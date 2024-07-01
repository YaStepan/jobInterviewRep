package com.jobinterview.interview.controller;

import com.jobinterview.interview.entity.MyString;
import com.jobinterview.interview.service.StringServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StringController {
    private StringServiceImpl service;

    public StringController(StringServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/searchById/{id}")
    public ResponseEntity<MyString> getStringById(@PathVariable("id") Long id) {
        return new ResponseEntity<MyString>(service.getStringById(id), HttpStatus.OK);
    }
}
