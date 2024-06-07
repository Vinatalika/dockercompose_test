package com.example.demo.domain;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@ToString
@Table (name = "persons")

public class Person {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String firstName;

    @Column (nullable = false)
    private String lastName;

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Person person)) return false;
        return id != null & id.equals(person.id);
    }

    @Override
    public int hashCode(){
        return getClass().hashCode();
    }
}