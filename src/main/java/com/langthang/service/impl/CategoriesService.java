package com.langthang.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.langthang.dao.ICategoriesDao;
import com.langthang.model.categoriesModel;
import com.langthang.service.ICategoriesService;

public class CategoriesService implements ICategoriesService {

	@Inject
	private ICategoriesDao categoriesDao;

	@Override
	public List<categoriesModel> findAll() {
		return categoriesDao.findAll();
	}

	@Override
	public categoriesModel save(categoriesModel category) {
		Long id = categoriesDao.save(category);
		return null;
	}
}
