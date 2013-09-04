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
	    	  // Establish a connection with the Database
	    	  con = DriverManager.getConnection(getConnectionString());
	          st = con.createStatement();

	          String sql = Query;
	          
	          //Run the Query
	          rs = st.executeQuery(sql);
	          
	          //Get the Results
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
	    	  //Establish a connection with the Database
	    	  con = DriverManager.getConnection(getConnectionString());
	          st = con.createStatement();

	          String sql = Query;
	          
	          //Run the Query
	          rs = st.executeUpdate(sql);
	          
	          if(rs == 1)
	        	  System.out.println("The INSERT was successful");
	         st.close();
	         con.close();

	     } catch (Exception e) {
	         System.out.println(e);
	     }
		
	}

	public String executeSQLStoredProcedure(String spName, int p1, int p2, int resultColumnIndex) {
		Connection con = null;
	    CallableStatement st = null;
	    ResultSet rs = null;
	   
	    String result = "";
	    
	      try {
	    	  //Establish a connection with the Database
	    	  con = DriverManager.getConnection(getConnectionString());
	    	  //Prepare the stored procedure cal
	          st = con.prepareCall(spName);
              //Set the parameters for the stored procedure
	          st.setInt(1, p1);
	          st.setInt(2, p2);
	          
	          boolean hadResults = st.execute();
	          
	          // Keep on retrieving results while we still have them...
	          while (hadResults) {
	              rs = st.getResultSet();
	              
	              //Retrieve the result at the specified index.
	              while(rs.next())
	              {
	            	  result = rs.getString(resultColumnIndex);
	              }

	              //Retrieve next set of results.
	              hadResults = st.getMoreResults();
	          }
	          
	      } catch (Exception e) {
		         System.out.println(e);
		  }
	      
	      return result;
	}

}
