package com.turkishlegacy.nutritionfactsmobile.diaryfragment_tabs;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.turkishlegacy.nutritionfactsmobile.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DinnerTab extends Fragment {


    public DinnerTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dinner_tab, container, false);
    }

}