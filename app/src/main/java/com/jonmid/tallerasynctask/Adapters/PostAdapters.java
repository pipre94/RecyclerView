package com.jonmid.tallerasynctask.Adapters;

import android.content.Context;
import android.media.Image;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonmid.tallerasynctask.Models.Post;
import com.jonmid.tallerasynctask.R;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc-16 on 19/04/17.
 */

public class PostAdapters extends RecyclerView.Adapter<PostAdapters.ViewHolder>{


    List<Post> myPost = new ArrayList<>();
    Context contex;

    public PostAdapters (Context context, List<Post> myPost){
        this.myPost= myPost;
        this.contex= context;

    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //vincular my lista con la vista principal (activyti_main_xml)


        View itemView =LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent, false);
        //iyecta mi layout item.xml en la vista princioal
        ViewHolder viewHolder = new ViewHolder(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
//lanza la ista principal
        holder.myText.setText(myPost.get(position).getTitle());

    }
//para traeer el tamaño de la vista que llega
    @Override
    public int getItemCount() {
        return 0;
    }

    //permite admimnistrar mi vista en recycler view
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView myIamge;
        TextView myText;

        //constructor de mi sub clase
        public ViewHolder(View item)  {
            super (item);
            myIamge = (ImageView) item.findViewById(R.id.logo);
            myText = (TextView) item.findViewById(R.id.txt_item);

        }
    }
}
