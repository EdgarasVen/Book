package lt.Store.Book.service;

import lt.Store.Book.dto.DtoBook;

import java.math.BigDecimal;

public class ServicesImp implements Services{


    @Override
    public DtoBook getBookByBarcode(Long barcode) {
        return null;
    }

    @Override
    public boolean addBook(DtoBook dtoBook) {
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
