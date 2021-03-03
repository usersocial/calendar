package com.calendar.service;

import com.calendar.model.Note;

import java.time.Instant;

public class NoteService {

    public Note create(String text) {
        Note note = new Note(text, Instant.now());

        return note;
    }
}
