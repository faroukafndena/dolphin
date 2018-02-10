package com.example.jennifer1.dolphincatalogue;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class social extends Fragment {

    TextView txt_face;

    public social() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_social, container, false);
        txt_face = (TextView) view.findViewById(R.id.url_fac);

        txt_face.setMovementMethod(LinkMovementMethod.getInstance());
        return view;
    }
}