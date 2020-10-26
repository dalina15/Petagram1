package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CincoMascotas extends AppCompatActivity {
    ArrayList<CincoMascotas> mascotas;
private TextView tvNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinco_mascotas);

        Bundle detalles = getIntent().getExtras();
        String nombre = detalles.getString(getResources().getString(R.string.nombre));

        TextView tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvNombre.setText(nombre);
        mascotas = new ArrayList<CincoMascotas>();
        mascotas.add(new CincoMascotas (R.drawable.boxer, "Niko bellic", getResources().getDrawable(R.drawable.HuesoBlanco,R.drawable.HuesoDorado)));
        mascotas.add(new CincoMascotas (R.drawable.perrofry, "Seymour",getResources().getDrawable(R.drawable.HuesoBlanco,R.drawable.HuesoDorado)));
        mascotas.add(new CincoMascotas (R.drawable.ayudantedesanta, "Ayudante de Santa",getResources().getDrawable(R.drawable.HuesoBlanco,R.drawable.HuesoDorado)));
        mascotas.add(new CincoMascotas (R.drawable.ovejerito, "Hamlet", getResources().getDrawable(R.drawable.HuesoBlanco,R.drawable.HuesoDorado)));
        mascotas.add(new CincoMascotas (R.drawable.perrunicornio, "Perrunicornio", getResources().getDrawable(R.drawable.HuesoBlanco,R.drawable.HuesoDorado)));

        ArrayList<String> nombresMascota = new ArrayList<>();
        for (CincoMascotas mascota : mascotas){
            nombresMascota.add(mascotas.getClass(mascotas));
        }
    @Override
    public boolean onKeyDown (int keyCode, KeyEvent){

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent (CincoMascotas.this, MainActivity.class);
            startActivity (intent);
        }
        return super.onKeyDown (keyCode, event);

    }
    public static class MascotaViewholder extends RecyclerView.ViewHolder{
        private ImageView fotoMascota;
        private TextView tnNombre;

        public MascotaViewholder (View itemView) {
            super(itemView);
            imgFoto = (ImageView) item.View.findViewByID(R.id.imgFoto);
            
        }

        public ArrayList <FotoMascota> fotoMascota{
            fotoMascota.add (new FotoMascota = R.drawable.boxer);


        }

    }
}