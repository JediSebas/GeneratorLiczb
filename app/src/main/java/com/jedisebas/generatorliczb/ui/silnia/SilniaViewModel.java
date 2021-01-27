package com.jedisebas.generatorliczb.ui.silnia;

import android.widget.EditText;
import android.widget.TextView;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SilniaViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public SilniaViewModel() {mText = new MutableLiveData<>();}

    long fact(int n) {
        long result;

        if (n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }

    public MutableLiveData<String> silnia(EditText et, TextView tv){
        int x = 1;
        try{
            x = Integer.parseInt(et.getText().toString().trim());
        }catch (NumberFormatException e){et.setText("1"); x=1;}
        finally {
            if (x == 0) {tv.setText("1");}
            else {
                String out = Long.toString(fact(x));
                mText.setValue(out);
                tv.setText(out);
            }
        }
        return mText;
    }
}