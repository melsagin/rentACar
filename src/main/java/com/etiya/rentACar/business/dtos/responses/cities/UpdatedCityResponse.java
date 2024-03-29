package com.etiya.rentACar.business.dtos.responses.cities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdatedCityResponse {
    private int id;
    private String name;
    private LocalDateTime updatedDate;
}
