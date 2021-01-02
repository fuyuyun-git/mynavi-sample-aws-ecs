package com.example.mynavi.backend.app.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private Long userId;
    private String userName;


}
