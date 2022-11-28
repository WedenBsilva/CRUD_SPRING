package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*Camada: controller
        Camada: repository
        FeedBack: faltou @Repository, extends, interface,
        Camada: model
        FeedBack: faltou @Entity, @Id, @GeneratedValue,*/
@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping
    public String hello() {
        return "<h1><li>OBJETIVO PESSOAL</li><h1>" +
                "<p>" +
                "<h2><li>APRENDER MAIS CODAR</li><h2>" +
                "<p>" +
                "<h3><li>TER MAIS COMUNICACAO</li><h3>";
    }

    @GetMapping("/mesagen")
    public String lista() {
        return
                "<h1><li>ORIENTAÇÃO AO FUTURO</li><h1>" +
                        "<p>" +
                        "<h2><li>PERSISTÊNCIA</li><h2>" +
                        "<p>" +
                        "<h3><li>TRABALHO EM EQUIPE</li><h3>" +
                        "<p>" +
                        "<h4><li>ATENÇÃO AOS DETALHES</li><h4>" +
                        "<p>" +
                        "<h5><li>PROATIVIDADE</li><h5>" +
                        "<p>" +
                        "<h5><li>COMUNICAÇÃO</li><h5>" +
                        "<p>" +
                        "<h5><li>RESPONSABILIDADE PESSOAL</li><h5>" +
                        "<p>" +
                        "<h5><li>MENTALIDADE DE CRESCIMENTO</li><h5>" +
                        "<p>";


    }
}

