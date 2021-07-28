package lt.Store.Book.api;

import lt.Store.Book.dto.BookDto;
import lt.Store.Book.model.AncientBook;
import lt.Store.Book.model.Book;
import lt.Store.Book.service.Services;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("Bookshelf/")
public class ControllerImpV1 implements Controller {

    @Autowired
    private Services service;

    @Override
    @PutMapping("edit/")
    public ResponseEntity<Map<Object, Object>> editBooks(@RequestBody final BookDto bookDto) {
        Map<Object, Object> response = new HashMap<>();
        return null;
    }

    @Override
    @PostMapping("add/")
    public ResponseEntity<Map<Object, Object>> addBooks(@RequestBody final BookDto bookDto) {
        Map<Object, Object> response = new HashMap<>();
        boolean result = service.addBook(bookDto);
        if (result){
            response.put("Book", bookDto);
            response.put("Result" , true);
            return ResponseEntity.ok(response);
        }
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @Override
    @GetMapping("get/{barcode}")
    public ResponseEntity<Map<Object, Object>> getBookByBarcode(@PathVariable final Long barcode) {
        Map<Object, Object> response = new HashMap<>();

        return null;
    }

    @Override
    @GetMapping("calculate/{barcode}")
    public ResponseEntity<Map<Object, Object>> calculateTotalPriceBooksByBarcode(@PathVariable final Long barcode) {
        Map<Object, Object> response = new HashMap<>();

        return null;
    }
}
