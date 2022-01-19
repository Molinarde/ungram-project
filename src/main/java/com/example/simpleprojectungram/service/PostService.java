package com.example.simpleprojectungram.service;

import com.example.simpleprojectungram.model.Post;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface PostService {
    Optional<Post> addPost(MultipartFile multipartFile, Post post);

    boolean updatePost(MultipartFile multipartFile, Post post);

    Optional<Post> getById(String id);

    List<Post> getAll();

    List<Post> getAllPostByAuthorId(String authorId);
}
