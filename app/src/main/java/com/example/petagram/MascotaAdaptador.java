package com.example.petagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdaptador {


    public class MascotaAdaptador extends  RecyclerView.Adapter <MascotaAdaptador.MascotaViewHolder>{
        ArrayList<CincoMascotas> mascotas;
        
        public MascotaAdaptador (ArrayList <CincoMascotas> mascotas){
        this.mascotas = mascotas;
        }
    }
        @Override
        public MascotaViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mascotas, parent, false);
            return new MascotaViewHolder (v);
        }

        @Override
        public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
            CincoMascotas mascota = mascotas.get(position);
            mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
            mascotaViewHolder.tvNombreMascota.setText(mascota.getNombre());
        }

        @Override
        public int getItemCount(){
            return mascotas.size();
    }
        public static class MascotaViewHolder extends RecyclerView.ViewHolder{
            private ImageView imgFoto;
            private TextView tvNombreMascota;

            public MascotaViewHolder (View itemView) {
                super(itemView);
                imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
                tvNombreMascota = (TextView) itemView.findViewById(R.id.tvPetagram);
            }}
}


