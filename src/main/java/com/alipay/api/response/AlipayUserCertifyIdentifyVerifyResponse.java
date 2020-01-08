package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.identify.verify response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-30 14:38:32
 */
public class AlipayUserCertifyIdentifyVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4132128566672485497L;

	/** 
	 * 校验结果，T表示满足条件，F表示不满足条件
	 */
	@ApiField("biz_code_status")
	private String bizCodeStatus;

	public void setBizCodeStatus(String bizCodeStatus) {
		this.bizCodeStatus = bizCodeStatus;
	}
	public String getBizCodeStatus( ) {
		return this.bizCodeStatus;
	}

}
