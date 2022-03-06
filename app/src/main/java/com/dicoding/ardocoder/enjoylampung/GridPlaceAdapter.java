package com.dicoding.ardocoder.enjoylampung;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridPlaceAdapter extends RecyclerView.Adapter<GridPlaceAdapter.GridViewHolder> {
    private ArrayList<Place> listPlace;

    public GridPlaceAdapter(ArrayList<Place> list) {
        this.listPlace = list;
    }

    @NonNull
    @Override
    public GridPlaceAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_place, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridPlaceAdapter.GridViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(listPlace.get(position).getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);

        holder.imgPhoto.setAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.fade_transition_animation));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), listPlace.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(holder.itemView.getContext(), PlaceActivity.class);
                intent.putExtra("img_place", listPlace.get(holder.getAdapterPosition()).getPhoto());
                intent.putExtra("tv_name", listPlace.get(holder.getAdapterPosition()).getName());
                intent.putExtra("tv_location", listPlace.get(holder.getAdapterPosition()).getLocation());
                intent.putExtra("tv_time", listPlace.get(holder.getAdapterPosition()).getTime());
                intent.putExtra("tv_htm", listPlace.get(holder.getAdapterPosition()).getTicket());
                intent.putExtra("tv_detail", listPlace.get(holder.getAdapterPosition()).getDetail());
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPlace.size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_grid_photo);
        }
    }
}
