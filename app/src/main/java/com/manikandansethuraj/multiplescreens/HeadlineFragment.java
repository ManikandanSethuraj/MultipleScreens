package com.manikandansethuraj.multiplescreens;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by MANIKANDAN_SETHURAJ on 2016-07-07.
 */
public class HeadlineFragment extends Fragment {

    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    String[] headlines;
    onHeadClickLis onheadClickListenser;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.headline_fragment_layout,container,false);
        listView = (ListView)view.findViewById(R.id.listview_headline);

        headlines = getResources().getStringArray(R.array.news_names);
        arrayAdapter = new ArrayAdapter<String>(getActivity(),R.layout.headline_list_layout,R.id.headline_textview_id,headlines);
        listView.setAdapter(arrayAdapter);

      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

              String headLine = headlines[i];
              onheadClickListenser.onHeadClick(headLine);

          }
      });

        return view;

        // return super.onCreateView(inflater, container, savedInstanceState);
    }


    public interface onHeadClickLis{

        public void onHeadClick(String headName);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        onheadClickListenser = (onHeadClickLis) activity;

    }
}
