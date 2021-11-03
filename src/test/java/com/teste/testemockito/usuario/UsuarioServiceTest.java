package com.teste.testemockito.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;


@ExtendWith(MockitoExtension.class)
class UsuarioServiceTest {

    @Mock
    private LogsService logsService;

    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioService usuarioService;

    @DisplayName(
            "FindAll Test UsuarioService"
    )
    @Test
    void findAll() {

        Mockito.when(usuarioRepository.findAll()).thenReturn(Arrays.asList(
                new Usuario("Gideão", "432212")
        ));

        Mockito.doAnswer( invocationOnMock -> {
            System.out.println("Teste log novo Gabriel");
            return null;
        }).when(logsService).registrarLog();

        Assertions.assertArrayEquals(
            usuarioService.findAll().toArray(),
            Arrays.asList(
                new Usuario("Gideão", "432212")
            ).toArray()
        );

        Mockito.verify(logsService, Mockito.times(1)).registrarLog();
        Mockito.verify(usuarioRepository, Mockito.times(1)).findAll();

    }
}