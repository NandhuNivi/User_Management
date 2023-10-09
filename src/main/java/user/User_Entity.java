package user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Userdetails")
public class User_Entity {
	@Id
	@GeneratedValue
	private int userID;
	private String userName;
	private String emailId;
	private Long phoneNo;
	private String password;
	private Date dob;
	private int age;
	private Date createdate;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public User_Entity(int userID, String userName, String emailId, Long phoneNo, String password, Date dob
			) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.password = password;
		this.dob = dob;
		
		
	}
	public User_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
