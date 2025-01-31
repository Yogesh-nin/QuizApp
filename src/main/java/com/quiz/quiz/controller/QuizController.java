package com.quiz.quiz.controller;

import com.quiz.quiz.entity.Question;
import com.quiz.quiz.entity.Quiz;
import com.quiz.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {
    @Autowired
    QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){
        return quizService.createQuiz(category, numQ, title);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Quiz>> getQuizById(@PathVariable Integer id){
        return quizService.getQuizById(id);
    }
}
