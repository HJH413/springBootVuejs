package com.board.study.service;

import com.board.study.dto.TestDTO;
import com.board.study.model.TestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    TestDAO testDAO;

    @Override
    public List<TestDTO> testList() {
        return testDAO.testList();
    }
}
