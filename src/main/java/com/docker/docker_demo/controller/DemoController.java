package com.docker.docker_demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

  @GetMapping("/")
  public ResponseEntity<String> welcome(){
    log.info("Spring boot application is running fine");
    return new ResponseEntity<>("Welcome to My Docker tutorial", HttpStatus.OK);
  }

}
