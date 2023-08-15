package com.example.demo.model.dto;

import lombok.Getter;
import lombok.Setter;


public class ChartDTO {
    private String label;
    private int value;

    public ChartDTO(String label, int value) {
        this.label = label;
        this.value = value;
    }

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
    
    
}
