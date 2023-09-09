package uni.edu.ni.a09septiembre23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etEdad;
    Button btnMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombre);
        etEdad = findViewById(R.id.etEdad);
        btnMostrar = findViewById(R.id.btnMostrar);

        btnMostrar.setOnClickListener(view -> {
            String Nombre = etNombre.getText().toString();
            int Edad = Integer.parseInt(etEdad.getText().toString());
            Intent i=new Intent(getApplicationContext(),MainActivity2.class);

            i.putExtra("Nombre", Nombre);
            i.putExtra("Edad", Edad);
          startActivity(i);
        });
    }







}
