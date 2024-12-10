package com.example.diary.controller;


import com.example.diary.dto.ToDoRequestDto;
import com.example.diary.dto.ToDoResponseDto;
import com.example.diary.entity.ToDo;
import com.example.diary.service.ToDoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ToDoList")
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @PostMapping
    public ResponseEntity<ToDoResponseDto> createToDo(@RequestBody ToDoRequestDto dto) {


        return new ResponseEntity<>(ToDoService.saveToDo), HttpStatus.CREATED);
    }


}
