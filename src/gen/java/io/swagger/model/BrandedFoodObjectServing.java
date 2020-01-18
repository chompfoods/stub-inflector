package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * An object containing serving information for this item
 **/
@Schema(description = "An object containing serving information for this item")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2020-01-18T16:42:42.556Z[GMT]")
public class BrandedFoodObjectServing   {
  @JsonProperty("size")
  private Integer size = null;
  @JsonProperty("measurement_unit")
  private String measurementUnit = null;
  @JsonProperty("size_fulltext")
  private String sizeFulltext = null;
  @JsonProperty("total")
  private Integer total = null;
  /**
   * Serving size
   **/
  public BrandedFoodObjectServing size(Integer size) {
    this.size = size;
    return this;
  }

  
  @Schema(description = "Serving size")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Serving measurement unit (e.g. if measure is 3 tsp, the unit is tsp)
   **/
  public BrandedFoodObjectServing measurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
    return this;
  }

  
  @Schema(description = "Serving measurement unit (e.g. if measure is 3 tsp, the unit is tsp)")
  @JsonProperty("measurement_unit")
  public String getMeasurementUnit() {
    return measurementUnit;
  }
  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  /**
   * Serving size description
   **/
  public BrandedFoodObjectServing sizeFulltext(String sizeFulltext) {
    this.sizeFulltext = sizeFulltext;
    return this;
  }

  
  @Schema(description = "Serving size description")
  @JsonProperty("size_fulltext")
  public String getSizeFulltext() {
    return sizeFulltext;
  }
  public void setSizeFulltext(String sizeFulltext) {
    this.sizeFulltext = sizeFulltext;
  }

  /**
   * Total servings
   **/
  public BrandedFoodObjectServing total(Integer total) {
    this.total = total;
    return this;
  }

  
  @Schema(description = "Total servings")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectServing brandedFoodObjectServing = (BrandedFoodObjectServing) o;
    return Objects.equals(size, brandedFoodObjectServing.size) &&
        Objects.equals(measurementUnit, brandedFoodObjectServing.measurementUnit) &&
        Objects.equals(sizeFulltext, brandedFoodObjectServing.sizeFulltext) &&
        Objects.equals(total, brandedFoodObjectServing.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, measurementUnit, sizeFulltext, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectServing {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    sizeFulltext: ").append(toIndentedString(sizeFulltext)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
