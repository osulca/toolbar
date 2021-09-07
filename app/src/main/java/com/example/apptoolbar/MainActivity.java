package com.example.apptoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.security.cert.CertPathBuilderSpi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.new_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Uri sitio = Uri.parse("http://www.udh.edu.pe/");
                Intent intentItem1 = new Intent(Intent.ACTION_VIEW, sitio);
                startActivity(intentItem1);
                Toast.makeText(getApplicationContext(), "Hola", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Intent intentItem2 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intentItem2);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}