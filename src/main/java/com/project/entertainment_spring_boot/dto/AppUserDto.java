package com.project.entertainment_spring_boot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUserDto {
    private Long id;
    private String userName;
    private String rePassword;
    private String phoneNumber;
    private Set<AppRoleDto> roles = new HashSet<>();
    private String email;

}
