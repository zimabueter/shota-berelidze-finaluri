package com.example.shotaberelidze1.repository;

import com.example.shotaberelidze1.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}