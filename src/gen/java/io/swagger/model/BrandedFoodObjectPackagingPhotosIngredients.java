package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * An object containing photos of the ingredients on this item&#x27;s packaging
 **/
@Schema(description = "An object containing photos of the ingredients on this item's packaging")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2021-03-09T22:27:14.607Z[GMT]")
public class BrandedFoodObjectPackagingPhotosIngredients   {
  @JsonProperty("small")
  private String small = null;
  @JsonProperty("thumb")
  private String thumb = null;
  @JsonProperty("display")
  private String display = null;
  /**
   * Small photo of the ingredients on this item's packaging
   **/
  public BrandedFoodObjectPackagingPhotosIngredients small(String small) {
    this.small = small;
    return this;
  }

  
  @Schema(description = "Small photo of the ingredients on this item's packaging")
  @JsonProperty("small")
  public String getSmall() {
    return small;
  }
  public void setSmall(String small) {
    this.small = small;
  }

  /**
   * Thumbnail photo of the ingredients on this item's packaging
   **/
  public BrandedFoodObjectPackagingPhotosIngredients thumb(String thumb) {
    this.thumb = thumb;
    return this;
  }

  
  @Schema(description = "Thumbnail photo of the ingredients on this item's packaging")
  @JsonProperty("thumb")
  public String getThumb() {
    return thumb;
  }
  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  /**
   * Full-sized photo of the ingredients on this item's packaging
   **/
  public BrandedFoodObjectPackagingPhotosIngredients display(String display) {
    this.display = display;
    return this;
  }

  
  @Schema(description = "Full-sized photo of the ingredients on this item's packaging")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectPackagingPhotosIngredients brandedFoodObjectPackagingPhotosIngredients = (BrandedFoodObjectPackagingPhotosIngredients) o;
    return Objects.equals(small, brandedFoodObjectPackagingPhotosIngredients.small) &&
        Objects.equals(thumb, brandedFoodObjectPackagingPhotosIngredients.thumb) &&
        Objects.equals(display, brandedFoodObjectPackagingPhotosIngredients.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(small, thumb, display);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPackagingPhotosIngredients {\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
    sb.append("    thumb: ").append(toIndentedString(thumb)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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
