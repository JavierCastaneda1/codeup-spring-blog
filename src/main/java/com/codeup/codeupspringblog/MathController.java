package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{a}/and/{b}")
    @ResponseBody
    public String add(@PathVariable int a, @PathVariable int b) {
        return (a + " plus " + b + " equals " +(a+b));
    }

    @GetMapping("/subtract/{num}/and/{onum}")
    @ResponseBody
    public String subtract(@PathVariable int num, @PathVariable int onum){
        return (num + " minus " + onum + " equals " +(num-onum));
    }

    @GetMapping("/multiply/{x}/and/{y}")
    @ResponseBody
    public String multiply(@PathVariable int x, @PathVariable int y){
        return (x + " times " + y + " equals " +(x*y));
    }

    @GetMapping("/divide/{z}/by/{v}")
    @ResponseBody
    public String divide(@PathVariable int z, @PathVariable int v){
        return (z + " divided by " + v + " is " +(z/v));
    }

}
