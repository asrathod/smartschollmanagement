package com.smartschool.dao;

import java.util.List;

import com.smartschool.bean.StudentBean;

public interface StudentDao {
	public long createStudentInfo(StudentBean studentBean);
	public StudentBean getStudentById(long studentId);
	public List<StudentBean> getAllStudentInfo();
	public StudentBean updateStudentInfo(StudentBean studentBean);
}
