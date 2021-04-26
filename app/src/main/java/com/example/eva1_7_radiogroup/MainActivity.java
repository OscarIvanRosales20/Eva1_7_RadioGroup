package com.example.eva1_7_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdGrpComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se conecta la interfaz Grafica con la variable
        rdGrpComida = findViewById(R.id.rdGrpComida);

        //Asignar el Listener
        rdGrpComida.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override                  //RdGrp que genera el evento,  Id del radioButton seleccionado
            public void onCheckedChanged(RadioGroup group, int I) {
                //Toast indicando cual RadioButton fue seleccionado
                /*
                switch (I) {
                    case R.id.rdBtnMontados:
                        Toast.makeText(MainActivity.this, "Montados", Toast.LENGTH_SHORT).show();
                    break;
                    case R.id.rdBtnAlitas:
                        Toast.makeText(MainActivity.this, "Alitas", Toast.LENGTH_SHORT).show();
                    break;
                    case R.id.rdBtnGarna:
                        Toast.makeText(MainActivity.this, "Garnachas", Toast.LENGTH_SHORT).show();
                    break;
                    case R.id.rdBtnRojo:
                        Toast.makeText(MainActivity.this, "Rojo", Toast.LENGTH_SHORT).show();
                    break;

                }

                 */

                RadioButton rdGrpSel;
                rdGrpSel = findViewById(I);
                Toast.makeText(getApplicationContext(), rdGrpSel.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}