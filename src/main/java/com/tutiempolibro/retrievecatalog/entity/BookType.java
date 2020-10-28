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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-28T14:59:10.220-05:00")




public class BookType   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("ranking")
  private String ranking = null;

  @JsonProperty("pricesale")
  private String pricesale = null;

  @JsonProperty("pricerental")
  private String pricerental = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("urlimage")
  private String urlimage = null;

  @JsonProperty("stocksale")
  private String stocksale = null;

  @JsonProperty("stockrental")
  private String stockrental = null;

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

  public BookType pricesale(String pricesale) {
    this.pricesale = pricesale;
    return this;
  }

  /**
   * price sales of the book
   * @return pricesale
  **/
  @ApiModelProperty(required = true, value = "price sales of the book")
  @NotNull


  public String getPricesale() {
    return pricesale;
  }

  public void setPricesale(String pricesale) {
    this.pricesale = pricesale;
  }

  public BookType pricerental(String pricerental) {
    this.pricerental = pricerental;
    return this;
  }

  /**
   * price Rental of the book
   * @return pricerental
  **/
  @ApiModelProperty(required = true, value = "price Rental of the book")
  @NotNull


  public String getPricerental() {
    return pricerental;
  }

  public void setPricerental(String pricerental) {
    this.pricerental = pricerental;
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

  public BookType stocksale(String stocksale) {
    this.stocksale = stocksale;
    return this;
  }

  /**
   * Stock Sales Book
   * @return stocksale
  **/
  @ApiModelProperty(required = true, value = "Stock Sales Book")
  @NotNull


  public String getStocksale() {
    return stocksale;
  }

  public void setStocksale(String stocksale) {
    this.stocksale = stocksale;
  }

  public BookType stockrental(String stockrental) {
    this.stockrental = stockrental;
    return this;
  }

  /**
   * Stock Rental Book
   * @return stockrental
  **/
  @ApiModelProperty(required = true, value = "Stock Rental Book")
  @NotNull


  public String getStockrental() {
    return stockrental;
  }

  public void setStockrental(String stockrental) {
    this.stockrental = stockrental;
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
        Objects.equals(this.pricesale, bookType.pricesale) &&
        Objects.equals(this.pricerental, bookType.pricerental) &&
        Objects.equals(this.id, bookType.id) &&
        Objects.equals(this.urlimage, bookType.urlimage) &&
        Objects.equals(this.stocksale, bookType.stocksale) &&
        Objects.equals(this.stockrental, bookType.stockrental);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, ranking, pricesale, pricerental, id, urlimage, stocksale, stockrental);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookType {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    pricesale: ").append(toIndentedString(pricesale)).append("\n");
    sb.append("    pricerental: ").append(toIndentedString(pricerental)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    urlimage: ").append(toIndentedString(urlimage)).append("\n");
    sb.append("    stocksale: ").append(toIndentedString(stocksale)).append("\n");
    sb.append("    stockrental: ").append(toIndentedString(stockrental)).append("\n");
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

