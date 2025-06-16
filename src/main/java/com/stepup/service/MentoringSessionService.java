package com.stepup.service;

import com.stepup.model.MentoringSession;
import com.stepup.repository.MentoringSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MentoringSessionService {
    private final MentoringSessionRepository repository;

    public MentoringSession register(MentoringSession session) {
        return repository.save(session);
    }

    public List<MentoringSession> getAllSessions() {
        return repository.findAll();
    }
}
