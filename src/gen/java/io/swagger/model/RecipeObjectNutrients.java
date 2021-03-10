package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RecipeObjectNutrientsCalories;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;


/**
 * An object containing nutrient information for this recipe
 **/
@Schema(description = "An object containing nutrient information for this recipe")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2021-03-09T22:27:14.607Z[GMT]")
public class RecipeObjectNutrients   {
  @JsonProperty("calories")
  private List<RecipeObjectNutrientsCalories> calories = null;
  @JsonProperty("daily_values")
  private List<RecipeObjectNutrientsCalories> dailyValues = null;
  @JsonProperty("fat")
  private List<RecipeObjectNutrientsCalories> fat = null;
  @JsonProperty("carbs")
  private List<RecipeObjectNutrientsCalories> carbs = null;
  @JsonProperty("vitamins")
  private List<RecipeObjectNutrientsCalories> vitamins = null;
  /**
   * An array containing information for calories found in this recipe
   **/
  public RecipeObjectNutrients calories(List<RecipeObjectNutrientsCalories> calories) {
    this.calories = calories;
    return this;
  }

  
  @Schema(description = "An array containing information for calories found in this recipe")
  @JsonProperty("calories")
  public List<RecipeObjectNutrientsCalories> getCalories() {
    return calories;
  }
  public void setCalories(List<RecipeObjectNutrientsCalories> calories) {
    this.calories = calories;
  }

  /**
   * An array containing information for this recipe's daily recommended value of certain nutrients
   **/
  public RecipeObjectNutrients dailyValues(List<RecipeObjectNutrientsCalories> dailyValues) {
    this.dailyValues = dailyValues;
    return this;
  }

  
  @Schema(description = "An array containing information for this recipe's daily recommended value of certain nutrients")
  @JsonProperty("daily_values")
  public List<RecipeObjectNutrientsCalories> getDailyValues() {
    return dailyValues;
  }
  public void setDailyValues(List<RecipeObjectNutrientsCalories> dailyValues) {
    this.dailyValues = dailyValues;
  }

  /**
   * An array containing information for fat found in this recipe
   **/
  public RecipeObjectNutrients fat(List<RecipeObjectNutrientsCalories> fat) {
    this.fat = fat;
    return this;
  }

  
  @Schema(description = "An array containing information for fat found in this recipe")
  @JsonProperty("fat")
  public List<RecipeObjectNutrientsCalories> getFat() {
    return fat;
  }
  public void setFat(List<RecipeObjectNutrientsCalories> fat) {
    this.fat = fat;
  }

  /**
   * An array containing information for carbs found in this recipe
   **/
  public RecipeObjectNutrients carbs(List<RecipeObjectNutrientsCalories> carbs) {
    this.carbs = carbs;
    return this;
  }

  
  @Schema(description = "An array containing information for carbs found in this recipe")
  @JsonProperty("carbs")
  public List<RecipeObjectNutrientsCalories> getCarbs() {
    return carbs;
  }
  public void setCarbs(List<RecipeObjectNutrientsCalories> carbs) {
    this.carbs = carbs;
  }

  /**
   * An array containing information for vitamins found in this recipe
   **/
  public RecipeObjectNutrients vitamins(List<RecipeObjectNutrientsCalories> vitamins) {
    this.vitamins = vitamins;
    return this;
  }

  
  @Schema(description = "An array containing information for vitamins found in this recipe")
  @JsonProperty("vitamins")
  public List<RecipeObjectNutrientsCalories> getVitamins() {
    return vitamins;
  }
  public void setVitamins(List<RecipeObjectNutrientsCalories> vitamins) {
    this.vitamins = vitamins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeObjectNutrients recipeObjectNutrients = (RecipeObjectNutrients) o;
    return Objects.equals(calories, recipeObjectNutrients.calories) &&
        Objects.equals(dailyValues, recipeObjectNutrients.dailyValues) &&
        Objects.equals(fat, recipeObjectNutrients.fat) &&
        Objects.equals(carbs, recipeObjectNutrients.carbs) &&
        Objects.equals(vitamins, recipeObjectNutrients.vitamins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calories, dailyValues, fat, carbs, vitamins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectNutrients {\n");
    sb.append("    calories: ").append(toIndentedString(calories)).append("\n");
    sb.append("    dailyValues: ").append(toIndentedString(dailyValues)).append("\n");
    sb.append("    fat: ").append(toIndentedString(fat)).append("\n");
    sb.append("    carbs: ").append(toIndentedString(carbs)).append("\n");
    sb.append("    vitamins: ").append(toIndentedString(vitamins)).append("\n");
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
