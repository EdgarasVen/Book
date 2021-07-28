package lt.Store.Book.api;

import lt.Store.Book.dto.BookDto;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface Controller {

    ResponseEntity<Map<Object,Object>> editBooks(BookDto book);
    ResponseEntity<Map<Object,Object>> addBooks(BookDto book);
    ResponseEntity<Map<Object,Object>> getBookByBarcode(Long barcode);
    ResponseEntity<Map<Object,Object>> calculateTotalPriceBooksByBarcode(Long barcode);

}
