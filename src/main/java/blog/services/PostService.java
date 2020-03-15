package blog.services;

import blog.models.Post;
import java.util.List;

public interface PostService{

    List <Post> listAll();
    List <Post> listRecent5();
    Post findById(Long id);
    Post findByTitle(String title);
    Post edit(Post post);
    Post create(Post post);
    void deleteById(Long id);
}