package com.teste.testemockito.usuario;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UsuarioRepositoryTest {

    @InjectMocks
    private UsuarioRepository usuarioRepository;

    @Test
    void findAll() {

        assertArrayEquals(usuarioRepository.findAll().toArray(), Arrays.asList(
                new Usuario("Gabriel", "12346"),
                new Usuario("Noeli", "12346")
        ).toArray());

    }
}