package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
public class CheckPromotion {
    private int discountType;

    private long discountValue;

    private long maximumDiscountValue;

	public int getDiscountType() {
		return discountType;
	}

	public void setDiscountType(int discountType) {
		this.discountType = discountType;
	}

	public long getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(long discountValue) {
		this.discountValue = discountValue;
	}

	public long getMaximumDiscountValue() {
		return maximumDiscountValue;
	}

	public void setMaximumDiscountValue(long maximumDiscountValue) {
		this.maximumDiscountValue = maximumDiscountValue;
	}
    
    
}