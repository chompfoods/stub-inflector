package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BrandedFoodObjectCalorieConversionFactor;
import io.swagger.model.BrandedFoodObjectCountryDetails;
import io.swagger.model.BrandedFoodObjectDietFlags;
import io.swagger.model.BrandedFoodObjectDietLabels;
import io.swagger.model.BrandedFoodObjectIngredients;
import io.swagger.model.BrandedFoodObjectNutrients;
import io.swagger.model.BrandedFoodObjectPackage;
import io.swagger.model.BrandedFoodObjectPackagingPhotos;
import io.swagger.model.BrandedFoodObjectServing;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * An object containing information for this specific item.
 **/
@Schema(description = "An object containing information for this specific item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2020-01-23T13:13:50.981Z[GMT]")
public class BrandedFoodObjectItems   {
  @JsonProperty("barcode")
  private String barcode = null;
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("brand")
  private String brand = null;
  @JsonProperty("ingredients")
  private BrandedFoodObjectIngredients ingredients = null;
  @JsonProperty("package")
  private BrandedFoodObjectPackage _package = null;
  @JsonProperty("serving")
  private BrandedFoodObjectServing serving = null;
  @JsonProperty("categories")
  private List<String> categories = null;
  @JsonProperty("nutrients")
  private BrandedFoodObjectNutrients nutrients = null;
  @JsonProperty("calorie_conversion_factor")
  private BrandedFoodObjectCalorieConversionFactor calorieConversionFactor = null;
  @JsonProperty("protein_conversion_factor")
  private BigDecimal proteinConversionFactor = null;
  @JsonProperty("diet_labels")
  private BrandedFoodObjectDietLabels dietLabels = null;
  @JsonProperty("diet_flags")
  private List<BrandedFoodObjectDietFlags> dietFlags = null;
  @JsonProperty("packaging_photos")
  private BrandedFoodObjectPackagingPhotos packagingPhotos = null;
  @JsonProperty("allergens")
  private List<String> allergens = null;
  @JsonProperty("brand_list")
  private List<String> brandList = null;
  @JsonProperty("countries")
  private List<String> countries = null;
  @JsonProperty("country_details")
  private BrandedFoodObjectCountryDetails countryDetails = null;
  @JsonProperty("palm_oil_ingredients")
  private List<String> palmOilIngredients = null;
  @JsonProperty("ingredient_list")
  private List<String> ingredientList = null;
  @JsonProperty("has_english_ingredients")
  private Boolean hasEnglishIngredients = null;
  @JsonProperty("minerals")
  private List<String> minerals = null;
  @JsonProperty("traces")
  private List<String> traces = null;
  @JsonProperty("vitamins")
  private List<String> vitamins = null;
  @JsonProperty("description")
  private String description = null;
  @JsonProperty("keywords")
  private List<String> keywords = null;
  /**
   * EAN/UPC barcode
   **/
  public BrandedFoodObjectItems barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

  
  @Schema(description = "EAN/UPC barcode")
  @JsonProperty("barcode")
  public String getBarcode() {
    return barcode;
  }
  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  /**
   * Item name as provided by brand owner or as shown on packaging
   **/
  public BrandedFoodObjectItems name(String name) {
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
   * The brand name that owns this item
   **/
  public BrandedFoodObjectItems brand(String brand) {
    this.brand = brand;
    return this;
  }

  
  @Schema(description = "The brand name that owns this item")
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   **/
  public BrandedFoodObjectItems ingredients(BrandedFoodObjectIngredients ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("ingredients")
  public BrandedFoodObjectIngredients getIngredients() {
    return ingredients;
  }
  public void setIngredients(BrandedFoodObjectIngredients ingredients) {
    this.ingredients = ingredients;
  }

  /**
   **/
  public BrandedFoodObjectItems _package(BrandedFoodObjectPackage _package) {
    this._package = _package;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("package")
  public BrandedFoodObjectPackage getPackage() {
    return _package;
  }
  public void setPackage(BrandedFoodObjectPackage _package) {
    this._package = _package;
  }

  /**
   **/
  public BrandedFoodObjectItems serving(BrandedFoodObjectServing serving) {
    this.serving = serving;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("serving")
  public BrandedFoodObjectServing getServing() {
    return serving;
  }
  public void setServing(BrandedFoodObjectServing serving) {
    this.serving = serving;
  }

  /**
   **/
  public BrandedFoodObjectItems categories(List<String> categories) {
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
  public BrandedFoodObjectItems nutrients(BrandedFoodObjectNutrients nutrients) {
    this.nutrients = nutrients;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("nutrients")
  public BrandedFoodObjectNutrients getNutrients() {
    return nutrients;
  }
  public void setNutrients(BrandedFoodObjectNutrients nutrients) {
    this.nutrients = nutrients;
  }

  /**
   **/
  public BrandedFoodObjectItems calorieConversionFactor(BrandedFoodObjectCalorieConversionFactor calorieConversionFactor) {
    this.calorieConversionFactor = calorieConversionFactor;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("calorie_conversion_factor")
  public BrandedFoodObjectCalorieConversionFactor getCalorieConversionFactor() {
    return calorieConversionFactor;
  }
  public void setCalorieConversionFactor(BrandedFoodObjectCalorieConversionFactor calorieConversionFactor) {
    this.calorieConversionFactor = calorieConversionFactor;
  }

  /**
   * The multiplication factor used to calculate protein from nitrogen
   **/
  public BrandedFoodObjectItems proteinConversionFactor(BigDecimal proteinConversionFactor) {
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
  public BrandedFoodObjectItems dietLabels(BrandedFoodObjectDietLabels dietLabels) {
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
   * An array of ingredient objects that were flagged while grading this item for compatibility with each diet
   **/
  public BrandedFoodObjectItems dietFlags(List<BrandedFoodObjectDietFlags> dietFlags) {
    this.dietFlags = dietFlags;
    return this;
  }

  
  @Schema(description = "An array of ingredient objects that were flagged while grading this item for compatibility with each diet")
  @JsonProperty("diet_flags")
  public List<BrandedFoodObjectDietFlags> getDietFlags() {
    return dietFlags;
  }
  public void setDietFlags(List<BrandedFoodObjectDietFlags> dietFlags) {
    this.dietFlags = dietFlags;
  }

  /**
   **/
  public BrandedFoodObjectItems packagingPhotos(BrandedFoodObjectPackagingPhotos packagingPhotos) {
    this.packagingPhotos = packagingPhotos;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("packaging_photos")
  public BrandedFoodObjectPackagingPhotos getPackagingPhotos() {
    return packagingPhotos;
  }
  public void setPackagingPhotos(BrandedFoodObjectPackagingPhotos packagingPhotos) {
    this.packagingPhotos = packagingPhotos;
  }

  /**
   * An array of ingredients in this item that may cause allergic reactions in people
   **/
  public BrandedFoodObjectItems allergens(List<String> allergens) {
    this.allergens = allergens;
    return this;
  }

  
  @Schema(description = "An array of ingredients in this item that may cause allergic reactions in people")
  @JsonProperty("allergens")
  public List<String> getAllergens() {
    return allergens;
  }
  public void setAllergens(List<String> allergens) {
    this.allergens = allergens;
  }

  /**
   * An array of brands we have associated with this item. Some items are sold by more than 1 brand.
   **/
  public BrandedFoodObjectItems brandList(List<String> brandList) {
    this.brandList = brandList;
    return this;
  }

  
  @Schema(description = "An array of brands we have associated with this item. Some items are sold by more than 1 brand.")
  @JsonProperty("brand_list")
  public List<String> getBrandList() {
    return brandList;
  }
  public void setBrandList(List<String> brandList) {
    this.brandList = brandList;
  }

  /**
   * An array of countries where this item is sold
   **/
  public BrandedFoodObjectItems countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  
  @Schema(description = "An array of countries where this item is sold")
  @JsonProperty("countries")
  public List<String> getCountries() {
    return countries;
  }
  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  /**
   **/
  public BrandedFoodObjectItems countryDetails(BrandedFoodObjectCountryDetails countryDetails) {
    this.countryDetails = countryDetails;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("country_details")
  public BrandedFoodObjectCountryDetails getCountryDetails() {
    return countryDetails;
  }
  public void setCountryDetails(BrandedFoodObjectCountryDetails countryDetails) {
    this.countryDetails = countryDetails;
  }

  /**
   * An array of ingredients made from palm oil
   **/
  public BrandedFoodObjectItems palmOilIngredients(List<String> palmOilIngredients) {
    this.palmOilIngredients = palmOilIngredients;
    return this;
  }

  
  @Schema(description = "An array of ingredients made from palm oil")
  @JsonProperty("palm_oil_ingredients")
  public List<String> getPalmOilIngredients() {
    return palmOilIngredients;
  }
  public void setPalmOilIngredients(List<String> palmOilIngredients) {
    this.palmOilIngredients = palmOilIngredients;
  }

  /**
   * An array of this item's ingredients
   **/
  public BrandedFoodObjectItems ingredientList(List<String> ingredientList) {
    this.ingredientList = ingredientList;
    return this;
  }

  
  @Schema(description = "An array of this item's ingredients")
  @JsonProperty("ingredient_list")
  public List<String> getIngredientList() {
    return ingredientList;
  }
  public void setIngredientList(List<String> ingredientList) {
    this.ingredientList = ingredientList;
  }

  /**
   * A boolean indicating if we have English ingredients for this item
   **/
  public BrandedFoodObjectItems hasEnglishIngredients(Boolean hasEnglishIngredients) {
    this.hasEnglishIngredients = hasEnglishIngredients;
    return this;
  }

  
  @Schema(description = "A boolean indicating if we have English ingredients for this item")
  @JsonProperty("has_english_ingredients")
  public Boolean isHasEnglishIngredients() {
    return hasEnglishIngredients;
  }
  public void setHasEnglishIngredients(Boolean hasEnglishIngredients) {
    this.hasEnglishIngredients = hasEnglishIngredients;
  }

  /**
   * An array of minerals that this item contains
   **/
  public BrandedFoodObjectItems minerals(List<String> minerals) {
    this.minerals = minerals;
    return this;
  }

  
  @Schema(description = "An array of minerals that this item contains")
  @JsonProperty("minerals")
  public List<String> getMinerals() {
    return minerals;
  }
  public void setMinerals(List<String> minerals) {
    this.minerals = minerals;
  }

  /**
   * An array of trace ingredients that may be found in this item
   **/
  public BrandedFoodObjectItems traces(List<String> traces) {
    this.traces = traces;
    return this;
  }

  
  @Schema(description = "An array of trace ingredients that may be found in this item")
  @JsonProperty("traces")
  public List<String> getTraces() {
    return traces;
  }
  public void setTraces(List<String> traces) {
    this.traces = traces;
  }

  /**
   * An array of vitamins that are found in this item
   **/
  public BrandedFoodObjectItems vitamins(List<String> vitamins) {
    this.vitamins = vitamins;
    return this;
  }

  
  @Schema(description = "An array of vitamins that are found in this item")
  @JsonProperty("vitamins")
  public List<String> getVitamins() {
    return vitamins;
  }
  public void setVitamins(List<String> vitamins) {
    this.vitamins = vitamins;
  }

  /**
   * A description of this item
   **/
  public BrandedFoodObjectItems description(String description) {
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
   * An array of keywords that can be used to describe this item
   **/
  public BrandedFoodObjectItems keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @Schema(description = "An array of keywords that can be used to describe this item")
  @JsonProperty("keywords")
  public List<String> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectItems brandedFoodObjectItems = (BrandedFoodObjectItems) o;
    return Objects.equals(barcode, brandedFoodObjectItems.barcode) &&
        Objects.equals(name, brandedFoodObjectItems.name) &&
        Objects.equals(brand, brandedFoodObjectItems.brand) &&
        Objects.equals(ingredients, brandedFoodObjectItems.ingredients) &&
        Objects.equals(_package, brandedFoodObjectItems._package) &&
        Objects.equals(serving, brandedFoodObjectItems.serving) &&
        Objects.equals(categories, brandedFoodObjectItems.categories) &&
        Objects.equals(nutrients, brandedFoodObjectItems.nutrients) &&
        Objects.equals(calorieConversionFactor, brandedFoodObjectItems.calorieConversionFactor) &&
        Objects.equals(proteinConversionFactor, brandedFoodObjectItems.proteinConversionFactor) &&
        Objects.equals(dietLabels, brandedFoodObjectItems.dietLabels) &&
        Objects.equals(dietFlags, brandedFoodObjectItems.dietFlags) &&
        Objects.equals(packagingPhotos, brandedFoodObjectItems.packagingPhotos) &&
        Objects.equals(allergens, brandedFoodObjectItems.allergens) &&
        Objects.equals(brandList, brandedFoodObjectItems.brandList) &&
        Objects.equals(countries, brandedFoodObjectItems.countries) &&
        Objects.equals(countryDetails, brandedFoodObjectItems.countryDetails) &&
        Objects.equals(palmOilIngredients, brandedFoodObjectItems.palmOilIngredients) &&
        Objects.equals(ingredientList, brandedFoodObjectItems.ingredientList) &&
        Objects.equals(hasEnglishIngredients, brandedFoodObjectItems.hasEnglishIngredients) &&
        Objects.equals(minerals, brandedFoodObjectItems.minerals) &&
        Objects.equals(traces, brandedFoodObjectItems.traces) &&
        Objects.equals(vitamins, brandedFoodObjectItems.vitamins) &&
        Objects.equals(description, brandedFoodObjectItems.description) &&
        Objects.equals(keywords, brandedFoodObjectItems.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcode, name, brand, ingredients, _package, serving, categories, nutrients, calorieConversionFactor, proteinConversionFactor, dietLabels, dietFlags, packagingPhotos, allergens, brandList, countries, countryDetails, palmOilIngredients, ingredientList, hasEnglishIngredients, minerals, traces, vitamins, description, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectItems {\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    serving: ").append(toIndentedString(serving)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    calorieConversionFactor: ").append(toIndentedString(calorieConversionFactor)).append("\n");
    sb.append("    proteinConversionFactor: ").append(toIndentedString(proteinConversionFactor)).append("\n");
    sb.append("    dietLabels: ").append(toIndentedString(dietLabels)).append("\n");
    sb.append("    dietFlags: ").append(toIndentedString(dietFlags)).append("\n");
    sb.append("    packagingPhotos: ").append(toIndentedString(packagingPhotos)).append("\n");
    sb.append("    allergens: ").append(toIndentedString(allergens)).append("\n");
    sb.append("    brandList: ").append(toIndentedString(brandList)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    countryDetails: ").append(toIndentedString(countryDetails)).append("\n");
    sb.append("    palmOilIngredients: ").append(toIndentedString(palmOilIngredients)).append("\n");
    sb.append("    ingredientList: ").append(toIndentedString(ingredientList)).append("\n");
    sb.append("    hasEnglishIngredients: ").append(toIndentedString(hasEnglishIngredients)).append("\n");
    sb.append("    minerals: ").append(toIndentedString(minerals)).append("\n");
    sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
    sb.append("    vitamins: ").append(toIndentedString(vitamins)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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
