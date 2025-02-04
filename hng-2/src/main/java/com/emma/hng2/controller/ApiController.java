package com.emma.hng2.controller;


import com.emma.hng2.dto.ResponseDto;
import com.emma.hng2.service.ClassificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @Autowired
    private ClassificationService ClassificationService;

    @GetMapping(value = "/classify-number")
    public ResponseEntity<ResponseDto> getClassification(@RequestParam("number") Integer number) {
        return new ResponseEntity<>(this.ClassificationService.getNumberClassification(number), HttpStatus.OK);
    }

}
