package com.tap.DaoImpl;

import java.sql.SQLException;
import java.util.List;

import com.tap.model.Restaurant;
import com.tap.model.User;

public class test {
	//123456
	public static void main(String[] args) throws SQLException
	{
		
		UserDaoImpl us=new UserDaoImpl();
		User user=new User(0,"Neeraj", "n@gmail.com", 6302742254L, null, "neeraj", "Neeraj@1106",null,null,null);
		us.addUser(user);

		
		
		
		

	}

}


