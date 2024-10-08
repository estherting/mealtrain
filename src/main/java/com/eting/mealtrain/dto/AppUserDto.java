package com.eting.mealtrain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppUserDto {
    private Long id;
    private String name;
    private String email;
    private Boolean isAdmin;
}
