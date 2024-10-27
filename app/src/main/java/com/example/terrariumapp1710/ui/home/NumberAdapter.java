package com.example.terrariumapp1710.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.terrariumapp1710.R;

import java.util.List;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {

    private List<Integer> numberList;

    public NumberAdapter(List<Integer> numberList) {
        this.numberList = numberList;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_number, parent, false);
        return new NumberViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        Integer currentNumber = numberList.get(position);
        holder.numberText.setText(String.valueOf(currentNumber));
    }

    @Override
    public int getItemCount() {
        return numberList.size();
    }

    public static class NumberViewHolder extends RecyclerView.ViewHolder {
        public TextView numberText;

        public NumberViewHolder(View itemView) {
            super(itemView);
            numberText = itemView.findViewById(R.id.number_text);
        }
    }
}

