package com.elfering.starter.controllers;

import com.elfering.starter.services.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/string")
public class StringController {

    private final StringService stringService;

    @Autowired
    public StringController(StringService stringService) {
        this.stringService = stringService;
    }

    @GetMapping("/reverse")
    @ResponseBody
    public String reverse(@RequestParam("value") String value) {
        return this.stringService.reverse(value);
    }

    @GetMapping("/caps")
    @ResponseBody
    public String caps(@RequestParam("value") String value) {
        return this.stringService.caps(value);
    }

    @GetMapping("/count")
    @ResponseBody
    public int count(@RequestParam("value") String value) {
        return this.stringService.count(value);
    }
}
