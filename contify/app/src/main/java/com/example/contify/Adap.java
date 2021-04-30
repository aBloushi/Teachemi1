package com.example.contify;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adap extends RecyclerView.Adapter {

    ArrayList<Elements> pArray;
    Context context;


    public Adap(ArrayList<Elements> pArray, Context context) {
        this.pArray = pArray;
        this.context = context;

    }

    public void filterList(ArrayList<Elements> filterList) {
        pArray = filterList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rvlayout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {


        ((ViewHolder) holder).img.setImageResource(pArray.get(position).getImage());
        // ((ViewHolder) holder).Atomic_number.setText("Atomic Number: " + pArray.get(position).getAtomic_Number() + "");
        ((ViewHolder) holder).name.setText(pArray.get(position).getName() + "");

        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, elementInfo.class);
                intent.putExtra("Common", pArray.get(position).getCommon());
                intent.putExtra("Atomic_Mass", pArray.get(position).getAtomic_Mass());
                intent.putExtra("Name", pArray.get(position).getName());
                intent.putExtra("Image", pArray.get(position).getImage());
                intent.putExtra("Atomic_Number", pArray.get(position).getAtomic_Number());
                intent.putExtra("symb", pArray.get(position).getSymbol());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public TextView name;
        public TextView Atomic_number;

        public View view;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView);


        }


    }


}
