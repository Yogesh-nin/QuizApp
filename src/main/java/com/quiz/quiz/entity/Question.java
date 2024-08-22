package com.quiz.quiz.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String questionTitle;

    @ElementCollection
    private List<String> options;
    private String rightAnswer;
    private String difficultyLevel;
    private String category;
}
