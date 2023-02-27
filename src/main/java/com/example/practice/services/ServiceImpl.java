package com.example.practice.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements Services {

	@Override
	public int apple(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sumnum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y ;
	}

	@Override
	public int differ(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int product(int a, int c) {
		// TODO Auto-generated method stub
		return a*c;
	}

	@Override
	public int quotient(int y, int z) {
		// TODO Auto-generated method stub
		return y/z;
	}

	@Override
	public int stringLength(String str) {
		// TODO Auto-generated method stub
		return str.length();
	}

	@Override
	public String stringReversed(String str) {
		// TODO Auto-generated method stub
		StringBuilder reversed=new StringBuilder(str);
		return reversed.reverse().toString();
	}

	@Override
	public int factorial(int a) {
		int f=1;
		for(int i=1;i<=a;i++) {
			f=f*i;
		}
		return f ;
	}

	@Override
	public boolean primeornot(int x) {
		if(x==2) {
			return true;
		}
		boolean flag=true;
		for(int i=2;i<x;i++) {
			int p=x%i;
			if(p==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}

	@Override
	public boolean palindrome(String str) {
		int length = str.length();
	    for (int i = 0; i < length / 2; i++) {
	        if (str.charAt(i) != str.charAt(length - i - 1)) {
	            return false;
	        }
	    }
		
		return true;
	}

	@Override
	public int listReturn(ArrayList<Integer> LL) {
		int sum=0;
		for(int i=1;i<LL.size();i++ ) {
			sum=sum+LL.get(i);
		}
	
		return sum;
	}

	
	

	

}
