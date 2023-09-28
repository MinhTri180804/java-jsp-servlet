package com.langthang.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.langthang.dao.INewsDao;
import com.langthang.model.newsModel;
import com.langthang.service.INewsService;

public class NewsService implements INewsService {
	@Inject
	private INewsDao newsDao;
	@Override
	public List<newsModel> findByCategoryId(Long categoryId) {
		return newsDao.findByCategoryId(categoryId);
	}

	@Override
	public newsModel save(newsModel news) {
		Long id = newsDao.save(news);
		System.out.println(id);
		return null;
	}

	@Override
	public boolean delete(Long newsID) {
		if(newsDao.remove(newsID)) {
			System.out.println("Delete Success");
			return true;
		}
		System.out.println("Delete fails");
		return false;
	}

}
