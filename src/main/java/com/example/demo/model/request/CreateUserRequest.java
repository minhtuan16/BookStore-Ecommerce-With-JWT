package com.example.demo.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class CreateUserRequest {

    @NotBlank(message = "Họ tên trống")
    private String fullName;

    @NotBlank(message = "Email trống")
    @Email(message = "Email không đúng định dạng")
    private String email;

    @NotBlank(message = "Mật khẩu trống")
    @Size(min = 6,max = 20, message = "Mật khẩu phải chứa từ 6-20 ký tự")
    private String password;

    @Pattern(regexp="(84|0[3|5|7|8|9])+([0-9]{8})\\b",message = "Số điện thoại không hợp lệ!")
    private String phone;

    private String address;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    
}
