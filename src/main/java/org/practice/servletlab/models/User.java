package org.practice.servletlab.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.practice.servletlab.enums.Gender;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String username;
    private String email;
    private String password;
    private LocalDate birthday;
    private Gender gender;
}
