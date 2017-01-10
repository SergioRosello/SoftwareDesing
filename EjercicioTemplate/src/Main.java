
public class Main {

	public static void main(String[] args) {
	    
		Quicksort sorter = new ProbQuickSort();
	    int[] input = {24,2,45,20,56,75,2,56,99,53,12};
	    sorter.sort(input);
	    for(int i:input){
	        System.out.print(i);
	        System.out.print(" ");
	    }
	    System.out.println();
	    
	    Quicksort nextSorter = new ClassicalQuickSort();
	    int[] nextInput = {24,2,45,20,56,75,2,56,99,53,12};
	    nextSorter.sort(nextInput);
	    for(int i:nextInput){
	        System.out.print(i);
	        System.out.print(" ");
	    }
	}
}