package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText campoPeso, campoAltura;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instance();

    }


    public void calcular(View view){

        String Vp = campoPeso.getText().toString();
        String Vl = campoAltura.getText().toString();

        if(Vp == null || Vp.equals("") || Vl == null || Vl.equals("")){





            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();

        }else {

            double peso = Double.parseDouble(campoPeso.getText().toString());
            double altura = Double.parseDouble(campoAltura.getText().toString());

            double resultado = peso / (altura * altura);

            if (resultado < 16) {
                result.setText("Magreza grave");
            } else if (resultado > 16 && resultado < 17) {
                result.setText("Magreza Moderada");
            } else if (resultado > 17 && resultado < 18.5) {
                result.setText("Magreza leve");
            } else if (resultado > 18.5 && resultado < 25) {
                result.setText("Saudável");
            } else if (resultado > 25 && resultado < 30) {
                result.setText("Sobrepeso");
            } else if (resultado > 30 && resultado < 35) {
                result.setText("Obesidade Grau I");
            } else if (resultado > 35 && resultado < 40) {
                result.setText("Obesidade Grau II");
            } else if (resultado > 40) {
                result.setText("Obesidade Grau III(mórbida)");
            }

        }

    }

    public void instance(){
        campoPeso = findViewById(R.id.editPeso);
        campoAltura = findViewById(R.id.editAltura);
        result = findViewById(R.id.result);
    }
}
