package br.com.webfluxcourse.controller.exceptions;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.time.LocalDateTime;
import java.io.Serializable;

@Data
@Builder
public class StandardError implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;

    private LocalDateTime timeStamp;
    private String path;
    private Integer status;
    private String error;
    private String message;
}
