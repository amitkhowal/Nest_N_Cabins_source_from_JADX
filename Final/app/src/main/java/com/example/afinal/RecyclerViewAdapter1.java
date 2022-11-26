package com.example.afinal;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter1 extends RecyclerView.Adapter<RecyclerViewAdapter1.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> mNames1 = new ArrayList<>();
    private ArrayList<String> mimageUrls1 = new ArrayList<>();
    private Context mContext1;

    public RecyclerViewAdapter1(Context Context, ArrayList<String> Names, ArrayList<String> image)  {
        mContext1 = Context;
        mimageUrls1 = image;
        mNames1 = Names;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log.d(TAG, "onCreateViewHolder: called");
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemlist2,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override

    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Log.d(TAG, "onBindViewHolder: called");
        Glide.with(mContext1)
            .asBitmap()
            .load(mimageUrls1.get(i))
            .into(viewHolder.image1);
        viewHolder.text1.setText(mNames1.get(i));
        viewHolder.image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: image"+mNames1.get(i));
                Toast.makeText(mContext1, mNames1.get(i), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return mimageUrls1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView image1;
        TextView text1;

        public ViewHolder(View itemView) {
            super(itemView);
            image1=itemView.findViewById(R.id.image1);
            text1=itemView.findViewById(R.id.text1);
        }
    }
}
