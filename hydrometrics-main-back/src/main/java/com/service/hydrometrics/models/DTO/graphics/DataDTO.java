package com.service.hydrometrics.models.DTO.graphics;

import java.io.Serializable;

public record DataDTO(String dateTime, double value) implements Serializable {

}
