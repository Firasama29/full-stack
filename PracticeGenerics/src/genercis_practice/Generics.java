package genercis_practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.print.attribute.SetOfIntegerSyntax;

public class Generics {
	
	public static void main(String[] args) {
		
		//set of any type
		//you can assign setOfString or setOfInteger
		Set<?> setOfAnyType = new HashSet<String>();
		
		setOfAnyType = new HashSet<Integer>();
		
		//set of object
		//you cannot assign setOfString or setOfInteger but can store Strings, integers, float, etc.
		Set<Object> setOfObject = new HashSet<Object>();
		
		setOfObject.add("Can add a String");
		
		setOfObject.add(2);
		
		setOfObject.add(new Double(2345.6));
		
		
		//raw type set
		//can assign any Set<T> to raw type Set
		Set setOfRawType = new LinkedHashSet<String>(); 
		
		setOfRawType = new HashSet<Integer>();
	}

}
