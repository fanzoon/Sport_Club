package org.example.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {
    private UUID id;
    private String firstName;
    private String secondName;
    private Date birthDay;
    private String gender;
}
