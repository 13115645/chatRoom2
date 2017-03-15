package chatRoom2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlConnection
{
	static String url = "jdbc:mysql://localhost:3306/";
	static String user = "root";
	static String password = "";

	
	public static void CreateDatabase()
	{

		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stt = con.createStatement();

			// Create and select db
			stt.execute("CREATE DATABASE IF NOT EXISTS clients");
			stt.execute("USE clients");

			// Create Table
			stt.execute("CREATE TABLE IF NOT EXISTS people (" + "id BIGINT NOT NULL AUTO_INCREMENT," + "name VARCHAR(25),"
					+ "PRIMARY KEY(id)"

					+ ") ");

			// ADD SOME ENTERIES

		

			// same ass the
		} catch (Exception e)
		{

		}

	}

	public static void AddPeople(String name)
	{

		try
		{

			Connection con = DriverManager.getConnection(url, user, password);
			Statement stt = con.createStatement();
			stt.execute("USE clients");
			stt.execute("INSERT INTO people (name) VALUES" + "('"+name+"')");

		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void DisplayTable()
	{
		try
		{

			Connection con = DriverManager.getConnection(url, user, password);
			Statement stt = con.createStatement();

			stt.execute("USE clients");
			
			//ResultSet res = stt.executeQuery("SELECT * FROM people WHERE lname = 'Bloggs'");
			ResultSet res = stt.executeQuery("SELECT * FROM people");
			while (res.next())
			{
				System.out.println(res.getString("name"));
			}
			System.out.println("");

		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args)
	{
		CreateDatabase();
		AddPeople("yasiru");
		DisplayTable();

	}
}
