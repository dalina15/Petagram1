package com.example.petagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     CincoMascotas.setOnItemclickListener (new AdapterView.OnItemClickListener()){
            @Override
            public void onItemClick (AdapterView<?> parent, View view, int position, long id){
                Intent intent = new Intent (MainActivity.this, CincoMascotas.class);
                intent.putExtra (getResources().getString(R.string.nombre), mascotas.get(position))
                startActivity(intent);
                finish();
            }
        }
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()){
            case R.id.mContacto:
                Intent intent = new Intent (this, ActivityContacto.class);
                startActivity (intent);
                break;
            case R.id.mAbout:
                Intent i = new Intent (this, ActivityAbout.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}