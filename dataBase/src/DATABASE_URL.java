import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class DATABASE_URL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		connection conn = null;
		Statement Statement=null;
		ResultSet result=null;
		String username = "sevenuser";
		String password = "sevenuser";
		try {
			conn = DriveManager.getConnection(DATABASE_URL,username,password);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
