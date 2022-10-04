//package com.example.nitjhostelapp.ui.ui.notifications;
//
//import androidx.lifecycle.ViewModelProvider;
//
//import android.os.Bundle;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import com.example.nitjhostelapp.databinding.FragmentGalleryBinding;
//import com.example.nitjhostelapp.ui.gallery.GalleryViewModel;
//
//
//public class notificationsFragment extends Fragment {
//
//    private notificationsViewModel mViewModel;
//
//    public static notificationsFragment newInstance() {
//        return new notificationsFragment();
//    }
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_notification, container, false);
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        mViewModel = new ViewModelProvider(this).get(notificationsViewModel.class);
//        // TODO: Use the ViewModel
//    }
//
//}

package com.example.nitjhostelapp.ui.notification.notifications;

        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.fragment.app.Fragment;
        import androidx.lifecycle.ViewModelProvider;

        import com.example.nitjhostelapp.databinding.FragmentNotificationBinding;

public class notificationsFragment extends Fragment {

    private FragmentNotificationBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel galleryViewModel =
                new ViewModelProvider(this).get(notificationsViewModel.class);

        binding = FragmentNotificationBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
//
        final TextView textView = binding.textNotification;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}