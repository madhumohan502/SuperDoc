package com.example.ihubtechnologies.superdoc;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    Context context;
    ArrayList<DataResPonse> data;

    public DataAdapter(Context context, ArrayList<DataResPonse> body) {
        this.data = body;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.setData(data.get(i));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final TextView name;
        private final TextView id;
        DataResPonse dataResPonse;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.textView11);
            id = (TextView) itemView.findViewById(R.id.textView222);
        }

        public void setData(DataResPonse dataResPonse) {
            this.dataResPonse = dataResPonse;
            name.setText(dataResPonse.getSDescription());
            id.setText(String.valueOf(dataResPonse.getSid()));
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Toast.makeText(context,"position"+position,Toast.LENGTH_SHORT).show();
        }
    }
}