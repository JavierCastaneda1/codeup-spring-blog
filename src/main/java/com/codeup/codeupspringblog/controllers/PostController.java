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
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsHome(@PathVariable long id) {
        return "viewing post at id " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postsForm() {
        return "And this is where the form for creating a post would go... IF WE HAD ONE!";
    }

    @PostMapping("/posts/create")
    public void createPost() {
        //Something happens here to store a post for later ;)
    }


}
