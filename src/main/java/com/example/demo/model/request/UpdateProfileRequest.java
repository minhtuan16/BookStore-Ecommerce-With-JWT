package com.example.demo.model.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateProfileRequest {

    @Pattern(regexp="(09|03|07|08|05)+([0-9]{8})\\b", message = "Điện thoại không hợp lệ")
    private String phone;

    @NotBlank(message = "Họ tên trống")
    @JsonProperty("full_name")
    private String fullName;

    private String address;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    
}
