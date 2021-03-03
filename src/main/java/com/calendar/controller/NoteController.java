package com.calendar.controller;


import com.calendar.service.NoteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoteController {

    private NoteService noteService;

    @PostMapping
    public String create(String text){
        return noteService.create(text).toString();
    }
}
