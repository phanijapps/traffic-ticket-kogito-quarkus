package org.acme.dto;

import java.util.Date;

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
public class Violation {
    
    private String code;
    private String type;
    private Date violationDate;
    private int speedLimit;
    private int actualSpeed;
}
