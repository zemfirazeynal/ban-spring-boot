package az.bank.bankspringboot.service.impl;


import az.bank.bankspringboot.controller.CustomerController;
import az.bank.bankspringboot.model.MyCustomer;
import az.bank.bankspringboot.repository.CustomerRepository;
import az.bank.bankspringboot.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public MyCustomer create (MyCustomer customer){
        return customerRepository.save(customer);
    }

    @Override
    public void delete(Long id){
        MyCustomer customer = customerRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Customer Not Found!"));
        customerRepository.delete(customer);

    }
    @Override
    public Set<MyCustomer> customers(){
        List<MyCustomer> all = customerRepository.findAll();
        return new HashSet<> (all);
    }



    @Override
    public MyCustomer update(Long id, MyCustomer customerNew){
        MyCustomer customer = customerRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Customer Not Found!"));
        customer.setName(customerNew.getName());
        customer.setSurname(customerNew.getSurname());
        customer.setProfession(customerNew.getProfession());
        return customerRepository.save(customer);
    }


}
