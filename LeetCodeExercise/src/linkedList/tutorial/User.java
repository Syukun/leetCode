package linkedList.tutorial;

import java.util.HashMap;
import java.util.Map;

public class User {

	private int id;
	private String name;
	private int[] friends;
	
	
	public User(int id, String name, int[] friends) {
		super();
		this.id = id;
		this.name = name;
		this.friends = friends;
		
		DataBase.idToName.put(id, name);
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


	public int[] getFriends() {
		return friends;
	}


	public void setFriends(int[] friends) {
		this.friends = friends;
	}
	
	
}

class Main{
	public String[] returnNames(User user) throws Exception {
		int[] friends = user.getFriends();
		int len = friends.length;
		String[] res = new String[len];
		
		for(int i = 0; i < len ; i++) {
			int id_i = friends[i];
			try {
				res[i] = DataBase.idToName.get(id_i);
			}
			catch(Exception e) {
				throw new Exception("id " + i + "does not exist");
			}
			
		}
		return res;
	}
}

class DataBase{
	public static Map<Integer,String> idToName = new HashMap<Integer,String>();
}
