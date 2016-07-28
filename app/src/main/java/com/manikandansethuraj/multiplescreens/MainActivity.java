package com.manikandansethuraj.multiplescreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements HeadlineFragment.onHeadClickLis {

    HeadlineFragment headLineFragment;
    ArticleFragment articleFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   headLineFragment = new HeadlineFragment();
      //  articleFragment = new ArticleFragment();
     //   FragmentManager fragmentManager = getFragmentManager();
     //   FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
     //   fragmentTransaction.add(R.id.fragmentheadline_small,headLineFragment);
     //   fragmentTransaction.add(R.id.fragmentarticle_small,articleFragment);
     //   fragmentTransaction.commit();

    }

    @Override
    public void onHeadClick(String headName) {

        articleFragment = (ArticleFragment) getFragmentManager().findFragmentById(R.id.fragmentarticle_small);

        if(articleFragment == null){

            Intent intent = new Intent(this,ArticleActivity.class);
            intent.putExtra("HeadLine",headName);
            startActivity(intent);

        }else {
            articleFragment.updateView(headName);

        }
    }
}
