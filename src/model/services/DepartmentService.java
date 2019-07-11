package model.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	public List<Department> findAll(){
		List<Department> list = new ArrayList<>();
		Department d1 = new Department(1, "Livros");
		Department d2 = new Department(1, "Electronics");
		Department d3 = new Department(1, "informática");
		list.addAll(Arrays.asList(d1, d2, d3));
		return list;
	}
}
