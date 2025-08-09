import java.util.Comparator;

// VisitorComparator implements Comparator interface
// Used to sort visitors by name first, then by age
public class VisitorComparator implements Comparator<Visitor>{
	
	@Override
	public int compare(Visitor v1, Visitor v2) {	
		  
		// First compare visitors by name
		int nameComparison = v1.getName().compareTo(v2.getName());
		
		// If names are same, then compare by age
		if (nameComparison == 0) {
			
			 return Integer.compare(v1.getAge(), v2.getAge());
			 
		}
		
		return nameComparison;
	}

}
