package com.emre.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.emre.landmarkbook.databinding.ActivityDetailsBinding;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        //Casting
        Landmark selectLandmark = (Landmark) intent.getSerializableExtra("landmark");
        binding.nameText.setText(selectLandmark.landmarkName);
        binding.countryText.setText(selectLandmark.landmarkCountry);
        binding.imageView.setImageResource(selectLandmark.landmarkimage);

    }
}