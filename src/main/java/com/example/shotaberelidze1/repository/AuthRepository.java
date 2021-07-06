package com.example.shotaberelidze1.repository;

import com.example.shotaberelidze1.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

interface AuthorRepository extends JpaRepository<Author, Long> {
}