package com.example.hw_3_2;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FirstFragment extends Fragment {

    private TextView textView;
    private Button buttonPlus;
    private Button buttonMinus;
    private int click;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findid();
        buttonsClicks();
    }

    private void findid() {
        textView = requireActivity().findViewById(R.id.tw_1);
        buttonPlus = requireActivity().findViewById(R.id.btn_plus);
        buttonMinus = requireActivity().findViewById(R.id.btn_minus);
    }

    private void buttonsClicks() {
        buttonPlus.setOnClickListener(view -> {
            textView.setText(String.valueOf(click));
            click++;
        });

        buttonMinus.setOnClickListener(view -> {
            textView.setText(String.valueOf(click));
            click--;

        });
    }
}