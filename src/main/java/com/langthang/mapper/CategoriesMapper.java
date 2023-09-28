package com.langthang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.langthang.model.categoriesModel;

public class CategoriesMapper implements IRowMapper<categoriesModel> {

	@Override
	public categoriesModel mapRow(ResultSet resultSet) {
		try {
			categoriesModel category = new categoriesModel();
			category.setId(resultSet.getLong("id"));
			category.setCode(resultSet.getString("code"));
			category.setName(resultSet.getString("name"));
			return category;
		}catch(SQLException e) {
			return null;
		}
	}

}
