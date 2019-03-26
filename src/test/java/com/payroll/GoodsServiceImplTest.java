package com.payroll;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import java.util.Optional;

import static java.util.Collections.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GoodsServiceImplTest {
    @Mock
    private GoodsRepository repository;
    @InjectMocks
    private GoodsServiceImpl goodsService;

    @Test
    public void testGetAll() {
        when(repository.findAll()).thenReturn(singletonList(new Goods()));
        List<Goods> result = goodsService.getAll();
        Assert.assertNotNull(result);
        verify(repository).findAll();
    }

    @Test
    public void testDeleteById() {
        goodsService.deleteById(anyLong());
        verify(repository).deleteById(anyLong());
    }

    @Test
    public void testFindById() {
        when(repository.findById(anyLong())).thenReturn(Optional.of(new Goods()));
        goodsService.findById(anyLong());
        verify(repository).findById(anyLong());
    }

    @Test
    public void testAdd() {
        when(repository.save(new Goods())).thenReturn(new Goods());
        goodsService.add(new Goods());
        verify(repository).save(new Goods());
    }
}