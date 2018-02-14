package com.smartschool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartschool.bean.ExtraCurricularInformationBean;
import com.smartschool.dao.ExtraCurricularInformationDao;
import com.smartschool.service.ExtraCurricularInformationService;

@Service
@Transactional
public class ExtraCurricularInformationServiceImpl implements ExtraCurricularInformationService {

	@Autowired
	private ExtraCurricularInformationDao extraCurricularInformationDao;
	
	@Override
	public long createExtraCurricularInformation(ExtraCurricularInformationBean extraCurricularInformationBean) {
		
		return extraCurricularInformationDao.createExtraCurricularInformation(extraCurricularInformationBean);
	}

	@Override
	public ExtraCurricularInformationBean getExtraCurricularInformationById(long extraCurrInfoId) {
		
		return extraCurricularInformationDao.getExtraCurricularInformationById(extraCurrInfoId);
	}

	@Override
	public List<ExtraCurricularInformationBean> getAllExtraCurricularInformation() {
		
		return extraCurricularInformationDao.getAllExtraCurricularInformation();
	}

	@Override
	public ExtraCurricularInformationBean updateExtraCurricularInformation(
			ExtraCurricularInformationBean extraCurricularInformationBean) {
		
		return extraCurricularInformationDao.updateExtraCurricularInformation(extraCurricularInformationBean);
	}

	@Override
	public void deleteExtraCurricularInformation(long extraCurrInfoId) {
		extraCurricularInformationDao.deleteExtraCurricularInformation(extraCurrInfoId);

	}

}
