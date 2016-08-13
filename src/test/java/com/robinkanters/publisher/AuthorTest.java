package com.robinkanters.publisher;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorTest {

    private Author author;

    @Before
    public void setUp() throws Exception {
        author = new Author();
    }

    @Test
    public void canAddNameToAuthor() throws Exception {
        author.name = "Author Name";
    }
    
    @Test
    public void canAddBiographyToAuthor() throws Exception {
        author.biography = "Author biography";
    }
}
