package com.stepup.repository;

import com.stepup.model.MentoringSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentoringSessionRepository extends JpaRepository<MentoringSession, Long> {
}
