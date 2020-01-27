package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;


/**
 * An object containing information for a specific nutrient found in this food item
 **/
@Schema(description = "An object containing information for a specific nutrient found in this food item")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2020-01-27T21:28:00.403Z[GMT]")
public class BrandedFoodObjectNutrients   {
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("per_100g")
  private BigDecimal per100g = null;
  @JsonProperty("measurement_unit")
  private String measurementUnit = null;
  @JsonProperty("rank")
  private Integer rank = null;
  @JsonProperty("data_points")
  private Integer dataPoints = null;
  @JsonProperty("description")
  private String description = null;
  /**
   * Nutrient name
   **/
  public BrandedFoodObjectNutrients name(String name) {
    this.name = name;
    return this;
  }

  
  @Schema(description = "Nutrient name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Amount of the nutrient per 100g of food
   **/
  public BrandedFoodObjectNutrients per100g(BigDecimal per100g) {
    this.per100g = per100g;
    return this;
  }

  
  @Schema(description = "Amount of the nutrient per 100g of food")
  @JsonProperty("per_100g")
  public BigDecimal getPer100g() {
    return per100g;
  }
  public void setPer100g(BigDecimal per100g) {
    this.per100g = per100g;
  }

  /**
   * The unit used for the measure of this nutrient
   **/
  public BrandedFoodObjectNutrients measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

  
  @Schema(description = "The unit used for the measure of this nutrient")
  @JsonProperty("measurement_unit")
  public String getMeasurementUnit() {
    return measurementUnit;
  }
  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  /**
   * Nutrient rank
   **/
  public BrandedFoodObjectNutrients rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  
  @Schema(description = "Nutrient rank")
  @JsonProperty("rank")
  public Integer getRank() {
    return rank;
  }
  public void setRank(Integer rank) {
    this.rank = rank;
  }

  /**
   * Number of observations on which the value is based
   **/
  public BrandedFoodObjectNutrients dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  
  @Schema(description = "Number of observations on which the value is based")
  @JsonProperty("data_points")
  public Integer getDataPoints() {
    return dataPoints;
  }
  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }

  /**
   * Description of the nutrient source
   **/
  public BrandedFoodObjectNutrients description(String description) {
    this.description = description;
    return this;
  }

  
  @Schema(description = "Description of the nutrient source")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectNutrients brandedFoodObjectNutrients = (BrandedFoodObjectNutrients) o;
    return Objects.equals(name, brandedFoodObjectNutrients.name) &&
        Objects.equals(per100g, brandedFoodObjectNutrients.per100g) &&
        Objects.equals(measurementUnit, brandedFoodObjectNutrients.measurementUnit) &&
        Objects.equals(rank, brandedFoodObjectNutrients.rank) &&
        Objects.equals(dataPoints, brandedFoodObjectNutrients.dataPoints) &&
        Objects.equals(description, brandedFoodObjectNutrients.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, per100g, measurementUnit, rank, dataPoints, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectNutrients {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    per100g: ").append(toIndentedString(per100g)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
