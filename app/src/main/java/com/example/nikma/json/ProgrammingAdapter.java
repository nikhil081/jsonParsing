package com.example.nikma.json;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikma on 3/11/2018.
 */


public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.viewholder> {
    private ArrayList<Listitem> listitems;
    private Context context ;

    public ProgrammingAdapter(ArrayList<Listitem> listitems,Context context) {

        this.listitems = listitems;
        this.context = context;


    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.list_layout, parent, false);

        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        Listitem listitem = listitems.get(position);
        holder.name.setText(listitem.getName());
        holder.email.setText(listitem.getEmail());
    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView name;
        TextView email;

        public viewholder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            email = itemView.findViewById(R.id.email);
        }
    }
}
