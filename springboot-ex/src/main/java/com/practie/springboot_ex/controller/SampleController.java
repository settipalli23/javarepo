package com.practie.springboot_ex.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/v1/api/")
public class SampleController {

    @GetMapping(value="/get/{name}")
    public ResponseEntity<String> getName(@PathVariable("name") String name ){

        return new ResponseEntity<>(name, HttpStatus.OK);
    }

    @GetMapping(value="/get")
    public ResponseEntity<String> getNameByRequest(@RequestParam("name") String name ){

        return new ResponseEntity<>(name, HttpStatus.OK);
    }
}
