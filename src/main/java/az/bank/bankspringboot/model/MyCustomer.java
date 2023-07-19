package az.bank.bankspringboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class MyCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String name;
    private String surname;
    private String profession;



}
