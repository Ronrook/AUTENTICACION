package co.com.pragma.model.user;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class User {

    private Integer id;
    private String names;
    private String lastNames;
    private LocalDate birthdate;
    private String addres;
    private String telephone;
    private String email;
    private Double baseSalary;
}
