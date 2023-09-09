package uni.edu.ni.a09septiembre23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView TvDatos;
    ImageView Imagen;
  Button btnRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Imagen=findViewById(R.id.imMayor);
        TvDatos=findViewById(R.id.tvMostrar);
        btnRegresar=findViewById(R.id.btnRegresar);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        int mayor = 18;
        Intent j=getIntent();
        String Name = j.getStringExtra("Nombre");
        int Edad = j.getIntExtra("Edad",0);


          if (Edad >= mayor) {
                Imagen.setImageResource(R.drawable.descarga);
                TvDatos.setText("Su nombre es:" + Name + " Su edad es :" + Edad);


            } else {

                Imagen.setImageResource(R.drawable.minion);
                TvDatos.setText("Su nombre es:" + Name + " Su edad es :" + Edad);


            }


    }
}
