package org.izv.igg.promul.garciagutierrez.interfazaerolinea.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.izv.igg.promul.garciagutierrez.interfazaerolinea.R;

public class DocuViajesActivity extends AppCompatActivity {

    private TextView tvGuiaBangkok;
    private String urlGuiaBangkok = "https://viajeronomada.com/guia-turistica-de-bangkok/";
    private TextView tvGuiaCiudadHoChiMinh;
    private String urlGuiaCiudadHoChiMinh = "https://www.whereismykiwi.com/es/guia-viaje-ho-chi-minh/";
    private TextView tvGuiaSeul;
    private String urlGuiaSeul = "https://www.agoda.com/es-es/travel-guides/south-korea/seoul?cid=1844104";
    private TextView tvGuiaShanghai;
    private String urlGuiaShanghai = "https://www.disfrutashanghai.com/";
    private TextView tvGuiaTokio;
    private String urlGuiaTokio = "https://www.disfrutatokio.com/";
    private TextView tvGuiaYakarta;
    private String urlGuiaYakarta = "https://tiempodexplorar.com/que-ver-en-yakarta-guia-de-1-dia/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_docu_viajes);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        tvGuiaBangkok = findViewById(R.id.tvGuiaBangkok);
        tvGuiaBangkok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(urlGuiaBangkok);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        tvGuiaCiudadHoChiMinh = findViewById(R.id.tvGuiaCiudadHoChiMinh);
        tvGuiaCiudadHoChiMinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(urlGuiaCiudadHoChiMinh);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        tvGuiaSeul = findViewById(R.id.tvGuiaSeul);
        tvGuiaSeul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(urlGuiaSeul);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        tvGuiaShanghai = findViewById(R.id.tvGuiaShanghai);
        tvGuiaShanghai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(urlGuiaShanghai);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        tvGuiaTokio = findViewById(R.id.tvGuiaTokio);
        tvGuiaTokio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(urlGuiaTokio);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        tvGuiaYakarta = findViewById(R.id.tvGuiaYakarta);
        tvGuiaYakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(urlGuiaYakarta);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}