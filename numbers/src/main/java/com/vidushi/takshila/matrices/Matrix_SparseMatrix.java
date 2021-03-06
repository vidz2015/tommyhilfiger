package com.vidushi.takshila.matrices;


//This is a sample program to check whether the matrix is sparse matrix or not
//The complexity of the code is O(n^2)
import java.util.Scanner;


public class Matrix_SparseMatrix {


	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the dimensions of the matrix: ");
	        int m = sc.nextInt();
	        int n = sc.nextInt();
	        double[][] mat = new double[m][n];
	        int zeros = 0;
	        System.out.println("Enter the elements of the matrix: ");
	        for(int i=0; i<m; i++)
	        {
	            for(int j=0; j<n; j++)
	            {
	                mat[i][j] = sc.nextDouble();
	                if(mat[i][j] == 0)
	                {
	                    zeros++;
	                }
	            }
	        }
	 
	        if(zeros > (m*n)/2)
	        {
	            System.out.println("The matrix is a sparse matrix");
	        }
	        else
	        {
	            System.out.println("The matrix is not a sparse matrix");
	        }
	 
	        sc.close();
	    }
	}



