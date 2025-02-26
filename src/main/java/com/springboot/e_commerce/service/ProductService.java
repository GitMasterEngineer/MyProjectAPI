package com.springboot.e_commerce.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.e_commerce.model.Product;

@Service
public class ProductService {

	List<Product> products = new ArrayList(Arrays.asList(new Product(101, "Iphone", 50000),
			new Product(102, "conon Camera", 70000), new Product(103, "Samsung", 100000)));

	public List<Product> getProducts() {
		return products;
	}

	public Product getProductById(int prodId) {
		return products.stream().filter(p -> p.getProdId() == prodId).findFirst().get();
	}

	public void addProduct(Product prod) {
		products.add(prod);
	}

	public void updateProdcut(Product prod) {
		int index = 0;
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getProdId() == prod.getProdId())
				index = 1;

			products.set(index, prod);

		}
	}

	public void deleteProduct(int prodId) {
		int index = 0;

		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getProdId() == prodId)
				index = i;
			products.remove(index);
		}
	}

}
