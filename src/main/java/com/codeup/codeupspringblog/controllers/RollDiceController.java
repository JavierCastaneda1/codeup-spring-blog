package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RollDiceController {

    public static double getRandomRoll(double min, double max){
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    @GetMapping("/roll-dice")
    public String showRollDice() {
        return "roll-dice";
    }

    @PostMapping("/roll-dice")
    public String guessRoll(@RequestParam(name = "userGuess") String userGuess, Model model) {
        int userInt = Integer.parseInt(userGuess);
        int randomRoll = (int) getRandomRoll(1,6);

        model.addAttribute("userGuess", "User guessed" + userGuess);
        model.addAttribute("randomRoll", "Random roll landed on" + randomRoll);

        if (userInt == randomRoll) {
            model.addAttribute("message", "You guessed the correct number!");
            return "roll-dice";
        }

        model.addAttribute("message", "You guessed the wrong number!");
        return "roll-dice";
    }


}
