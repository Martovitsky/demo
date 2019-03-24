package com.payroll;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;



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
        goodsService.getAll();
        verify(repository).findAll();
    }

    @Test
    public void testDeleteById() {

        goodsService.deleteById(1L);
        verify(repository).deleteById(1L);
    }

    @Test
    public void testFindById() {

        when(repository.findById(1L)).thenReturn(Optional.of(new Goods()));
        goodsService.findById(1L);
        verify(repository).findById(1L);
    }

    @Test
    public void testAdd() {

        when(repository.save(new Goods())).thenReturn(new Goods());
        goodsService.add(new Goods());
        verify(repository).save(new Goods());

    }
}