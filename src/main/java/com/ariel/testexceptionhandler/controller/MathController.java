package com.ariel.testexceptionhandler.controller;

import com.ariel.testexceptionhandler.model.SumNumbers;
import com.ariel.testexceptionhandler.service.MathService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("math")
public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/sum/showIndex")
    public String loadSumPage(Model model) {

        model.addAttribute("sumNumbers", new SumNumbers());
        return "sum/index";

    }

    @PostMapping("/sum/showResult")
    public String sumNumbers(SumNumbers sumNumbers, Model model) {

        int sumResult = mathService.sumNumbers(sumNumbers.getNumber1(), sumNumbers.getNumber2());

        model.addAttribute("sumResult", sumResult);
        return "sum/result";

    }

}
