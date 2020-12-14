package com.jedisebas.generatorliczb.ui.home;

import android.widget.EditText;
import android.widget.TextView;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
    }


    public MutableLiveData<String> gen(EditText et1, EditText et2, TextView tv){
        String starts, stops, ress;
        int s1 = 0, s2 = s1 + 1, res;
        try{
            starts = et1.getText().toString().trim();
            s1 = Integer.parseInt(starts);
        }catch (NumberFormatException e){et1.setText("0");}
        try{
            stops = et2.getText().toString().trim();
            s2 = Integer.parseInt(stops);
        }catch (NumberFormatException e){
            s2 = s1 + 1;
            String er = Integer.toString(s2);
            et2.setText(er);
        }
        finally {
            if (s1 < s2) {
                res = (int) (Math.random() * (s2 - s1 + 1) + s1);
            }else {
                res = (int) (Math.random() * (s1 - s2 + 1) + s2);
            }
            ress = Integer.toString(res);
            mText.setValue(ress);
            tv.setText(ress);
        }
        return mText;
    }
}