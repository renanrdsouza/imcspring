package com.example.exercicio.service;

import com.example.exercicio.model.IMCModel;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class IMCService {

    public IMCModel calculate(String height, String weight) {
        String classification;
        BigDecimal imc = new BigDecimal(String.valueOf(new BigDecimal(weight)
                .divide(new BigDecimal(height).pow(2), 2, RoundingMode.HALF_UP)));

        if(imc.compareTo(new BigDecimal("18.5")) <= 0) {
            classification = "Magreza";
        } else if(imc.compareTo(new BigDecimal("24.5")) <= 0) {
            classification = "Normal";
        } else if(imc.compareTo(new BigDecimal("29.9")) <= 0) {
            classification = "Sobrepeso";
        } else {
            classification = "Obesidade";
        }

        return new IMCModel(new BigDecimal(height), new BigDecimal(weight), imc, classification);
    }
}
