package com.pgf.examplemockito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    PresenterDatabase presenterDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenterDatabase.addArticle("Shampoo Bottle");

        presenterDatabase.getArticle("Whampoo Bottle");
    }
}
