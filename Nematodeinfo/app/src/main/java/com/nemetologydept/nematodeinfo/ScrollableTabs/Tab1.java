package com.nemetologydept.nematodeinfo.ScrollableTabs;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nemetologydept.nematodeinfo.R;
import com.nemetologydept.nematodeinfo.settings;

/**
 * Created by Weirdo on 15-06-2016.
 */
public class Tab1 extends android.support.v4.app.Fragment {

    @Nullable
    //
            //
            // @Override
    int value[];
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.tab1, container, false);
        Log.i("k","tab0.0");

        value=getArguments().getIntArray("id");
        Log.i("k","tab0.1");
        TextView t= (TextView) v.findViewById(R.id.textView);
        Log.i("k","l1");

        if(value[0]==0)
        {
            Log.i("k","l2");
            t.setText(R.string.riceaintro);
        }

        else
        {
            Log.i("k","l3");
            t.setText(R.string.ricebintro);
        }



        return v;

    }


}
