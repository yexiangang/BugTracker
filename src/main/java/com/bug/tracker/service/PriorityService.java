package com.bug.tracker.service;

import com.bug.tracker.model.Priority;

import java.util.List;

public interface PriorityService {

    List<Priority> findAll();

    Priority findByType(String type);

    Priority findById(int id);
}
