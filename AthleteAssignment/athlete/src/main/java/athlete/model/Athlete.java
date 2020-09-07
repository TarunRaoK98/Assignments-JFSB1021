package athlete.model;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import athlete.dao.AthleteDao;

public class Athlete {
	
	private int id;
	private String name;
	private String gender;
	private String category;
	private String email;
	private String number;
	
	@Autowired
	AthleteDao athleteDao;
	
	public Athlete() {
		super();
		this.id = new Random().nextInt(1000);
	}
	
	public Athlete(int id, String name, String gender, String category, String email, String number) {
		super();
		//this.id = athleteDao.getMaxId() + 1;
		this.id = new Random().nextInt(1000);
		this.name = name;
		this.gender = gender;
		this.category = category;
		this.email = email;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = ""+number;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		//this.id = athleteDao.getMaxId() + 1;
		this.id = new Random().nextInt(1000);
	}

	public int getMaxId() {
		//	Query dB
		return 0;
	}

	@Override
	public String toString() {
		return "Athlete [id=" + id + ", name=" + name + ", gender=" + gender + ", category=" + category + ", email="
				+ email + ", number=" + number + "]";
	}
	
}
