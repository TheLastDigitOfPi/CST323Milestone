package com.gcu.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gcu.model.ProductModel;

/**
 * Creates the ProductsRowMapper
 * @author connorrolstad
 *
 */
public class ProductsRowMapper implements RowMapper<ProductModel> {

	@Override
	public ProductModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductModel product = new ProductModel();
//		maps the returned data from query to a new product model
		product.setName(rs.getString("name"));
		product.setType(rs.getString("type"));
		product.setPrice(rs.getString("price"));
		product.setDescription(rs.getString("description"));
		product.setImage(rs.getString("image"));
		product.setProductId(rs.getInt("products_id"));
		
		return product;
	}
}
