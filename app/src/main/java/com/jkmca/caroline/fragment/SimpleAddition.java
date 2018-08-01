package com.jkmca.caroline.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SimpleAddition extends Fragment
{
    TextView textView;


// method to mainly connect the layout of the fragment to the fragment's java class.
@Nullable
@Override
public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle
        savedInstanceState) {
        //inflating the SimpleAddition.java file with the so created layout file for the same.
        return inflater.inflate(R.layout.simple_addition,container,false);
        }

//a method which is called when the main activity's onCreate is completed.
@Override
public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //initializing the text view by referencing the EditText's ID.
        textView = (TextView) getActivity().findViewById(R.id.viewText);
        }

// method to change the text of the text view inside the fragment.
public void changeText(String data){
        //setting the text of the text view to the data got from the edit text.
        textView.setText(data);
        }
}
