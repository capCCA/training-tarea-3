package com.capgemini.training.api.model;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Schema(description = "CustomerDetails")
@Getter
@SuperBuilder
@EqualsAndHashCode()
@NoArgsConstructor
@ToString(callSuper = true)
public class CustomerDetails {

  @Schema(title = "customerId", example = "1234567891", description = "Customer identifier.")
  @NotBlank
  private String customerId;

  @Schema(
      title = "documentType",
      example = "DNI",
      description = "Customer document type identifier.")
  @NotBlank
  private DocumentType documentType;

  @Schema(
      title = "documentNumber",
      example = "1234567891",
      description = "Customer document number.")
  @NotBlank
  private String documentNumber;

  @Schema(title = "name", example = "Jaimito", description = "Customer name.")
  @NotBlank
  private String name;

  @Schema(title = "surName", example = "Ronaldo", description = "Customer surName.")
  @NotBlank
  private String surName;

  @Schema(title = "lastName", example = "Eustaquio", description = "Customer lastName.")
  private String lastName;

  @Schema(title = "country", example = "Spain", description = "Customer country.")
  @NotBlank
  private String country;

  @Schema(title = "telephone", example = "678097823", description = "Customer telephone.")
  @NotBlank
  private String telephone;
}
