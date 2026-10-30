package com.manage;

import java.util.List;
import java.util.Scanner;

import com.dao.*;
import com.dto.*;

public class Manage {

	public static void main(String[] args) throws Exception {
		
		System.out.println("welcome to Employee Management System!!");
		DataAcces d=new DataAcces();
		System.out.println(" 1.Insert \n 2.Read \n 3.Update \n 4. Delete \n 5.Exit");
		while(true) {
			System.out.println("enter your choice: ");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("enetr id: ");
					int eid=sc.nextInt();
					System.out.println("enter name: ");
					String ename=sc.next();
					System.out.println("enetr salary: ");
					int esalary=sc.nextInt();
					System.out.println("enetr city: ");
					String city=sc.next();
					Employee e = new Employee(eid, ename, esalary, city);
				    d.insertData(e);
					System.out.println("inserted data succesfully");
					break;
				case 2:
				    List<Employee> emp = d.readData();

				    if (emp.isEmpty()) {
				        System.out.println("No employee records found");
				    } 
				    else {
				        for (Employee e1 : emp) {
				            System.out.println(
				                e1.getEid() + " " + e1.getEname() + " " +e1.getEsalary() + " " +e1.getCity()
				            );
				        }
				    }
					break;
				case 3:
					System.out.println("enter the id: ");
					int eid1=sc.nextInt();
					System.out.println("update name: ");
					String ename1=sc.next();
					System.out.println("update salary: ");
					int esalary1=sc.nextInt();
					System.out.println("update city: ");
					String city1=sc.next();
					Employee e2=new Employee(eid1,ename1,esalary1,city1);
					d.updateData(e2);
					System.out.println("updated data succesfully");
					break;
				case 4:
					System.out.println("enter id: ");
					int id=sc.nextInt();
					d.deleteData(id);
					System.out.println("data deleted successfully");
					break;
				case 5:
					System.out.println("thank you");
					System.exit(0);
					sc.close();
		}
	}

	}
}
