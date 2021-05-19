package com.assignment.MTIT64.wishlistservice.controller;

import com.assignment.MTIT64.wishlistservice.dto.WishListRequest;
import com.assignment.MTIT64.wishlistservice.dto.WishListResponse;
import com.assignment.MTIT64.wishlistservice.service.WishListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/wishlist")
public class WishListController {

    @Autowired
    private WishListServiceImpl wishListService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody WishListResponse CreateWishList(@RequestBody WishListRequest wishListRequest){

        System.out.println("WishList Details Added : " + wishListRequest);


        return  wishListService.CreateWishList(wishListRequest);
    }

}
