package com.example.nitjhostelapp.ui.help;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class helpViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private final MutableLiveData<String> mText;

    public helpViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is help fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}