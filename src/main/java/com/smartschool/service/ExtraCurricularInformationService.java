package com.smartschool.service;

import java.util.List;

import com.smartschool.bean.ExtraCurricularInformationBean;

public interface ExtraCurricularInformationService {

	public long createExtraCurricularInformation(ExtraCurricularInformationBean extraCurricularInformationBean);
	public ExtraCurricularInformationBean getExtraCurricularInformationById(long extraCurrInfoId);
	public List<ExtraCurricularInformationBean> getAllExtraCurricularInformation();
	public ExtraCurricularInformationBean updateExtraCurricularInformation(ExtraCurricularInformationBean extraCurricularInformationBean);
	public void deleteExtraCurricularInformation(long extraCurrInfoId);
}
