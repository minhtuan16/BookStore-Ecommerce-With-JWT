package com.example.demo.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class FilterProductRequest {
    private List<Long> brands;

    private List<Long> categories;

    private List<Integer> sizes;

    @JsonProperty("min_price")
    private Long minPrice;

    @JsonProperty("max_price")
    private Long maxPrice;

    private int page;

//	public FilterProductRequest(List<Long> brands, List<Long> categories, List<Integer> sizes, Long minPrice,
//			Long maxPrice, int page) {
//		super();
//		this.brands = brands;
//		this.categories = categories;
//		this.sizes = sizes;
//		this.minPrice = minPrice;
//		this.maxPrice = maxPrice;
//		this.page = page;
//	}

}
