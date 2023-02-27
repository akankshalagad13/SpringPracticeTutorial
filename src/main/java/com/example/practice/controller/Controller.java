package com.example.practice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.services.Services;

@RestController
public class Controller{
	@Autowired
	Services services;
	
	@GetMapping("/apple")
	public int apple(int a,int b) {
		return services.apple(a,b);
	}
	@GetMapping("/sumnum")
	public int sumnum(int x,int y) {
		return services.sumnum(x, y);
	}
	
	@GetMapping("/differ")
	public int differ(int a,int b) {
		return services.differ(a,b);
	}
	@GetMapping("/product")
	public int product(int a,int c) {
		return services.product(a, c);
	}
	@GetMapping("/quotient")
	public int quotient(int y,int z) {
		return services.quotient(y, z);
	}
	
	@GetMapping("/Stringlength")
	public int stringLength(String str) {
		return services.stringLength(str);
	}
	
	@GetMapping("/stringreversed")
	public String stringReverse(String str) {
		return services.stringReversed(str);
	}
	@GetMapping("/factorial")
	public int factorial(int a) {
		return services.factorial(a);
	}
	@GetMapping("/primeornot")
	public boolean primeornot(int x) {
		return services.primeornot(x);
	}
	@GetMapping("/palindrome")
	public boolean palindrome(String str) {
		return services.palindrome(str);
		
	}
	@GetMapping("/Listreturn")
	public int listReturn(ArrayList<Integer> LL)
	{
		return services.listReturn(LL);
	}
}


