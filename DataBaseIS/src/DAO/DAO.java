package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import MODEL.Exercies;

public class DAO {
	private static String URL ="db4free.net:3306/isresources";
	private static String user ="isteam";
	private static String password ="12345678910";
	
	private Connection connect = null;
	private ResultSet resultSet = null;
	
	private ArrayList resList = new ArrayList();
	
	
	
	public ArrayList getExercies() throws Exception {
	try {
	connect = DriverManager.getConnection("jdbc:mysql://" + URL,
	user, password);
	Statement statement = connect.createStatement();
	String sql = "select * from IS";
	resultSet = statement.executeQuery(sql);
	while (resultSet.next()) {
		String first_name = resultSet.getString("first_name");
		String last_name = resultSet.getString("last_name");
		
		resList.add(new Exercies(first_name , last_name));
	}
	return resList; }
	
	catch (Exception e) {
	throw e; } finally { close();
	}}
	
	private void close() {
		try {
		if (resultSet != null) {
		resultSet.close();
		}
		if (connect != null) {
		connect.close();
		}}
		catch (Exception e) {
		
		
		e.printStackTrace();
		}
}}
