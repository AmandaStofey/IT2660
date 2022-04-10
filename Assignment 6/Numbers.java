/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ditzy
 */
public class Numbers {
    
    int min = 1;
    int max = 100;
    private int[] anArray;
    
    public void print() {
        for (int element: anArray) {
            System.out.println(element);
        }
    }
    
    public int[] list() {
        anArray = new int[100];
        
        for(int i=0; i<anArray.length; i++) {
            anArray[i] = randomInt();
        }
        return anArray;
    }
    public int randomInt() {
    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
    return random_int;
    }
    public int getArrayLength() {
        return this.anArray.length;
    }
    public static void merge(int[] left_array, int [] right_array, int[] array, int left_size, int right_size) {
        int i = 0, left=0, right=0;
        
        while (left<left_size && right<right_size) {
            
            if(left_array[left]<right_array[right]) {
                array[i++] = left_array[left++];
            }
            else{
                array[i++] = right_array[right++];
            }
        }

        while(left<left_size) {
            array[i++] = left_array[left++];
        }
        while(right<right_size) {
            array[i++] = right_array[right++];
        }
    }
    
    public static void doMergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }
        
        int middle = length/2;
        int[] left_array = new int[middle];
        int[] right_array = new int[length-middle];
        int k = 0;
        
        for(int i = 0; i<length;++i) {
            if(i<middle) {
                left_array[i] = array[i];
            }
            else{
                right_array[k] = array[i];
                k = k+1;
            }
        }
        
        doMergeSort(left_array,middle);
        doMergeSort(right_array, length-middle);
        merge(left_array, right_array, array, middle, length-middle);
    }

    public void mergeSort() {
        doMergeSort(this.anArray, this.anArray.length);
    }
    
}