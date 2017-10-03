package iterators;


import java.util.Iterator;

// Iterator that may produce 0 or more output elements for every input element
public class FlatApply<InT,OutT> implements Iterator<OutT> {
		public FlatApply(FlatApplyFunction<InT,OutT> f, Iterator<InT> input) {
		}

		@Override
		public boolean hasNext() {
		}

		@Override
		public OutT next() {
		}

        // feel free to create private methods if helpful
}
