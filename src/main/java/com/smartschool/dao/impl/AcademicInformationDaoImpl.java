package com.smartschool.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartschool.bean.AcademicInformationBean;
import com.smartschool.dao.AcademicInformationDao;
import com.smartschool.entity.AcademicInformation;
import com.smartschool.entity.Student;
import com.smartschool.entity.UserInformation;
import com.smartschool.util.HibernateUtil;

@Repository
public class AcademicInformationDaoImpl implements AcademicInformationDao {
	
	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public long createAcademicInfo(AcademicInformationBean academicInformationBean) {
		AcademicInformation academicInformation = converBeanToEntity(academicInformationBean);
		long academicId = (long) hibernateUtil.create(academicInformation);
		return academicId;
	}

	@Override
	public AcademicInformationBean getAcademicInformationBeanById(long academicInfoId) {
		AcademicInformation academicInformation = hibernateUtil.fetchById(academicInfoId, AcademicInformation.class);
		
		return convertEntityToBean(academicInformation);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AcademicInformationBean> getAllAcademicInformationBean() {
		Session session = hibernateUtil.getCurrentSession();
		Query query = session.createQuery("FROM AcademicInformation");
		return getAcademicInformationInformation(query.list());
		
	}

	private List<AcademicInformationBean> getAcademicInformationInformation(List<AcademicInformation> AcademicInformationlists) {
		List<AcademicInformationBean> academicInformationBeans = new ArrayList<AcademicInformationBean>();
		for(AcademicInformation academicInformation : AcademicInformationlists){
			AcademicInformationBean academicInformationBean = convertEntityToBean(academicInformation);
			academicInformationBeans.add(academicInformationBean);
		}
		return academicInformationBeans ;
	}

	@Override
	public AcademicInformationBean updateAcademicInformationBean(AcademicInformationBean AcademicInformationBean) {
		AcademicInformation academicInformation = converBeanToEntity(AcademicInformationBean);
		academicInformation = hibernateUtil.update(academicInformation);
		return convertEntityToBean(academicInformation);
	}

	@Override
	public void deleteAcademicInformationBean(long academicInfoId) {
		AcademicInformation academicInformation = new AcademicInformation();
		academicInformation.setAcademicInfoId(academicInfoId);
		hibernateUtil.delete(academicInformation);
	}
	
	//converBeanToEntity
	private AcademicInformation converBeanToEntity(AcademicInformationBean academicInformationBean) {
		AcademicInformation academicInformation = new AcademicInformation();
		academicInformation.setAcademicInfoId(academicInformationBean.getAcademicInfoId());
		academicInformation.setStudent(new Student(academicInformationBean.getStudentId()));
		academicInformation.setStatus(academicInformationBean.getStatus());
		academicInformation.setAcademicStream(academicInformationBean.getAcademicStream());
		academicInformation.setMedium(academicInformationBean.getMedium());
		academicInformation.setAdmissionMode(academicInformationBean.getAdmissionMode());
		academicInformation.setTransportReq(academicInformationBean.getTransportReq());
		academicInformation.setRecCreatedDate(academicInformationBean.getRecCreatedDate());
		academicInformation.setRecCreatedById(new UserInformation(academicInformationBean.getRecCreatedById()));
		academicInformation.setRecUpdatedDate(academicInformationBean.getRecUpdatedDate());
		academicInformation.setRecUpdatedById(new UserInformation(academicInformationBean.getRecUpdatedById()));
		academicInformation.setActiveFlag(academicInformationBean.isActiveFlag());
		
		return academicInformation ;
	}

	//convertEntityToBean
	private AcademicInformationBean convertEntityToBean(AcademicInformation academicInformation) {
		AcademicInformationBean academicInformationBean = new AcademicInformationBean();
		academicInformationBean.setAcademicInfoId(academicInformation.getAcademicInfoId());
		academicInformationBean.setStudentId(academicInformation.getStudent().getStudentId());
		academicInformationBean.setAcademicYear(academicInformation.getStudent().getAcademicYear());
		academicInformationBean.setCurrentStandard(academicInformation.getStudent().getCurrentStandard());
		academicInformationBean.setCurrentSection(academicInformation.getStudent().getCurrentSection());
		academicInformationBean.setStatus(academicInformation.getStatus());
		academicInformationBean.setAcademicStream(academicInformation.getAcademicStream());
		academicInformationBean.setMedium(academicInformation.getMedium());
		academicInformationBean.setAdmissionMode(academicInformation.getAdmissionMode());
		academicInformationBean.setTransportReq(academicInformation.getTransportReq());
		academicInformationBean.setRecCreatedDate(academicInformation.getRecCreatedDate());
		academicInformationBean.setRecCreatedById(academicInformation.getRecCreatedById().getUserId());
		academicInformationBean.setRecUpdatedDate(academicInformation.getRecUpdatedDate());
		academicInformationBean.setRecUpdatedById(academicInformation.getRecUpdatedById().getUserId());
		academicInformationBean.setActiveFlag(academicInformation.isActiveFlag());
		
		return academicInformationBean ;
	}
}
