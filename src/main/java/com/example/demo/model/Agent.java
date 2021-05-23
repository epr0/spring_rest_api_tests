package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer salary;
    private Integer experience;

    public Agent(String name, Integer salary, Integer experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
}
