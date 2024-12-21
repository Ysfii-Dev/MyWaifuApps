package com.yusfisyawali.mywaifuapps.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yusfisyawali.mywaifuapps.R;
import com.yusfisyawali.mywaifuapps.model.Waifu;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListWaifuAdapter extends RecyclerView.Adapter<ListWaifuAdapter.ListViewHolder> {
    private final ArrayList<Waifu> listWaifu;

    public ListWaifuAdapter(ArrayList<Waifu> list) {
        this.listWaifu = list;
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chara_waifu_row, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Waifu waifu = listWaifu.get(position);
        Glide.with(holder.itemView.getContext())
                .load(waifu.getPhoto())
                .apply(new RequestOptions().centerCrop())
                .into(holder.imgPhoto);
        holder.tvName.setText(waifu.getName());
        holder.tvAnime.setText(waifu.getAnime());
        holder.tvAboutWaifu.setText(waifu.getAboutWaifu());
        holder.itemView.setOnClickListener(v -> onItemClickCallback.onItemClicked(listWaifu.get(holder.getAdapterPosition())));
    }

    @Override
    public int getItemCount() {
        return listWaifu.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvAnime, tvBirth, tvZodiak, tvAge, tvBlood, tvHeightBody, tvAboutWaifu, tvAnimeDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_chara_photo);
            tvName = itemView.findViewById(R.id.tv_name);
            tvAnime = itemView.findViewById(R.id.tv_anime);
            tvBirth = itemView.findViewById(R.id.tv_birth);
            tvZodiak = itemView.findViewById(R.id.tv_zodiak);
            tvAge = itemView.findViewById(R.id.tv_age);
            tvBlood = itemView.findViewById(R.id.tv_blood);
            tvHeightBody = itemView.findViewById(R.id.tv_height_body);
            tvAboutWaifu = itemView.findViewById(R.id.tv_about_waifu);
            tvAnimeDetail = itemView.findViewById(R.id.tv_anime_detail);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Waifu data);
    }
}
