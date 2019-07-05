package com.example.submissiondicoding;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListGadgetAdapter extends RecyclerView.Adapter<ListGadgetAdapter.ListViewHolder> {
    private ArrayList<Gadget> lisGadget;

    private OnItemClickCallback onItemClickCallback;

    public ListGadgetAdapter(ArrayList<Gadget> lisGadget) {
        this.lisGadget = lisGadget;

    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //return null;
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder listViewHolder, final int i) {

        final Gadget gadget = lisGadget.get(i);
        Glide.with(listViewHolder.itemView.getContext())
                .load(gadget.getProphoto())
                .apply(new RequestOptions().override(55, 65))
                .into(listViewHolder.imgPhoto);

        listViewHolder.tvProBy.setText(gadget.getProby());
        listViewHolder.tvProName.setText(gadget.getProname());
        listViewHolder.tvProdate.setText(gadget.getProdate());
        listViewHolder.tvProDesc.setText(gadget.getProdes());

        listViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(lisGadget.get(listViewHolder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return  lisGadget.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvProName, tvProBy, tvProdate, tvProDesc;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.image_view);
            tvProName = itemView.findViewById(R.id.posted_name_phone);
            tvProBy = itemView.findViewById(R.id.posted_by);
            tvProdate = itemView.findViewById(R.id.posted_date);
            tvProDesc = itemView.findViewById(R.id.posted_desc);

        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Gadget data);
    }
}
