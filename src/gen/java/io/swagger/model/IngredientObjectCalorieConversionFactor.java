package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;


/**
 * An object containing the multiplication factors to be used when calculating energy from macronutrients for a specific food.
 **/
@Schema(description = "An object containing the multiplication factors to be used when calculating energy from macronutrients for a specific food.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2021-03-09T22:27:14.607Z[GMT]")
public class IngredientObjectCalorieConversionFactor   {
  @JsonProperty("protein_value")
  private BigDecimal proteinValue = null;
  @JsonProperty("fat_value")
  private BigDecimal fatValue = null;
  @JsonProperty("carbohydrate_value")
  private BigDecimal carbohydrateValue = null;
  /**
   * The multiplication factor for protein
   **/
  public IngredientObjectCalorieConversionFactor proteinValue(BigDecimal proteinValue) {
    this.proteinValue = proteinValue;
    return this;
  }

  
  @Schema(description = "The multiplication factor for protein")
  @JsonProperty("protein_value")
  public BigDecimal getProteinValue() {
    return proteinValue;
  }
  public void setProteinValue(BigDecimal proteinValue) {
    this.proteinValue = proteinValue;
  }

  /**
   * The multiplication factor for fat
   **/
  public IngredientObjectCalorieConversionFactor fatValue(BigDecimal fatValue) {
    this.fatValue = fatValue;
    return this;
  }

  
  @Schema(description = "The multiplication factor for fat")
  @JsonProperty("fat_value")
  public BigDecimal getFatValue() {
    return fatValue;
  }
  public void setFatValue(BigDecimal fatValue) {
    this.fatValue = fatValue;
  }

  /**
   * The multiplication factor for carbohydrates
   **/
  public IngredientObjectCalorieConversionFactor carbohydrateValue(BigDecimal carbohydrateValue) {
    this.carbohydrateValue = carbohydrateValue;
    return this;
  }

  
  @Schema(description = "The multiplication factor for carbohydrates")
  @JsonProperty("carbohydrate_value")
  public BigDecimal getCarbohydrateValue() {
    return carbohydrateValue;
  }
  public void setCarbohydrateValue(BigDecimal carbohydrateValue) {
    this.carbohydrateValue = carbohydrateValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientObjectCalorieConversionFactor ingredientObjectCalorieConversionFactor = (IngredientObjectCalorieConversionFactor) o;
    return Objects.equals(proteinValue, ingredientObjectCalorieConversionFactor.proteinValue) &&
        Objects.equals(fatValue, ingredientObjectCalorieConversionFactor.fatValue) &&
        Objects.equals(carbohydrateValue, ingredientObjectCalorieConversionFactor.carbohydrateValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proteinValue, fatValue, carbohydrateValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectCalorieConversionFactor {\n");
    sb.append("    proteinValue: ").append(toIndentedString(proteinValue)).append("\n");
    sb.append("    fatValue: ").append(toIndentedString(fatValue)).append("\n");
    sb.append("    carbohydrateValue: ").append(toIndentedString(carbohydrateValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
