package com.emma.hng2.dto;

public class ErrorDto {
    String number;
    String error;


    public ErrorDto(String number, String error) {
        this.error = error;
        this.number = number;
    }

    public ErrorDto() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

