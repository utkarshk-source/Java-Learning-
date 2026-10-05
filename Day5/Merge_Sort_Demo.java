package Day5;

public class Merge_Sort_Demo {
	
	int [] array ;
	int [] tempMergeArr;
	int length;
	
	public static void main(String[] args) {

		int[] inputArr = {48, 36, 13, 52, 19, 94, 21};
		Merge_Sort_Demo ms = new Merge_Sort_Demo();
		ms.sort(inputArr);
		
		for(int i : inputArr) {
			System.out.print(i+" ");
		}
	}
	
	public void sort(int inputArr[]) {
		this.array = inputArr;       // {48, 36, 13, 52, 19, 94, 21};
		this.length = inputArr.length;   // length = 7
		this.tempMergeArr = new int[inputArr.length];   // {0,0,0,0,0,0,0 }
		
		divideArray(0 , length-1);     // calling method for divide
	}
	
	public void divideArray(int lowerIndex , int higherIndex) {   // (0 , 6)
		
		if(lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex ) / 2 ;
			
			//sort left side of an array
			divideArray(lowerIndex, middle);
			
			//sort the right side array
			divideArray(middle +1 , higherIndex );
			
			mergeArray(lowerIndex, middle, higherIndex);
		}
	}
	
	public void mergeArray(int lowerIndex, int middle, int higherIndex) {
		
		for(int i = lowerIndex; i<= higherIndex; i++) {   //copy array into tempMergeArr
			tempMergeArr[i] = array[i];
		}
		
		int i = lowerIndex;  // 0
		int j = middle +1;   // 4
		int k = lowerIndex;  // 0
		
		while(i <= middle && j <= higherIndex) {
			
			if(tempMergeArr[i] <= tempMergeArr[j]) {
				array[k] = tempMergeArr[i];
				
				i++;
				
			}
			else {
				array[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}
		
		while(i <= middle){
			array[k] = tempMergeArr[i];
			k++;
			i++;
		}
	}

}
