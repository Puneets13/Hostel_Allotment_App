package com.example.nitjhostelapp.ui.complaint;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.nitjhostelapp.databinding.FragmentComplaintBinding;

public class complaintFragment extends Fragment {

    private FragmentComplaintBinding binding;
//complaint
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        complaintViewModel slideshowViewModel =
                new ViewModelProvider(this).get(complaintViewModel.class);

        binding = FragmentComplaintBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textComplaint;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}