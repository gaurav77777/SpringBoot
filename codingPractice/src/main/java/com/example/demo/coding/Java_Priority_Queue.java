package com.example.demo.coding;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/*There are a number of students in a school who wait to be served. 
Two types of events, ENTER and SERVED, can take place which are described below.

ENTER: A student with some priority enters the queue to be served.
SERVED: The student with the highest priority is served (removed) from the queue.

A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):

The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending order of the id.*/


class Priorities {

	List<Student> getStudents(List<String> events) 
	{

		PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new Comparator<Student>() 
		{
			public int compare(Student s1, Student s2) 
			{
				return s1.getCGPA() != s2.getCGPA() ? s2.getCGPA() - s1.getCGPA() > 0 ? 1 : -1
						: !s1.getName().equals(s2.getName()) ? s1.getName().compareTo(s2.getName())
								: s1.getID() > s2.getID() ? 1 : -1;
			}
		});

		for (String str : events)
		{
			String isENTER = str.split(" ")[0];

			if (isENTER.equals("ENTER")) 
			{
				int id = Integer.parseInt(str.split(" ")[3]);
				String name = str.split(" ")[1];
				double cgpa = Double.parseDouble(str.split(" ")[2]);

				priorityQueue.add(new Student(id, name, cgpa));

			} 
			else
				priorityQueue.poll();
		}

		List<Student> result = new ArrayList<>();

		while (!priorityQueue.isEmpty()) 
		{
			result.add(priorityQueue.poll());
		}

		return result;
	}
}

class Student {
    private int id;
    private String name;
    private double cgpa;
    
    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    int getID() {
        return id;
    }
    
    String getName() {
        return name;
    }
    
    double getCGPA() {
        return cgpa;
    }
}

public class Java_Priority_Queue 
{
	
	private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) 
        {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) 
        {
            System.out.println("EMPTY");
        } else 
        {
            for (Student st: students) 
            {
                System.out.println(st.getName());
            }
        }

	}

}
