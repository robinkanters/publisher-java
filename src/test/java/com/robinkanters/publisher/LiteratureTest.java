package com.robinkanters.publisher;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public abstract class LiteratureTest {
    Literature literature;

    @Test
    public void canAddTitleToLiterature() throws Exception {
        literature.title = "Some title";
    }

    @Test
    public void canAddContentToLiterature() throws Exception {
        literature.content = "Poem content";
    }

    @Test
    public void canAddPublishDateToLiterature() throws Exception {
        literature.publishDate = makeDateObject();
    }

    @Test
    public void canAddAuthorToLiterature() throws Exception {
        literature.author = new Author();
    }

    private Date makeDateObject() {
        return Calendar.getInstance().getTime();
    }
}
