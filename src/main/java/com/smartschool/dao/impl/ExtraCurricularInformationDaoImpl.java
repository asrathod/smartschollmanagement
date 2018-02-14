package com.smartschool.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smartschool.bean.ExtraCurricularInformationBean;
import com.smartschool.dao.ExtraCurricularInformationDao;
import com.smartschool.entity.ExtraCurricularInformation;
import com.smartschool.entity.Student;
import com.smartschool.entity.UserInformation;
import com.smartschool.util.HibernateUtil;

@Repository
public class ExtraCurricularInformationDaoImpl implements ExtraCurricularInformationDao {
	
	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public long createExtraCurricularInformation(ExtraCurricularInformationBean extraCurricularInformationBean) {
		ExtraCurricularInformation extraCurricularInformation = convertBeantoEntity(extraCurricularInformationBean);
		long extraCurr = (long) hibernateUtil.create(extraCurricularInformation);
		return extraCurr;
	}

	@Override
	public ExtraCurricularInformationBean getExtraCurricularInformationById(long extraCurrInfoId) {
		ExtraCurricularInformation extraCurricularInformation = hibernateUtil.fetchById(extraCurrInfoId, ExtraCurricularInformation.class);
		return convertEntityToBean(extraCurricularInformation);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ExtraCurricularInformationBean> getAllExtraCurricularInformation() {
		Session session = hibernateUtil.getCurrentSession();
		Query query = session.createQuery("FROM ExtraCurricularInformation");
		return getExtraCurricularInformation(query.list());
	}

	private List<ExtraCurricularInformationBean> getExtraCurricularInformation(List<ExtraCurricularInformation> extraCurricularInformationlists) {
		List<ExtraCurricularInformationBean> extraCurricularInformationBeans = new ArrayList<ExtraCurricularInformationBean>();
		for(ExtraCurricularInformation extraCurricularInformation : extraCurricularInformationlists){
			ExtraCurricularInformationBean extraCurricularInformationBean = convertEntityToBean(extraCurricularInformation);
			extraCurricularInformationBeans.add(extraCurricularInformationBean);
		}
		return extraCurricularInformationBeans ;
	}

	@Override
	public ExtraCurricularInformationBean updateExtraCurricularInformation(
			ExtraCurricularInformationBean extraCurricularInformationBean) {
		ExtraCurricularInformation extraCurricularInformation = convertBeantoEntity(extraCurricularInformationBean);
		extraCurricularInformation = hibernateUtil.update(extraCurricularInformation);
		return convertEntityToBean(extraCurricularInformation);
	}

	@Override
	public void deleteExtraCurricularInformation(long extraCurrInfoId) {
		ExtraCurricularInformation extraCurricularInformation = new ExtraCurricularInformation();
		extraCurricularInformation.setExtraCurrInfoId(extraCurrInfoId);
		hibernateUtil.delete(extraCurricularInformation);
	}
	
	//convertBeantoEntity
	private ExtraCurricularInformation convertBeantoEntity(
			ExtraCurricularInformationBean extraCurricularInformationBean) {
		ExtraCurricularInformation extraCurricularInformation = new ExtraCurricularInformation();
		extraCurricularInformation.setExtraCurrInfoId(extraCurricularInformationBean.getExtraCurrInfoId());
		extraCurricularInformation.setStudent(new Student(extraCurricularInformationBean.getStudentId()));
		extraCurricularInformation.setSprorts(extraCurricularInformationBean.getSprorts());
		extraCurricularInformation.setIndoorGame(extraCurricularInformationBean.getIndoorGame());
		extraCurricularInformation.setOutdoorGame(extraCurricularInformationBean.getOutdoorGame());
		extraCurricularInformation.setRecCreatedDate(extraCurricularInformationBean.getRecCreatedDate());
		extraCurricularInformation.setRecCreatedById(new UserInformation(extraCurricularInformationBean.getRecUpdatedById()));
		extraCurricularInformation.setRecUpdatedDate(extraCurricularInformationBean.getRecUpdatedDate());
		extraCurricularInformation.setRecUpdatedById(new UserInformation(extraCurricularInformationBean.getRecUpdatedById()));
		extraCurricularInformation.setActiveFlag(extraCurricularInformationBean.isActiveFlag());
		
		return extraCurricularInformation ;
	}

	// convertEntityToBean
	private ExtraCurricularInformationBean convertEntityToBean(ExtraCurricularInformation extraCurricularInformation) {
		ExtraCurricularInformationBean extraCurricularInformationBean = new ExtraCurricularInformationBean();
		extraCurricularInformationBean.setExtraCurrInfoId(extraCurricularInformation.getExtraCurrInfoId());
		extraCurricularInformationBean.setStudentId(extraCurricularInformation.getStudent().getStudentId());
		extraCurricularInformationBean.setSprorts(extraCurricularInformation.getSprorts());
		extraCurricularInformationBean.setIndoorGame(extraCurricularInformation.getIndoorGame());
		extraCurricularInformationBean.setOutdoorGame(extraCurricularInformation.getOutdoorGame());
		extraCurricularInformationBean.setRecCreatedDate(extraCurricularInformation.getRecCreatedDate());
		extraCurricularInformationBean.setRecCreatedById(extraCurricularInformation.getRecCreatedById().getUserId());
		extraCurricularInformationBean.setRecUpdatedDate(extraCurricularInformation.getRecUpdatedDate());
		extraCurricularInformationBean.setRecUpdatedById(extraCurricularInformation.getRecUpdatedById().getUserId());
		extraCurricularInformationBean.setActiveFlag(extraCurricularInformation.isActiveFlag());
		
		return extraCurricularInformationBean ;
	}
}
