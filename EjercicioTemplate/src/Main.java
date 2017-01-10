
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		Quicksort sorter = new ProbQuickSort();
	    int[] input = {24,2,45,20,56,75,2,56,99,53,12};
	    sorter.sort(input);
	    for(int i:input){
	        System.out.print(i);
	        System.out.print(" ");
	    }
	}
}