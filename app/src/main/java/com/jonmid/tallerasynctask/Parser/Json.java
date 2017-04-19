package com.jonmid.tallerasynctask.Parser;

import com.jonmid.tallerasynctask.Models.Post;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by software on 19/04/2017.
 */

public class Json {

    public static List<Post> getData(String content) throws Exception {
        JSONArray myArray = new JSONArray(content);
        List<Post> myPost = new ArrayList<>();

        for (int i=0; i<myArray.length(); i++){
            JSONObject item = myArray.getJSONObject(i);

            Post post = new Post();
            post.setId(item.getInt("id"));
            post.setTitle(item.getString("title"));
            post.setBody(item.getString("body"));

            myPost.add(post);
        }

        return myPost;
    }
}
