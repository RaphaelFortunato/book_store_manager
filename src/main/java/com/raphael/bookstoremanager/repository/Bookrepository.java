package com.raphael.bookstoremanager.repository;

import com.raphael.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookrepository extends JpaRepository<Book, Long> {
}
