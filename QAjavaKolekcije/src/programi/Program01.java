package programi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Program01 {

	public static void main(String[] args) {
		System.out.println("Kolekcije");
		
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		System.out.println(l1);
		l1.add(2, 4);
		System.out.println(l1);
		System.out.println(l1.contains(2));
		System.out.println(l1.get(3)); // a[3]
		l1.set(3, 6);
		System.out.println(l1);
		l1.set(2, l1.get(1));
		System.out.println(l1);
		l1.remove(new Integer(6));
		System.out.println(l1);
		System.out.println(l1.indexOf(1));
		l1.add(null);
		System.out.println(l1);
		int s=0;
		for (Integer pom : l1) {
			if(pom!=null) {
				s+=pom;
			}
			
			
		}
		System.out.println(s);
		
		System.out.println("Setovi");
		
		
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(1);
		
		System.out.println(s1);
		s1.remove(2);
		System.out.println(s1);
		
		
		
		System.out.println("LinkedList"); // ulancana lista
		
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		
		ll1.add(1);
		ll1.addLast(2);
		ll1.addFirst(3);
		System.out.println(ll1);
		System.out.println(ll1.offer(4));
		System.out.println(ll1);
		System.out.println(ll1.peekLast());
		System.out.println(ll1);
		
		System.out.println(ll1.pollLast());
		
		System.out.println(ll1);
		
		
		System.out.println("RED-QUEUE-FIFO(Frist in first out)");
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		q1.add(1);
		q1.add(1);
		q1.add(1);
		System.out.println(q1);
		
		System.out.println("STACK - LIFO(Last in first out)");
		
		
		Stack<Integer> st1 =new Stack<Integer>();
		
		st1.add(1);
		st1.push(2);
		System.out.println(st1);
		st1.pop();
		System.out.println(st1);
		
		System.out.println("MAPS");
		
		Map<String, Float> m1 =new HashMap<String, Float>();
		m1.put("Marko", 7.6f);
		m1.put("Nikola", 6.8f);
		m1.put("Marko", 8.7f);
		System.out.println(m1);
		m1.remove("Marko");
		System.out.println(m1);
		m1.put("Marko", 8.7f);
		System.out.println(m1);
		
		
		System.out.println("Kljucevi");
		
		for (String pom : m1.keySet()) {
			System.out.println(pom+" = "+m1.get(pom));
			
		}
		
		System.out.println("Vrednosti");
		
		for (Float pom : m1.values()) {
			System.out.println(pom);
			
		}
		
		
		Map<String, ArrayList<Integer>> m2=new HashMap<String,ArrayList<Integer>>();
		m2.put("Petar", new ArrayList<Integer>());
		m2.get("Petar").add(7);
		m2.get("Petar").add(10);
		m2.get("Petar").add(11);
		System.out.println(m2);
		m2.put("Nikola", new ArrayList<Integer>());
		m2.get("Nikola").add(7);
		m2.put("Stefan", new ArrayList<Integer>());
		m2.get("Stefan").add(6);
		m2.get("Stefan").add(9);
		
		System.out.println("Ocene odeljenja");
		for (String pom : m2.keySet()) {
			System.out.println("Ucenik: "+pom);
			for(Integer o : m2.get(pom)) {
				System.out.println(o);
				
			}
			
			
		}
	}

}
