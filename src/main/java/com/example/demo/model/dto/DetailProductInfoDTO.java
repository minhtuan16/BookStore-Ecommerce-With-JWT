package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Brand;
import com.example.demo.entity.Comment;

@AllArgsConstructor
@NoArgsConstructor

public class DetailProductInfoDTO {
    private String id;

    private String name;
    
    private String author;
    
    private String pageNumber;

    private String slug;

    private long price;

    private int views;

    private long totalSold;

    private ArrayList<String> productImages;

    private ArrayList<String> feedbackImages;

    private long promotionPrice;

    private String couponCode;

    private String description;

    private Brand brand;

    private List<Comment> comments;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public long getTotalSold() {
		return totalSold;
	}

	public void setTotalSold(long totalSold) {
		this.totalSold = totalSold;
	}

	public ArrayList<String> getProductImages() {
		return productImages;
	}

	public void setProductImages(ArrayList<String> productImages) {
		this.productImages = productImages;
	}

	public ArrayList<String> getFeedbackImages() {
		return feedbackImages;
	}

	public void setFeedbackImages(ArrayList<String> feedbackImages) {
		this.feedbackImages = feedbackImages;
	}

	public long getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(long promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
    
    
}
