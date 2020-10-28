package com.tutiempolibro.retrievecatalog.service;

import java.util.List;

import com.tutiempolibro.retrievecatalog.entity.BookType;

public interface IRetrieveCatalogBookService {
	
	public List<BookType> retrieveBookCatalog(Integer idCatalog);
	
}
