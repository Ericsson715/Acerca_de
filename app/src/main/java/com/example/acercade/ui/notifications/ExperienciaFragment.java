package com.example.acercade.ui.notifications;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.acercade.databinding.FragmentExperienciaBinding;
import com.example.acercade.databinding.FragmentPreciosBinding;


public class ExperienciaFragment extends Fragment {

    private FragmentExperienciaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding =  FragmentExperienciaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final ImageView imageV= binding.doctora;
       // notificationsViewModel.getImageview;
        return root;

           }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}