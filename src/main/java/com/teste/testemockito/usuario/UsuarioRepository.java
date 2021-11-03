package com.teste.testemockito.usuario;


import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UsuarioRepository {

    public List<Usuario> findAll(){
        return Arrays.asList(
                new Usuario("Gabriel", "12346"),
                new Usuario("Noeli", "12346")
            );
    }

}
