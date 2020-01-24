package io.swagger.model;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BrandedFoodObjectItems;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;


/**
 * Please read the description of each field in this API response object example. By default, the value of each field is **null**. This indicates an unknown state or that no data exists.
 **/
@Schema(description = "Please read the description of each field in this API response object example. By default, the value of each field is **null**. This indicates an unknown state or that no data exists.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2020-01-24T13:22:21.913Z[GMT]")
public class BrandedFoodObject   {
  @JsonProperty("items")
  private List<BrandedFoodObjectItems> items = null;
  /**
   * An array containing an object for each individual item returned by your API call.
   **/
  public BrandedFoodObject items(List<BrandedFoodObjectItems> items) {
    this.items = items;
    return this;
  }

  
  @Schema(description = "An array containing an object for each individual item returned by your API call.")
  @JsonProperty("items")
  public List<BrandedFoodObjectItems> getItems() {
    return items;
  }
  public void setItems(List<BrandedFoodObjectItems> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObject brandedFoodObject = (BrandedFoodObject) o;
    return Objects.equals(items, brandedFoodObject.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObject {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
