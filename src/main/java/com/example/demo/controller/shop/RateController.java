package com.example.demo.controller.shop;
import com.example.demo.entity.Rate;
import com.example.demo.entity.User;
import com.example.demo.model.request.CreateRateProductRequest;
import com.example.demo.security.CustomUserDetails;
import com.example.demo.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class RateController {

    @Autowired
    private RateService rateService;

    @PostMapping("/api/rates/product")
    public ResponseEntity<Object> createRate(@RequestBody CreateRateProductRequest createRateProductRequest){
        User user = ((CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser();
        Rate rate = rateService.createRate(createRateProductRequest,user.getId());
        return ResponseEntity.ok(rate);
    }

}
