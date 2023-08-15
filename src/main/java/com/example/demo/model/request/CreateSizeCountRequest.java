package com.example.demo.model.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class CreateSizeCountRequest {
    private int size;

    @Min(0)
    private int count;

    @NotEmpty(message = "Mã sản phẩm trống")
    @NotNull(message = "Mã sản phẩm trống")
    @JsonProperty("product_id")
    private String productId;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
    
    
}
