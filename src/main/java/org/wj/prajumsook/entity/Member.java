package org.wj.prajumsook.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    @Schema(
            description = "Member unique identifier id",
            example = "1",
            required = true
    )
    @Id
    @GeneratedValue
    private Integer id;

    @Schema(
            description = "Member first name",
            example = "John"
    )
    private String firstName;

    @Schema(
            description = "Member last name",
            example = "Pages"
    )
    private String lastName;
}
