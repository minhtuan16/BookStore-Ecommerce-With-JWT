package com.example.demo.service;

import com.example.demo.entity.Comment;
import com.example.demo.model.request.CreateCommentPostRequest;
import com.example.demo.model.request.CreateCommentProductRequest;

import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
