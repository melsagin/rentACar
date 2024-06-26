package com.etiya.rentACar.business.dtos.responses.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetModelResponse {
    private int id;
    private String name;
    private int brandId;
    private int fuelId;
    private int transmissionId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime deletedDate;
}
