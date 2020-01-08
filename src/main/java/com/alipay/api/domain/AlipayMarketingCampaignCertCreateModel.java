package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销抽奖活动凭证创建
 *
 * @author auto create
 * @since 1.0, 2018-10-17 14:15:23
 */
public class AlipayMarketingCampaignCertCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5439269358434916211L;

	/**
	 * 凭证批次名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 拓展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 凭证有效次数，数值(最大为10000)
	 */
	@ApiField("valid_count")
	private String validCount;

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getValidCount() {
		return this.validCount;
	}
	public void setValidCount(String validCount) {
		this.validCount = validCount;
	}

}
