package com.example.notes.controller;

import com.example.notes.model.Note;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/notes")
public class NotesController {

    private final List<Note> notes = new ArrayList<>();

    // GET /notes → return all notes
    @GetMapping
    public List<Note> getNotes() {
        return notes;
    }

    // POST /notes → add a new note
    @PostMapping
    public Note addNote(@RequestBody Note note) {
        notes.add(note);
        return note;
    }
}
