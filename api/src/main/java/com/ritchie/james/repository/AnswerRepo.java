package com.ritchie.james.repository;

import com.ritchie.james.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepo extends JpaRepository<Answer, Integer> {
}
