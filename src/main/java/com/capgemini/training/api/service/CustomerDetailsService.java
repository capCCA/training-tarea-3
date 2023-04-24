package com.capgemini.training.api.service;

import com.capgemini.training.api.model.CustomerDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerDetailsService {

  public CustomerDetails getCustomerDetails(String customerId){
    return CustomerDetails.builder().customerId("TEST").build();
  }
}
