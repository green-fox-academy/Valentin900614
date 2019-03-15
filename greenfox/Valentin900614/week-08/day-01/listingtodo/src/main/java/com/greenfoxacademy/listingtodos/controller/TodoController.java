package com.greenfoxacademy.listingtodos.controller;

import com.greenfoxacademy.listingtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    @ResponseBody
    public String showStartString() {
        return "This is my first Todo";
    }

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public String showToDoList(Model model) {
        model.addAttribute("list", todoRepository.findAll());
        return "todolist";
    }

}
