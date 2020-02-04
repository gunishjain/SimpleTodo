
package com.example.simpletodo;

import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {

    private Task[] data;

    // data is passed into the constructor
    public TaskAdapter(Task[] data) {
        this.data = data;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.activity_tasklayout, parent,false);


        return new ViewHolder(view);

    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final Task taskdata = data[position];
        holder.desc.setText(data[position].getDesc());
        holder.title.setText(data[position].getTitle());
        holder.id=data[position].getId();
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+taskdata.getTitle(),Toast.LENGTH_LONG).show();
            }
        });

    }

    // total number of rows
    @Override
    public int getItemCount() {
        return data.length;

    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public int id;
        public TextView desc;
        public TextView title;
        public LinearLayout linearLayout;


        public ViewHolder(View itemView) {
            super(itemView);

            desc = (TextView) itemView.findViewById(R.id.desc);
            title= (TextView) itemView.findViewById(R.id.title);
            linearLayout= (LinearLayout) itemView.findViewById(R.id.linearlayout);


        }

        @Override
        public void onClick(View v) {

        }
    }

    /*
    // convenience method for getting data at click position
    String getItem(int id) {
        return mData.get(id);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }*/
}
