package com.example.exercicio.model;

import java.math.BigDecimal;

public class IMCModel {

    private BigDecimal height;
    private BigDecimal weight;
    private BigDecimal value;
    private String result;

    public IMCModel() {

    }

    public IMCModel(BigDecimal height, BigDecimal weight, BigDecimal value, String result) {
        this.height = height;
        this.weight = weight;
        this.value = value;
        this.result = result;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
