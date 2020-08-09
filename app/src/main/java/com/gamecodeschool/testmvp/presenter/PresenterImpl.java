package com.gamecodeschool.testmvp.presenter;

import com.gamecodeschool.testmvp.contracts.MainContract;

public class PresenterImpl implements MainContract.Presenter {

    private MainContract.Model model;
    private MainContract.View view;

    public PresenterImpl(MainContract.Model model) {
        this.model = model;

    }

    public PresenterImpl(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void SaveButtonClick(String username) {
        model.SaveData(username);

    }

    @Override
    public void RetrieveButtonClick() {
        model.RetrieveData();

    }

    @Override
    public void DataFromModel(String username) {
        view.DisplayData(username);

    }
}
