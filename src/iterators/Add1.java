package iterators;


import java.util.Iterator;

public class Add1 implements Iterator{
      
        // The Iterator that this apply  object will get its input from
		private final Iterator<Integer> input;	
                private final int additive;

		public Add1(int additive, Iterator<Integer> input) {
				this.input = input;
                                this.additive = additive;
		}

		@Override
		public boolean hasNext() {
                    
		}

		@Override
		public Integer next() {
		}
}
