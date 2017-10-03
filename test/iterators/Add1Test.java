
package iterators;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class Add1Test {
    
    public Add1Test() {
    }
    
		@Test
		public void emptyTest() {
			Integer[] inputValues = {};
			List<Integer> input = Arrays.asList(inputValues);
                        Add1 op = new Add1(1, input.iterator());
			assertEquals(false, op.hasNext());
			assertEquals(false, op.hasNext());
		}
		
		@Test
		public void oneTest() {
			Integer[] inputValues = {100};
			List<Integer> input = Arrays.asList(inputValues);
                         Add1 op = new Add1(10, input.iterator());
			assertEquals(true, op.hasNext());
			assertEquals(true, op.hasNext());
			assertEquals(110, (int)op.next());
			assertEquals(false, op.hasNext());
			assertEquals(false, op.hasNext());
		}
		
		@Test
		public void moreTest() {
			Integer[] inputValues = {10,50,1,400};
			List<Integer> input = Arrays.asList(inputValues);
			//Apply<Integer,Integer> op = new Apply<>(new TimesTwo(), input.iterator());
                        Add1 op = new Add1(10, input.iterator());

			assertEquals(true, op.hasNext());
			assertEquals(true, op.hasNext());
			assertEquals(20, (int)op.next());
			assertEquals(true, op.hasNext());
			assertEquals(true, op.hasNext());
			assertEquals(true, op.hasNext());
			assertEquals(60, (int)op.next());
			assertEquals(12, (int)op.next());
			assertEquals(410, (int)op.next());
			assertEquals(false, op.hasNext());
		}
		
		


		
    
}
