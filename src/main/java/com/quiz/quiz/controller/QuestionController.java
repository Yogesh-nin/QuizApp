package com.quiz.quiz.controller;

import com.quiz.quiz.entity.Question;
import com.quiz.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        try{
            return questionService.addQuestion(question);
        }
        catch (Exception e){
            throw new RuntimeException();
        }
    }

    @PutMapping("id/{id}")
    public ResponseEntity<String> updateQuestion(@PathVariable String id, @RequestBody Question question){
        return questionService.updateQuestion(id, question);
    }
}
