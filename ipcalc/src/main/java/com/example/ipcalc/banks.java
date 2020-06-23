package com.example.ipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class banks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banks);

        Button butt9 = findViewById(R.id.butt9);
        butt9.setBackgroundColor(getResources().getColor(R.color.red));

    }

    public void clickButt7(View view) {
        Intent intent = new Intent(this, annuit.class);
        startActivity(intent);
    }

    public void clickButt8(View view) {
        Intent intent = new Intent(this, activity_cost_new.class);
        startActivity(intent);

    }
}
