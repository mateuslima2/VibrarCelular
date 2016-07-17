package com.example.mateus.helloword;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btVibrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btVibrar = (Button) findViewById(R.id.btVibrar);

        btVibrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrar();
            }
        });
    }
    private void vibrar(){
        Vibrator rr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long milissegundos = 100;
        rr.vibrate(milissegundos);
    }
}
