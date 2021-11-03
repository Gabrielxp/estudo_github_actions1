package com.teste.testemockito.usuario;

import org.springframework.stereotype.Service;

@Service
public class LogsService {

    public void registrarLog(){
        System.out.println("Log: Efetuando busca de usuarios");
    }

}
