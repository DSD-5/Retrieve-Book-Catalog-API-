package com.tutiempolibro.retrievecatalog.entity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BookType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-28T13:04:35.736-05:00")




public class BookType   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("ranking")
  private String ranking = null;

  @JsonProperty("price")
  private String price = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("urlimage")
  private String urlimage = null;

  @JsonProperty("stock")
  private String stock = null;

  public BookType title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the book
   * @return title
  **/
  @ApiModelProperty(required = true, value = "title of the book")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BookType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Long description of the book
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Long description of the book")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BookType ranking(String ranking) {
    this.ranking = ranking;
    return this;
  }

  /**
   * number of stars ranking
   * @return ranking
  **/
  @ApiModelProperty(required = true, value = "number of stars ranking")
  @NotNull


  public String getRanking() {
    return ranking;
  }

  public void setRanking(String ranking) {
    this.ranking = ranking;
  }

  public BookType price(String price) {
    this.price = price;
    return this;
  }

  /**
   * price of the book
   * @return price
  **/
  @ApiModelProperty(required = true, value = "price of the book")
  @NotNull


  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public BookType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Indentity of Book
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Indentity of Book")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BookType urlimage(String urlimage) {
    this.urlimage = urlimage;
    return this;
  }

  /**
   * Url Image
   * @return urlimage
  **/
  @ApiModelProperty(required = true, value = "Url Image")
  @NotNull


  public String getUrlimage() {
    return urlimage;
  }

  public void setUrlimage(String urlimage) {
    this.urlimage = urlimage;
  }

  public BookType stock(String stock) {
    this.stock = stock;
    return this;
  }

  /**
   * Stock Book
   * @return stock
  **/
  @ApiModelProperty(required = true, value = "Stock Book")
  @NotNull


  public String getStock() {
    return stock;
  }

  public void setStock(String stock) {
    this.stock = stock;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookType bookType = (BookType) o;
    return Objects.equals(this.title, bookType.title) &&
        Objects.equals(this.description, bookType.description) &&
        Objects.equals(this.ranking, bookType.ranking) &&
        Objects.equals(this.price, bookType.price) &&
        Objects.equals(this.id, bookType.id) &&
        Objects.equals(this.urlimage, bookType.urlimage) &&
        Objects.equals(this.stock, bookType.stock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, ranking, price, id, urlimage, stock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookType {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    urlimage: ").append(toIndentedString(urlimage)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
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

