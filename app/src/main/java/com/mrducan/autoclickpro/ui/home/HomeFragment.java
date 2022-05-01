package com.mrducan.autoclickpro.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mrducan.autoclickpro.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView tvHfDesTitle = binding.tvHfDesTitle;
        final TextView tvHfDesCon =binding.tvHfDesCon;
        final Button btnHfStServer = binding.btnHfStServer;
        final Button btnHfStPopWin = binding.btnHfStPopWin;
        final Button btnHfStReStep = binding.btnHfStReStep;
        homeViewModel.getText().observe(getViewLifecycleOwner(), tvHfDesCon::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}