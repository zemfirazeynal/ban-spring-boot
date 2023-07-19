package az.bank.bankspringboot.repository;

import az.bank.bankspringboot.model.MyCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<MyCustomer, Long> {

}
