package com.example.shotaberelidze2.repository;

import com.example.shotaberelidze2.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task,Long> {
}