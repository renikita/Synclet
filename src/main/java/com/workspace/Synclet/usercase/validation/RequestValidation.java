package com.workspace.Synclet.usercase.validation;

import com.workspace.Synclet.usercase.exception.RequestValidationException;
import org.springframework.stereotype.Component;

@Component
public class RequestValidation {

    public void validateAuth(String login, String password) {

        if (login == null || login.isEmpty()) {throw new RequestValidationException("Email cannot be empty");}
        if (password == null || password.isEmpty()) {throw new RequestValidationException("Password cannot be empty");}
    }

    public void validateReg(String login, String mail, String password) {

        if (login == null || login.isEmpty()) {throw new RequestValidationException("Login cannot be empty");}
        if (mail == null || mail.isEmpty()) {throw new RequestValidationException("Email cannot be empty");}
        if (password == null || password.isEmpty()) {throw new RequestValidationException("Password cannot be empty");}
    }
}
