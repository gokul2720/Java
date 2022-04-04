package com.gp.final_assessment;

import java.util.Comparator;

public class SortByMark implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return (int)(o1.mark-o2.mark);
	}

}
