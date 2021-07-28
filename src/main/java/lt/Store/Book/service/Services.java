package lt.Store.Book.service;

import lt.Store.Book.dto.BookDto;
import lt.Store.Book.model.Book;

import java.math.BigDecimal;

public interface Services {

    BookDto getBookByBarcode(Long barcode);
    boolean addBook(BookDto bookDto);
    boolean editBookByBarcode(Long barcode);
    BigDecimal calculatePrice(Long barcode);

}
