package com.example.shotaberelidze2.service;

import com.example.shotaberelidze2.dto.*;

public interface TaskService {
    AddTaskOutput addTask(AddTaskInput addTaskInput);
    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);
    GetTasksOutput getTasks(GetTasksInput getTasksInput);
}