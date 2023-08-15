package com.example.demo.model.request;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class UpdateFeedBackRequest {
	@JsonProperty("feedback_images")
	private ArrayList<String> feedBackImages;

	public ArrayList<String> getFeedBackImages() {
		return feedBackImages;
	}

	public void setFeedBackImages(ArrayList<String> feedBackImages) {
		this.feedBackImages = feedBackImages;
	}

}
