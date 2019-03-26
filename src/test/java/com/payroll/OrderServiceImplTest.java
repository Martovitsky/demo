package com.payroll;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Optional;

import static java.util.Collections.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceImplTest {
    @Mock
    private OrderRepository repository;
    @InjectMocks
    private OrderServiceImpl orderService;

    @Test
    public void testGetAll() {
        when(repository.findAll()).thenReturn(singletonList(new Order()));
        orderService.getAll();
        verify(repository).findAll();
    }

    @Test
    public void testGetById() {
        when(repository.findById(anyLong())).thenReturn(Optional.of(new Order()));
        orderService.getById(anyLong());
        verify(repository).findById(anyLong());
    }

    @Test
    public void deleteById() {
        orderService.deleteById(anyLong());
        verify(repository).deleteById(anyLong());
    }

    @Test
    public void add() {
        when(repository.save(new Order())).thenReturn(new Order());
        orderService.add(new Order());
        verify(repository).save(new Order());
    }
}