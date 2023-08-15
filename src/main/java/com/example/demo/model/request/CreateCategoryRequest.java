package com.example.demo.model.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class CreateCategoryRequest {
    @NotBlank(message = "Tên danh mục trống")
    @Size(max = 50,message = "Tên danh mục có độ dài tối đa 50 ký tự!")
    private String name;

    private boolean status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
    
    
}
