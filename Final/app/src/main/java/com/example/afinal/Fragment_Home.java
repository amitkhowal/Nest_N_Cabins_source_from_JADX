package com.example.afinal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Fragment_Home extends Fragment {
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mNames1 = new ArrayList<>();
    private ArrayList<String> mImageUrls1 = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.fragment_home,container,false);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        RecyclerView recyclerView1=view.findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView1.setLayoutManager(layoutManager1);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(), mNames, mImageUrls);
        RecyclerViewAdapter1 adapter1=new RecyclerViewAdapter1(getContext(),mNames1,mImageUrls1);
        recyclerView.setAdapter(adapter);
        recyclerView1.setAdapter(adapter1);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getImages();
        getImages1();
    }

    public void getImages(){

        mImageUrls.add("https://img.staticmb.com/mbphoto/property/cropped_images/2018/Dec/09/Photo_h180_w240/38557865_14__O0A9632copy_180_240.jpg");
        mNames.add("Gagan PG");

        mImageUrls.add("https://www.allroomz.com/uploads/blog/blog_2017_08_30_12_07_49.jpg");
        mNames.add("Satyam Homes");

        mImageUrls.add("https://www.zamroo.com/images/product-images/real-estate/pg-accommodation/medium/20150512084547-45807.jpg");
        mNames.add("Akash Homes");

        mImageUrls.add("https://www.grotal.com/ToletImages/f1ac2664-719d-4c2f-a25a-dc020471b694.jpg");
        mNames.add("Harbhajan Stays");


        mImageUrls.add("https://images.jdmagicbox.com/comp/zirakpur/d8/0172px172.x172.190510140224.q5d8/catalogue/stay-home-pg-services-zirakpur-paying-guest-accommodations-mc2tx464so.jpg");
        mNames.add("Magic Homes");

        mImageUrls.add("https://content3.jdmagicbox.com/comp/chandigarh/g1/0172px172.x172.180220114427.d5g1/catalogue/brar-s-pg-sector-34d-chandigarh-paying-guest-accommodations-for-men-hvo5i.jpg");
        mNames.add("Sangam Homes");


        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands Desert");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");


    }
    public void getImages1(){

        mImageUrls1.add("https://img.staticmb.com/mbphoto/property/cropped_images/2018/Dec/09/Photo_h180_w240/38557865_14__O0A9632copy_180_240.jpg");
        mNames1.add("Gagan PG");

        mImageUrls1.add("https://www.allroomz.com/uploads/blog/blog_2017_08_30_12_07_49.jpg");
        mNames1.add("Satyam Homes");

        mImageUrls1.add("https://www.zamroo.com/images/product-images/real-estate/pg-accommodation/medium/20150512084547-45807.jpg");
        mNames1.add("Akash Homes");

        mImageUrls1.add("https://www.grotal.com/ToletImages/f1ac2664-719d-4c2f-a25a-dc020471b694.jpg");
        mNames1.add("Harbhajan Stays");


        mImageUrls1.add("https://images.jdmagicbox.com/comp/zirakpur/d8/0172px172.x172.190510140224.q5d8/catalogue/stay-home-pg-services-zirakpur-paying-guest-accommodations-mc2tx464so.jpg");
        mNames1.add("Magic Homes");

        mImageUrls1.add("https://content3.jdmagicbox.com/comp/chandigarh/g1/0172px172.x172.180220114427.d5g1/catalogue/brar-s-pg-sector-34d-chandigarh-paying-guest-accommodations-for-men-hvo5i.jpg");
        mNames1.add("Sangam Homes");


        mImageUrls1.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames1.add("White Sands Desert");

        mImageUrls1.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames1.add("Austrailia");

        mImageUrls1.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames1.add("Washington");


    }
}
