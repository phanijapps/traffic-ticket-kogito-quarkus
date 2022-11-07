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
public class Fine {
    
    private float fine;
    private int points;
    private boolean court;
    private Payment payment;
}
