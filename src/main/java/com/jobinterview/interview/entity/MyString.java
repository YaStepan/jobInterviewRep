package com.jobinterview.interview.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="my_string")
public class MyString {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="default_seq")
    private Long id;

    @Column
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyString myString = (MyString) o;
        return id.equals(myString.id) && name.equals(myString.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
