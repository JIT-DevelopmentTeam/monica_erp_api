package com.fh.service.interface_.item;

import com.fh.entity.Page;
import com.fh.util.PageData;

import java.util.List;

public interface ItemManager {

	/**需要同步的客户数据
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> listClient(PageData pd)throws Exception;

	/**更新一条对于客户的FModifyTime的数据
	 * @param pd
	 * @throws Exception
	 */
	public void insertCusMaxMDF(PageData pd)throws Exception;

	/**需要同步的部门数据
	 * @param page
	 * @throws Exception
	 */
	public List<PageData> listDept(Page page)throws Exception;

	/**
	 * 查询部门的总数
	 * @return
	 * @throws Exception
	 */
	public PageData deptTotal(PageData pd)throws Exception;

	/**更新一条对于部门的FModifyTime的数据
	 * @param pd
	 * @throws Exception
	 */
	public void insertDeptMaxMDF(PageData pd)throws Exception;

	/**需要职员的部门数据
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> listEmpl(PageData pd)throws Exception;

	/**更新一条对于职员的FModifyTime的数据
	 * @param pd
	 * @throws Exception
	 */
	public void insertEmplMaxMDF(PageData pd)throws Exception;

	/**需要同步的产品数据
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> listICItem(PageData pd)throws Exception;

	/**更新一条对于产品的FModifyTime的数据
	 * @param pd
	 * @throws Exception
	 */
	public void insertICItemMaxMDF(PageData pd)throws Exception;

	/**库存数据
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> listStock(PageData pd)throws Exception;

	/**更新一条对于产品的FModifyTime的数据
	 * @param pd
	 * @throws Exception
	 */
	public void insertStockMaxMDF(PageData pd)throws Exception;

	/**供应商数据
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> listSupplier(PageData pd)throws Exception;

	/**更新一条对于供应商的FModifyTime的数据
	 * @param pd
	 * @throws Exception
	 */
	public void insertSupplierMaxMDF(PageData pd)throws Exception;

	/**币别数据
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> listCur(PageData pd)throws Exception;

	/**物料分类数据
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> listIcItemClass(PageData pd)throws Exception;

	/**更新一条对于币别的FModifyTime的数据
	 * @param pd
	 * @throws Exception
	 */
	public void insertCurMaxMDF(PageData pd)throws Exception;

	/**删除对应的Modifytime数据
	 * @param pd
	 * @throws Exception
	 */
	public void delete_Class(PageData pd)throws Exception;

	/**库存查询
	 * @param page
	 * @throws Exception
	 */
	public List<PageData> listWareHouseStock(Page page)throws Exception;

	/**
	 * 库存查询详情
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> findWareHouseStockByNum(PageData pd) throws Exception;

	/**库存查询(总数)
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> wareHouseStockTotal(PageData pd)throws Exception;

	/**
	 * 库存等级列表
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	public List<PageData> getLevel(Page page) throws Exception;
}
