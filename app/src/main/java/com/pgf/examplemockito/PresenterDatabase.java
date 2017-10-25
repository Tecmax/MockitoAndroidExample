package com.pgf.examplemockito;

/**
 * Created by Pedro on 24/10/2017.
 * A class to hold operation calls to a database
 */

public class PresenterDatabase {

    private static final String TAG = PresenterDatabase.class.getSimpleName();

    private MyDatabase myDatabase;

    public PresenterDatabase(MyDatabase myDatabase) {
        this.myDatabase = myDatabase;
    }

    public void addArticle(String articleName) {

        Article tempArticle = new Article(articleName);

        // ... call to database to store tempArticle

        myDatabase.saveArticle(tempArticle);
    }

    public Article getArticle(String articleName) {

        // ... call to database to get article

        return myDatabase.getArticle(articleName);
    }

    public boolean isArticleInDatabase(String articleName) {

        return myDatabase.containsArticle(articleName);
    }
}
