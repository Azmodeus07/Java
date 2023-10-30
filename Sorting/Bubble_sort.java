package Sorting;

import java.util.Scanner;

public class Bubble_sort{
    /**
     * 
     */
    public static void main()
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter size");
        int n =sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        //input taking
        sc.close();
        for(int i=0;i<n-1;i++) //for selecting a element
        {
            for(int j=0;j<n-i;j++)//for finding the largest element and sending  it to the last
            {
                if(ar[i]<ar[j])
                {
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }//output
        for (int i : ar)
            System.out.println(i);
    }
}