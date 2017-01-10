
public class ProbQuickSort extends Quicksort {

	@Override
	protected int selectPivot(int lowerIndex, int higherIndex) {
		return array[lowerIndex + (int)(Math.random() * ((higherIndex - lowerIndex) + 1))];
	}


}
