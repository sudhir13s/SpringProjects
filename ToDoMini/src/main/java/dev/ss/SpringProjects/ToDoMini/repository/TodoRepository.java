package dev.ss.SpringProjects.ToDoMini.repository;

import dev.ss.SpringProjects.ToDoMini.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {

  List<Todo> findByUserName(String user);

}
