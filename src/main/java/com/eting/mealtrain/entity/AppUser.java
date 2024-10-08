package com.eting.mealtrain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("app_user")
public class AppUser {

    @Id
    private Long id;
    private String name;
    private String email;
    private Boolean isAdmin;

    public AppUser(String inName, String inEmail) {
        name = inName;
        email = inEmail;
    }
}
