package com.msds.km.service;

import com.msds.base.service.BaseService;
import com.msds.km.entity.RfidEntity;

/**
 * 
 * <br>
 * <b>功能：</b>RfidService<br>
 * <b>作者：</b>lilong<br>
 * <b>日期：</b> 2015-10-10 13:29:16 <br>
 * <b>版权所有：<b>版权所有(C) 2014，wwww.minshengec.com<br>
 * <b>此类为自动生成<br>
 */
public interface RfidService extends BaseService<RfidEntity> {
	
	Boolean mkrfid(RfidEntity rfidEntity);

}
