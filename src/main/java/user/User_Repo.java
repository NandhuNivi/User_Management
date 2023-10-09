package user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Repo extends JpaRepository<User_Entity, Integer>{

	User_Entity getByuserID(int userID);
	

}
