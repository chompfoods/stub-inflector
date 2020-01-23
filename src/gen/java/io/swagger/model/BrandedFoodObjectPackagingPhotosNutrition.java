package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * An object containing photos of this item&#x27;s nutrition label
 **/
@Schema(description = "An object containing photos of this item's nutrition label")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2020-01-23T13:12:53.320Z[GMT]")
public class BrandedFoodObjectPackagingPhotosNutrition   {
  @JsonProperty("small")
  private String small = null;
  @JsonProperty("thumb")
  private String thumb = null;
  @JsonProperty("display")
  private String display = null;
  /**
   * Small photo of this item's nutrition label
   **/
  public BrandedFoodObjectPackagingPhotosNutrition small(String small) {
    this.small = small;
    return this;
  }

  
  @Schema(description = "Small photo of this item's nutrition label")
  @JsonProperty("small")
  public String getSmall() {
    return small;
  }
  public void setSmall(String small) {
    this.small = small;
  }

  /**
   * Thumbnail photo of this item's nutrition label
   **/
  public BrandedFoodObjectPackagingPhotosNutrition thumb(String thumb) {
    this.thumb = thumb;
    return this;
  }

  
  @Schema(description = "Thumbnail photo of this item's nutrition label")
  @JsonProperty("thumb")
  public String getThumb() {
    return thumb;
  }
  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  /**
   * Full-sized photo of this item's nutrition label
   **/
  public BrandedFoodObjectPackagingPhotosNutrition display(String display) {
    this.display = display;
    return this;
  }

  
  @Schema(description = "Full-sized photo of this item's nutrition label")
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
    BrandedFoodObjectPackagingPhotosNutrition brandedFoodObjectPackagingPhotosNutrition = (BrandedFoodObjectPackagingPhotosNutrition) o;
    return Objects.equals(small, brandedFoodObjectPackagingPhotosNutrition.small) &&
        Objects.equals(thumb, brandedFoodObjectPackagingPhotosNutrition.thumb) &&
        Objects.equals(display, brandedFoodObjectPackagingPhotosNutrition.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(small, thumb, display);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPackagingPhotosNutrition {\n");
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
