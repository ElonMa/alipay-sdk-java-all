package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityParticipation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.activity.participated.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-21 12:06:32
 */
public class ZhimaMerchantActivityParticipatedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3835475494485879219L;

	/** 
	 * 用户参加活动模型列表
	 */
	@ApiListField("activity_participation_list")
	@ApiField("activity_participation")
	private List<ActivityParticipation> activityParticipationList;

	public void setActivityParticipationList(List<ActivityParticipation> activityParticipationList) {
		this.activityParticipationList = activityParticipationList;
	}
	public List<ActivityParticipation> getActivityParticipationList( ) {
		return this.activityParticipationList;
	}

}
