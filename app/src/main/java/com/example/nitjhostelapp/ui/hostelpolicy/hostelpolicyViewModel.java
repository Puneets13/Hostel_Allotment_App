package com.example.nitjhostelapp.ui.hostelpolicy;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class hostelpolicyViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
//hostel policy
    public hostelpolicyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is hostel policy fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}