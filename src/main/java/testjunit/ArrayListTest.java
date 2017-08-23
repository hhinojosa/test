package testjunit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class ArrayListTest {

	
	public static void main(String args[]){
		ArrayList<Persona> l = new ArrayList<Persona>(){{
			add(new Persona("Chad", 28, null));
		}};
		Persona p1,p2,p3;
		p1 = new Persona("humberto", 26, null);
		Persona puno = new Persona("humberto", 26, null);
		p2 = new Persona("Pedro",24,null);
		p3 = new Persona("Armando",22,null);
		l.add(0,p1);
		l.add(p2);
		l.add(p3);

		Iterator<Persona> i = l.iterator();
		while(i.hasNext()){
			System.out.println(i.next().getName());
		}
		System.out.println("after sortByNameLength");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("hola", 44);
		map.get("hola");
		Collections.sort(l,Persona.sortByNameLength);
		i = l.iterator();
		while(i.hasNext()){
			System.out.println(i.next().getName());
		}
		System.out.println("after sortByAge	");
		Collections.sort(l,Persona.sortByAge);
		i = l.iterator();
		while(i.hasNext()){
			System.out.println(i.next().getName());
		}
	
	}
}
