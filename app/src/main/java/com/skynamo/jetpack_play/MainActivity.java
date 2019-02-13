package com.skynamo.jetpack_play;

import android.os.Bundle;

import com.skynamo.jetpack_play.jetpack_play.R;
import com.skynamo.jetpack_play.jetpack_play.databinding.ActivityMainBinding;
import com.skynamo.jetpack_play.viewmodels.ReimbursementClaimViewModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {

    private ReimbursementClaimViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewModel = ViewModelProviders.of(this).get(ReimbursementClaimViewModel.class);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setModel(mViewModel);
    }

}
