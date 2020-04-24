package blog.services;

import blog.models.Post;
import blog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImplementation implements PostService{

    @Autowired
    private PostRepository postRepo;
/*
    public List<Post> listAll(){
        return this.postRepo.listAll();
    }
*/
    public List <Post> listRecent5(){
        return this.postRepo.listRecent5Posts(PageRequest.of(0, 5));
    }
/*
    public Post findById(Long id) {
        return this.postRepo.findOne(id);
    }
*/
    public Post create(Post post){
        return this.postRepo.save(post);
    }


    public Post edit(Post post) {
        return this.postRepo.save(post);
    }

    /*
    public void deleteById(Long id){
        this.postRepo.delete(id);
    }

     */
}
