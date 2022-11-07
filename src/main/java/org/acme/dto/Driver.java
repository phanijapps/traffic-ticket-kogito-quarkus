package org.acme.dto;

import org.kie.api.project.KieActivator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@KieActivator
public class Driver {
    
    private String firstName;
    private String lastName;
    private int age;
    private String city;
    private String state;
    private String addressLine1;
    private String addressLine2;
    private String phone;
}
