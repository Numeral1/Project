package com.OverOneSringProject_Alex.Blog.Controllers;

import com.OverOneSringProject_Alex.Blog.Model.Post;
import com.OverOneSringProject_Alex.Blog.Repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    private PostRepo postRepo;

    @GetMapping("/blog")
    public String greeting(Model model) {
        Iterable<Post> posts = postRepo.findAll();
        model.addAttribute("posts", posts);
        return "blog_page";
    }

    @GetMapping("/blog/add")
    public String blogAdd() {
        return "blog_add_page";
    }

    @PostMapping("/blog/add")
    public String blogAddPost(@RequestParam String title,
                              @RequestParam String anons,
                              @RequestParam String full_text) {
        Post post = new Post(title, anons, full_text);
        postRepo.save(post);
        return "redirect:/blog";
    }

    @GetMapping("/blog/{id}")
    public String blogDetails(@PathVariable(value = "id") long id, Model model) {
        if (!postRepo.existsById(id)) {
            return "redirect:/blog";
        }
        Optional<Post> post = postRepo.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        model.addAttribute("post", res);
        return "blog_details";
    }

    @GetMapping("/blog/{id}/edit")
    public String blogEdit(@PathVariable(value = "id") long id, Model model) {
        if (!postRepo.existsById(id)) {
            return "redirect:/blog";
        }
        Optional<Post> post = postRepo.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        model.addAttribute("post", res);
        return "blog_edit";
    }

    @PostMapping("/blog/{id}/edit")
    public String blogPostUpdate(@PathVariable(value = "id") long id,
                                 @RequestParam String title,
                                 @RequestParam String anons,
                                 @RequestParam String full_text
    ) {
        Post post = postRepo.findById(id).orElseThrow();
        post.setTitle(title);
        post.setAnons(anons);
        post.setFull_text(full_text);
        postRepo.save(post);
        return "redirect:/blog";
    }

    @PostMapping("/blog/{id}/delete")
    public String delete(@PathVariable(value = "id") long id) {
        Post post = postRepo.findById(id).orElseThrow();
        postRepo.delete(post);
        return "redirect:/blog";
    }
}
