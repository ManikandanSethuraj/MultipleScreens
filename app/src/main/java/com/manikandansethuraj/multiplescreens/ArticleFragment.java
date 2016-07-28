package com.manikandansethuraj.multiplescreens;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by MANIKANDAN_SETHURAJ on 2016-07-08.
 */
public class ArticleFragment extends Fragment {

    TextView headLinetext;
    TextView descriptionText;
    String[] headLine;
    String[] description;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.article_fragment_layout,container,false);
        headLinetext = (TextView)view.findViewById(R.id.headline_id);
        descriptionText = (TextView)view.findViewById(R.id.desc_id);
        return view;

        // return super.onCreateView(inflater, container, savedInstanceState);
    }


    public void updateView(String headLineText){

        headLine = getResources().getStringArray(R.array.news_names);
        description = getResources().getStringArray(R.array.news_list);
        if (headLineText.equals(headLine[0])){
            headLinetext.setText(headLineText);
            descriptionText.setText(description[0]);
        }else if (headLineText.equals(headLine[1])){
            headLinetext.setText(headLineText);
            descriptionText.setText(description[0]);
        }else if (headLineText.equals(headLine[2])){
            headLinetext.setText(headLineText);
            descriptionText.setText(description[0]);
        }else if (headLineText.equals(headLine[3])){
            headLinetext.setText(headLineText);
            descriptionText.setText(description[0]);
        }else if (headLineText.equals(headLine[4])){
            headLinetext.setText(headLineText);
            descriptionText.setText(description[0]);
        }else if (headLineText.equals(headLine[5])){
            headLinetext.setText(headLineText);
            descriptionText.setText(description[0]);
        }else if (headLineText.equals(headLine[6])){
            headLinetext.setText(headLineText);
            descriptionText.setText(description[0]);
        }else {
            headLinetext.setText(headLine[0]);
            descriptionText.setText(description[0]);
        }



    }



}
