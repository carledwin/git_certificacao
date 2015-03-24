package a.b.c;

import java.util.*;
//import java.io.*; // compila, pois o import está no lugar correto

class D{
	public static void main(String[] args){
		ArrayList<String> lista = new ArrayList<String>();
		
		for(String arg : args){
			if(new E().existe(arg))
				lista.add(arg);
		}
	}
}

import java.io.*; //não compila, pois o import está no lugar incorreto
/*
 17: error: class, interface, or enum expected
import java.io.*;
*/

class E{
	public boolean existe(String nome){
		File f = new File(nome);
		return f.exists();
	}
}