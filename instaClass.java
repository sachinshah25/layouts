package com.example.image.tutorial_10_to_20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.image.R;
import com.example.image.databinding.InstalayoutBinding;
import com.example.image.databinding.InstastorylayoutBinding;
import com.example.image.databinding.WhatsappuserlayoutBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class instaClass  extends RecyclerView.Adapter<instaClass.ViewHolder> {
    ArrayList<instaModel> arrayList;
    Context context;

    public instaClass(ArrayList<instaModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }
    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.instastorylayout,null));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
        instaModel instaModel=arrayList.get(position);
        holder.binding.img.setImageResource(instaModel.getImage());
        holder.binding.text.setText(instaModel.getName());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        InstastorylayoutBinding binding;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            binding=InstastorylayoutBinding.bind(itemView);
        }
    }
}
