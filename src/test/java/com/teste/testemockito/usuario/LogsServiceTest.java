package com.teste.testemockito.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class LogsServiceTest {

    @Spy
    @InjectMocks
    private LogsService logsService;

    @Test
    void registrarLog() {

        doNothing().when(logsService).registrarLog();
        Assertions.assertAll(() -> {
            logsService.registrarLog();
        });
        verify(logsService, times(1)).registrarLog();

    }
}