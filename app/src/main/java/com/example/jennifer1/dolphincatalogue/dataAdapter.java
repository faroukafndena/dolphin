package com.example.jennifer1.dolphincatalogue;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by It_design on 2/10/2018.
 */

public class dataAdapter extends RecyclerView.Adapter <dataAdapter.productholder>{



    List <ourdata> radproducts;
    public dataAdapter(List <ourdata> radproducts){


        this.radproducts=radproducts;
    }
    @Override
    public productholder onCreateViewHolder(ViewGroup parent, int viewType) {
            View row= LayoutInflater.from(parent.getContext()).inflate(R.layout.products,parent,false);
            productholder holder=new productholder(row);
            return holder;
    }

    @Override
    public void onBindViewHolder(productholder  holder, int position) {
        ourdata dat=radproducts.get(position);
        holder.title.setText(dat.cartit);
        holder.info.setText(dat.carinfo);
        holder.img.setImageResource(dat.carimg);



    }

    @Override
    public int getItemCount() {
         return radproducts.size();
    }
    class  productholder extends RecyclerView.ViewHolder {



        TextView title,info;
        ImageView img;



        public productholder(View itemView) {
            super(itemView);


            title=(TextView)itemView.findViewById(R.id.prod_tit);
            info=(TextView)itemView.findViewById(R.id.prod_info);
            img=(ImageView)itemView.findViewById((R.id.img));



        }
    }
}
