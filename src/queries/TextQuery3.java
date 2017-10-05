package queries;


import iterators.Apply;
import iterators.ApplyFunction;
import iterators.Filter;
import iterators.Predicate;
import java.util.Iterator;
import readers.TextFileReader;

// return all filenames that contain the word "Mars" 
public class TextQuery3 {
	public static void main(String[] args) {
		Iterator<Pair<String,String>> filenameAndContents = new TextFileReader("../sci.space");
		
		/* finish the query using a combination of Applys and Filters */
		
		while (/*lastIterator*/.hasNext()) {
			System.out.println(/*lastIterator*/.next());
		}
	}	


	// put your classes that implement ApplyFunction and Predicate here

}
