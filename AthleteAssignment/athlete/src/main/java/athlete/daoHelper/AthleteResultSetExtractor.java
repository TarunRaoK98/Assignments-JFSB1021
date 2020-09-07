package athlete.daoHelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import athlete.model.Athlete;

public class AthleteResultSetExtractor implements ResultSetExtractor<List<Athlete>>{
	public List<Athlete> extractData(ResultSet rs) throws SQLException, DataAccessException {
		System.out.println("Pong");
		//del Athlete right
		List<Athlete> athList = new ArrayList<>();
		while(rs.next()) {
			Athlete ath = new Athlete();
			ath.setId(rs.getInt(1));
			ath.setName(rs.getString(2));
			ath.setGender(rs.getString(3));
			ath.setCategory(rs.getString(4));
			ath.setEmail(rs.getString(5));
			ath.setNumber(rs.getInt(6));
			athList.add(ath);
			System.out.println(ath);
		}
		return athList;
	}
	
}
