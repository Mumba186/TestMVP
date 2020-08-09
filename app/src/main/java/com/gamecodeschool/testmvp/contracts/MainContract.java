package com.gamecodeschool.testmvp.contracts;

public interface MainContract {

    interface Model{
        void SaveData(String username);
        void RetrieveData();
        void DataRetrievedFromSharedPref(String username);

    }

    interface Presenter{
        void SaveButtonClick(String username);
        void RetrieveButtonClick();
        void DataFromModel(String username);

    }

    interface View{

        void DisplayData(String username);

    }
}
