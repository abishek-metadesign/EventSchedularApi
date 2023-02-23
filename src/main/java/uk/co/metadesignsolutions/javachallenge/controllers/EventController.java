package uk.co.metadesignsolutions.javachallenge.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventController {
    @PostMapping ("/schedule")
    public ResponseEntity<Void> create(){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @PutMapping("/schedule/{eventId}")
    public ResponseEntity<Void> update(@PathVariable final  Long id){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @DeleteMapping("/schedule/{eventId}")
    public ResponseEntity<Void> delete(@PathVariable final  Long id){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    @GetMapping("/schedule/all")
    public ResponseEntity<Void> list(){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

}
