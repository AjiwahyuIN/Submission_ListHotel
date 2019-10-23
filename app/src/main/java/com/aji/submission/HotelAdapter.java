package com.aji.submission;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder> {
    private ArrayList<Hotel> listHotel;
    private Context context;

    private OnItemClickCallback onItemClickCallback;

    public void SetOnItemClickCallback(OnItemClickCallback onItemsClickCallbak) {
        this.onItemClickCallback = onItemsClickCallbak;
    }

    public HotelAdapter(ArrayList<Hotel> listHotel, Context context) {
        this.listHotel = listHotel;
        this.context = context;
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HotelViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detail, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final HotelViewHolder holder, final int position) {
        Hotel hotel = listHotel.get(position);
        Picasso.with(context)
                .load(hotel.getPhoto())
                .into(holder.imgPhoto);
        holder.tvName.setText(hotel.getNama());
        holder.tvStar.setText(hotel.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listHotel.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHotel.size();
    }

    class HotelViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvStar, tvName;

        HotelViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_hotel);
            tvName = itemView.findViewById(R.id.hotel_name);
            tvStar = itemView.findViewById(R.id.hotel_star);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Hotel data);
    }

}
