package com.tutiempolibro.retrievecatalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutiempolibro.retrievecatalog.business.CatalogBusiness;
import com.tutiempolibro.retrievecatalog.entity.BookType;

@Service
public class RetrieveCatalogBookService implements IRetrieveCatalogBookService {
	
	@Autowired
	private CatalogBusiness catalogBusiness;
	
	@Override
	public List<BookType> retrieveBookCatalog(Integer idCatalog) {
		// TODO Auto-generated method stub
		return catalogBusiness.retrieveBookCatalog(idCatalog);
	}

	
}
