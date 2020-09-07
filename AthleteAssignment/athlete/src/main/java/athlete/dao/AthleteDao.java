package athlete.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import athlete.daoHelper.AthleteResultSetExtractor;
import athlete.daoHelper.IdResultSetExtractor;

import athlete.model.Athlete;

public class AthleteDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int addAthlete(Athlete athlete) {
		String query = "INSERT INTO ATHLETE VALUES(?, ?, ?, ?, ?, ?)";
		int status = jdbcTemplate.update(query, athlete.getId(), athlete.getName(), athlete.getGender(), athlete.getCategory(), athlete.getEmail(), Long.parseLong(athlete.getNumber()));
		return status;
	}
	
	public int getMaxId() {
		String sql="SELECT max(athlete_id) FROM athlete";
		System.out.println(jdbcTemplate.query(sql, new IdResultSetExtractor()));
		int id = jdbcTemplate.query(sql, new IdResultSetExtractor());
		return id;
	}
	
	public List<Athlete> getAllAthletes(){
		System.out.println("Pinko");
		
		List<Athlete> userList = jdbcTemplate.query("SELECT * FROM athlete", new AthleteResultSetExtractor());
		return userList;
	}
}
