package com.example.nitjhostelapp.ui.account_settings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class account_settingsViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private final MutableLiveData<String> mText;

    public account_settingsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is account settings fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}