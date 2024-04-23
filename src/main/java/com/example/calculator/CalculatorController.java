package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public String add (@RequestParam int a, @RequestParam int b) {
        return "Sum: " + (a + b);
    }

    @GetMapping("/subtract")
    public String subtract (@RequestParam int a, @RequestParam int b ) {
        return "Difference: " + (a - b);
    }

    @GetMapping("/multiply")
    public String multiply (@RequestParam int a, @RequestParam int b) {
        return "Product: " + (a * b);
    }

    @GetMapping("/divide")
    public String divide (@RequestParam int a, @RequestParam int b) {
        return "Quotient: " + (a / b);
    }


}
