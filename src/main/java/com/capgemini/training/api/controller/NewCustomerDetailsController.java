package com.capgemini.training.api.controller;

import com.capgemini.training.api.model.CustomerDetails;
import com.capgemini.training.api.service.NewCustomerDetailsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/capgemini/training/customer"})
@Tag(name = "Customers")
@RequiredArgsConstructor
public class NewCustomerDetailsController {

  private final NewCustomerDetailsService newCustomerDetailsService;
  private static final String SUCCESS_CODE = "200";

  @Operation(
      summary = "Service for create a new customer information.",
      description = "Service for create a new customer information.")
  @ApiResponses(
      value = {
          @ApiResponse(
              description = "CustomerDetails",
              responseCode = SUCCESS_CODE,
              content = {
                  @Content(
                      mediaType = MediaType.APPLICATION_JSON_VALUE,
                      schema = @Schema(implementation = CustomerDetails.class))
              })
      })
  @PostMapping()
  public ResponseEntity<CustomerDetails> createNewCustomerDetails(
      @ParameterObject @RequestBody CustomerDetails customerDetails) {
    return ResponseEntity.ok(newCustomerDetailsService.createNewCustomer(customerDetails));
  }
}
