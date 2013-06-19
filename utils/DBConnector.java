package utils;
import java.sql.*;
	/**
	 * @author kritarth saurabh
	 *
	 */
public class DBConnector {
	
	private String dbName;
	private String user;
	private String password;
	private String url;
	
	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public DBConnector(String dbName, String user, String password){
		
		setUser(user);
		setDbName(dbName);
		setPassword(password);
		setUrl("jdbc:mysql://127.0.0.1:8889/");
	}

	public String getConnectionString(){
		String url = getUrl();
	    String db = getDbName();
	    String user = getUser();
	    String pass = getPassword();
	      
	    String connectionString = url + db + "?user=" + user + "&password=" + pass; 
	    
	    return connectionString;
	}
	
	public void RunSQLSelectQuery(String Query)
	{
		Connection con = null;
	    Statement st = null;
	    ResultSet rs = null;
	   
	      try {
	    	  con = DriverManager.getConnection(getConnectionString());
	          st = con.createStatement();

	          String sql = Query;
	          rs = st.executeQuery(sql);
	          
	          while (rs.next()) {
	              System.out.print(rs.getInt(1));
	              System.out.println("\t"+rs.getString(2) + "\t"+rs.getString(3));
	          }
	          rs.close();
	          st.close();
	          con.close();

	      } catch (Exception e) {
	          System.out.println(e);
	      }
		
	}
	
	public void RunSQLInsert(String Query)
	{
		 Connection con = null;
	     Statement st = null;
	     Integer rs = 0; 
	      
	      try {
	    	  con = DriverManager.getConnection(getConnectionString());
	          st = con.createStatement();

	          String sql = Query;
	          rs = st.executeUpdate(sql);
	          
	          if(rs == 1)
	        	  System.out.println("The INSERT was successful");
	         st.close();
	         con.close();

	     } catch (Exception e) {
	         System.out.println(e);
	     }
		
	}

}
