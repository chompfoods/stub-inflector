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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2021-03-09T22:27:14.607Z[GMT]")
public class IngredientObjectNutrients   {
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("per_100g")
  private BigDecimal per100g = null;
  @JsonProperty("measurement_unit")
  private String measurementUnit = null;
  @JsonProperty("min")
  private BigDecimal min = null;
  @JsonProperty("max")
  private BigDecimal max = null;
  @JsonProperty("median")
  private BigDecimal median = null;
  @JsonProperty("rank")
  private Integer rank = null;
  @JsonProperty("data_points")
  private Integer dataPoints = null;
  @JsonProperty("footnote")
  private String footnote = null;
  @JsonProperty("description")
  private String description = null;
  /**
   * Nutrient name
   **/
  public IngredientObjectNutrients name(String name) {
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
  public IngredientObjectNutrients per100g(BigDecimal per100g) {
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
  public IngredientObjectNutrients measurementUnit(String measurementUnit) {
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
   * Minimum nutrient value
   **/
  public IngredientObjectNutrients min(BigDecimal min) {
    this.min = min;
    return this;
  }

  
  @Schema(description = "Minimum nutrient value")
  @JsonProperty("min")
  public BigDecimal getMin() {
    return min;
  }
  public void setMin(BigDecimal min) {
    this.min = min;
  }

  /**
   * Maximum nutrient value
   **/
  public IngredientObjectNutrients max(BigDecimal max) {
    this.max = max;
    return this;
  }

  
  @Schema(description = "Maximum nutrient value")
  @JsonProperty("max")
  public BigDecimal getMax() {
    return max;
  }
  public void setMax(BigDecimal max) {
    this.max = max;
  }

  /**
   * Median nutrient value
   **/
  public IngredientObjectNutrients median(BigDecimal median) {
    this.median = median;
    return this;
  }

  
  @Schema(description = "Median nutrient value")
  @JsonProperty("median")
  public BigDecimal getMedian() {
    return median;
  }
  public void setMedian(BigDecimal median) {
    this.median = median;
  }

  /**
   * Nutrient rank
   **/
  public IngredientObjectNutrients rank(Integer rank) {
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
  public IngredientObjectNutrients dataPoints(Integer dataPoints) {
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
   * Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.
   **/
  public IngredientObjectNutrients footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

  
  @Schema(description = "Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.")
  @JsonProperty("footnote")
  public String getFootnote() {
    return footnote;
  }
  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }

  /**
   * Description of the nutrient source
   **/
  public IngredientObjectNutrients description(String description) {
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
    IngredientObjectNutrients ingredientObjectNutrients = (IngredientObjectNutrients) o;
    return Objects.equals(name, ingredientObjectNutrients.name) &&
        Objects.equals(per100g, ingredientObjectNutrients.per100g) &&
        Objects.equals(measurementUnit, ingredientObjectNutrients.measurementUnit) &&
        Objects.equals(min, ingredientObjectNutrients.min) &&
        Objects.equals(max, ingredientObjectNutrients.max) &&
        Objects.equals(median, ingredientObjectNutrients.median) &&
        Objects.equals(rank, ingredientObjectNutrients.rank) &&
        Objects.equals(dataPoints, ingredientObjectNutrients.dataPoints) &&
        Objects.equals(footnote, ingredientObjectNutrients.footnote) &&
        Objects.equals(description, ingredientObjectNutrients.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, per100g, measurementUnit, min, max, median, rank, dataPoints, footnote, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectNutrients {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    per100g: ").append(toIndentedString(per100g)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
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
