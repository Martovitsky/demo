package com.payroll;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;



import static java.util.Collections.singletonList;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GoodsControllerTest {
    @Mock
    private GoodsServiceImpl goodsService;
    @InjectMocks
    private  GoodsController goodsController;

    @Test
    public void testGetAll() {
       when(goodsService.getAll()).thenReturn(singletonList(new Goods()));
       goodsController.getAll();
       verify(goodsService).getAll();
    }

    @Test
    public void testAdd() {
        when(goodsService.add(new Goods())).thenReturn(new Goods());
        goodsController.add(new Goods());
        verify(goodsService.add(new Goods()));

    }

    @Test
    public void testEdit() {
        when(goodsService.add(new Goods())).thenReturn(new Goods());
        goodsController.add(new Goods());
        verify(goodsService.add(new Goods()));
    }

    @Test
    public void testFindById() {
        when(goodsService.findById(1L)).thenReturn(new Goods());
        goodsController.findById(1L);
        verify(goodsService).findById(1L);

    }

    @Test
    public void testDelete() {
        goodsController.findById(1L);
        verify(goodsService).deleteById(1L);
    }
}