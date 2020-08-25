package day36collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;

public class Dq01 {

	public static void main(String[] args) {
		/*
		1) Deque: Double Ended Queue
		 */
		Deque<String> d =  new LinkedList<>();
		
		d.add("Ali");
		d.addFirst("Veli");
		d.addLast("Can");
		d.add("Ay�e");
		d.addFirst("Emine");
		d.addLast("Reyhan");
		
		System.out.println(d.element());//ilk eleman� silmeden size g�steririlk eleman olmad�g�nda Exception atar
		System.out.println(d.peek());//element() fark� ilk eleman olmad�g�nda Exception atamaz
		System.out.println(d.peekLast());
		System.out.println(d.poll());//ilk eleman� kesip bize getirir
		System.out.println(d.pollLast());//Reyhan siler
		
		
		
		
		
		
		
		
		System.out.println(d);//[Emine, Veli, Ali, Can, Ay�e, Reyhan]
	}

}
