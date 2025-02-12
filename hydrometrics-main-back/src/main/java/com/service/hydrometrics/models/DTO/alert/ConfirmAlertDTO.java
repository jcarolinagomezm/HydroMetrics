package com.service.hydrometrics.models.DTO.alert;

import lombok.Getter;

import java.io.Serializable;

public record ConfirmAlertDTO(long alertId, String dataCamp, double prediction) implements Serializable {
}
