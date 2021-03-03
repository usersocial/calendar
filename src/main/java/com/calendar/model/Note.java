package com.calendar.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.Instant;

public class Note {

    @Id
    @Column
    int id;

    @Column
    String text;

    @Column
    Instant date;

    public Note(String text, Instant date) {
        this.text = text;
        this.date = date;
    }
}
