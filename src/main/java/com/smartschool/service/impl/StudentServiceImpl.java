package com.smartschool.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartschool.bean.StudentBean;
import com.smartschool.dao.StudentDao;
import com.smartschool.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public long createStudentInfo(StudentBean studentBean) {
		
		return studentDao.createStudentInfo(studentBean);
	}

	@Override
	public StudentBean getStudentById(long studentId) {
		
		return studentDao.getStudentById(studentId);
	}

	@Override
	public List<StudentBean> getAllStudentInfo() {
		
		return studentDao.getAllStudentInfo();
	}

	@Override
	public StudentBean updateStudentInfo(StudentBean studentBean) {
		
		return studentDao.updateStudentInfo(studentBean);
	}

}
