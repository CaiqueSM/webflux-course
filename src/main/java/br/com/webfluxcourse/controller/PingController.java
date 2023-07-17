package br.com.webfluxcourse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface PingController {

    @GetMapping
    ResponseEntity<String> pong();
}
