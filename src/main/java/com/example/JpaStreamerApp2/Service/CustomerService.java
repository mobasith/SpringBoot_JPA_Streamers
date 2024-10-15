package com.example.JpaStreamerApp2.Service;


import com.example.JpaStreamerApp2.Repository.CustomerRepository;
import com.example.JpaStreamerApp2.model.Customer;

import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CustomerService {

        @Autowired
        private CustomerRepository repo;

        private final JPAStreamer jpaStreamer;

        @Autowired
        public CustomerService(final JPAStreamer jpaStreamer) {
            this.jpaStreamer = jpaStreamer;

        }
        public Map<String, List<Customer>> groupbyCustomerByCity() {
            return jpaStreamer.stream(Customer.class)
                    .collect(Collectors.groupingBy(Customer::getCity));
        }

       public List<Customer> getAll() {
            return repo.findAll() ;
        }

        public List<Customer> saveCustomer(List<Customer> customer) {
            return repo.saveAll(customer);
        }

//        public Map<String, Long> groupEmployeesByEducationUnderPaymentTier(int paymentTier) {
//            return jpaStreamer.stream(Employee.class)
//                    .filter(employee -> employee.getPaymentTier() <= paymentTier)
//                    .collect(Collectors.groupingBy(Employee::getEducation, Collectors.counting()));
//        }
        public Map<String, Long> countCustomerByGender() {
            return jpaStreamer.stream(Customer.class)
                    .collect(Collectors.groupingBy(Customer::getGender, Collectors.counting()));
        }

        public Map<String, Long>countProductBySales(String prod)
        {

            return jpaStreamer.stream(Customer.class)
                    .filter(customer -> customer.getProd().equalsIgnoreCase(prod))
                    .collect(Collectors.groupingBy(Customer::getProd,
                            Collectors.summingLong(customer -> customer.getQty())));
        }



    public Map<String, List<Customer>> groupbyCustomerByProduct() {
        return jpaStreamer.stream(Customer.class)
                .collect(Collectors.groupingBy(Customer::getProd));
    }
    }

