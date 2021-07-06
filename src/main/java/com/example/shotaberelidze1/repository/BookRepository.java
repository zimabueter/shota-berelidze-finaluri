package com.example.shotaberelidze1.repository;
import com.example.shotaberelidze1.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}