package com.jobinterview.interview.service;

import com.jobinterview.interview.entity.MyString;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface StringServiceImpl {
    @Transactional
    public MyString getStringById();
}
