package com.jobinterview.interview.service;

import com.jobinterview.interview.entity.MyString;
import com.jobinterview.interview.repository.StringRepository;

import java.util.Optional;

public class StringService implements StringServiceImpl {
    private final StringRepository stringRepository;

    public StringService(StringRepository stringRepository) {
        this.stringRepository = stringRepository;
    }



    @Override
    public MyString getStringById(Long id) {
        MyString str = null;
        try {
            Optional<MyString> stringOptional = stringRepository.findById(id);
            if(stringOptional.isPresent()) {
               str =  stringOptional.get();
            }
            else {
                throw new NullPointerException("There is no such id in my_string table");
            }
        }
        catch (NullPointerException e)
        {
            System.out.println("NPE");
        }
        return str;
    }
}
