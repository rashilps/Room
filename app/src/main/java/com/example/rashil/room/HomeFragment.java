package com.example.rashil.room;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    Button button1, button2,button3, button4;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        button1 =view.findViewById(R.id.b1);
        button1.setOnClickListener(this);
        button2=view.findViewById(R.id.b2);
        button2.setOnClickListener(this);
        button3 = view.findViewById(R.id.b3);
        button3.setOnClickListener(this);

        button4 = view.findViewById(R.id.b4);
        button4.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b1:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.frameLayout, new AddUserFragment()).addToBackStack(null).commit();
                break;


            case R.id.b2:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.frameLayout, new ReadUserFragment()).addToBackStack(null).commit();
                break;

            case R.id.b3:
            MainActivity.fragmentManager.beginTransaction().replace(R.id.frameLayout, new DeleteUserFragment()).addToBackStack(null).commit();
            break;

            case R.id.b4:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.frameLayout, new UpdateUserFragment()).addToBackStack(null).commit();
                break;
        }
    }
}
