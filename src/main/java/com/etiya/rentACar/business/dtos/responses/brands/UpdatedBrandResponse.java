package com.etiya.rentACar.business.dtos.responses.brands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdatedBrandResponse {
    private int id;
    private String name;
    private LocalDateTime updatedDate;
}
