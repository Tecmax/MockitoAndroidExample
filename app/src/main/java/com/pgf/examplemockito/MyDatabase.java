package com.pgf.examplemockito;

/**
 * Created by Pedro on 25/10/2017.
 */

class MyDatabase {

    public void saveArticle(Article tempArticle) {

        // save article to database
    }

    public Article getArticle(String articleName) {

        // query database and return the article
        return new Article(articleName);
    }

    public boolean containsArticle(String articleName) {

        // query database and return if database contains articleName
        return false;
    }
}
