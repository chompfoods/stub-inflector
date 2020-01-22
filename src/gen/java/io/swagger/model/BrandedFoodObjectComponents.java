package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;


/**
 * An object containing information on a specific component of this food item
 **/
@Schema(description = "An object containing information on a specific component of this food item")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2020-01-22T13:41:42.100Z[GMT]")
public class BrandedFoodObjectComponents   {
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("pct_weight")
  private BigDecimal pctWeight = null;
  @JsonProperty("gram_weight")
  private BigDecimal gramWeight = null;
  @JsonProperty("is_refuse")
  private Boolean isRefuse = null;
  @JsonProperty("data_points")
  private Integer dataPoints = null;
  /**
   * The kind of component, e.g. bone
   **/
  public BrandedFoodObjectComponents name(String name) {
    this.name = name;
    return this;
  }

  
  @Schema(description = "The kind of component, e.g. bone")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The weight of the component as a percentage of the total weight of the food
   **/
  public BrandedFoodObjectComponents pctWeight(BigDecimal pctWeight) {
    this.pctWeight = pctWeight;
    return this;
  }

  
  @Schema(description = "The weight of the component as a percentage of the total weight of the food")
  @JsonProperty("pct_weight")
  public BigDecimal getPctWeight() {
    return pctWeight;
  }
  public void setPctWeight(BigDecimal pctWeight) {
    this.pctWeight = pctWeight;
  }

  /**
   * The weight of the component in grams
   **/
  public BrandedFoodObjectComponents gramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
    return this;
  }

  
  @Schema(description = "The weight of the component in grams")
  @JsonProperty("gram_weight")
  public BigDecimal getGramWeight() {
    return gramWeight;
  }
  public void setGramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
  }

  /**
   * Whether the component is refuse, i.e. not edible
   **/
  public BrandedFoodObjectComponents isRefuse(Boolean isRefuse) {
    this.isRefuse = isRefuse;
    return this;
  }

  
  @Schema(description = "Whether the component is refuse, i.e. not edible")
  @JsonProperty("is_refuse")
  public Boolean isIsRefuse() {
    return isRefuse;
  }
  public void setIsRefuse(Boolean isRefuse) {
    this.isRefuse = isRefuse;
  }

  /**
   * The number of obersvations on which the measure is based
   **/
  public BrandedFoodObjectComponents dataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
    return this;
  }

  
  @Schema(description = "The number of obersvations on which the measure is based")
  @JsonProperty("data_points")
  public Integer getDataPoints() {
    return dataPoints;
  }
  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectComponents brandedFoodObjectComponents = (BrandedFoodObjectComponents) o;
    return Objects.equals(name, brandedFoodObjectComponents.name) &&
        Objects.equals(pctWeight, brandedFoodObjectComponents.pctWeight) &&
        Objects.equals(gramWeight, brandedFoodObjectComponents.gramWeight) &&
        Objects.equals(isRefuse, brandedFoodObjectComponents.isRefuse) &&
        Objects.equals(dataPoints, brandedFoodObjectComponents.dataPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pctWeight, gramWeight, isRefuse, dataPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectComponents {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pctWeight: ").append(toIndentedString(pctWeight)).append("\n");
    sb.append("    gramWeight: ").append(toIndentedString(gramWeight)).append("\n");
    sb.append("    isRefuse: ").append(toIndentedString(isRefuse)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
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
