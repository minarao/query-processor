package iterators;


import java.util.Iterator;

public class IntApply implements Iterator {
        // The function that will be applied to each input element to make an output element
		private final IntApplyFunction f;

        // The Iterator that this Apply object will get its input from
		private final Iterator<Integer> input;		

		public IntApply(IntApplyFunction f, Iterator<Integer> input) {
		}

		@Override
		public boolean hasNext() {
		}

		@Override
		public Integer next() {
		}
}
