package com.greenfoxacademy.listingtodos.todorepository;

import com.greenfoxacademy.listingtodos.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoInterface extends CrudRepository<Todo, Long> {

}
