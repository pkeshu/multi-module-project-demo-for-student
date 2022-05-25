package com.keshar.model.doctor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Doctor {
    /**
     * @project multimodule-project
     * @author kesharpaudel on 18/05/2022
     * @created_at 18(Wed) May,2022 at 3:04 PM
     */

    @Id
    private int id;
    private String name;
    private String specialist;


}
