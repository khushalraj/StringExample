package com.example.string;

public class StringLiteral {
public static void main(String[] args) {
	String s1 = "Mohan";
	String s2 = "Sohan";
	String s3 = "Mohan";
	String s4 = new String("Mohan");
	String s5 = new String("Mohan");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
	System.out.println(s5.hashCode());
	System.out.println(s1 == s4);
	System.out.println(s1.equals(s4));
}
}
