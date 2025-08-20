# Notes Backend (Starter Pack)

A minimal Spring Boot backend for coding test candidates.

## Run Instructions
1. Install JDK 17+ and Maven.
2. From the project root, run:
   ```
   mvn spring-boot:run
   ```
3. Server will start on `http://localhost:8080`.

## Candidate Task
- Implement two endpoints in `NotesController`:
  - `GET /notes` → return list of notes.
  - `POST /notes` → accept JSON and add a note.

Notes can be stored in memory (e.g., a static `List<Note>`).
