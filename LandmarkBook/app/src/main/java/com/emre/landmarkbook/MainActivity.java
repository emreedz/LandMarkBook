package com.emre.landmarkbook;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.emre.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    ArrayList<Landmark> landmarkArrayList = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Data
        Landmark pisa = new Landmark(R.drawable.pisa, "Pisa Tower", "Italy");
        Landmark eiffel = new Landmark(R.drawable.eiffel, "Eiffel", "France");
        Landmark colosseum = new Landmark(R.drawable.colosseum, "Colosseum", "Italy");
        Landmark ayasoyfa = new Landmark(R.drawable.ayasofya, "Ayasofya", "Turkey");


        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(ayasoyfa);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

        //Adapter
        //Listview
        //Mapping
        /*
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.landmarkName).collect(Collectors.toList())
        );
        binding.listview.setAdapter(arrayAdapter);

        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(MainActivity.this, landmarkArrayList.get(i).landmarkName, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("landmark", landmarkArrayList.get(i));
                startActivity(intent);
            }
        });
        */
    }
}