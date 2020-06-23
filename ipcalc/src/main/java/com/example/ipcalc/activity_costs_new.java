package com.example.ipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

class activity_costs_new extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costs_new);

        //Button butt5 = findViewById(R.id.butt5);
        //butt5.setBackgroundColor(getResources().getColor(R.color.red));

        Button obras = findViewById(R.id.obras);
        obras.setOnClickListener(this);

        Button vozm = findViewById(R.id.vozm);
        vozm.setOnClickListener(this);

        Button vsego = findViewById(R.id.vsego);
        vsego.setOnClickListener(this);
    }

    public void clickButt4(View view) {
        Intent intent = new Intent(this, annuit.class);
        startActivity(intent);
    }

    public void clickButt6(View view) {
        Intent intent = new Intent(this, banks.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        EditText et1 = findViewById(R.id.ocenin);
        EditText et2 = findViewById(R.id.poshlin);
        EditText et3 = findViewById(R.id.elregin);
        EditText et4 = findViewById(R.id.strahin);
        String ocenin = et1.getText().toString();
        String poshlin = et2.getText().toString();
        String elregin = et3.getText().toString();
        String strahin = et4.getText().toString();
        System.out.println(ocenin);
        System.out.println(poshlin);
        System.out.println(elregin);
        System.out.println(strahin);

        Double obras = Double.parseDouble(ocenin) + Double.parseDouble(poshlin) + Double.parseDouble(elregin) + Double.parseDouble(strahin); // вычисление суммы обязательных расходов
        TextView obrasin = findViewById(R.id.obrasin);
        obrasin.setText("" + obras);

        EditText et5 = findViewById(R.id.psihin);
        EditText et6= findViewById(R.id.notarin);
        EditText et7 = findViewById(R.id.kombankin);
        EditText et8 = findViewById(R.id.uslipin);
        EditText et9 = findViewById(R.id.prochin);
        String psihin = et5.getText().toString();
        String notarin = et6.getText().toString();
        String kombankin = et7.getText().toString();
        String uslipin = et8.getText().toString();
        String prochin = et9.getText().toString();
        System.out.println(psihin);
        System.out.println(notarin);
        System.out.println(kombankin);
        System.out.println(uslipin);
        System.out.println(prochin);

        Double vozm = Double.parseDouble(psihin) + Double.parseDouble(notarin) + Double.parseDouble(kombankin) + Double.parseDouble(uslipin) + Double.parseDouble(prochin); // вычисление суммы прочих расходов
        TextView vozmin = findViewById(R.id.vozmin);
        vozmin.setText("" + vozm);

        Double vseg;
        vseg = obras + vozm;
        TextView vsegoin = findViewById(R.id.vsegoin);
        vsegoin.setText("" + vseg);
    }

    //@Override
    //protected void onDestroy() {
    //    super.onDestroy();
    //}
}
