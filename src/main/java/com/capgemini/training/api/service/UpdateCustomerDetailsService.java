package com.capgemini.training.api.service;

import com.capgemini.training.api.model.CustomerDetails;
import com.capgemini.training.api.model.UpdateCustomerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateCustomerDetailsService {

  public CustomerDetails updateCustomerDetails(UpdateCustomerRequest customerRequest) {
    // TODO puesto que estas usando el código original quiero darte una pista de cara a la siguiente
    // tarea.. Cuando en la definición de APIs usamos el método PUT
    // quiere decir que nunca actualizamos registros de forma parcial. Sino que debemos obtener toda
    // la información que hay en base de datos,
    // modificar el dato o datos que nos están diciendo de cambiar y luego actualizar el registro.
    // Es decir, se actualiza el registro completo,
    // no de forma parcial. Si queremos actualizar de forma parcial deberíamos usar el metodo PATCH
    // (Os dejo este tema interesante para que investigueis, es algo teorico solamente, a nivel
    // practico os encontrareis sitios que no se respeta).
    return CustomerDetails.builder().customerId("New Customer Updated").build();
  }
}
