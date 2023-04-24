package com.capgemini.training.api.service;

import com.capgemini.training.api.model.CustomerDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewCustomerDetailsService {

  public CustomerDetails createNewCustomer(CustomerDetails customerDetails) {
    return CustomerDetails.builder().customerId("New Customer Created").build();
  }
}
