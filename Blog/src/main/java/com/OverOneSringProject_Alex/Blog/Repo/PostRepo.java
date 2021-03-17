package com.OverOneSringProject_Alex.Blog.Repo;

import com.OverOneSringProject_Alex.Blog.Model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {
}
