package com.demo.demodatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;


public class UserInfo {
    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<Integer> age = new ObservableField<>();
    public ObservableField<Boolean> isStudent = new ObservableField<>();

    public UserInfo(){
        name.set("王羲之");
        age.set(18);
        isStudent.set(false);
    }
}
