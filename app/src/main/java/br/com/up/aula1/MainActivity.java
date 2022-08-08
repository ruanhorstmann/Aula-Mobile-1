package br.com.up.aula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonSelect;
    private TextView textTitle;
    private ArrayList<String> ListPhases = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListPhases.add("Comprar um café");
        ListPhases.add("Comprar um chá");
        ListPhases.add("Comprar um bolo");

        buttonSelect = findViewById(R.id.button_select);
        textTitle = findViewById(R.id.text_title);


        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int position = new Random().nextInt(ListPhases.size());
                textTitle.setText(ListPhases.get(position));

                //textTitle.setText("Aula 1");

            }
        };

        buttonSelect.setOnClickListener(clickListener);
    }
}