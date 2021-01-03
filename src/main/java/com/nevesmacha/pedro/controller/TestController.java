package com.nevesmacha.pedro.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TestController {

  @GetMapping
  public String test() {
    Date startedAt = new Date();

    for (int i = 0; i < Integer.MAX_VALUE; i++) {

    }

    return "Testing - v4 - " + (new Date().getTime() - startedAt.getTime());
  }
}
