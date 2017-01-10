
public class ClassicalQuickSort extends Quicksort {

	@Override
	protected int selectPivot(int lowerIndex, int higherIndex) {
		// TODO Auto-generated method stub
		return array[lowerIndex+(higherIndex-lowerIndex)/2];
	}

}
