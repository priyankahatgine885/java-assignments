package jdbccrudoperation.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
	private static Properties prop;
	static {
		prop = new Properties();
		try {
			prop.load(new FileReader(new File("Config.properties")));
			Class.forName(prop.getProperty("DRIVER"));
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(prop.getProperty("URL"), prop.getProperty("USER"), prop.getProperty("PASSWORD"));
	}
}
