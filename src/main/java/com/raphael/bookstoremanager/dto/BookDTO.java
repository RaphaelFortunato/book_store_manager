package com.raphael.bookstoremanager.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Long id;

    @NotBlank
    @Size(max = 200)
    private String name;

    @NotNull
    private Integer pages;

    @NotNull
    private Integer chapters;

    @NotBlank
    @Size(max = 100)
    //@Pattern(regexp = (?:ISBN(?:-10)?:?)?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ])))
    //        message = "ISBN format must be a valid format")
    private String isbn;

    @NotBlank
    @Size(max = 200)
    private String publisherName;

    @Valid //o @Valid faz com que todas as validações sejam verificadas
    @NotNull
    private AuthorDTO author;

}
