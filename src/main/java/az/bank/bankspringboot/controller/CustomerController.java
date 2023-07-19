package az.bank.bankspringboot.controller;

import az.bank.bankspringboot.model.MyCustomer;
import az.bank.bankspringboot.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public MyCustomer create(@RequestBody MyCustomer customer){
        log.info("Call Create!");
        return customerService.create(customer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        log.info("Call Delete! id="+id);
        customerService.delete(id);
    }

    @GetMapping
    public Set<MyCustomer> customers(){
        log.info("Call Get!");
        return customerService.customers();
    }


    @PutMapping("/{id}")
    public MyCustomer update(@PathVariable Long id,@RequestBody MyCustomer customer){
        log.info("Call Update! id=" +id);
        return customerService.update(id,customer);
    }

}
