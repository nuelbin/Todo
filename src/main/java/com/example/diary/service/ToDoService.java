package com.example.diary.service;

import com.example.diary.dto.ToDoRequestDto;
import com.example.diary.dto.ToDoResponseDto;
import com.example.diary.entity.ToDo;
import com.example.diary.repository.ToDoRepository;

public interface ToDoService {

    ToDoResponseDto saveToDo(ToDoRequestDto dto);
}
