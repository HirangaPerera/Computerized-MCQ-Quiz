package randomGenerator;

import java.sql.SQLException;

public class RunRandomQuections {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	FetchData fd = new FetchData();
	fd.fetchingQuections();
	}

}
