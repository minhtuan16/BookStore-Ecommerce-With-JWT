package com.example.demo.model.request;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class CreateCommentPostRequest {
    private long postId;
    @NotBlank(message = "Nội dung trống!")
    private String content;
	public long getPostId() {
		return postId;
	}
	public void setPostId(long postId) {
		this.postId = postId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
    
    
}
