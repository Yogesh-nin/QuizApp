package com.quiz.quiz.dao;

import com.quiz.quiz.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
