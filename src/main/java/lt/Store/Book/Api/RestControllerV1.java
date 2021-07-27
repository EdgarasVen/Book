package lt.Store.Book.Api;

import lt.Store.Book.dto.DtoBook;
import lt.Store.Book.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("Bookshelf/")
public class RestControllerV1 implements RestApi{

    @Autowired
    private Services bookshelf;

    @Override
    @PutMapping("put/")
    public ResponseEntity<Map<Object, Object>> addOrEditBooks(@RequestBody final DtoBook book) {
        Map<Object, Object> response = new HashMap<>();

        return null;
    }

    @Override
    @GetMapping("get/{barcode}")
    public ResponseEntity<Map<Object, Object>> getBookByBarcode(@PathVariable Long barcode) {
        Map<Object, Object> response = new HashMap<>();
        return null;
    }

    @Override
    @GetMapping("calculate/{barcode}")
    public ResponseEntity<Map<Object, Object>> calculateTotalPriceBooksByBarcode(@PathVariable Long barcode) {
        Map<Object, Object> response = new HashMap<>();
        return null;
    }
}
