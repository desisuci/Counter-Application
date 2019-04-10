package com.desisuci.counterapplication;


import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int x = 0;
    private TextView textCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hitung(View view){
        x++;
        Vibrator vibe = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        textCounter = (TextView) findViewById(R.id.textCounter);
        textCounter.setText(Integer.toString(x));
        vibe.vibrate(50);
        if(x == 33) {
            vibe.vibrate(2000);
        }
        if(x == 34){
            x = 0;
            reset(view);
        }

    }


    public void reset(View view){
        x = 0;
        textCounter.setText(Integer.toString(x));
        textCounter = (TextView) findViewById(R.id.textCounter);

        String pesan = "Berhasil direset";
        Toast notif = Toast.makeText(this, pesan, Toast.LENGTH_LONG);
        notif.setGravity(Gravity.FILL_HORIZONTAL, 0,-240);
        notif.show();
    }
}
