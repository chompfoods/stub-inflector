package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * An object containing recipe attributes
 **/
@Schema(description = "An object containing recipe attributes")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2021-03-09T22:27:14.607Z[GMT]")
public class RecipeObjectAttributes   {
  @JsonProperty("prep_time")
  private String prepTime = null;
  @JsonProperty("total_time")
  private String totalTime = null;
  @JsonProperty("servings")
  private String servings = null;
  @JsonProperty("serving_size")
  private String servingSize = null;
  /**
   * The time it takes to prep this recipe
   **/
  public RecipeObjectAttributes prepTime(String prepTime) {
    this.prepTime = prepTime;
    return this;
  }

  
  @Schema(description = "The time it takes to prep this recipe")
  @JsonProperty("prep_time")
  public String getPrepTime() {
    return prepTime;
  }
  public void setPrepTime(String prepTime) {
    this.prepTime = prepTime;
  }

  /**
   * The total time it takes to make this recipe
   **/
  public RecipeObjectAttributes totalTime(String totalTime) {
    this.totalTime = totalTime;
    return this;
  }

  
  @Schema(description = "The total time it takes to make this recipe")
  @JsonProperty("total_time")
  public String getTotalTime() {
    return totalTime;
  }
  public void setTotalTime(String totalTime) {
    this.totalTime = totalTime;
  }

  /**
   * The number of servings this recipe makes
   **/
  public RecipeObjectAttributes servings(String servings) {
    this.servings = servings;
    return this;
  }

  
  @Schema(description = "The number of servings this recipe makes")
  @JsonProperty("servings")
  public String getServings() {
    return servings;
  }
  public void setServings(String servings) {
    this.servings = servings;
  }

  /**
   * The size of each serving
   **/
  public RecipeObjectAttributes servingSize(String servingSize) {
    this.servingSize = servingSize;
    return this;
  }

  
  @Schema(description = "The size of each serving")
  @JsonProperty("serving_size")
  public String getServingSize() {
    return servingSize;
  }
  public void setServingSize(String servingSize) {
    this.servingSize = servingSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeObjectAttributes recipeObjectAttributes = (RecipeObjectAttributes) o;
    return Objects.equals(prepTime, recipeObjectAttributes.prepTime) &&
        Objects.equals(totalTime, recipeObjectAttributes.totalTime) &&
        Objects.equals(servings, recipeObjectAttributes.servings) &&
        Objects.equals(servingSize, recipeObjectAttributes.servingSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prepTime, totalTime, servings, servingSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectAttributes {\n");
    sb.append("    prepTime: ").append(toIndentedString(prepTime)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    servings: ").append(toIndentedString(servings)).append("\n");
    sb.append("    servingSize: ").append(toIndentedString(servingSize)).append("\n");
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
