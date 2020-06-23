package com.example.ipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.TextView;

public class annuit extends AppCompatActivity implements View.OnClickListener{

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annuit);

        Button butt = findViewById(R.id.butt);
        butt.setOnClickListener(this);
        Button butt1 = findViewById(R.id.butt1);
        butt1.setBackgroundColor(getResources().getColor(R.color.red));

    }

    @Override
    public void onClick(View view) {
        EditText et1 = findViewById(R.id.stobin);
        EditText et2 = findViewById(R.id.pervin);
        EditText et3 = findViewById(R.id.srokin);
        EditText et4 = findViewById(R.id.proc);
        String stobin = et1.getText().toString();
        String pervin = et2.getText().toString();
        String srokin = et3.getText().toString();
        String proc = et4.getText().toString();
        System.out.println(stobin);
        System.out.println(pervin);
        System.out.println(srokin);
        System.out.println(proc);
        final double m;
        m = 466617;
        final double st;
        st = Double.parseDouble(stobin);
        final double pv;
        pv = Double.parseDouble(pervin);
        CheckBox check = findViewById(R.id.matkap);
        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    double cr = st - pv - m;
                    TextView credin = findViewById(R.id.credin);
                    credin.setText(""+ cr);// делаем работу, если кнопка стала активной
                } else {
                    double cr = st - pv;
                    TextView credin = findViewById(R.id.credin);
                    credin.setText(""+ cr);// делаем работу, если кнопка перестала быть активной
                }
            }


        });

        double a, b, c, d;

        a = Double.parseDouble(stobin) - Double.parseDouble(pervin); // вычисление суммы кредита
        System.out.println(a);
        b = (Double.parseDouble(proc) / 12) / 100; // вычисление ежемесячной ставки
        System.out.println(b);
        d = Double.parseDouble(srokin) * 12; // срок в месяцах
        //c = Math.pow(((Double.parseDouble(proc) / 12) / 100), d);
        c = Math.pow(1+b, d);
        System.out.println(c);

        double res = a * ((b * c) / (c - 1));
        TextView ann = findViewById(R.id.ann);
        ann.setText(""+ res);
            }


    public void clickButt2(View view) {
        Intent intent = new Intent(this, activity_cost_new.class);
        startActivity(intent);
    }

    public void clickButt3(View view) {
        Intent intent = new Intent(this, banks.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}





