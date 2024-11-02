package org.practice.servletlab.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProfilePicture {
    private String id;
    private String username;
    private byte[] profilePicture;
    private Timestamp uploadDate;
}
