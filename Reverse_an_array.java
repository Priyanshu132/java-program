package reverse_an_array;


//  Link:- https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse_an_array {

    public static void main(String[] args) throws IOException {
       
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of Array");
        int size = Integer.parseInt(bf.readLine());
        System.out.println("Enter the Element of Array");
        int[] arr =new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        int start = 0, end = size - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("The Array is:");
        for(int i = 0; i < size; i++){
            
            System.out.print(arr[i]+" ");
        }
        
        
        
    }
    
}
