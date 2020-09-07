package athlete.daoHelper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class IdResultSetExtractor implements ResultSetExtractor<Integer>{
	
	public Integer extractData(ResultSet rs) throws SQLException, DataAccessException {
		int id;
		if (rs.next()) {
			id = rs.getInt(1);
		}
		else {
			id = 0;
		}		
		return id;
	}
}
