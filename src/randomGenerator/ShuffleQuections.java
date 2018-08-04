package randomGenerator;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleQuections {
	FetchData fd;
	public ShuffleQuections() throws ClassNotFoundException, SQLException {
		 fd = new FetchData();						
		 fd.fetchingQuections();
	}
int p;
	public void shuffle() {
		String a,b,c,d;
		a= fd.a;									
		b=fd.b;
		c=fd.c;
		d=fd.d;
		
		 List<String> mcqlist = new ArrayList<>();	
		 	mcqlist.add(a);  
		    mcqlist.add(b);
		    mcqlist.add(c);
		    mcqlist.add(d);
		    	
		Collections.shuffle(mcqlist);
		Collections.shuffle(mcqlist); 				
		
		Object[] objects = mcqlist.toArray();		
		for (int i = 0; i < objects.length; i++) 	
			{
				System.out.println(objects[i]);		
		    }    
	}
}
