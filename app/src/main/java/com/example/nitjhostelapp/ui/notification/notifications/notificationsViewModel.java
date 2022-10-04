package com.example.nitjhostelapp.ui.notification.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class notificationsViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private final MutableLiveData<String> mText;

    public notificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Notification fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}