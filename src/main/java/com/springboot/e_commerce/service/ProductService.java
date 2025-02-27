package com.springboot.e_commerce.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.e_commerce.model.Product;
import com.springboot.e_commerce.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;

//	List<Product> products = new ArrayList(Arrays.asList(new Product(101, "Iphone", 50000),
//			new Product(102, "conon Camera", 70000), new Product(103, "Samsung", 100000)));

	public List<Product> getProducts() {
		return productRepo.findAll();
	}

	public Product getProductById(int prodId) {
		return productRepo.findById(prodId).orElse(new Product());
	}

	public void addProduct(Product prod) {
		productRepo.save(prod);
	}

	public void updateProdcut(Product prod) {
		productRepo.save(prod);
	}

	public void deleteProduct(int prodId) {
		productRepo.deleteById(prodId);
	}

}
