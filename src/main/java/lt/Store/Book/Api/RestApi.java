package lt.Store.Book.Api;

import lt.Store.Book.dto.DtoBook;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface RestApi {

    ResponseEntity<Map<Object,Object>> addOrEditBooks(DtoBook book);
    ResponseEntity<Map<Object,Object>> getBookByBarcode(Long barcode);
    ResponseEntity<Map<Object,Object>> calculateTotalPriceBooksByBarcode(Long barcode);

}
