package com.example.RestAPI.domain.error;

public class ResponseError extends RuntimeException{

    public ResponseError(String title) {

        super(title);
    }
}
