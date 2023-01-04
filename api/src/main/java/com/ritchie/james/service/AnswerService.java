package com.ritchie.james.service;

import com.ritchie.james.entity.Answer;

import java.util.List;

public interface AnswerService {

    List<Answer> getAllAnswers();

    Answer getRandomAnswer();
}
