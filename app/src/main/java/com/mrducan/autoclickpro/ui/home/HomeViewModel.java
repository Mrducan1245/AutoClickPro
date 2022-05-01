package com.mrducan.autoclickpro.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> titleText;


    public HomeViewModel() {
        titleText = new MutableLiveData<>();
        titleText.setValue("屏幕已翻转，请转回竖面谢谢");
    }

    public LiveData<String> getText() {
        return titleText;
    }
}