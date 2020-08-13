package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑估清查询简化接口
 *
 * @author auto create
 * @since 1.0, 2020-07-02 21:50:47
 */
public class KoubeiCateringDishEstimateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5719736126138281366L;

	/**
	 * 外部门店id，外部门店id和口碑门店id，必须二选一必填，当都传入时，以口碑门店id为准
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}