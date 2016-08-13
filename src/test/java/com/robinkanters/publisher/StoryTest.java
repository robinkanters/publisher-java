package com.robinkanters.publisher;

import org.junit.Before;
import org.junit.Test;

public class StoryTest extends LiteratureTest {
    @Before
    public void setUp() throws Exception {
        literature = new Story();
    }

    @Test
    public void canAddShortDescriptionToStory() throws Exception {
        ((Story)literature).shortDescription = "Short description";
    }
}
