package com.example.baok2n.recycleviewdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.baok2n.recycleviewdemo.R;
import com.example.baok2n.recycleviewdemo.pojo.Product_;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by baok2n on 5/16/2016.
 */
public class ProductListAdapter extends Adapter {

    List<Product_> listProduct;

    public ProductListAdapter( List<Product_> listProduct){
        this.listProduct = listProduct;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView tv_name;
        public ImageView iv_picture;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_name = (TextView) itemView.findViewById(R.id.text_view_name);
            iv_picture = (ImageView) itemView.findViewById(R.id.image_view_picture);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_product_list,parent,false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).tv_name.setText(listProduct.get(position).getTitle());
        Picasso.with(holder.itemView.getContext())
                .load(listProduct.get(position).getImages().get(0).getSrc())
                .into(((ViewHolder)holder).iv_picture);
    }

    @Override
    public int getItemCount() {
        return listProduct.size();
    }
}
