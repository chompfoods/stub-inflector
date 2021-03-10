package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * An object containing this recipe&#x27;s image URLs
 **/
@Schema(description = "An object containing this recipe's image URLs")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2021-03-09T22:27:14.607Z[GMT]")
public class RecipeObjectMetaImages   {
  @JsonProperty("extra_large")
  private String extraLarge = null;
  @JsonProperty("large")
  private String large = null;
  @JsonProperty("standard")
  private String standard = null;
  @JsonProperty("grid_view")
  private String gridView = null;
  @JsonProperty("small")
  private String small = null;
  @JsonProperty("thumbnail")
  private String thumbnail = null;
  @JsonProperty("extra_small")
  private String extraSmall = null;
  /**
   * Extra large recipe image
   **/
  public RecipeObjectMetaImages extraLarge(String extraLarge) {
    this.extraLarge = extraLarge;
    return this;
  }

  
  @Schema(description = "Extra large recipe image")
  @JsonProperty("extra_large")
  public String getExtraLarge() {
    return extraLarge;
  }
  public void setExtraLarge(String extraLarge) {
    this.extraLarge = extraLarge;
  }

  /**
   * Large recipe image
   **/
  public RecipeObjectMetaImages large(String large) {
    this.large = large;
    return this;
  }

  
  @Schema(description = "Large recipe image")
  @JsonProperty("large")
  public String getLarge() {
    return large;
  }
  public void setLarge(String large) {
    this.large = large;
  }

  /**
   * Standard recipe image
   **/
  public RecipeObjectMetaImages standard(String standard) {
    this.standard = standard;
    return this;
  }

  
  @Schema(description = "Standard recipe image")
  @JsonProperty("standard")
  public String getStandard() {
    return standard;
  }
  public void setStandard(String standard) {
    this.standard = standard;
  }

  /**
   * Grid view recipe image
   **/
  public RecipeObjectMetaImages gridView(String gridView) {
    this.gridView = gridView;
    return this;
  }

  
  @Schema(description = "Grid view recipe image")
  @JsonProperty("grid_view")
  public String getGridView() {
    return gridView;
  }
  public void setGridView(String gridView) {
    this.gridView = gridView;
  }

  /**
   * Small recipe image
   **/
  public RecipeObjectMetaImages small(String small) {
    this.small = small;
    return this;
  }

  
  @Schema(description = "Small recipe image")
  @JsonProperty("small")
  public String getSmall() {
    return small;
  }
  public void setSmall(String small) {
    this.small = small;
  }

  /**
   * Thumbnail recipe image
   **/
  public RecipeObjectMetaImages thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  
  @Schema(description = "Thumbnail recipe image")
  @JsonProperty("thumbnail")
  public String getThumbnail() {
    return thumbnail;
  }
  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  /**
   * Extra small recipe image
   **/
  public RecipeObjectMetaImages extraSmall(String extraSmall) {
    this.extraSmall = extraSmall;
    return this;
  }

  
  @Schema(description = "Extra small recipe image")
  @JsonProperty("extra_small")
  public String getExtraSmall() {
    return extraSmall;
  }
  public void setExtraSmall(String extraSmall) {
    this.extraSmall = extraSmall;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeObjectMetaImages recipeObjectMetaImages = (RecipeObjectMetaImages) o;
    return Objects.equals(extraLarge, recipeObjectMetaImages.extraLarge) &&
        Objects.equals(large, recipeObjectMetaImages.large) &&
        Objects.equals(standard, recipeObjectMetaImages.standard) &&
        Objects.equals(gridView, recipeObjectMetaImages.gridView) &&
        Objects.equals(small, recipeObjectMetaImages.small) &&
        Objects.equals(thumbnail, recipeObjectMetaImages.thumbnail) &&
        Objects.equals(extraSmall, recipeObjectMetaImages.extraSmall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraLarge, large, standard, gridView, small, thumbnail, extraSmall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectMetaImages {\n");
    sb.append("    extraLarge: ").append(toIndentedString(extraLarge)).append("\n");
    sb.append("    large: ").append(toIndentedString(large)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    gridView: ").append(toIndentedString(gridView)).append("\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    extraSmall: ").append(toIndentedString(extraSmall)).append("\n");
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
