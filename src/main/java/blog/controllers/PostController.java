package blog.controllers;

import blog.models.Post;
import blog.services.NotificationService;
import blog.services.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PostController{

    @Autowired
    private PostService postService;

    @Autowired
    private NotificationService notifyService;

    @RequestMapping("/posts/view/{id}")
    public String view(@PathVariable("id") Long id, Model model) {
        Post post = postService.findById(id);
        if(post == null) {
            notifyService.addErrorMessage("Post #" + id + " not found please check again");
            return "redirect:/";
        }
        model.addAttribute("post", post);
        return "posts/view";
    }

    @RequestMapping("/posts/all_posts")
    public String all_posts(Model model) {
        List<Post> allPosts= postService.listPosts();
        model.addAttribute("allPosts", allPosts);
        return "posts/all_posts";
    }
}