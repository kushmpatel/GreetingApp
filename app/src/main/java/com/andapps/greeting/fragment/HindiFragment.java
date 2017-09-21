package com.andapps.greeting.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andapps.greeting.R;

import static com.andapps.greeting.constants.IConstants.TAG_DIWALI;
import static com.andapps.greeting.constants.IConstants.TAG_NEW_YEAR;

/**
 * A simple {@link Fragment} subclass.
 */
public class HindiFragment extends ChildFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hindi, container, false);
    }

    @Override
    protected String[] getMsgArray() {
        String[] msgArray = new String[0];
        switch (from){

            case TAG_DIWALI:
                msgArray = mActivity.getResources().getStringArray(R.array.diwali_hindi_message_list);
                break;

            case TAG_NEW_YEAR:
                msgArray = mActivity.getResources().getStringArray(R.array.new_year_hindi_message_list);
                break;

        }

        return msgArray;
    }
}
