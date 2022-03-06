package com.dicoding.ardocoder.enjoylampung;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPlaceAdapter extends RecyclerView.Adapter<ListPlaceAdapter.ListViewHolder> {
    private ArrayList<Place> listPlace;

    ListPlaceAdapter(ArrayList<Place> list) {
        this.listPlace = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_places, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Place place = listPlace.get(position);

        Glide.with(holder.itemView.getContext())
                .load(place.getPhoto())
                .apply(new RequestOptions().override(80,80))
                .into(holder.imgPhoto);

        holder.tvName.setText(place.getName());
        holder.tvLocation.setText(place.getLocation());
        holder.imgPhoto.setAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.fade_transition_animation));
        holder.relativeLayout.setAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.fade_scale_animation));

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

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvLocation;
        RelativeLayout relativeLayout;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvLocation = itemView.findViewById(R.id.tv_item_location);
            relativeLayout = itemView.findViewById(R.id.relativeLayoutInner);
        }
    }
}
