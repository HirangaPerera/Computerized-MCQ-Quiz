package randomGenerator;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchData {
public FetchData() throws ClassNotFoundException, SQLException {
	ConnectionClass cc = new ConnectionClass(); //ConnectionClass eke object eka.Constructer ekak athule hadanna ethakota class eka load weddima connection eka create wenawa
	cc.createConnection();
}
String a,b,c,d;
public void fetchingQuections() throws SQLException {
	String[]mcqArray = new String[5];
	String k;
	int i = 0;
	String query = "select question_one from questions";
	ResultSet rs = ConnectionClass.stmt.executeQuery(query);
	while(rs.next()) 
	{
			
			k = rs.getString("question_one");
			mcqArray[i]=k;
			i++;
	}
	a = mcqArray[0];
	b = mcqArray[1];
	c = mcqArray[2];
	d = mcqArray[3];

System.out.println(a); //For testing
System.out.println(b);
System.out.println(c);
System.out.println(d);
}

}
