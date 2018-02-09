package com.example.mihai.proiectintegrator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Trimitere la lista produse
        // TODO (1) de scris nukm
        ImageView imageViewListaProduse = (ImageView) findViewById(R.id.imagine_lista_produse);
        imageViewListaProduse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ListaProduseActivity.class));
            }
        });
    }
}
