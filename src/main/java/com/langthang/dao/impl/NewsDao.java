package com.langthang.dao.impl;

import com.langthang.dao.INewsDao;
import com.langthang.mapper.NewMapper;
import com.langthang.model.newsModel;

import java.util.List;

public class NewsDao extends AbstractDao<newsModel> implements INewsDao {

    @Override
    public List<newsModel> findByCategoryId(Long categoryId) {
        String sql = "SELECT * FROM news WHERE category_id = ?";
        return query(sql, new NewMapper(), categoryId);
    }

    @Override
    public Long save(newsModel news) {
        String sql = "INSERT INTO news (title, description, shortdescription, thumbneil, category_id) VALUES(?, ?, ?, ?, ?)";
        return insert(sql, news.getTitle(), news.getDescription(), news.getShortDescription(), news.getThumbneil(), news.getCategory_id());
    }

    @Override
    public boolean remove(Long newsId) {
        String sql = "DELETE FROM news WHERE id = ?";
        return update(sql, newsId);
    }
}
