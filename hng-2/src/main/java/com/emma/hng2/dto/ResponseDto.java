package com.emma.hng2.dto;

import java.util.List;


public class ResponseDto {
    private Integer number;
    private String is_prime;
    private String is_perfect;
    private List<String> properties;
    private Integer digit_sum;
    private String fun_fact;

    public ResponseDto(Integer number, String isPrime, String isPerfect, List<String> properties, Integer digitSum, String funFact) {
        this.number = number;
        this.is_prime = isPrime;
        this.is_perfect = isPerfect;
        this.properties = properties;
        this.digit_sum = digitSum;
        this.fun_fact = funFact;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getIs_prime() {
        return is_prime;
    }

    public void setIs_prime(String is_prime) {
        this.is_prime = is_prime;
    }

    public String getIs_perfect() {
        return is_perfect;
    }

    public void setIs_perfect(String is_perfect) {
        this.is_perfect = is_perfect;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public Integer getDigit_sum() {
        return digit_sum;
    }

    public void setDigit_sum(Integer digit_sum) {
        this.digit_sum = digit_sum;
    }

    public String getFun_fact() {
        return fun_fact;
    }

    public void setFun_fact(String fun_fact) {
        this.fun_fact = fun_fact;
    }
}
