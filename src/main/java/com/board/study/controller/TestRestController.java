package com.board.study.controller;

import com.board.study.dto.TestDTO;
import com.board.study.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class TestRestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<TestDTO> testList(){

        return testService.testList();
    }
}
