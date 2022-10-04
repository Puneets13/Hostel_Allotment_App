package com.example.nitjhostelapp.ui.hostelpolicy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.nitjhostelapp.databinding.FragmentHostelpolicyBinding;

public class hostelPolicyFragment extends Fragment {

    private FragmentHostelpolicyBinding binding;
//hostel policy
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        hostelpolicyViewModel galleryViewModel =
                new ViewModelProvider(this).get(hostelpolicyViewModel.class);

        binding = FragmentHostelpolicyBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHostelPolicy;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}