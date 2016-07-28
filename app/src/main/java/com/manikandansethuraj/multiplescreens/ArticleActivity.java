package com.manikandansethuraj.multiplescreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ArticleActivity extends AppCompatActivity {

    ArticleFragment articleFragment;
    //String[] headLineData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_activity);
      //  headLineData = getResources().getStringArray(R.array.news_names);
        Intent intent = getIntent();
        String headlineintent = intent.getStringExtra("HeadLine");
        articleFragment = (ArticleFragment) getFragmentManager().findFragmentById(R.id.fragmentarticle_small);
        articleFragment.updateView(headlineintent);

    }
}
