package com.langthang.service;

import java.util.List;

import com.langthang.model.newsModel;

public interface INewsService {
	List<newsModel> findByCategoryId(Long categoryId);
	newsModel save(newsModel news);
	boolean delete(Long newsID);
}
