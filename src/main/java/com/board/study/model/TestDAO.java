package com.board.study.model;

import com.board.study.dto.TestDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDAO {

    List<TestDTO> testList();
}
