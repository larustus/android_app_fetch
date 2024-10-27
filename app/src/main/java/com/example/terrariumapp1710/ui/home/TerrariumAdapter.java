package com.example.terrariumapp1710.ui.home;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.terrariumapp1710.R;
import com.example.terrariumapp1710.Terrarium;

import java.util.List;

public class TerrariumAdapter extends RecyclerView.Adapter<TerrariumAdapter.ViewHolder> {
    private List<Terrarium> terrariumList;

    public TerrariumAdapter(List<Terrarium> terrariumList) {
        this.terrariumList = terrariumList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.terrarium_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Terrarium terrarium = terrariumList.get(position);
        holder.nameTextView.setText(terrarium.getName());
        holder.humidityTextView.setText(String.valueOf(terrarium.getHumidity()));
        holder.temperatureTextView.setText(String.valueOf(terrarium.getTemperature()));
    }

    @Override
    public int getItemCount() {
        return terrariumList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView humidityTextView;
        public TextView temperatureTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            humidityTextView = itemView.findViewById(R.id.humidityTextView);
            temperatureTextView = itemView.findViewById(R.id.temperatureTextView);
        }
    }
}

