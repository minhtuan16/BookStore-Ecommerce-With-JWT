package com.example.demo.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

@EqualsAndHashCode
public class ProductSizeId implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productId;
    private int size;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
    
    
}
