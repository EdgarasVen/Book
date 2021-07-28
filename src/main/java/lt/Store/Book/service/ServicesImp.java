package lt.Store.Book.service;

import lt.Store.Book.dto.BookDto;
import lt.Store.Book.model.Book;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ServicesImp implements Services{


    @Override
    public BookDto getBookByBarcode(Long barcode) {
        return null;
    }

    @Override
    public boolean addBook(BookDto bookDto) {
        return false;
    }

    @Override
    public boolean editBookByBarcode(Long barcode) {
        return false;
    }

    @Override
    public BigDecimal calculatePrice(Long barcode) {
        return null;
    }
}
