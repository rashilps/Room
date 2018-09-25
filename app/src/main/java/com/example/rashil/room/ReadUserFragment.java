package com.example.rashil.room;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class ReadUserFragment extends Fragment {
        private TextView txtInfo;

    public ReadUserFragment() {



    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_read_user, container, false);

        txtInfo = view.findViewById(R.id.textDisplayInfo);

        List<User> users = MainActivity.myAppDatabase.myDoa().getUsers();

        String info = "";

        for(User usr : users){
             int id = usr.getId();
             String name = usr.getName();
             String email = usr.getEmail();

             info = info+"\n\n "+"Id :" + id + "\nName :" + name + "\nEmail :" + email;
        }

        txtInfo.setText(info);

        return  view;
    }

}
