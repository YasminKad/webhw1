package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/calc/{operator}/{op1}/{op2}")
    public String calculate(@PathVariable String operator, @PathVariable double op1, @PathVariable double op2) {
        double result;
        String operation;

        switch (operator) {
            case "mult":
                result = op1 * op2;
                operation = "*";
                break;
            case "div":
                result = op1 / op2;
                operation = "/";
                break;
            case "sum":
                result = op1 + op2;
                operation = "+";
                break;
            case "subtract":
                result = op1 - op2;
                operation = "-";
                break;
            default:
                return "Invalid operator";
        }

        return op1 + operation + op2 + "=" + result;
    }
}