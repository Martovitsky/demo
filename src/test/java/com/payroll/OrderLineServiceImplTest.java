package com.payroll;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OrderLineServiceImplTest {
    @Mock
    private OrderLineRepository repository;
    @InjectMocks
    private OrderLineServiceImpl orderLineService;

    @Test
    public void testAddOrderLine() {
        when(repository.save(new OrderLine())).thenReturn(new OrderLine());
        orderLineService.addOrderLine(new OrderLine());
        verify(repository).save(new OrderLine());

    }
}