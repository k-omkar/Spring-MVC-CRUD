package blog.services;

import blog.models.Post;
import java.util.List;

public interface PostService{

    //List <Post> listAll();
    List <Post> listRecent5();
    //Post findById(Long id);
    Post create(Post post);
    Post edit(Post post);
    //void deleteById(Long id);

}