package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RecipeObjectAttributes;
import io.swagger.model.RecipeObjectIngredients;
import io.swagger.model.RecipeObjectMeta;
import io.swagger.model.RecipeObjectNutrients;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;


/**
 * An object containing information for this specific item.
 **/
@Schema(description = "An object containing information for this specific item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2021-03-09T22:27:14.607Z[GMT]")
public class RecipeObjectItems   {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("title")
  private String title = null;
  @JsonProperty("meta")
  private RecipeObjectMeta meta = null;
  @JsonProperty("categories")
  private List<String> categories = null;
  @JsonProperty("author")
  private String author = null;
  @JsonProperty("keywords")
  private List<String> keywords = null;
  @JsonProperty("topics")
  private List<String> topics = null;
  @JsonProperty("attributes")
  private RecipeObjectAttributes attributes = null;
  @JsonProperty("ingredients")
  private List<RecipeObjectIngredients> ingredients = null;
  @JsonProperty("base_ingredients")
  private List<String> baseIngredients = null;
  @JsonProperty("nutrients")
  private RecipeObjectNutrients nutrients = null;
  @JsonProperty("diabetic_exchanges")
  private List<String> diabeticExchanges = null;
  /**
   * Unique recipe ID
   **/
  public RecipeObjectItems id(String id) {
    this.id = id;
    return this;
  }

  
  @Schema(description = "Unique recipe ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Recipe title
   **/
  public RecipeObjectItems title(String title) {
    this.title = title;
    return this;
  }

  
  @Schema(description = "Recipe title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public RecipeObjectItems meta(RecipeObjectMeta meta) {
    this.meta = meta;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("meta")
  public RecipeObjectMeta getMeta() {
    return meta;
  }
  public void setMeta(RecipeObjectMeta meta) {
    this.meta = meta;
  }

  /**
   **/
  public RecipeObjectItems categories(List<String> categories) {
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
   * The author of this recipe. You must attribute this author when displaying this recipe.
   **/
  public RecipeObjectItems author(String author) {
    this.author = author;
    return this;
  }

  
  @Schema(description = "The author of this recipe. You must attribute this author when displaying this recipe.")
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   **/
  public RecipeObjectItems keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("keywords")
  public List<String> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  /**
   **/
  public RecipeObjectItems topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("topics")
  public List<String> getTopics() {
    return topics;
  }
  public void setTopics(List<String> topics) {
    this.topics = topics;
  }

  /**
   **/
  public RecipeObjectItems attributes(RecipeObjectAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("attributes")
  public RecipeObjectAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(RecipeObjectAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * An array containing this recipe's ingredients
   **/
  public RecipeObjectItems ingredients(List<RecipeObjectIngredients> ingredients) {
    this.ingredients = ingredients;
    return this;
  }

  
  @Schema(description = "An array containing this recipe's ingredients")
  @JsonProperty("ingredients")
  public List<RecipeObjectIngredients> getIngredients() {
    return ingredients;
  }
  public void setIngredients(List<RecipeObjectIngredients> ingredients) {
    this.ingredients = ingredients;
  }

  /**
   **/
  public RecipeObjectItems baseIngredients(List<String> baseIngredients) {
    this.baseIngredients = baseIngredients;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("base_ingredients")
  public List<String> getBaseIngredients() {
    return baseIngredients;
  }
  public void setBaseIngredients(List<String> baseIngredients) {
    this.baseIngredients = baseIngredients;
  }

  /**
   **/
  public RecipeObjectItems nutrients(RecipeObjectNutrients nutrients) {
    this.nutrients = nutrients;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("nutrients")
  public RecipeObjectNutrients getNutrients() {
    return nutrients;
  }
  public void setNutrients(RecipeObjectNutrients nutrients) {
    this.nutrients = nutrients;
  }

  /**
   **/
  public RecipeObjectItems diabeticExchanges(List<String> diabeticExchanges) {
    this.diabeticExchanges = diabeticExchanges;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("diabetic_exchanges")
  public List<String> getDiabeticExchanges() {
    return diabeticExchanges;
  }
  public void setDiabeticExchanges(List<String> diabeticExchanges) {
    this.diabeticExchanges = diabeticExchanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeObjectItems recipeObjectItems = (RecipeObjectItems) o;
    return Objects.equals(id, recipeObjectItems.id) &&
        Objects.equals(title, recipeObjectItems.title) &&
        Objects.equals(meta, recipeObjectItems.meta) &&
        Objects.equals(categories, recipeObjectItems.categories) &&
        Objects.equals(author, recipeObjectItems.author) &&
        Objects.equals(keywords, recipeObjectItems.keywords) &&
        Objects.equals(topics, recipeObjectItems.topics) &&
        Objects.equals(attributes, recipeObjectItems.attributes) &&
        Objects.equals(ingredients, recipeObjectItems.ingredients) &&
        Objects.equals(baseIngredients, recipeObjectItems.baseIngredients) &&
        Objects.equals(nutrients, recipeObjectItems.nutrients) &&
        Objects.equals(diabeticExchanges, recipeObjectItems.diabeticExchanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, meta, categories, author, keywords, topics, attributes, ingredients, baseIngredients, nutrients, diabeticExchanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectItems {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    baseIngredients: ").append(toIndentedString(baseIngredients)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    diabeticExchanges: ").append(toIndentedString(diabeticExchanges)).append("\n");
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
