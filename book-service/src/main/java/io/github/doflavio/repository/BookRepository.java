package io.github.doflavio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.doflavio.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{}