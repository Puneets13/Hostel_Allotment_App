package com.example.nitjhostelapp.ui.account_settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.nitjhostelapp.databinding.FragmentAboutBinding;
import com.example.nitjhostelapp.databinding.FragmentAccountSettingsBinding;
import com.example.nitjhostelapp.databinding.FragmentComplaintBinding;

public class AccountSettingsFragment extends Fragment {

    private FragmentAccountSettingsBinding binding;
    //complaint
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        account_settingsViewModel slideshowViewModel =
                new ViewModelProvider(this).get(account_settingsViewModel.class);

        binding = FragmentAccountSettingsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAccountSetings;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}