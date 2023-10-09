package user;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User_Controller {
	@Autowired
	User_Repo repo1;

	// Post-reqb-create
	@PostMapping("Createdetails")
	public Object Createdetails(@RequestBody User_Entity user) {
		User_Entity z = new User_Entity(user.getUserID(), user.getUserName(), user.getEmailId(), user.getPhoneNo(),
				user.getPassword(), user.getDob());
			if(z==null)
			{
				return z;
			}
				
		z.setCreatedate(new Date());


		LocalDate currentDate = LocalDate.now();
		// Define the desired date format
		//System.out.println(new Date());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");

		// Format the date as a string
		String formattedDate = dateFormat.format(user.getDob());
		System.out.println(formattedDate + 1);
		
		int currentYear = currentDate.getYear();
		

		int axis = Integer.parseInt(formattedDate);
		System.out.println(axis + 1);
		int Age = currentYear - axis;
		if (!(currentYear >= axis)) {

			return "dob is greater than currentYear";
		}
		z.setAge(Age);
		repo1.save(z);
		return z;
//		System.out.println("Age is:" + Age);
//		z.setAge(Age);
//		repo1.save(z);
//		return z;
	}
//    Post-reqb-Createdate

//	@PostMapping("CreateDate")
//	public Object CreateDate(@RequestBody  User_Entity a) 
//	{
//		User_Entity z = new User_Entity(a.getUserID());
//		z.setCreatedate(new Date());
//		
//		repo1.save(z);
//		return z;
//	}

	// Post-Get(Read)
	@PostMapping("Readuserdetails1")
	public Object Readuserdetails1(@RequestBody User_Entity y) {
		User_Entity z = repo1.getByuserID(y.getUserID());
		User_Entity e = new User_Entity();
		return e;
	}

	// Post-Update
	@PostMapping("Updateuser")
	public Object Updateuser(@RequestBody User_Entity o) {
		User_Entity x = repo1.getByuserID(o.getUserID());
		User_Entity e = new User_Entity();
		System.out.println(e.toString());
		x.setEmailId(o.getEmailId());

		x.setPassword(o.getPassword());
		repo1.save(x);
		return x;

	}

//Post-Delete
	@PostMapping("Deleteuser")
	public Object Deleteuser(@RequestBody User_Entity l) {
		User_Entity n = repo1.getByuserID(l.getUserID());
		repo1.delete(n);
		return "Deleted Successfully";
	}

}
