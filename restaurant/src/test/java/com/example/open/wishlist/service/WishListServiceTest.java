package com.example.open.wishlist.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("서비스 테스트")
@SpringBootTest
class WishListServiceTest {

    @Autowired WishListService wishListService;

    @DisplayName("검색 테스트")
    @Test
    public void searchTest(){
        var result = wishListService.search("떡볶이");
        System.out.println(result);
        Assertions.assertNotNull(result);
    }

}