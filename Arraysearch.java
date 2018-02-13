package com.xuexi;

import java.util.*;

class Search{
     public int getIndex (int[] arr,int x)
     {
    	 int min=0,max=arr.length,mid=(min+max)/2;
    	 while(arr[mid]!=x)
    	 {	
    		 if(x>arr[mid]) {
    			 min=mid+1;
    			 mid=(min+max)/2;
    		 }
    		 else if(x<arr[mid])
    		 {
    			 max=mid-1;
    			 mid=(min+max)/2;
    		 }
    		 if(max<min)
    			 return -1;
    		 
    	 }
    	 return mid;
     }
}
public class Arraysearch{
	public static void main(String[] args) {
		Search sh=new Search();
		int[] arr= {543,231,5234,13,4235,56,67,78};
	    Arrays.sort(arr);
	    int x=sh.getIndex(arr,56);
	    System.out.print(x);
	    Lei.dayin();
	}
	
}
