package com.workspace.Synclet.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegRequest {

    private String login;
    private String mail;
    private String password;
}
