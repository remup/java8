package testJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class testJava8Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r= 1;
		Integer g=r;
		System.out.println("integer "+g);
		int arrR[] = new int[5];
		String a="test remya";
		//String a=".;";
		System.out.println(a.trim().toUpperCase()+arrR);
		Student s1 =new Student ("remya","mumbai");
		Student s2 =new Student("reshmi","bangalore");
		testJava8Class t = new testJava8Class();
		float num1=5; 
		//t.overide(1,num1);
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
				
		
		studentList.forEach(d->System.out.println(d.getName()+" "+d.getLocation()));
		
		
		HashMap<String, String> studentMap =(HashMap<String, String>)  studentList.stream().collect(
                Collectors.toMap(x -> x.getName(), x -> x.getLocation()));
		System.out.println(studentMap);
		
		

		
		int arr[] = {0,2,4,5,1};
		int n = arr.length;
		findDoubleSum(arr,n,3);
		find_all_triplets(arr, n, 3);
		
		bubbleSort(arr,n);
	    for(int i=0;i<n;i++) {
	    	System.out.println("bubble "+arr[i]);
	    }
	    
	    //String lamda = ()->system.out.println("test");
	    
	}
	
	private static void bubbleSort(int[] arr, int n) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=0; i < n-1; i++){  
            for(int j=i+1; j < n; j++){  
                     if(arr[i] > arr[j]){  
                            //swap elements  
                             temp = arr[i];  
                            arr[i] = arr[j];  
                            arr[j] = temp;  
                    }  
                     
            } } 
		
	}

	static void findDoubleSum(int arr[], int n, int sum) {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				//for(int k=j+1;k<n-2;k++) {
					
				
				if(arr[i]+arr[j]==sum)
				{
					System.out.println("sum result "+arr[i]+" "+arr[j]);
				}
			//}
			}
		}
		
		
		int[] arrayClock = {2,5,3,9};
		TreeSet<Integer> t1 = new TreeSet<>();
		TreeSet<Integer> t2 = new TreeSet<>();
		for(int i=0;i<arrayClock.length-1;i++)
		{
			for(int j=i+1;j<arrayClock.length;j++)
			{
				int hours =Integer.parseInt(Integer.toString(arrayClock[i])+Integer.toString(arrayClock[j]));
				if(hours<=24)
				{
					t1.add(hours);
				}
				
				int min =Integer.parseInt(Integer.toString(arrayClock[i])+Integer.toString(arrayClock[j]));
				if(min<=59)
				{
					t2.add(min);
				}
			}
			
//			t1.forEach(d->System.out.println("hours "+d));
//			t2.forEach(d->System.out.println("min "+d));
			
			
		}
		System.out.println("final time format hours"+t1.toArray()[t1.toArray().length-1]);
		System.out.println("final time format min"+t2.toArray()[t2.toArray().length-1]);
	}
	
	static void find_all_triplets(int arr[], int n, int sum)
	{
	for (int i = 0; i < n-2; i++)
	{
	for (int j = i + 1; j < n-1; j++)
	{
	for (int k = j + 1; k < n; k++)
	{
	if (arr[i] + arr[j] + arr[k] == sum)
	{
	System.out.println("triplesum "+arr[i]+ " " + arr[j] + " "+ arr[k]);
	}
	}
	}
	}
	
	int array[]= {0,1,1,0,0,1};
			
int temp3 = 0;

			for(int i=0;i<array.length-1;i++)
			{
			for(int j=i+1;j<array.length;j++)
			{
			if(array[i]>array[j]) {
		temp3=array[i];
			array[i]=array[j];
			array[j]=temp3;

			}
			}
			}
			
			for(int i=0;i<array.length;i++)
			{
				System.out.println("testone"+array[i]);
			}
			List<Integer> l = new ArrayList<>();
			l= Arrays.stream(array).boxed().collect(Collectors.toList());
			l.forEach(a->System.out.println("test"+a));
	}
	public  void overide(int a,int b) {
		System.out.println("overload int  "+a);
		
	}
//	public  void overide(float a,int b) {
//		System.out.println("overload float  "+a);
//	}
	

}
