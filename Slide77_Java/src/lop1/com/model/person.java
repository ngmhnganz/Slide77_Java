package lop1.com.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class person {
	private String firstname;
	private String postcode;
	private String bloodGroup;
	private Calendar dob;
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Calendar getDob(Calendar calendar) {
		return dob;
	}
	public void setDateOfBirth(Calendar dob) {
		this.dob = dob;
	}
	private long getAgeAsDays() {
		Calendar hienTai = Calendar.getInstance();
		long i= (hienTai.getTime().getTime()- dob.getTime().getTime())/ (24 * 3600 * 1000);
		return i;
	}
	private String hienThiNgayThang() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date ngaySinh = dob.getTime();
		String s= sdf.format(ngaySinh);
		return s;
	}
	@Override
	public String toString() {
		System.out.println("Firstname: "+ firstname);
		System.out.println("Postcode: "+ postcode);
		System.out.println("Blood group: "+bloodGroup);
		System.out.println("Date of birht: "+ hienThiNgayThang());
		System.out.println("Age as day: "+getAgeAsDays());
		return "";
	}
	
}
