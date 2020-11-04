package com.leonardo.landportscapetarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int contador=0;
    ImageView siguiente1,atras, imagen, imagenLandScape;
    Button button1, button2, button3, button4, button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            final int arreglo[] = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground, R.drawable.ic_flecha_hacia_abajo, R.drawable.ic_casas};
            setContentView(R.layout.activity_main);

            siguiente1 = findViewById(R.id.imageView3);
            atras = findViewById(R.id.imageView2);
            imagen = findViewById(R.id.imageView4);

            siguiente1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (contador > 3) {
                        contador = 0;
                        System.out.println("entre al primer if");
                    }
                    imagen.setImageResource(arreglo[contador]);
                    contador++;
                    System.out.println("---contador siguiente: " + contador);
                }
            });

            atras.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    contador--;
                    if (contador < 0) {
                        contador = 3;
                        System.out.println("entre al segundo if");
                    }
                    imagen.setImageResource(arreglo[contador]);

                    System.out.println("---contador atras: " + contador);

                }
            });

            System.out.println("---contador: " + contador);


        } else if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_main);

            button1 = findViewById(R.id.button);
            button2 = findViewById(R.id.button7);
            button3 = findViewById(R.id.button8);
            button4 = findViewById(R.id.button9);
            button5 = findViewById(R.id.button10);
            imagenLandScape = findViewById(R.id.imageView);

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imagenLandScape.setImageResource(R.drawable.ic_launcher_background);

                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imagenLandScape.setImageResource(R.drawable.ic_launcher_foreground);

                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imagenLandScape.setImageResource(R.drawable.ic_flecha_hacia_abajo);

                }
            });
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imagenLandScape.setImageResource(R.drawable.ic_casas);

                }
            });
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imagenLandScape.setImageResource(R.drawable.ic_flecha_hacia_azul);

                }
            });
        }
    }
}
