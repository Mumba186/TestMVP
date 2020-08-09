package com.gamecodeschool.testmvp.model;

import com.gamecodeschool.testmvp.contracts.MainContract;
import com.gamecodeschool.testmvp.storage.SharedPref;

public class ModelImpl implements MainContract.Model {
    private MainContract.Presenter presenter;
    SharedPref sharedPref;

    public ModelImpl(MainContract.Presenter presenter) {
        this.presenter = presenter;
        sharedPref = new SharedPref();
    }

    @Override
    public void SaveData(String username) {
        sharedPref.DataSave(username);

    }

    @Override
    public void RetrieveData() {
        sharedPref.DataRetrieve();
    }

    @Override
    public void DataRetrievedFromSharedPref(String username) {
        presenter.DataFromModel(username);

    }
}
