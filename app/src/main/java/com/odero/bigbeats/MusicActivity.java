package com.odero.bigbeats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.odero.bigbeats.databinding.ActivityMusicBinding;

public class MusicActivity extends AppCompatActivity {
    ActivityMusicBinding binding;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        this.setTitle("User Name : "+userName);

        binding = ActivityMusicBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.african,R.drawable.afrofusion,R.drawable.blues,R.drawable.christian,R.drawable.classical,
            R.drawable.country,R.drawable.electro,R.drawable.fusion,R.drawable.jazz,
                R.drawable.middle,R.drawable.novelty,R.drawable.reggea
                };
        String[] categoryName = {"African Music","Afro fusion","Blues","Christian Music","Classical Music",
                "Countey Music","Electro Music","World Fusion","Jazz Music","Middle East Music",
                "Novelty Music","Reggae Music"
            };
        String[] categoryDescription = {
                "African Music gives you the best of African voices.","" +
                "Afro beat fused with traditional African melodies"
        };
        String[] numberOfSongs ={};

    }
}