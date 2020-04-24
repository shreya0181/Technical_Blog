package TechnicalBlog.service;

import TechnicalBlog.Model.Post;

import java.util.ArrayList;
import java.util.Date;

public class PostService {
    public ArrayList<Post> getAllPosts()
    {
        ArrayList<Post> list=new ArrayList<>();
        Post p1=new Post();
        p1.setId(1);
        p1.setTitle("java");
        p1.setBody("java is a programming language");
        p1.setDate(new Date());

        Post p2=new Post();
        p2.setId(2);
        p2.setTitle("c++");
        p2.setBody("c++ is a programming language");
        p2.setDate(new Date());

        Post p3=new Post();
        p3.setId(3);
        p3.setTitle("c");
        p3.setBody("c is a programming language");
        p3.setDate(new Date());

        list.add(p1);
        list.add(p2);
        list.add(p3);

        return list;
    }
}
