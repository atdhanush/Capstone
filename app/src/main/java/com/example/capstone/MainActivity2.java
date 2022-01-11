package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s1[],s2[];
        int images[]={R.drawable.bacterialspot,R.drawable.earlybright,
                R.drawable.latebright,R.drawable.leafmold,R.drawable.mosiacvirus,
                R.drawable.septorialeafspot,R.drawable.spidermitestwospottedspidermite,
                R.drawable.targetspot,R.drawable.healthy,R.drawable.yellowleafcurlvirus};
        s1= getResources().getStringArray(R.array.title);
        s2= getResources().getStringArray(R.array.content);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);
        b10=findViewById(R.id.button10);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.diseasedisp);
                TextView t1 = findViewById(R.id.diseasesname);
                TextView t2 = findViewById(R.id.treatment);
                ImageView im1 = findViewById(R.id.imageView);
                t1.setText(s1[0]);
                t2.setText(s2[0]);
                im1.setImageResource(images[0]);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.diseasedisp);
                TextView t1 = findViewById(R.id.diseasesname);
                TextView t2 = findViewById(R.id.treatment);
                ImageView im1 = findViewById(R.id.imageView);
                t1.setText(s1[1]);
                t2.setText(s2[1]);
                im1.setImageResource(images[1]);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.diseasedisp);
                TextView t1 = findViewById(R.id.diseasesname);
                TextView t2 = findViewById(R.id.treatment);
                ImageView im1 = findViewById(R.id.imageView);
                t1.setText(s1[2]);
                t2.setText(s2[2]);
                im1.setImageResource(images[2]);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.diseasedisp);
                TextView t1 = findViewById(R.id.diseasesname);
                TextView t2 = findViewById(R.id.treatment);
                ImageView im1 = findViewById(R.id.imageView);
                t1.setText(s1[3]);
                t2.setText(s2[3]);
                im1.setImageResource(images[3]);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.diseasedisp);
                TextView t1 = findViewById(R.id.diseasesname);
                TextView t2 = findViewById(R.id.treatment);
                ImageView im1 = findViewById(R.id.imageView);
                t1.setText(s1[4]);
                t2.setText(s2[4]);
                im1.setImageResource(images[4]);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.diseasedisp);
                TextView t1 = findViewById(R.id.diseasesname);
                TextView t2 = findViewById(R.id.treatment);
                ImageView im1 = findViewById(R.id.imageView);
                t1.setText(s1[5]);
                t2.setText(s2[5]);
                im1.setImageResource(images[5]);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.diseasedisp);
                TextView t1 = findViewById(R.id.diseasesname);
                TextView t2 = findViewById(R.id.treatment);
                ImageView im1 = findViewById(R.id.imageView);
                t1.setText(s1[6]);
                t2.setText(s2[6]);
                im1.setImageResource(images[6]);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.diseasedisp);
                TextView t1 = findViewById(R.id.diseasesname);
                TextView t2 = findViewById(R.id.treatment);
                ImageView im1 = findViewById(R.id.imageView);
                t1.setText(s1[7]);
                t2.setText(s2[7]);
                im1.setImageResource(images[7]);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.diseasedisp);
                TextView t1 = findViewById(R.id.diseasesname);
                TextView t2 = findViewById(R.id.treatment);
                ImageView im1 = findViewById(R.id.imageView);
                t1.setText(s1[8]);
                t2.setText(s2[8]);
                im1.setImageResource(images[8]);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.diseasedisp);
                TextView t1 = findViewById(R.id.diseasesname);
                TextView t2 = findViewById(R.id.treatment);
                ImageView im1 = findViewById(R.id.imageView);
                t1.setText(s1[9]);
                t2.setText(s2[9]);
                im1.setImageResource(images[9]);
            }
        });
    }

}