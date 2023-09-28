package com.langthang.dao;

import com.langthang.mapper.IRowMapper;

import java.util.List;

public interface IGenericDao<T> {
    <T> List<T> query(String sql, IRowMapper<T> rowMapper, Object... parameters);
    boolean update(String sql, Object... parameters);
    Long insert(String sql, Object... parameters);
}
