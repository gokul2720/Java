package com.gp.final_assessment;

import java.util.*;

public class Main extends Student {

	public Main(int id, String name, String course, double mark) {
		super(id, name, course, mark);

	}

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		System.out.println(" 1.Add student details \n 2.Edit student details");
		System.out.println(" 3.Delete student details \n 4.List the student details");
		System.out.println(" 5.Get a Student details \n 6.Student list Sort by \n 7.Exit");
		int choice;
		do {
			System.out.println("enter your choice");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				arrayList.add(addStudent());
				System.out.println(arrayList);
				break;

			case 2: {
				Scanner edit = new Scanner(System.in);
				System.out.println("enter the id number");
				int y = edit.nextInt();
				System.out.println("What Field needs to be changed?  \n 1.name \n 2.course \n 3.mark");
				int x = edit.nextInt();

				switch (x) {
				case 1:
					System.out.println("enter new name:");
					String z = edit.next();
					for (Student stu : arrayList) {
						if (y == stu.id) {
							stu.name = z;
						}

					}
					break;

				case 2:
					System.out.println("enter new course:");
					String a = edit.next();
					for (Student stu : arrayList) {
						if (y == stu.id) {
							stu.course = a;
						}

					}
					break;

				case 3:
					System.out.println("enter new name:");
					int b = edit.nextInt();
					for (Student stu : arrayList) {
						if (y == stu.id) {
							stu.mark = b;
						}

					}
					break;
				}
				break;
			}

			case 3:
				System.out.println("enter student id");
				int num = scan.nextInt();
//					while(iterator.hasNext()) {
//						Student x= iterator.next();
//						if(x.id==num)
//							iterator.remove();
//					}
				arrayList.remove(num - 1);
				System.out.println("student details removed");
				break;

			case 4:
				Iterator<Student> iterator = arrayList.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				break;

			case 5:
				System.out.println("enter student id");
				Iterator<Student> iter = arrayList.iterator();
				int n = scan.nextInt();
				while (iter.hasNext()) {
					Student x = iter.next();
					if (x.id == n)
						System.out.println(x);

				}
				break;

			case 6:
				System.out.println("Sort by: \n 1.name \n 2.id \n 3.marks ");
				int c = scan.nextInt();
				switch (c) {
				case 1:
					SortByName sortByName = new SortByName();
					arrayList.sort(sortByName);
					break;

				case 2:
					SortById sortById = new SortById();
					arrayList.sort(sortById);
					break;

				case 3:
					SortByMark sortByMark = new SortByMark();
					arrayList.sort(sortByMark);
					break;
				}

			}
		} while (choice < 7);

		System.out.println("End of program");
	}
}
