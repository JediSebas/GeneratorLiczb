package com.jedisebas.generatorliczb.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.jedisebas.generatorliczb.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView result = root.findViewById(R.id.text_home);
        final EditText start = root.findViewById(R.id.startEt);
        final EditText stop = root.findViewById(R.id.stopEt);
        final Button button = root.findViewById(R.id.generate);
        button.setText("generuj");
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                homeViewModel.gen(start, stop, result);
            }
        });
        return root;
    }
}