package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BrandedFoodObjectDietLabels;
import io.swagger.model.IngredientObjectCalorieConversionFactor;
import io.swagger.model.IngredientObjectComponents;
import io.swagger.model.IngredientObjectNutrients;
import io.swagger.model.IngredientObjectPortions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * An object containing information for this specific item.
 **/
@Schema(description = "An object containing information for this specific item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2020-01-23T13:15:58.178Z[GMT]")
public class IngredientObjectItems   {
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("categories")
  private List<String> categories = null;
  @JsonProperty("nutrients")
  private IngredientObjectNutrients nutrients = null;
  @JsonProperty("calorie_conversion_factor")
  private IngredientObjectCalorieConversionFactor calorieConversionFactor = null;
  @JsonProperty("protein_conversion_factor")
  private BigDecimal proteinConversionFactor = null;
  @JsonProperty("diet_labels")
  private BrandedFoodObjectDietLabels dietLabels = null;
  @JsonProperty("components")
  private List<IngredientObjectComponents> components = null;
  @JsonProperty("portions")
  private List<IngredientObjectPortions> portions = null;
  @JsonProperty("common_names")
  private String commonNames = null;
  @JsonProperty("description")
  private String description = null;
  @JsonProperty("footnote")
  private String footnote = null;
  /**
   * Item name as provided by brand owner or as shown on packaging
   **/
  public IngredientObjectItems name(String name) {
    this.name = name;
    return this;
  }

  
  @Schema(description = "Item name as provided by brand owner or as shown on packaging")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public IngredientObjectItems categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  /**
   **/
  public IngredientObjectItems nutrients(IngredientObjectNutrients nutrients) {
    this.nutrients = nutrients;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("nutrients")
  public IngredientObjectNutrients getNutrients() {
    return nutrients;
  }
  public void setNutrients(IngredientObjectNutrients nutrients) {
    this.nutrients = nutrients;
  }

  /**
   **/
  public IngredientObjectItems calorieConversionFactor(IngredientObjectCalorieConversionFactor calorieConversionFactor) {
    this.calorieConversionFactor = calorieConversionFactor;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("calorie_conversion_factor")
  public IngredientObjectCalorieConversionFactor getCalorieConversionFactor() {
    return calorieConversionFactor;
  }
  public void setCalorieConversionFactor(IngredientObjectCalorieConversionFactor calorieConversionFactor) {
    this.calorieConversionFactor = calorieConversionFactor;
  }

  /**
   * The multiplication factor used to calculate protein from nitrogen
   **/
  public IngredientObjectItems proteinConversionFactor(BigDecimal proteinConversionFactor) {
    this.proteinConversionFactor = proteinConversionFactor;
    return this;
  }

  
  @Schema(description = "The multiplication factor used to calculate protein from nitrogen")
  @JsonProperty("protein_conversion_factor")
  public BigDecimal getProteinConversionFactor() {
    return proteinConversionFactor;
  }
  public void setProteinConversionFactor(BigDecimal proteinConversionFactor) {
    this.proteinConversionFactor = proteinConversionFactor;
  }

  /**
   **/
  public IngredientObjectItems dietLabels(BrandedFoodObjectDietLabels dietLabels) {
    this.dietLabels = dietLabels;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("diet_labels")
  public BrandedFoodObjectDietLabels getDietLabels() {
    return dietLabels;
  }
  public void setDietLabels(BrandedFoodObjectDietLabels dietLabels) {
    this.dietLabels = dietLabels;
  }

  /**
   * An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)
   **/
  public IngredientObjectItems components(List<IngredientObjectComponents> components) {
    this.components = components;
    return this;
  }

  
  @Schema(description = "An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)")
  @JsonProperty("components")
  public List<IngredientObjectComponents> getComponents() {
    return components;
  }
  public void setComponents(List<IngredientObjectComponents> components) {
    this.components = components;
  }

  /**
   * An array of objects containing information on discrete amounts of a food found in this item
   **/
  public IngredientObjectItems portions(List<IngredientObjectPortions> portions) {
    this.portions = portions;
    return this;
  }

  
  @Schema(description = "An array of objects containing information on discrete amounts of a food found in this item")
  @JsonProperty("portions")
  public List<IngredientObjectPortions> getPortions() {
    return portions;
  }
  public void setPortions(List<IngredientObjectPortions> portions) {
    this.portions = portions;
  }

  /**
   * Common names associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")
   **/
  public IngredientObjectItems commonNames(String commonNames) {
    this.commonNames = commonNames;
    return this;
  }

  
  @Schema(description = "Common names associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")")
  @JsonProperty("common_names")
  public String getCommonNames() {
    return commonNames;
  }
  public void setCommonNames(String commonNames) {
    this.commonNames = commonNames;
  }

  /**
   * A description of this item
   **/
  public IngredientObjectItems description(String description) {
    this.description = description;
    return this;
  }

  
  @Schema(description = "A description of this item")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.
   **/
  public IngredientObjectItems footnote(String footnote) {
    this.footnote = footnote;
    return this;
  }

  
  @Schema(description = "Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.")
  @JsonProperty("footnote")
  public String getFootnote() {
    return footnote;
  }
  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientObjectItems ingredientObjectItems = (IngredientObjectItems) o;
    return Objects.equals(name, ingredientObjectItems.name) &&
        Objects.equals(categories, ingredientObjectItems.categories) &&
        Objects.equals(nutrients, ingredientObjectItems.nutrients) &&
        Objects.equals(calorieConversionFactor, ingredientObjectItems.calorieConversionFactor) &&
        Objects.equals(proteinConversionFactor, ingredientObjectItems.proteinConversionFactor) &&
        Objects.equals(dietLabels, ingredientObjectItems.dietLabels) &&
        Objects.equals(components, ingredientObjectItems.components) &&
        Objects.equals(portions, ingredientObjectItems.portions) &&
        Objects.equals(commonNames, ingredientObjectItems.commonNames) &&
        Objects.equals(description, ingredientObjectItems.description) &&
        Objects.equals(footnote, ingredientObjectItems.footnote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, categories, nutrients, calorieConversionFactor, proteinConversionFactor, dietLabels, components, portions, commonNames, description, footnote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectItems {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    calorieConversionFactor: ").append(toIndentedString(calorieConversionFactor)).append("\n");
    sb.append("    proteinConversionFactor: ").append(toIndentedString(proteinConversionFactor)).append("\n");
    sb.append("    dietLabels: ").append(toIndentedString(dietLabels)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    portions: ").append(toIndentedString(portions)).append("\n");
    sb.append("    commonNames: ").append(toIndentedString(commonNames)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
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
