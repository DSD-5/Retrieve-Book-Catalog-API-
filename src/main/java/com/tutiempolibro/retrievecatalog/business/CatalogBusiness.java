package com.tutiempolibro.retrievecatalog.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutiempolibro.retrievecatalog.entity.BookType;
import com.tutiempolibro.retrievecatalog.model.BookModel;
import com.tutiempolibro.retrievecatalog.repository.ICatalogRepository;

@Service
public class CatalogBusiness {

	@Autowired
	private ICatalogRepository catalogRepo;

	public List<BookType> retrieveBookCatalog(Integer idCategory) {
		
		List<BookModel> listBook = new ArrayList<BookModel>();
		List<BookType> listBookType = new ArrayList<BookType>();
		
		if (idCategory != null && idCategory > 0) {
			listBook = catalogRepo.findByIdcategoria(idCategory);
		} else {
			listBook = catalogRepo.findAll();
		}
		
		listBook.stream().forEach(book -> {
			BookType b = new BookType();
			b.setId(book.getIdlibro().toString());
			b.setDescription(book.getDescripcion());
			b.setTitle(book.getNombre());
			b.setPricesale(book.getCostoventa().toString());
			b.setPricerental(book.getCostoalquiler().toString());
			b.setStocksale(book.getStockventa().toString());
			b.setStockrental(book.getStockalquiler().toString());
			listBookType.add(b);
		});
		
		System.out.println("Tamano lista : " + listBookType);

		return listBookType;

	}

}
