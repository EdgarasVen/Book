package lt.Store.Book.dto;

import java.math.BigDecimal;

public class BookDto {

    private Long barcode;
    private String name;
    private String author;
    private BigDecimal price;
    private int quantity;
    private int releaseYear;
    private int scienceIndex;

    public BookDto(Long barcode, String name, String author, BigDecimal price, int quantity, int releaseYear, int scienceIndex) {
        this.barcode = barcode;
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.releaseYear = releaseYear;
        this.scienceIndex = scienceIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getBarcode() {
        return barcode;
    }

    public void setBarcode(Long barcode) {
        this.barcode = barcode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getScienceIndex() {
        return scienceIndex;
    }

    public void setScienceIndex(int scienceIndex) {
        this.scienceIndex = scienceIndex;
    }
}
