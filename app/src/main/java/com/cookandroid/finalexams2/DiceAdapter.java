package com.cookandroid.finalexams2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DiceAdapter extends RecyclerView.Adapter<DiceAdapter.MyViewHolder> {

    ArrayList<Dice> items;

    public DiceAdapter(ArrayList<Dice> items) {
        this.items = items;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_layout, parent, false);
        DiceAdapter.MyViewHolder vh = new DiceAdapter.MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Dice item = items.get(position);
        holder.textView2.setText(item.getDicenum());
        holder.textView1.setText(item.getDiceorder());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Dice item) {
        items.add(item);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView1;
        TextView textView2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textView1 = (TextView) itemView.findViewById(R.id.textview1);
            textView2 = (TextView) itemView.findViewById(R.id.textview2);
        }

        public void setItem(Dice item) {
            textView2.setText(item.getDicenum());
            textView1.setText(item.getDiceorder());

        }
    }
}
