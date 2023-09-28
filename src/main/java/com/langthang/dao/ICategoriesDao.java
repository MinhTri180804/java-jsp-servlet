package com.langthang.dao;

import java.util.List;

import com.langthang.model.categoriesModel;

public interface ICategoriesDao extends IGenericDao<categoriesModel> {
	List<categoriesModel> findAll();
	Long save(categoriesModel category);
}
