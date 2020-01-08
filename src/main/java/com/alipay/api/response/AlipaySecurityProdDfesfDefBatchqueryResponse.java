package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.dfesf.def.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-21 14:29:44
 */
public class AlipaySecurityProdDfesfDefBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1213447711811646669L;

	/** 
	 * 1
	 */
	@ApiField("ded")
	private String ded;

	public void setDed(String ded) {
		this.ded = ded;
	}
	public String getDed( ) {
		return this.ded;
	}

}
