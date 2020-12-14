package com.jedisebas.generatorliczb.ui.gallery;

import android.widget.EditText;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
    }

    public MutableLiveData<String> first(EditText et, TextView tv){
        String sm;
        int m=1;
        try {
            sm = et.getText().toString().trim();
            m = Integer.parseInt(sm);
        }catch (NumberFormatException e){et.setText("1"); m=1;}
        finally {
            int input, whichNumber = 0, i, j, first = 2;
            input = m;
            for (i = 2; input != whichNumber; i++) {
                for (j = 2; j < i + 1; j++) {
                    if (i % j == 0) {
                        if (j == i) {
                            whichNumber++;
                            first = i;
                        }
                        break;
                    }
                }
            }
            String si = Integer.toString(first);
            mText.setValue(si);
            tv.setText(si);
        }
        return mText;
    }
}