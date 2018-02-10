package com.example.jennifer1.dolphincatalogue;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class products extends Fragment {


    public products() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater,  @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.newproducts, container, false);


        List<ourdata> data = new ArrayList<>();





        String title []  = {
                "My BMW Car",
                "My Nissan Car",
                "My Daweoo"};


        String info []  = {
                "My AMazing Car",
                "My wonederfull Car",
                "My great one"};


        int img []  = {
                R.drawable.car,
                R.drawable.car2,
                R.drawable.car3
        };

        for (int i=0;i<title.length;i++)
        {
                    ourdata dates=new ourdata( title[i],info [i],img [i] );

                    data.add(dates);
        }

        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.recycle_products);

        dataAdapter adapter=new dataAdapter(data);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);



        return view;
    }
}

















