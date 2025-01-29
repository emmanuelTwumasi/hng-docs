package com.emma.hng;

public enum CONSTANTS {
    EMAIL("protwumasi@gmail.com"), GITHUB_URL("github.com/emmanueltwumasi");
    private final String value;
    CONSTANTS(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
