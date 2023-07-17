package br.com.webfluxcourse.controller.impl;

import br.com.webfluxcourse.controller.PingController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/ping")
public class PingControllerImpl implements PingController {

    @Override
    public ResponseEntity<String> pong() {
        return ResponseEntity.status(HttpStatus.OK)
                .body("pong");
    }
}
