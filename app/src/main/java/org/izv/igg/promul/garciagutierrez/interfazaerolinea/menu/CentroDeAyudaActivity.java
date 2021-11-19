package org.izv.igg.promul.garciagutierrez.interfazaerolinea.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import org.izv.igg.promul.garciagutierrez.interfazaerolinea.R;

public class CentroDeAyudaActivity extends AppCompatActivity {

    private Button btCentroDeAyuda;
    private String urlCentroDeAyuda = "https://help.shopify.com/es/manual/checkout-settings/script-editor/examples";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centro_de_ayuda);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        btCentroDeAyuda = findViewById(R.id.btCentroDeAyuda);
        btCentroDeAyuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(urlCentroDeAyuda);
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