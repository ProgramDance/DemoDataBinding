package com.demo.demodatabinding;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class EventHandler {
    public void handleClick(View view){
        Log.d("tag", "handleClick>>");
        Toast.makeText(view.getContext(), view.getId() + ">>onClick", Toast.LENGTH_SHORT).show();
    }
}
