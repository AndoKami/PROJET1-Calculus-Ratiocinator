package com.example.projet1_Calculus.Controller;



import com.example.projet1_Calculus.Model.Assertion;
import com.example.projet1_Calculus.Model.AssertionReponse;
import com.example.projet1_Calculus.Service.Logique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class LogiqueController {

    @Autowired
    private Logique logique;

    @PostMapping("/evaluate")
    public AssertionReponse evaluate(@RequestBody Assertion assertion) {
        boolean result = logique.evaluateAssertion(assertion);
        return new AssertionReponse(result);
    }
}