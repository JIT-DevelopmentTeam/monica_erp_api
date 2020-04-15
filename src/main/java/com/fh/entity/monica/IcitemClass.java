/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.fh.entity.monica;


/**
 * 商品分类管理Entity
 * @author JiaChe
 * @version 2019-05-29
 */
public class IcitemClass  {
	
	private static final long serialVersionUID = 1L;
	private String erpId;		// erp分类id
	private String number;		// 编码
	private String modifyTime;		// 同步时间戳
	private String erpNote;		// erp备注
	private String parentId;

	public String getErpId() {
		return erpId;
	}

	public void setErpId(String erpId) {
		this.erpId = erpId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getErpNote() {
		return erpNote;
	}

	public void setErpNote(String erpNote) {
		this.erpNote = erpNote;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
}