package testjunit;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Comparator;

public class Persona implements Comparable<Persona> {
	String name;
	int edad;
	ArrayList<Rol> roles;
	
	
	public Persona(String name, int edad, ArrayList<Rol> roles) {
		super();
		this.name = name;
		this.edad = edad;
		this.roles = roles;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public ArrayList<Rol> getRoles() {
		return roles;
	}
	public void setRoles(ArrayList<Rol> roles) {
		this.roles = roles;
	}
	public <T> gen(GenericsType<T> o){
		return o;
	}
	@Override
	public boolean equals(Object obj) {
		
		return (this.getEdad() == ((Persona) obj).getEdad()) && (this.getName().equals(((Persona) obj).getName()));
	
	}
	
	public int compareTo(Persona o) {
		System.out.println(this.toString());
		System.out.println(o.toString());
		System.out.println(this.edad-o.edad);
		return o.edad-this.edad;
	}
	@Override
	public String toString() {
		return "Persona [name=" + name + ", edad=" + edad + "]";
	}
	public static Comparator<Persona> sortByNameLength = new Comparator<Persona>() {
		
		public int compare(Persona o1, Persona o2) {
			// TODO Auto-generated method stub
			return o2.name.length()-o1.name.length();
		}
	};
	
	public static Comparator<Persona> sortByAge = new Comparator<Persona>(){
		public int compare(Persona p1, Persona p2){
			return p1.edad-p2.edad;
		}
	};
	
}
