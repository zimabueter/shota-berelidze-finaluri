package com.example.shotaberelidze2.service.impl;


import com.example.shotaberelidze2.dto.*;
import com.example.shotaberelidze2.model.Task;
import com.example.shotaberelidze2.repository.TaskRepository;
import com.example.shotaberelidze2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository taskRepository;

    @Override
    public AddTaskOutput addTask(AddTaskInput addTaskInput) {
        Task task = new Task();
        task.setTitle(addTaskInput.getTitle());
        task.setDescription(addTaskInput.getDescription());
        task.setStartDate(addTaskInput.getStartDate());
        task.setEndDate(addTaskInput.getEndDate());
        taskRepository.save(task);
        AddTaskOutput addTaskOutput = new AddTaskOutput();
        addTaskOutput.setMsg("Task added");
        return addTaskOutput;
    }

    @Override
    public DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput) {
        Task task = taskRepository.getOne(deleteTaskInput.getTaskId());
        taskRepository.delete(task);
        DeleteTaskOutput deleteTaskOutput = new DeleteTaskOutput();
        deleteTaskOutput.setMsg("Task deleted");
        return deleteTaskOutput;
    }

    @Override
    public GetTasksOutput getTasks(GetTasksInput getTaskInput) {
        List<Task> taskList = taskRepository.findAll();
        GetTasksOutput getTasksOutput = new GetTasksOutput();
        List<TaskDTO> taskDTOS = new ArrayList<>();
        for(Task task: taskList) {
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setId(task.getId());
            taskDTO.setTitle(task.getTitle());
            taskDTO.setDescription(task.getDescription());
            taskDTO.setStartDate(task.getStartDate());
            taskDTO.setEndDate(task.getEndDate());
            taskDTOS.add(taskDTO);
        }
        getTasksOutput.setTasks(taskDTOS);
        return getTasksOutput;
    }
}