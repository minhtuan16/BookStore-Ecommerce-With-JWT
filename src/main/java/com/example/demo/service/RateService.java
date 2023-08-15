package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Rate;
import com.example.demo.model.request.CreateRateProductRequest;

@Service
public interface RateService {
    Rate createRate(CreateRateProductRequest createRateProductRequest,long userId);
}
