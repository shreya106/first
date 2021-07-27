package com.lti.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.lti.model.Student;

public class CollectionsDemo {

	public static void main(String[] args) {
//      List<Student> students=new ArrayList<Student>();
//      students.add(new Student(1,"John", LocalDate.now()));
//      students.add(new Student(2,"Mike", LocalDate.now()));
//      students.add(new Student(3,"Kevin", LocalDate.now()));
//      students.add(new Student(4,"Peter", LocalDate.now()));
//      Student st=new Student(3,"Kevin", LocalDate.now());
//      System.out.println(students.indexOf(st));
//      
//      
//      List<Integer> nums=new ArrayList<Integer>();
//      nums.add(10);
//      nums.add(20);
//      nums.add(30);
//      nums.add(40);
//      System.out.println(nums.indexOf(30));
//		Set<String> names=new HashSet<String>();
//		//Set<String> names=new TreeSet<String>();
//		names.add(new String("Shreya"));
//		names.add(new String("harry"));
//		names.add(new String("kevin"));
//		names.add(new String("lina"));
//		names.add(new String("dual"));
//		names.add(null);
//		System.out.println(names);
//		System.out.println(names.contains("kevin"));
//        System.out.println();
        //Map<Integer, String> credentials=new HashMap<Integer, String>();
        Map<Integer, String> credentials=new TreeMap<Integer, String>();

		credentials.put(1001, "pass@123");
        credentials.put(1002, "pass@111");
        credentials.put(1003, "pass@333");
        credentials.put(1004, "pass@456");
        credentials.put(1005, "pass@144");
        credentials.put(1006, "pass@123");
        System.out.println(credentials);
        //there are two ways we can convert Map into set:1.entrySet() 2.keySet()
        Set<Entry<Integer,String>> entrySet=credentials.entrySet();
        Iterator<Entry<Integer, String>> iterator=entrySet.iterator();
        while(iterator.hasNext()) {
        	Entry<Integer,String> items=iterator.next();
        	System.out.println(items.getKey()+" "+items.getValue());
        }
        
        
	}

}
