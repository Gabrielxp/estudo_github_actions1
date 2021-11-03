package com.teste.testemockito.usuario;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UsuarioEndpointTest {

    @Mock
    private UsuarioService usuarioService;

    @InjectMocks
    private UsuarioEndpoint usuarioEndpoint;

    @Test
    @DisplayName(
            "FindAll Test UsuarioEndpoint"
    )
    void findAll() {

        when(usuarioService.findAll()).thenReturn(Arrays.asList(
                new Usuario("Bebel", "G1#@1")
        ));

        assertArrayEquals(usuarioEndpoint.findAll().toArray(),
        Arrays.asList( new Usuario("Bebel", "G1#@1")).toArray());

        verify(usuarioService, times(1)).findAll();

    }
}