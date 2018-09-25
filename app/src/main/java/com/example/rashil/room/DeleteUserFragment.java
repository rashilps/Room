package com.example.rashil.room;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class DeleteUserFragment extends Fragment {

    EditText userId;
    Button delete;


    public DeleteUserFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete_user, container, false);
        userId = view.findViewById(R.id.userID);
        delete = view.findViewById(R.id.delete);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(userId.getText().toString());
                User user = new User();
                user.setId(id);

                MainActivity.myAppDatabase.myDoa().deleteUser(user);

                Toast.makeText(getActivity(),"User Deleted Successfully",Toast.LENGTH_SHORT).show();
                userId.setText("");
            }
        });




        return view;
        }

}
