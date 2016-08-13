package com.robinkanters.publisher;

import org.junit.Before;
import org.junit.Test;

public class PoemTest extends LiteratureTest {
    @Before
    public void setUp() throws Exception {
        literature = new Poem();
    }

    @Test
    public void canAddMetaphorToPoem() throws Exception {
        ((Poem)literature).metaphor = "Some metaphor";
    }
}
