package com.langthang.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.langthang.dao.ICategoriesDao;
import com.langthang.mapper.CategoriesMapper;
import com.langthang.model.categoriesModel;
import com.langthang.service.ICategoriesService;
import javassist.NotFoundException;

public class CategoriesDao extends AbstractDao<categoriesModel> implements ICategoriesDao {

    @Override
    public List<categoriesModel> findAll() {
        String sql = "SELECT * FROM categories";
        return query(sql, new CategoriesMapper());
    }

    @Override
    public Long save(categoriesModel category) {
        String sql = "INSERT INTO categories (name, code) VALUES (?, ?)";
        return insert(sql, category.getName(), category.getCode());
    }
}
