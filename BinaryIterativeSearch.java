public class BinaryIterativeSearch implements Practice2Search{

	public int search(int [] arr, int target){
	
		int low = 0;
		int upper = arr.length;
		int mid = (low+upper)/2;
	
		while(low < upper){
			if(arr[mid] == target){
				return mid;
			}
			else if (arr[mid] < target){
				low = mid+1;
				mid = (upper+low)/2;
			}
			else{
				upper = mid-1;
				mid =(upper+low)/2;
			}
		}
		return mid;
	}
	
	public String searchName(){
		return "Binary Iterative Search";
	}
	
}



