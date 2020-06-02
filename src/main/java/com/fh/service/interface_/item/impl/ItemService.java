package com.fh.service.interface_.item.impl;

import com.fh.dao.DaoSupport;
import com.fh.entity.Page;
import com.fh.service.interface_.item.ItemManager;
import com.fh.util.PageData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("itemService")
public class ItemService implements ItemManager {


	@Resource(name = "daoSupport")
	private DaoSupport dao;


	@SuppressWarnings("unchecked")
	@Override
	public List<PageData> listClient(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		return (List<PageData>)dao.findForList("Interface_erp.listClient", pd);
	}

	/**更新一条对于客户的FModifyTime的数据
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public void insertCusMaxMDF(PageData pd)throws Exception{
		dao.save("Interface_erp.insertCusMaxMDF", pd);
	}

	/**需要同步的部门数据
	 * @param page
	 * @throws Exception
	 */
	@Override
	public List<PageData> listDept(Page page) throws Exception {
		// TODO Auto-generated method stub
		return (List<PageData>)dao.findForList("Interface_erp.deptlistPage", page);
	}

	@Override
	public List<PageData> deptTotal(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("Interface_erp.deptTotal", pd);
	}

	/**更新一条对于部门的FModifyTime的数据
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public void insertDeptMaxMDF(PageData pd)throws Exception{
		dao.save("Interface_erp.insertDeptMaxMDF", pd);
	}

	/**需要同步的职员数据
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public List<PageData> listEmpl(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		return (List<PageData>)dao.findForList("Interface_erp.listEmpl", pd);
	}

	/**更新一条对于职员的FModifyTime的数据
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public void insertEmplMaxMDF(PageData pd)throws Exception{
		dao.save("Interface_erp.insertEmplMaxMDF", pd);
	}

	/**需要同步的产品数据
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public List<PageData> listICItem(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		return (List<PageData>)dao.findForList("Interface_erp.listICItem", pd);
	}

	/**更新一条对于产品的FModifyTime的数据
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public void insertICItemMaxMDF(PageData pd)throws Exception{
		dao.save("Interface_erp.insertICItemMaxMDF", pd);
	}

	/**需要同步的仓库数据
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public List<PageData> listStock(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		return (List<PageData>)dao.findForList("Interface_erp.listStock", pd);
	}

	/**更新一条对于仓库的FModifyTime的数据
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public void insertStockMaxMDF(PageData pd)throws Exception{
		dao.save("Interface_erp.insertStockMaxMDF", pd);
	}

	/**供应商数据
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public List<PageData> listSupplier(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		return (List<PageData>)dao.findForList("Interface_erp.listSupplier", pd);
	}

	/**更新一条对于供应商的FModifyTime的数据
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public void insertSupplierMaxMDF(PageData pd)throws Exception{
		dao.save("Interface_erp.insertSupplierMaxMDF", pd);
	}

	/**供应商数据
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public List<PageData> listCur(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		return (List<PageData>)dao.findForList("Interface_erp.listSupplier", pd);
	}

	/**
	 * 物料分类数据
	 * @param pd
	 */
	@Override
	public List<PageData> listIcItemClass(PageData pd) throws Exception {
		// TODO Auto-generated method stub
		return (List<PageData>)dao.findForList("Interface_erp.listIcItemClass", pd);
	}

	/**更新一条对于供应商的FModifyTime的数据
	 * @param pd
	 * @throws Exception
	 */
	@Override
	public void insertCurMaxMDF(PageData pd)throws Exception{
		dao.save("Interface_erp.insertCurMaxMDF", pd);
	}

	/**删除对应的Modifytime数据
	 * @param pd
	 * @throws Exception
	 */
	public void delete_Class(PageData pd)throws Exception{
		dao.delete("Interface_erp.delete_Class", pd);
	}

	/**
	 * 库存查询
	 * @param page
	 */
	@Override
	public List<PageData> listWareHouseStock(Page page) throws Exception {
		// TODO Auto-generated method stub
		return (List<PageData>)dao.findForList("Interface_erp.wareHouseStocklistPage", page);
	}

	/**
	 * 库存查询详情
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<PageData> findWareHouseStockByNum(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("Interface_erp.findWareHouseStockByNum", pd);
	}

	/**库存查询(总数)
	 * @param pd
	 * @throws Exception
	 */
	public List<PageData> wareHouseStockTotal(PageData pd)throws Exception {
		return (List<PageData>) dao.findForList("Interface_erp.wareHouseStockTotal", pd);
	}

	/**
	 * 库存等级列表
	 * @param page
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<PageData> getLevel(Page page) throws Exception {
		return (List<PageData>) dao.findForList("Interface_erp.getLevel", page);
	}

	/**
	 * 二维码追溯
	 * @param page
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<PageData> qrCodelistPage(Page page) throws Exception {
		return (List<PageData>) dao.findForList("Interface_erp.qrCodelistPage", page);
	}

	/**
	 * 二维码追溯总数
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageData qrCodeTotal(PageData pd) throws Exception {
		return (PageData) dao.findForObject("Interface_erp.qrCodeTotal", pd);
	}

	/* =================================== 微信服务号 =================================== */

	/**
	 * 销售订单查询
	 * @param page
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<PageData> orderlistPage(Page page) throws Exception {
		return (List<PageData>)dao.findForList("Interface_erp.orderlistPage", page);
	}

	/**
	 * 销售订单总数
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageData orderlistTotal(PageData pd) throws Exception {
		return (PageData) dao.findForObject("Interface_erp.orderlistTotal", pd);
	}

	/**
	 * 销售订单详情
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<PageData> orderDetail(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("Interface_erp.orderDetail", pd);
	}

	/**
	 * 库存列表-服务号
	 * @param page
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<PageData> stocklistPage(Page page) throws Exception {
		return (List<PageData>) dao.findForList("Interface_erp.stocklistPage", page);
	}

	/**
	 * 库存列表总数-服务号
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<PageData> stocklistTotal(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("Interface_erp.stocklistTotal", pd);
	}

	/**
	 * 库存详情-服务号
	 * @param pd
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<PageData> stockDetail(PageData pd) throws Exception {
		return (List<PageData>) dao.findForList("Interface_erp.stockDetail", pd);
	}
}
