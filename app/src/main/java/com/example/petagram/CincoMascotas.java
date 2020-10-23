package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;

public class CincoMascotas extends AppCompatActivity {
private TextView tvNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinco_mascotas);

        Bundle detalles = getIntent().getExtras();
        String nombre = detalles.getString(getResources().getString(R.string.nombre));

        TextView tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvNombre.setText(nombre);

    }
    @Override
    public boolean onKeyDown (int keyCode, KeyEvent event){

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent (CincoMascotas.this, MainActivity.class);
            startActivity (intent);
        }
        return super.onKeyDown (keyCode, event);

    }
    public static class MascotaViewholder extends RecyclerView.ViewHolder{
        private ImageView imgFoto;
        private TextView tnNombre;

        public MascotaViewholder (View itemView) {
            super(itemView);
            imgFoto = (ImageView) item.View.findViewByID(R.id.imgFoto);
            
        }

    }
}