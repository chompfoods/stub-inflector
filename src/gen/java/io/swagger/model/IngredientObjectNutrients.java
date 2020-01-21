package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BrandedFoodObjectNutrientsUsda;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;


/**
 * An object containing nutrient information from each source
 **/
@Schema(description = "An object containing nutrient information from each source")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2020-01-21T14:14:30.632Z[GMT]")
public class IngredientObjectNutrients   {
  @JsonProperty("usda")
  private List<BrandedFoodObjectNutrientsUsda> usda = null;
  /**
   * An array containing an object for each nutrient data point as found in the USDA database
   **/
  public IngredientObjectNutrients usda(List<BrandedFoodObjectNutrientsUsda> usda) {
    this.usda = usda;
    return this;
  }

  
  @Schema(description = "An array containing an object for each nutrient data point as found in the USDA database")
  @JsonProperty("usda")
  public List<BrandedFoodObjectNutrientsUsda> getUsda() {
    return usda;
  }
  public void setUsda(List<BrandedFoodObjectNutrientsUsda> usda) {
    this.usda = usda;
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
    return Objects.equals(usda, ingredientObjectNutrients.usda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usda);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectNutrients {\n");
    sb.append("    usda: ").append(toIndentedString(usda)).append("\n");
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
