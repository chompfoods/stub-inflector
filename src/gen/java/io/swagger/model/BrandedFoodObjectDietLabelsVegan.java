package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * An object containing information on this item&#x27;s compatibility with the Vegan diets
 **/
@Schema(description = "An object containing information on this item's compatibility with the Vegan diets")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2020-01-28T14:08:55.979Z[GMT]")
public class BrandedFoodObjectDietLabelsVegan   {
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("is_compatible")
  private Boolean isCompatible = null;
  @JsonProperty("compatibility_level")
  private Integer compatibilityLevel = null;
  @JsonProperty("confidence")
  private Integer confidence = null;
  @JsonProperty("confidence_description")
  private String confidenceDescription = null;
  /**
   * Diet name
   **/
  public BrandedFoodObjectDietLabelsVegan name(String name) {
    this.name = name;
    return this;
  }

  
  @Schema(description = "Diet name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Boolean describing if this item is compatible with this diet
   **/
  public BrandedFoodObjectDietLabelsVegan isCompatible(Boolean isCompatible) {
    this.isCompatible = isCompatible;
    return this;
  }

  
  @Schema(description = "Boolean describing if this item is compatible with this diet")
  @JsonProperty("is_compatible")
  public Boolean isIsCompatible() {
    return isCompatible;
  }
  public void setIsCompatible(Boolean isCompatible) {
    this.isCompatible = isCompatible;
  }

  /**
   * Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility
   **/
  public BrandedFoodObjectDietLabelsVegan compatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
    return this;
  }

  
  @Schema(description = "Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility")
  @JsonProperty("compatibility_level")
  public Integer getCompatibilityLevel() {
    return compatibilityLevel;
  }
  public void setCompatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
  }

  /**
   * Boolean that indicates if we are confident in how this item is graded for this diet
   **/
  public BrandedFoodObjectDietLabelsVegan confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

  
  @Schema(description = "Boolean that indicates if we are confident in how this item is graded for this diet")
  @JsonProperty("confidence")
  public Integer getConfidence() {
    return confidence;
  }
  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  /**
   * Description of our confidence that this item was graded correctly
   **/
  public BrandedFoodObjectDietLabelsVegan confidenceDescription(String confidenceDescription) {
    this.confidenceDescription = confidenceDescription;
    return this;
  }

  
  @Schema(description = "Description of our confidence that this item was graded correctly")
  @JsonProperty("confidence_description")
  public String getConfidenceDescription() {
    return confidenceDescription;
  }
  public void setConfidenceDescription(String confidenceDescription) {
    this.confidenceDescription = confidenceDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectDietLabelsVegan brandedFoodObjectDietLabelsVegan = (BrandedFoodObjectDietLabelsVegan) o;
    return Objects.equals(name, brandedFoodObjectDietLabelsVegan.name) &&
        Objects.equals(isCompatible, brandedFoodObjectDietLabelsVegan.isCompatible) &&
        Objects.equals(compatibilityLevel, brandedFoodObjectDietLabelsVegan.compatibilityLevel) &&
        Objects.equals(confidence, brandedFoodObjectDietLabelsVegan.confidence) &&
        Objects.equals(confidenceDescription, brandedFoodObjectDietLabelsVegan.confidenceDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isCompatible, compatibilityLevel, confidence, confidenceDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietLabelsVegan {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isCompatible: ").append(toIndentedString(isCompatible)).append("\n");
    sb.append("    compatibilityLevel: ").append(toIndentedString(compatibilityLevel)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    confidenceDescription: ").append(toIndentedString(confidenceDescription)).append("\n");
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
