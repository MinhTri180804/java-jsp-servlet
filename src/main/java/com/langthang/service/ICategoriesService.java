package com.langthang.service;

import java.util.List;

import com.langthang.model.categoriesModel;

public interface ICategoriesService {
	List<categoriesModel> findAll();
	categoriesModel save(categoriesModel category);
}
