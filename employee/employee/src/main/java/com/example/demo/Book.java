package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "bookstore")
public class Book {
	
	// Attributes
    //@Id private Bigint _id;
    @Id private ObjectId _id;
    private String bookName;
    private String authorName;

}
