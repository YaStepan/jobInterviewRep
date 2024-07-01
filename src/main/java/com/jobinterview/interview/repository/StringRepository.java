package com.jobinterview.interview.repository;

import com.jobinterview.interview.entity.MyString;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StringRepository extends JpaRepository<MyString,Long> {

}
