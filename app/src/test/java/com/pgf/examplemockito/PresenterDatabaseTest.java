package com.pgf.examplemockito;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;

/**
 * Created by Pedro on 25/10/2017.
 */
public class PresenterDatabaseTest {

    private PresenterDatabase presenterDatabase;
    private MyDatabase mockDatabase;

    @Before
    public void setUp() throws Exception {

        mockDatabase = Mockito.mock(MyDatabase.class);
        presenterDatabase = new PresenterDatabase(mockDatabase);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void articleExistsInDatabase() throws Exception {

        Mockito.when(presenterDatabase.isArticleInDatabase(anyString())).thenReturn(true);

        assertTrue(presenterDatabase.isArticleInDatabase("Shampoo"));

    }
}