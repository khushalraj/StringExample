package com.example.string;

public class StringMethods {
public static void main(String[] args) {
	String s  = "Khushal";
	String s1 = "Rajput";
	System.out.println(s.length());
	System.out.println(s.charAt(4));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.trim());
	System.out.println(s.strip());
	System.out.println(s.isEmpty());
	System.out.println(s.isBlank());
	System.out.println(s.concat(s1));
	System.out.println(s.repeat(4));
	System.out.println(s.equals(s1));
	System.out.println(s.equalsIgnoreCase(s1));
	System.out.println(s.compareToIgnoreCase(s1));
	System.out.println(s.contentEquals(s1));
	System.out.println(s.indexOf("h"));
	System.out.println(s.lastIndexOf("l"));
	System.err.println(s.contains(s1));
	System.out.println(s.startsWith("h"));
	System.out.println(s.endsWith("l"));
	System.out.println(s.matches("//s"));
	System.out.println(s.substring(2, 4));
	System.out.println(s.subSequence(1, 5));
    System.out.println(s.replace("h		", "m"));
}
}
