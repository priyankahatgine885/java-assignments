package arrnclctn.basic.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    private int id;
    private String name;
    private String department;
    private float salary;
}
