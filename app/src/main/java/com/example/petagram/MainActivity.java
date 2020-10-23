package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota (R.drawable.boxer, "Niko bellic", getResources().getDrawable(R.drawable.HuesoBlanco,R.drawable.HuesoDorado)));
        mascotas.add(new Mascota (R.drawable.perrofry, "Seymour",getResources().getDrawable(R.drawable.HuesoBlanco,R.drawable.HuesoDorado)));
        mascotas.add(new Mascota (R.drawable.ayudantedesanta, "Ayudante de Santa",getResources().getDrawable(R.drawable.HuesoBlanco,R.drawable.HuesoDorado)));
        mascotas.add(new Mascota (R.drawable.ovejerito, "Hamlet", getResources().getDrawable(R.drawable.HuesoBlanco,R.drawable.HuesoDorado)));
        mascotas.add(new Mascota (R.drawable.perrunicornio, "Perrunicornio", getResources().getDrawable(R.drawable.HuesoBlanco,R.drawable.HuesoDorado)));

        ArrayList<String> nombresMascota = new ArrayList<>();
        for (Mascota mascota : mascotas){
            nombresMascota.add(mascotas.getClass(mascotas));
        }
     .setOnItemclickListener (new AdapterView.OnItemClickListener()){
            @Override
            public void onItemClick (AdapterView<?> parent, View view, int position, long id){
                Intent intent = new Intent (MainActivity.this, CincoMascotas.class);
                intent.putExtra (getResources().getString(R.string.nombre), mascotas.get(position))
                startActivity(intent);
                finish();
            }
        }

    }
}