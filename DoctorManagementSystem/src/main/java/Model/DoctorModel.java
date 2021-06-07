package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import DocterController.Messages;

public class DoctorModel implements Comparable<DoctorModel>{
	private int id;
	private String name;
	private String dateOfBirth;
	private String specialization;
	private int availability;
	private String email;
	private String mobile;

	public DoctorModel() {
	}

	public DoctorModel(int id, String name, String dateOfBirth, String specialization, int availability, String email,
			String mobile) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.specialization = specialization;
		this.availability = availability;
		this.email = email;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "DoctorModel [id=" + getId() + ", name=" + getName() + ", dateOfBirth=" + getDateOfBirth()
				+ ", specialization=" + getSpecialization() + ", availability=" + getAvailability() + ", email="
				+ getEmail() + ", mobile=" + getMobile() + "]";
	}

	public int compareTo(DoctorModel o) {
			return this.dateOfBirth.compareTo(o.dateOfBirth);
	}

}
