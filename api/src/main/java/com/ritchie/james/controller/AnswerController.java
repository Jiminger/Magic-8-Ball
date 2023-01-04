package com.ritchie.james.controller;

import com.ritchie.james.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnswerController {

    @Autowired
    AnswerService answerService;

    @GetMapping("/answers")
    public ResponseEntity<Object> getAnswers(){
        return ResponseEntity.ok().body(answerService.getAllAnswers());
    }

    @GetMapping("/answers/random")
    public ResponseEntity<Object> getRandomAnswer(){
        return ResponseEntity.ok().body(answerService.getRandomAnswer());
    }
}
