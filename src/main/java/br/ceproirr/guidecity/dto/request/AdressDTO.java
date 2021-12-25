package br.ceproirr.guidecity.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdressDTO {

    private Long id;

    @NotEmpty
    @Size(min = 8, max = 10)
    private String zipcode;

    @NotEmpty
    @Size(min = 1, max = 50)
    private String street;

    @NotEmpty
    @Size(min = 1, max = 20)
    private String number;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String district;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String state;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String country;

    @NotEmpty
    private int status;

}
