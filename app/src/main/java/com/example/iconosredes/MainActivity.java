package com.example.iconosredes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ImageButton imageButtonF, imageButtonT, imageButtonI;
    String urlf = "https://www.facebook.com/";
    String urli = "https://www.instagram.com/";
    String urlt = "https://twitter.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonF = findViewById(R.id.imageButtonF);
        imageButtonT = findViewById(R.id.imageButtonT);
        imageButtonI = findViewById(R.id.imageButtonI);

        imageButtonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri link = Uri.parse(urlt);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);
            }
        });
        imageButtonI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri link = Uri.parse(urli);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);

            }
        });

        imageButtonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri link = Uri.parse(urlf);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);

            }
        });
    }

    //REALIZACIÓN DE MENU DESPLEGABLE PUNTO 9

    public boolean onCreateOptionsMenu (Menu menu){

        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    public boolean onOptionsItemSelected (MenuItem item){

        int id = item.getItemId();

        if (id == R.id.Item1){

            startActivity(new Intent(MainActivity.this, Registro.class));

        }else if (id == R.id.Item2){

            startActivity(new Intent(MainActivity.this, Perfil.class));

        }else if (id == R.id.Item3){

            startActivity(new Intent(MainActivity.this, ActualizarDatos.class));

        }else if (id == R.id.Item4){

            startActivity(new Intent(MainActivity.this, Version.class));
        }
        return super.onOptionsItemSelected(item);

    }

}