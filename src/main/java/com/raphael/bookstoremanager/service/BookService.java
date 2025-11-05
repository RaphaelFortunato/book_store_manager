package com.raphael.bookstoremanager.service;

import com.raphael.bookstoremanager.dto.BookDTO;
import com.raphael.bookstoremanager.dto.MessageResponseDTO;
import com.raphael.bookstoremanager.entity.Book;
import com.raphael.bookstoremanager.mapper.BookMapper;
import com.raphael.bookstoremanager.repository.Bookrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private Bookrepository bookrepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(Bookrepository bookrepository) {
        this.bookrepository = bookrepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO){

        Book bookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = bookrepository.save(bookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId())
                .build();

    }
}
