package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pages.SQLUser;

public class UserPage {

	public static void main(String[] args) throws ClassNotFoundException {
		String login;
		String password;
		String url = "jdbc:mysql://localhost:3306/sys?useSSL=false&allowPublicKeyRetrieval=true"
				+ "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String userSQL = "root";
		String passwordUser = "Root";

		String query = "SELECT * from User";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection con = DriverManager.getConnection(url, userSQL, passwordUser);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query)) {
			while (rs.next()) {
				SQLUser user = new SQLUser();
				login = user.setLogin(rs.getString("Login"));
				password = user.setPassword(rs.getString("Pssword"));

				// Display values
				System.out.println("Login: " + login);
				System.out.println("Password: " + password);

			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
