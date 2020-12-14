package com.jedisebas.generatorliczb.ui.slideshow;

import android.widget.EditText;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {mText = new MutableLiveData<>();}

    public MutableLiveData<String> fibonacci(EditText et, TextView tv){
        int x = 1;
        try{
            x = Integer.parseInt(et.getText().toString().trim());
        }catch (NumberFormatException e){et.setText("1"); x=1;}
        finally {
            int input = x, whichNumber = 0;
            long i = 0, j, fib = 1;
            while (input != whichNumber) {
                j = fib;
                fib += i;
                i = j;
                whichNumber++;
            }
            String out = Long.toString(fib);
            mText.setValue(out);
            tv.setText(out);
        }
        return mText;
    }
}