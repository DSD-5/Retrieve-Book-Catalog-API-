package com.tutiempolibro.retrievecatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutiempolibro.retrievecatalog.model.BookModel;

@Repository
public interface ICatalogRepository extends JpaRepository<BookModel, Integer> {

}
