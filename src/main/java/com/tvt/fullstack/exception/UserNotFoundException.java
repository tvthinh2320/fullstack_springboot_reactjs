package com.tvt.fullstack.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id) {
        super("Can not find the user with the id: " + id);
    }
}
