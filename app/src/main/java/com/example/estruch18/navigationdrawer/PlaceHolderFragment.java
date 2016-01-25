package com.example.estruch18.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by estruch18 on 25/1/16.
 */
public class PlaceHolderFragment extends Fragment {

    public static final String ARG_SECTION_TITLE = "section_number";

    public static PlaceHolderFragment newInstance(String sectionTitle) {

        PlaceHolderFragment fragment = new PlaceHolderFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, sectionTitle);
        fragment.setArguments(args);
        return fragment;

    }

    public PlaceHolderFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.section_fragment, container, false);

        // Ubicar argumento en el text view de section_fragment.xml
        String title = getArguments().getString(ARG_SECTION_TITLE);
        TextView titulo = (TextView) view.findViewById(R.id.title);
        titulo.setText(title);
        return view;
    }
}
