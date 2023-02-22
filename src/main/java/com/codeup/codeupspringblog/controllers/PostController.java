package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String postsHome() {
        return "posts HOME page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String singlePost(@PathVariable long id) {
        return "viewing post of id " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postsForm() {
        return "And this is where the form for creating a post would go... IF WE HAD ONE!";
    }

    @PostMapping("/posts/create")
    public String createPost() {
        return "form for create post goes here";
    }


}
