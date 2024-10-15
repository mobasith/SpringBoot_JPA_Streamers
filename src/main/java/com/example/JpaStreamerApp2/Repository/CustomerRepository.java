package com.example.JpaStreamerApp2.Repository;
import com.example.JpaStreamerApp2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{
}
