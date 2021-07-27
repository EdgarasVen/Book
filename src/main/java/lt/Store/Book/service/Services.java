package lt.Store.Book.service;

import lt.Store.Book.dto.DtoBook;

import java.math.BigDecimal;

public interface Services {

    DtoBook getBookByBarcode(Long barcode);
    boolean addBook(DtoBook dtoBook);
    boolean editBookByBarcode(Long barcode);
    BigDecimal calculatePrice(Long barcode);

}
