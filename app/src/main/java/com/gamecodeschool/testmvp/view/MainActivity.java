package com.gamecodeschool.testmvp.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gamecodeschool.testmvp.R;
import com.gamecodeschool.testmvp.contracts.MainContract;
import com.gamecodeschool.testmvp.presenter.PresenterImpl;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private Button btnSave;
    private Button btnRetrieve;
    private TextView updateView;
    private EditText name;
    private MainContract.Presenter presenter;

    private String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiateViews();
        clickListener();
    }

    private void clickListener() {


            btnSave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    userName = name.getText().toString();
                    presenter.SaveButtonClick(userName);
                }
            });

        btnRetrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                presenter.RetrieveButtonClick();
            }
        });

    }


    public void initiateViews(){

        btnSave = (Button) findViewById(R.id.buttonSave);
        btnRetrieve = (Button) findViewById(R.id.buttonRetrieve);
        updateView = (TextView) findViewById(R.id.tvNameShow);
        name = (EditText) findViewById(R.id.etName);
        presenter = new PresenterImpl(this);


    }

    @Override
    public void DisplayData(String username) {
        updateView.setText(username);
    }
}