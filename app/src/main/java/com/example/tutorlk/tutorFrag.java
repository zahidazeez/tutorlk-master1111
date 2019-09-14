package com.example.tutorlk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class tutorFrag extends Fragment {

    private RecyclerView sRecycleView;
    private tutor_feed_adaper mAdapter;                                    //private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.frag_student_feed,container,false);

        final ArrayList <tutor_tab> studentList =new ArrayList<>();

        studentList.add(new tutor_tab(R.drawable.studentpic,"Sadaruwan","Graguated in IT"));
        studentList.add(new tutor_tab(R.drawable.stud2,"Ridma weerawardana","Sinhala"));
        studentList.add(new tutor_tab(R.drawable.studentpic,"A.D.Kalpa","Science"));
        studentList.add(new tutor_tab(R.drawable.studentpic,"Poojitha Karunarathna","History"));
        studentList.add(new tutor_tab(R.drawable.studentpic,"Sadun Hettige","Maths"));
        studentList.add(new tutor_tab(R.drawable.studentpic,"Hasindu Madushan","Arts"));
        studentList.add(new tutor_tab(R.drawable.studentpic,"Kasun Chamara","Android Devolopmet"));
        studentList.add(new tutor_tab(R.drawable.studentpic,"Pasindu Madushan","Health"));
        studentList.add(new tutor_tab(R.drawable.studentpic,"Chamara","Sinhala"));
        studentList.add(new tutor_tab(R.drawable.studentpic,"Weerathunga","Maths"));
        studentList.add(new tutor_tab(R.drawable.studentpic,"Nirmal Pathirana","Science"));





        sRecycleView = (RecyclerView) view.findViewById(R.id.recyclerView_student_feed);
        sRecycleView.setHasFixedSize(true);
        mLayoutManager =new LinearLayoutManager(getActivity());
        mAdapter=new tutor_feed_adaper(studentList);


        sRecycleView.setLayoutManager((mLayoutManager));
        sRecycleView.setAdapter(mAdapter);

        mAdapter.setOnIemClickListner(new tutor_feed_adaper.onItemClickLIstner() {
            @Override
            public void onItemClick(int position) {

                String studentid=studentList.get(position).getmText1();
                studentList.get(position).OpentStudentportal(view.getContext(),studentid);



            }
        });

        return view;
    }

    public void openPortal(String id){ //id os the name




    };


}
