package com.example.comex.settings_page;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.comex.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Settings_Adapter extends RecyclerView.Adapter<Settings_Adapter.RecyclerViewHolder> {

    private ArrayList<Settings_Provider> arrayList = new ArrayList<Settings_Provider>();

    public Settings_Adapter(ArrayList<Settings_Provider> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.settings_items, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        Settings_Provider settings_provider = arrayList.get(position);
        holder.imageView.setImageResource(settings_provider.getImg_res());
        holder.settings_title.setText(settings_provider.getSettings_title());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView settings_title;

        public RecyclerViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.img);
            settings_title = (TextView) view.findViewById(R.id.settings_title);
        }

    }
}
