package com.example.image.tutorial_10_to_20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.image.R;
import com.example.image.databinding.FacebookbelllayoutBinding;
import com.example.image.databinding.FacebookfriendlistBinding;
import com.example.image.databinding.Facebooklayout1Binding;
import com.example.image.databinding.InstalayoutBinding;
import com.example.image.databinding.Picartlayout1Binding;
import com.example.image.databinding.WhatsapplayoutBinding;
import com.example.image.databinding.WhatsstatuslayoutBinding;

import java.util.ArrayList;

public class layoutActivity extends AppCompatActivity {


    InstalayoutBinding binding;
//    Picartlayout1Binding binding;
//    Facebooklayout1Binding binding;
//    FacebookfriendlistBinding binding;
//    WhatsapplayoutBinding binding;
//     WhatsstatuslayoutBinding binding;
//     FacebookbelllayoutBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=InstalayoutBinding.inflate(getLayoutInflater());
//        binding=Picartlayout1Binding.inflate(getLayoutInflater());
//        binding=Facebooklayout1Binding.inflate(getLayoutInflater());
//        binding=WhatsapplayoutBinding.inflate(getLayoutInflater());
//        binding=WhatsstatuslayoutBinding.inflate(getLayoutInflater());
//        binding=FacebookbelllayoutBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
    
        getSupportActionBar().hide();
        ArrayList<instaModel> arrayList=new ArrayList<>();
        arrayList.add(new instaModel(R.drawable.dhoni,"M.S Dhoni"));
        arrayList.add(new instaModel(R.drawable.virat,"Virat Kholi"));
        arrayList.add(new instaModel(R.drawable.rohit,"Rohit Sharma"));
        arrayList.add(new instaModel(R.drawable.rahul,"K.L Rahul"));
        arrayList.add(new instaModel(R.drawable.surya,"SuryaKumar Yadav"));
        arrayList.add(new instaModel(R.drawable.hardik,"Hardik Pandya"));
        arrayList.add(new instaModel(R.drawable.image6,"name"));
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL,false);
        binding.story.setLayoutManager(linearLayoutManager);

        instaClass instaClass=new instaClass(arrayList,getApplicationContext());
        binding.story.setAdapter(instaClass);

    }
}