package com.stepup.controller;

import com.stepup.model.MentoringSession;
import com.stepup.service.MentoringSessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mentoring")
@RequiredArgsConstructor
@CrossOrigin
public class MentoringSessionController {

    private final MentoringSessionService sessionService;

    @PostMapping("/register")
    public MentoringSession register(@RequestBody MentoringSession session) {
        return sessionService.register(session);
    }

    @GetMapping("/all")
    public List<MentoringSession> getAll() {
        return sessionService.getAllSessions();
    }
}
