package com.langthang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.langthang.model.newsModel;

public class NewMapper implements IRowMapper<newsModel> {

	@Override
	public newsModel mapRow(ResultSet resultSet) {
		try {
			newsModel news = new newsModel();
			news.setId(resultSet.getLong("id"));
			news.setTitle(resultSet.getString("title"));
			news.setShortDescription(resultSet.getString("shortdescription"));
			news.setDescription(resultSet.getString("description"));
			news.setThumbneil(resultSet.getString("thumbneil"));
			news.setCategory_id(resultSet.getLong("category_id"));
			news.setView(resultSet.getInt("views"));
			return news;
		} catch (SQLException e) {
			return null;
		}
	}
}
