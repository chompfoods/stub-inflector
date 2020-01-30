package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * An object containing basic packaging information about this item
 **/
@Schema(description = "An object containing basic packaging information about this item")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2020-01-30T02:08:15.824Z[GMT]")
public class BrandedFoodObjectPackage   {
  @JsonProperty("quantity")
  private Integer quantity = null;
  @JsonProperty("size")
  private String size = null;
  /**
   * Package quantity
   **/
  public BrandedFoodObjectPackage quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  
  @Schema(description = "Package quantity")
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * Package size
   **/
  public BrandedFoodObjectPackage size(String size) {
    this.size = size;
    return this;
  }

  
  @Schema(description = "Package size")
  @JsonProperty("size")
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectPackage brandedFoodObjectPackage = (BrandedFoodObjectPackage) o;
    return Objects.equals(quantity, brandedFoodObjectPackage.quantity) &&
        Objects.equals(size, brandedFoodObjectPackage.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPackage {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
