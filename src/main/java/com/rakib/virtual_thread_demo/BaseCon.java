package com.rakib.virtual_thread_demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BaseCon {
    @GetMapping
    public ResponseEntity<?> getGreat(){
        return ResponseEntity.ok ("running................");
    }
}
