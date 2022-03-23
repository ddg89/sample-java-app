package com.example.demo.exception;

import lombok.Data;

import java.util.Date;

@Data
public class ExceptionResponse {
    private int codice;
    private String message;
    private Date data = new Date();
}
