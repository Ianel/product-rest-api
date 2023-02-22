package com.madadev.productrestapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.madadev.productrestapi.model.Product;

@RepositoryRestResource(collectionResourceRel = "product", path = "product")
@CrossOrigin(origins = "*")
public interface ProductRepository extends MongoRepository<Product, String> {}
