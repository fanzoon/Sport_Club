package org.example.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {
    private String firstName;
    private String secondName;
    private Date birthDay;
    private String gender;
}
