package com.example.shotaberelidze1.model;
import lombok.Data;


import javax.persistence.*;

@Data
@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private String pdfUrl;

    @OneToOne(cascade = CascadeType.ALL)
    private Book book;
}