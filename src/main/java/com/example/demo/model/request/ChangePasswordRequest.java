package com.example.demo.model.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ChangePasswordRequest {

    @NotBlank(message = "Mật khẩu cũ trống")
    @Size(min = 6, max = 20, message = "Mật khẩu phải chứa từ 4 - 20 ký tự")
    @JsonProperty("old_password")
    private String oldPassword;

    @NotBlank(message = "Mật khẩu mới trống")
    @Size(min = 6, max = 20, message = "Mật khẩu phải chứa từ 4 - 20 ký tự")
    @JsonProperty("new_password")
    private String newPassword;

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
    
    
}
