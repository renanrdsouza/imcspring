package com.example.exercicio.controller;

import com.example.exercicio.model.IMCModel;
import com.example.exercicio.service.IMCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/imc")
public class IMCController {

    @Autowired
    private IMCService imcService;

    @PostMapping
    public ResponseEntity<IMCModel> calculateIMC(@RequestParam(name = "height") String height,
                                                 @RequestParam(name = "weight") String weight) {

        return ResponseEntity.ok().body(imcService.calculate(height, weight));
    }
}
