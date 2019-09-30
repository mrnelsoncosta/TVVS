package TVVS;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private String name;

    private List<Post> posts = new ArrayList<>();

    private List<Profile> friends = new ArrayList<>();

    public Profile(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public List<Post> getPosts (){
        return posts;
    }

    public int getNumberOfPosts(){
        return posts.size();
    }

    public Post createPost(String content){
        Post post = new Post(content);
        posts.add(post);
        return post;
    }

    public String getPostContent(Post post){
        return post.getContent();
    }




}
