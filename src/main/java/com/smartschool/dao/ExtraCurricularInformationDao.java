package com.smartschool.dao;

import java.util.List;

import com.smartschool.bean.ExtraCurricularInformationBean;

public interface ExtraCurricularInformationDao {
	
	public long createExtraCurricularInformation(ExtraCurricularInformationBean extraCurricularInformationBean);
	public ExtraCurricularInformationBean getExtraCurricularInformationById(long extraCurrInfoId);
	public List<ExtraCurricularInformationBean> getAllExtraCurricularInformation();
	public ExtraCurricularInformationBean updateExtraCurricularInformation(ExtraCurricularInformationBean extraCurricularInformationBean);
	public void deleteExtraCurricularInformation(long extraCurrInfoId);
}
