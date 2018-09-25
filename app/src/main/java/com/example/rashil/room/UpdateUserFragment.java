package com.example.rashil.room;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class UpdateUserFragment extends Fragment {
    private EditText UserId,Username,Useremail;

    private Button save;

    public UpdateUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update_user, container, false);
        UserId = view.findViewById(R.id.et1);
        Username = view.findViewById(R.id.et2);
        Useremail = view.findViewById(R.id.et3);
        save = view.findViewById(R.id.b1);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int userid = Integer.parseInt(UserId.getText().toString());
                String username = Username.getText().toString();
                String useremail = Useremail.getText().toString();

                User user = new User();
                user.setId(userid);
                user.setName(username);
                user.setEmail(useremail);

                MainActivity.myAppDatabase.myDoa().updateUser(user);

                Toast.makeText(getActivity(),"User updated successfully",Toast.LENGTH_SHORT).show();
                UserId.setText("");
                Useremail.setText("");
                Username.setText("");
            }
        });



        return view;
    }

}
