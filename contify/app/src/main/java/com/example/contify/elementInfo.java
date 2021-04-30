package com.example.contify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class elementInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element_info);


        ImageView img = findViewById(R.id.img);
        TextView NameTXT = findViewById(R.id.name);
        TextView Atomic_masTXT = findViewById(R.id.atomic_we);
        TextView Atomic_numTXT = findViewById(R.id.atomic_num);
        TextView symbTXT = findViewById(R.id.symb);
        TextView comm =findViewById(R.id.comm);

        Bundle get = getIntent().getExtras();

        String common = get.getString("Common");
        String Name = get.getString("Name");
        String symb = get.getString("symb");
        Double Atomic_Mass = get.getDouble("Atomic_Mass");
        int Image = get.getInt("Image");
        int Atomic_Num = get.getInt("Atomic_Number");

        comm.setText(common);
        NameTXT.setText(Name);
        Atomic_masTXT.setText(Atomic_Mass + "");
        Atomic_numTXT.setText(Atomic_Num + "");
        symbTXT.setText(symb);
        img.setImageResource(Image);







    }
}