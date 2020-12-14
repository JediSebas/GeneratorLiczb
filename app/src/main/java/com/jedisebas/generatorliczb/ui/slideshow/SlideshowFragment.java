package com.jedisebas.generatorliczb.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.jedisebas.generatorliczb.R;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        final EditText input = root.findViewById(R.id.inputEt);
        final Button fib = root.findViewById(R.id.fibBtn);
        fib.setText("oblicz");
        fib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideshowViewModel.fibonacci(input, textView);
            }
        });
        return root;
    }
}