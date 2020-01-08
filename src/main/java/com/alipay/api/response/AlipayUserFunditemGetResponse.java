package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FundDetailItemAOPModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.funditem.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-13 17:04:20
 */
public class AlipayUserFunditemGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6628145392327284119L;

	/** 
	 * 查询得到的消费记录详细信息（主记录+资金明细列表）
	 */
	@ApiField("fund_detail_item_aopmodel")
	private FundDetailItemAOPModel fundDetailItemAopmodel;

	public void setFundDetailItemAopmodel(FundDetailItemAOPModel fundDetailItemAopmodel) {
		this.fundDetailItemAopmodel = fundDetailItemAopmodel;
	}
	public FundDetailItemAOPModel getFundDetailItemAopmodel( ) {
		return this.fundDetailItemAopmodel;
	}

}
