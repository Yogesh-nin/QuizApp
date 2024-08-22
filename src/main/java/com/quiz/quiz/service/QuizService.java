package com.quiz.quiz.service;

import com.quiz.quiz.dao.QuestionDao;
import com.quiz.quiz.dao.QuizDao;
import com.quiz.quiz.entity.Question;
import com.quiz.quiz.entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    Quiz quiz = new Quiz();

    @Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title){
        try {
            List<Question> questions = questionDao.findRandomQuestionByCategory(category, numQ);
            quiz.setTitle(title);
            quiz.setQuestions(questions);
            quizDao.save(quiz);

            return new ResponseEntity<>("quiz created successfully", HttpStatus.CREATED);
        } catch (RuntimeException e) {

            return new ResponseEntity<>("Error creating quiz", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<Quiz>> getQuizById(Integer id) {
        try {
            Optional<Quiz> quiz = quizDao.findById(id);
            return new ResponseEntity<>(quiz, HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
