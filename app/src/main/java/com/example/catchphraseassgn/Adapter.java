package com.example.catchphraseassgn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter  extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    private List<String> data;
    private ViewGroup viewGroup;

    Adapter(Context context,List<String>data){
        this.layoutInflater=LayoutInflater.from(context);
        this.data=data;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.custom_view,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView storyTitle,storyContent;

        public ViewHolder(@NonNull View itemView) {
          super(itemView);
          storyTitle=itemView.findViewById(R.id.storyTitle);
          storyContent=itemView.findViewById(R.id.storyContent);
      }
  }
}
