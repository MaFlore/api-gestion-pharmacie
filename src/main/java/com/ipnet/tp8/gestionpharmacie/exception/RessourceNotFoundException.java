package com.ipnet.tp8.gestionpharmacie.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RessourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -6629514807178733792L;

    public RessourceNotFoundException(String message) {
        super(message);
    }

}