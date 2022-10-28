package com.example.easymytrip;

public class flight {
    @GetMapping("/myflight")
    public String getData(){
        return "Please book your flight";
    }

}
