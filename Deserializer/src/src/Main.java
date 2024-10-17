package src;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		User user;
		
		FileInputStream fileIn = new FileInputStream("UserInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		
		user = (User) in.readObject();
		
		in.close();
		fileIn.close();
		
		System.out.println(user.name);

	}

}