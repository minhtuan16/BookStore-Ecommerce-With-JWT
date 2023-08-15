package com.example.demo.service.impl;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Product;
import com.example.demo.entity.Rate;
import com.example.demo.entity.User;
import com.example.demo.exception.InternalServerException;
import com.example.demo.model.request.CreateRateProductRequest;
import com.example.demo.repository.RateRepository;
import com.example.demo.service.RateService;

@Component
public class RateServiceImpl implements RateService {

    @Autowired
    private RateRepository rateRepository;

    @Override
    public Rate createRate(CreateRateProductRequest createRateProductRequest, long userId) {
        Rate rate = new Rate();
        rate.setRating(createRateProductRequest.getRate());
        rate.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        Product product = new Product();
        product.setId(createRateProductRequest.getProductId());
        rate.setProduct(product);
        User user = new User();
        user.setId(userId);
        rate.setUser(user);
        try {
            rateRepository.save(rate);
        }catch (Exception e){
            throw new InternalServerException("Có lỗi khi đánh giá");
        }
        return rate;
    }

}
