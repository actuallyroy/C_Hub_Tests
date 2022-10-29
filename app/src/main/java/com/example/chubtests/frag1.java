package com.example.chubtests;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class frag1 extends Fragment {
    public frag1(){
        super(R.layout.frag_1);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Here-------------", "----------------------------------");
    }
}
