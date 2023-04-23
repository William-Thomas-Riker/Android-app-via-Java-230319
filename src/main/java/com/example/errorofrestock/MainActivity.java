/**
*Copiright2023'William-Thomas-Riker'. All rights reserved.
*/
package com.example.errorofrestock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
////import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
////import android.widget.Toast;

import com.example.errorofrestock.databinding.ActivityMainBinding;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

  static final com.example.errorofrestock.CellData dataBox = new CellData();
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ////setContentView(R.layout.activity_main);
    ActivityMainBinding binding = DataBindingUtil.setContentView(this , R.layout.activity_main);
    binding.setDataBox(dataBox);
    ////printComponentClassName((ViewGroup) findViewById(R.id.layoutTable01));
    setNyuuryokuListener(binding.layoutTable01);
  }
  ////IME option listener is made, listener getter/setter
  private TextView.OnEditorActionListener listener;
  private TextView.OnEditorActionListener getNyuuryokuListener(){
    listener = new TextView.OnEditorActionListener() {
      @Override
      public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == EditorInfo.IME_ACTION_NEXT || i == EditorInfo.IME_ACTION_DONE) {
          //action; NEXT / DONE tapped
          String s = (textView.getText()).toString();
          s = dataBox.doubleToString(dataBox.stringToDouble(s));
          textView.setText(s);
          ////Toast.makeText(getApplicationContext(),"IME_NEXT",Toast.LENGTH_LONG).show();
          return true;
        }
        return false;
      }
    };
    return listener;
  }
  ////select type:EditText components, set IME listener to each of them
  private void setNyuuryokuListener(View v){
    if (v instanceof EditText) {
      ((EditText) v).setOnEditorActionListener(getNyuuryokuListener());
    }
    if (v instanceof ViewGroup) {
      ViewGroup layout = (ViewGroup) v;
      for (int i = 0 ; i < layout.getChildCount() ; i++) {
        setNyuuryokuListener(layout.getChildAt(i));
      }
    }
  }
    /* draft
    void printComponentClassName (View v) {
    if (v instanceof EditText){
      Log.d("componentClassName" , getApplicationContext().getResources().getResourceName(v.getId()));
    }
      if ( v instanceof ViewGroup) {
        ViewGroup layout = (ViewGroup) v;
        for ( int i = 0 ; i < layout.getChildCount() ; i++){
          printComponentClassName(layout.getChildAt(i));
        }
      }
    }
*/
}
