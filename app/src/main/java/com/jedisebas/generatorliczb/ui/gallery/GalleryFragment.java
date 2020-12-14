package com.jedisebas.generatorliczb.ui.gallery;

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

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final TextView resultfir = root.findViewById(R.id.text_gallery);
        final EditText firdt = root.findViewById(R.id.firstEt);
        final Button obl = root.findViewById(R.id.oblBtn);
        obl.setText("oblicz");
        obl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                galleryViewModel.first(firdt, resultfir);
            }
        });
        return root;
    }
}