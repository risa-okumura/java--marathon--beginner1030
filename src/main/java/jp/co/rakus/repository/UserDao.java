package jp.co.rakus.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jp.co.rakus.domain.User;

/**
 * テーブルinfoを操作するリポジトリ.
 * 
 * @author risa.okumura
 *
 */
@Repository

public class UserDao {
	
	private static final RowMapper<User> USER_ROW_MAPPER = (rs,i) ->{
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setAge(rs.getString("age"));
		user.setAddress(rs.getString("address"));
		return user;
	};
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	/**
	 * 主キー検索を行う.
	 * 
	 * @param id id
	 * @return 検索結果（ユーザー情報）
	 */
	public User load(Integer id) {
		
		String sql = "SELECT id,name,age,address FROM info WHERE id=:id ;";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		
		User user = template.queryForObject(sql, param, USER_ROW_MAPPER);
		
		return user;
	}
	

}
