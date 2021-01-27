package com.jedisebas.generatorliczb.ui.silnia;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jedisebas.generatorliczb.R;
import com.jedisebas.generatorliczb.ui.slideshow.SlideshowViewModel;

public class SilniaFragment extends Fragment {

    private SilniaViewModel silniaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        silniaViewModel =
                ViewModelProviders.of(this).get(SilniaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_silnia, container, false);
        final TextView textView = root.findViewById(R.id.text_silnia);
        final EditText input = root.findViewById(R.id.numEt);
        final Button fib = root.findViewById(R.id.silBtn);
        fib.setText("oblicz");
        fib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                silniaViewModel.silnia(input, textView);
            }
        });
        return root;
    }

}