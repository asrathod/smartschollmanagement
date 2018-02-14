package com.smartschool.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartschool.bean.StudentBean;
import com.smartschool.dao.StudentDao;
import com.smartschool.entity.Student;
import com.smartschool.entity.UserInformation;
import com.smartschool.util.HibernateUtil;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private HibernateUtil hibernateUtil;
	
	@Override
	public long createStudentInfo(StudentBean studentBean) {	
		Student student = convertStudentBeanToEntity(studentBean);
	//	long studentId = 0;
		long studentId = (long) hibernateUtil.create(student);
		return studentId;
	}

	@Override
	public StudentBean updateStudentInfo(StudentBean studentBean) {
		Student student = convertStudentBeanToEntity(studentBean);
		student = hibernateUtil.update(student);
		return convertStudentEntityToBean(student);
	}
	
	@Override
	public StudentBean getStudentById(long studentId) {
		Student student = hibernateUtil.fetchById(studentId, Student.class);
		return convertStudentEntityToBean(student);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<StudentBean> getAllStudentInfo() {
		Session session = hibernateUtil.getCurrentSession();
		Query query = session.createQuery("FROM Student");
		return getStudentInfo(query.list());
	}
	
	private List<StudentBean> getStudentInfo(List<Student> students) {
		List<StudentBean> studentBeans = new ArrayList<StudentBean>();
		for(Student student : students){
			StudentBean studentBean = convertStudentEntityToBean(student);
			studentBeans.add(studentBean);
		}
		return studentBeans;
	}

	//Convert Student Bean To Entity
	private Student convertStudentBeanToEntity(StudentBean studentBean) {
		Student student = new Student();
		student.setStudentId(studentBean.getStudentId());
		student.setFirstName(studentBean.getFirstName());
		student.setMiddleName(studentBean.getMiddleName());
		student.setLastName(studentBean.getLastName());
		student.setDateOfBirth(studentBean.getDateOfBirth());
		student.setGender(studentBean.getGender());
		student.setAcademicYear(studentBean.getAcademicYear());
		student.setCurrentStandard(studentBean.getCurrentStandard());
		student.setCurrentSection(studentBean.getCurrentSection());
		student.setRecCreatedBy(new UserInformation(studentBean.getRecCreatedById()));
		student.setRecCreatedDate(studentBean.getRecCreatedDate());
		student.setRecUpdatedBy(new UserInformation(studentBean.getRecUpdatedById()));
		student.setRecUpdatedDate(studentBean.getRecUpdatedDate());
		student.setActiveFlag(studentBean.isActiveFlag());
//		student.setUserInformation(new UserInformation(studentBean.getUserId()));
		
		return student;
	}

	//Convert Student Entity To Bean
	private StudentBean convertStudentEntityToBean(Student student) {
		StudentBean studentBean = new StudentBean();
		studentBean.setStudentId(student.getStudentId());
		studentBean.setFirstName(student.getFirstName());
		studentBean.setMiddleName(student.getMiddleName());
		studentBean.setLastName(student.getLastName());
		studentBean.setDateOfBirth(student.getDateOfBirth());
		studentBean.setGender(student.getGender());
		studentBean.setAcademicYear(student.getAcademicYear());
		studentBean.setCurrentStandard(student.getCurrentStandard());
		studentBean.setCurrentSection(student.getCurrentSection());
		studentBean.setRecCreatedById(student.getRecCreatedBy().getUserId());
		studentBean.setRecCreatedDate(student.getRecCreatedDate());
		studentBean.setRecUpdatedById(student.getRecUpdatedBy().getUserId());
		studentBean.setRecUpdatedDate(student.getRecUpdatedDate());
		studentBean.setActiveFlag(student.isActiveFlag());
//		studentBean.setUserId(student.getUserInformation().getUserId());
		
		return studentBean; 
	}

}
