package com.greenfoxacademy.listingtodos.service;

import com.greenfoxacademy.listingtodos.model.Todo;
import com.greenfoxacademy.listingtodos.todorepository.TodoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ToDoService {

    private TodoInterface todoInterface;

    @Autowired
    public ToDoService(TodoInterface todoInterface) {
        this.todoInterface = todoInterface;
    }

    private List<Todo> todoList = new ArrayList<>(Arrays.asList(
            new Todo("Buy groceries", true, false),
            new Todo("Workout late evening", false, false)
    ));

    public List<Todo> getAllTodos() {
        List<Todo> todos = new ArrayList<>();

        todoInterface.findAll().forEach(todo -> todos.add(todo));

        return todos;
    }

    public void addTodo(Todo todo) {
        todoInterface.save(todo);
    }

}
