package com.andapps.greeting.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;

import static com.andapps.greeting.constants.IConstants.FROM;

/**
 * Created by kushpatel on 9/21/2017.
 */

public abstract class  ChildFragment extends Fragment {

    protected Bundle bundle;
    protected String from;
    protected  String[] msgArray;
    protected Activity mActivity;
    private RecyclerView rvMessageLists;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = (Activity) context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = getArguments();
        from = bundle.getString(FROM);
        msgArray = getMsgArray();
    }

    protected abstract String [] getMsgArray();
}
