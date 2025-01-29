package com.emma.hng;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1")
public class ApiController {
    @GetMapping
    public ResponseEntity<ResponseData> getData() {
        ResponseData responseData = new ResponseData();
        responseData.setEmail(CONSTANTS.EMAIL.getValue());
        responseData.setCurrent_datetime(LocalDateTime.now());
        responseData.setGithub_url(CONSTANTS.GITHUB_URL.getValue());
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
}
