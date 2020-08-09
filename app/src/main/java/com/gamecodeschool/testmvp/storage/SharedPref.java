package com.gamecodeschool.testmvp.storage;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gamecodeschool.testmvp.contracts.MainContract;
import com.gamecodeschool.testmvp.model.ModelImpl;


public class SharedPref extends AppCompatActivity {
    private MainContract.Model model;
    private String UzaName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    public void DataSave(String Uzaa){
        this.UzaName =Uzaa;
        SharedPreferences sharedPref1 = getSharedPreferences("myKey1", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref1.edit();
        editor.clear();
        editor.apply();
        editor.putString("userName", UzaName);
        editor.apply();

    }

    public void DataRetrieve(){

        SharedPreferences sharedPreferences = getSharedPreferences("myKey1", MODE_PRIVATE);
        String uzaRetrieved = sharedPreferences.getString("userName", "");

        model.DataRetrievedFromSharedPref(uzaRetrieved);

    }
}
