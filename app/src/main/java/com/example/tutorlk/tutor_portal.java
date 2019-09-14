package com.example.tutorlk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class tutor_portal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_portal);

        Intent intent=getIntent();

        String id=intent.getStringExtra("Studentid");


        ArrayList<tutor_tab> studentListDB=new ArrayList<>();

        studentListDB.add(new tutor_tab(R.drawable.studentpic,"Sadaruwan","o/l student"));
        studentListDB.add(new tutor_tab(R.drawable.stud2,"Ridma Weerawardana","postgraduate"));
        studentListDB.add(new tutor_tab(R.drawable.studentpic,"Tuter 3","Education"));
        studentListDB.add(new tutor_tab(R.drawable.studentpic,"Tuter 4","Education"));
        studentListDB.add(new tutor_tab(R.drawable.studentpic,"Tuter 5","Education"));
        studentListDB.add(new tutor_tab(R.drawable.studentpic,"Tuter 6","Education"));
        studentListDB.add(new tutor_tab(R.drawable.studentpic,"Tuter 7","Education"));
        studentListDB.add(new tutor_tab(R.drawable.studentpic,"Tuter 8","Education"));
        studentListDB.add(new tutor_tab(R.drawable.studentpic,"Tuter 9","Education"));
        studentListDB.add(new tutor_tab(R.drawable.studentpic,"Tuter 10","Education"));
        studentListDB.add(new tutor_tab(R.drawable.studentpic,"Tuter 11","Education"));




        int index=getindex(id,studentListDB);
        tutor_tab Student=studentListDB.get(index);

        ImageView stu_pic=(ImageView)findViewById(R.id.student_img);
        TextView name=(TextView) findViewById(R.id.std_name);
        TextView edu=(TextView) findViewById(R.id.std_education);

        stu_pic.setImageResource(Student.getmImageResource());     // use setImageResourse
        name.setText(Student.getmText1());
        edu.setText(Student.getmText2());



    }


    public int getindex(String id,ArrayList<tutor_tab> list){

        int noOfobject=list.size();

        for(int i=0;i<=noOfobject;i++){
            System.out.println(i);
            System.out.println(id);
            if(list.get(i).getmText1().equalsIgnoreCase(id)){

                return i;


            }
            else {
                System.out.println("\nSearching");

            }


        }
        System.out.println("object does not is not there in the studentlistDB arrays");
        return 6;


    }



}
