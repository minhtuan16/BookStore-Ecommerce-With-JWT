package com.example.demo.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class LoginRequest {
    @NotBlank(message = "Email trống")
    @Email(message = "Email không đúng định dạng")
    private String email;
    @NotBlank(message = "Mật khẩu trống")
    @Size(min = 6, max = 20,message = "Mật khẩu phải chứa từ 6-20 ký tự")
    private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
