package com.gupao.gp16306.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * ORM映射定制化的接口
 * @param <T>
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
