package com.robinkanters.publisher;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class PoemTest {

    private Poem poem;

    @Before
    public void setUp() throws Exception {
        poem = new Poem();
    }

    @Test
    public void canAddTitleToPoem() throws Exception {
        poem.title = "Some title";
    }

    @Test
    public void canAddContentToPoem() throws Exception {
        poem.content = "Poem content";
    }
    
    @Test
    public void canAddMetaphorToPoem() throws Exception {
        poem.metaphor = "Some metaphor";
    }
    
    @Test
    public void canAddPublishDateToPoem() throws Exception {
        poem.publishDate = makeDateObject();
    }
    
    @Test
    public void canAddAuthorToPoem() throws Exception {
        poem.author = new Author();
    }

    private Date makeDateObject() {
        return Calendar.getInstance().getTime();
    }
}
