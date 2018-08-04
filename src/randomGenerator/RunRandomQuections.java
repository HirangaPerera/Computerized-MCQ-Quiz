package randomGenerator;

import java.sql.SQLException;

public class RunRandomQuections {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	ShuffleQuections sq = new ShuffleQuections();
	sq.shuffle();
	}

}
