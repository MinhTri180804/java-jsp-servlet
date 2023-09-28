package com.langthang.dao;

import java.util.List;

import com.langthang.model.newsModel;

public interface INewsDao extends IGenericDao<newsModel> {
	List<newsModel> findByCategoryId(Long categoryId);
	Long save(newsModel news);
	boolean remove(Long newsId);
}
