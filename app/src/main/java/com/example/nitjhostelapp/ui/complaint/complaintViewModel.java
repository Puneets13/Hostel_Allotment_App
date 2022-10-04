package com.example.nitjhostelapp.ui.complaint;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class complaintViewModel extends ViewModel {
//complaint
    private final MutableLiveData<String> mText;

    public complaintViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is complaint fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}