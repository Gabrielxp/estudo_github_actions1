package com.teste.testemockito.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private LogsService logsService;

    public List<Usuario> findAll(){

        logsService.registrarLog();

        return usuarioRepository.findAll();

    }

}
