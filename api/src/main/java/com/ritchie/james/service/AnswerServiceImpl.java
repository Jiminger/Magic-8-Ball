package com.ritchie.james.service;

import com.ritchie.james.entity.Answer;
import com.ritchie.james.repository.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class AnswerServiceImpl implements AnswerService{

    @Autowired
    private AnswerRepo answerRepo;

    public AnswerServiceImpl() {
    }

    @Override
    public List<Answer> getAllAnswers() {
        return answerRepo.findAll();
    }

    @Override
    public Answer getRandomAnswer() {

        List<Answer> allAnswers = answerRepo.findAll();

        Random rand = new Random();
        return allAnswers.get(rand.nextInt(allAnswers.size()));
    }

}
