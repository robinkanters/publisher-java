package com.robinkanters.publisher;

import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class StoryTest {

    private Story story;

    @Before
    public void setUp() throws Exception {
        story = new Story();
    }

    @Test
    public void canAddTitleToStory() throws Exception {
        story.title = "Story title";
    }
    
    @Test
    public void canAddContentToStory() throws Exception {
        story.content = "Story content";
    }

    @Test
    public void canAddShortDescriptionToStory() throws Exception {
        story.shortDescription = "Short description";
    }
    
    @Test
    public void canAddPublishDateToStory() throws Exception {
        story.publishDate = makeDateObject();
    }

    @Test
    public void canAddAuthorToStory() throws Exception {
        story.author = new Author();
    }

    private Date makeDateObject() {
        return Calendar.getInstance().getTime();
    }
}
