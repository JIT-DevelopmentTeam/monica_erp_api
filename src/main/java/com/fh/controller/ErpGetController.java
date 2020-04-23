package com.fh.controller;

import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.service.interface_.item.ItemManager;
import com.fh.util.PageData;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


@Controller
@RequestMapping(value="/erp_get")
public class ErpGetController extends BaseController{

	/**
	 * modify的Class号码  客户：1    部门：2    员工：3    产品：4    仓库：5   供应商：6
	 */

	@Resource(name="itemService")
	private ItemManager itemService;

	//客户数据
	@RequestMapping(value="/erp_cus")
	@ResponseBody
	public  Map<String, Object> erp_cus(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String token_value = pd.getString("token_value");
		String time_value = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//需要填写token值认证
		List<PageData>	varList = itemService.listClient(pd);
		int result = readTokenXml("cus",token_value,time_value);
		if (result == 1){
			json.put("Data", varList);
		}else {
			json.put("Data", "");
		}
		return json;
	}

	//物料分类信息
	@RequestMapping(value="/erp_icitem_class")
	@ResponseBody
	public  Map<String, Object> erp_icitem_class(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String token_value = pd.getString("token_value");
		String time_value = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//需要填写token值认证
		List<PageData>	varList = itemService.listIcItemClass(pd);
		int result = readTokenXml("icitem_class",token_value,time_value);
		if (result == 1){
			json.put("Data", varList);
		}else {
			json.put("Data", "");
		}
		return json;
	}

	//部门数据
	@RequestMapping(value="/erp_dept")
	@ResponseBody
	public  Map<String, Object> erp_dept(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String currentPage = pd.getString("currentPage");
		String showCount = pd.getString("showCount");
		page.setPd(pd);
		if (currentPage != null && currentPage != "null" && currentPage != "") {
			page.setCurrentPage(Integer.parseInt(currentPage));
		}
		if (showCount != null && showCount != "null" && showCount != "") {
			page.setShowCount(Integer.parseInt(showCount));
		}
		String token_value = pd.getString("token_value");
		String time_value = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//需要填写token值认证
		List<PageData>	varList = itemService.listDept(page);
		int result = readTokenXml("dept",token_value,time_value);
		if (result == 1){
			json.put("Data", varList);
		}else {
			json.put("Data", "");
		}
		return json;
	}

	@RequestMapping(value = "/erp_dept_total")
	@ResponseBody
	public Map<String, Object> erp_dept_total(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = this.getPageData();
		String token_value = pd.getString("token_value");
		String time_value = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//需要填写token值认证
		List<PageData>	varList = itemService.deptTotal(pd);
		int result = readTokenXml("dept_total",token_value,time_value);
		if (result == 1){
			json.put("Data", varList);
		}else {
			json.put("Data", "");
		}
		return json;
	}

	//职员数据
	@RequestMapping(value="/erp_empl")
	@ResponseBody
	public  Map<String, Object> erp_empl(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String token_value = pd.getString("token_value");
		String time_value = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//需要填写token值认证
		List<PageData>	varList = itemService.listEmpl(pd);
		int result = readTokenXml("empl",token_value,time_value);
		if (result == 1){
			json.put("Data", varList);
		}else {
			json.put("Data", "");
		}
		return json;
	}

	//产品数据
	@RequestMapping(value="/erp_icitem")
	@ResponseBody
	public  Map<String, Object> erp_icitem(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String token_value = pd.getString("token_value");
		String time_value = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//需要填写token值认证
		List<PageData>	varList = itemService.listICItem(pd);
		int result = readTokenXml("icitem",token_value,time_value);
		if (result == 1){
			json.put("Data", varList);
		}else {
			json.put("Data", "");
		}
		return json;
	}

	//仓库数据listStock
	@RequestMapping(value="/erp_stock")
	@ResponseBody
	public  Map<String, Object> erp_stock(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String token_value = pd.getString("token_value");
		String time_value = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//需要填写token值认证
		List<PageData>	varList = itemService.listStock(pd);
		int result = readTokenXml("stock",token_value,time_value);
		if (result == 1){
			json.put("Data", varList);
		}else {
			json.put("Data", "");
		}
		return json;
	}

	//供应商数据listStock
	@RequestMapping(value="/erp_supplier")
	@ResponseBody
	public  Map<String, Object> erp_Supplier(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String token_value = pd.getString("token_value");
		String time_value = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//需要填写token值认证
		List<PageData>	varList = itemService.listSupplier(pd);
		int result = readTokenXml("supplier",token_value,time_value);
		if (result == 1){
			json.put("Data", varList);
		}else {
			json.put("Data", "");
		}
		return json;
	}

	//币别数据listStock
	@RequestMapping(value="/erp_cur")
	@ResponseBody
	public  Map<String, Object> erp_Cur(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String token_value = pd.getString("token_value");
		String time_value = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//需要填写token值认证
		List<PageData>	varList = itemService.listCur(pd);
		int result = readTokenXml("cur",token_value,time_value);
		if (result == 1){
			json.put("Data", varList);
		}else {
			json.put("Data", "");
		}
		return json;
	}

	//库存查询
	@RequestMapping(value="/erp_warehouse_stock")
	@ResponseBody
	public  Map<String, Object> erp_warehouse_stock(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String itemClassNumber = pd.getString("itemClassNumber");
		pd.put("itemClassNumber", itemClassNumber);
		String item = pd.getString("item");
		pd.put("item", item);
		String batchNum = pd.getString("batchNum");
		pd.put("batchNum", batchNum);
		String level = pd.getString("level");
		pd.put("level", level);
		String colorNum = pd.getString("colorNum");
		pd.put("colorNum", colorNum);
		String warehouse = pd.getString("warehouse");
		pd.put("warehouse", warehouse);
		String currentPage = pd.getString("currentPage");
		String showCount = pd.getString("showCount");
		page.setPd(pd);
		if (currentPage != null && currentPage != "null" && currentPage != "") {
			page.setCurrentPage(Integer.parseInt(currentPage));
		}
		if (showCount != null && showCount != "null" && showCount != "") {
			page.setShowCount(Integer.parseInt(showCount));
		}
		String token_value = pd.getString("token_value");
		String time_value = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//需要填写token值认证
		List<PageData>	varList = itemService.listWareHouseStock(page);
		int result = readTokenXml("warehouse_stock",token_value,time_value);
		if (result == 1){
			json.put("Data", varList);
		}else {
			json.put("Data", "");
		}
		return json;
	}

	//库存查询详情
	@RequestMapping(value="/erp_warehouse_stock_detail")
	@ResponseBody
	public  Map<String, Object> erp_warehouse_stock_detail(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String commodityNumber = pd.getString("commodityNumber");
		pd.put("commodityNumber", commodityNumber);
		String token_value = pd.getString("token_value");
		String time_value = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//需要填写token值认证
		List<PageData> detail = itemService.findWareHouseStockByNum(pd);
		int result = readTokenXml("warehouse_stock_detail",token_value,time_value);
		if (result == 1){
			json.put("Data", detail);
		}else {
			json.put("Data", "");
		}
		return json;
	}

	//库存查询(总数)
	@RequestMapping(value="/erp_warehouse_stock_total")
	@ResponseBody
	public  Map<String, Object> erp_warehouse_stock_total(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		String itemClassNumber = pd.getString("itemClassNumber");
		pd.put("itemClassNumber", itemClassNumber);
		String item = pd.getString("item");
		pd.put("item", item);
		String batchNum = pd.getString("batchNum");
		pd.put("batchNum", batchNum);
		String level = pd.getString("level");
		pd.put("level", level);
		String colorNum = pd.getString("colorNum");
		pd.put("colorNum", colorNum);
		String warehouse = pd.getString("warehouse");
		pd.put("warehouse", warehouse);
		String token_value = pd.getString("token_value");
		String time_value = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//需要填写token值认证
		List<PageData>	total = itemService.wareHouseStockTotal(pd);
		ArrayList arrayList = new ArrayList();
		arrayList.add(total.size());
		int result = readTokenXml("warehouse_stock_total",token_value,time_value);
		if (result == 1){
			json.put("Data", arrayList);
		}else {
			json.put("Data", "");
		}
		return json;
	}

	//库存等级列表
	@RequestMapping(value="/getLevel")
	@ResponseBody
	public  Map<String, Object> getLevel(Page page) throws Exception{
		Map<String, Object> json = new HashMap<String, Object>();
		PageData pd = new PageData();
		pd = this.getPageData();
		page.setPd(pd);
		String token_value = pd.getString("token_value");
		String time_value = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//需要填写token值认证
		List<PageData>	varList = itemService.getLevel(page);
		int result = readTokenXml("warehouse_stock_level",token_value,time_value);
		if (result == 1){
			json.put("Data", varList);
		}else {
			json.put("Data", "");
		}
		return json;
	}



	/**
	 * 读取token.xml文件
	 * 创建人：家成
	 */
	public static int readTokenXml(String api_nrl,String token_value,String time_value){
		int result = 1;
		try {
			SAXReader reader = new SAXReader(); //1.创建一个xml解析器对象
			String filePath = String.valueOf(Thread.currentThread().getContextClassLoader().getResource(""))+"../../";	//项目路径
			filePath = filePath.replaceAll("file:/", "");
			filePath = filePath.replaceAll("%20", " ");
			filePath = filePath.trim() + "admin/config/token.xml";
			if(filePath.indexOf(":") != 1){
				filePath = File.separator + filePath;
			}
			Document doc = reader.read(new File(filePath));//2.读取xml文档，返回Document对象
			Element element = doc.getRootElement();
			Iterator it = element.elementIterator();
			/*
			//返回json数据
			JSONObject jsonObject = new JSONObject();
			jsonObject = iterateNodes(element, jsonObject);
			*/
			int hasApi = 0;
			String time = "";
			String token = "";
			SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ArrayList<String> list = new ArrayList<String>();
			while (it.hasNext()) {
				System.out.println("==========开始遍历===========");
				Element value1 = (Element) it.next();
				hasApi = 0;
				System.out.println(value1.attributeValue("name"));
				if(api_nrl.equals(value1.attributeValue("name"))){//开始判断是否存在API的token，有则吧hasAPI设为1，无则重新新建
					hasApi = 1;
					// 解析子节点的信息
					Iterator itt = value1.elementIterator();

					while (itt.hasNext()) {
						Element carChild = (Element) itt.next();
						list.add(carChild.getStringValue());
						System.out.println("节点名：" + carChild.getName() + "-----节点值：" + carChild.getStringValue());
					}

					break;
				}
				System.out.println("==========结束遍历===========");
			}
			/*//解析时间后，判断时间是否已经过期
			Date api_date = sdfTime.parse(time_value);
			Date xml_date = sdfTime.parse(list.get(0));
			System.out.println((api_date.getTime()-xml_date.getTime())/ 1000);
			if((api_date.getTime()-xml_date.getTime()) / 1000 > 7200){
				System.out.println("token无效已过期");
			}*/
			if (hasApi == 0){
				System.out.println("需要新建节点");
				createElement(filePath,api_nrl,token_value,time_value);
			}else {
				if(!list.get(1).equals(token_value)){
					result = 0;
				}
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}

	/*
	 * 增加:文档,标签,属性
	 * */
	public static void createElement(String fileUrl,String api,String token_value,String time_value) throws IOException {
		try {
			SAXReader reader=new SAXReader();
			Document doc = reader.read(new File(fileUrl));//2.读取xml文档，返回Document对象
			Element root = doc.getRootElement();
			Element token = root.addElement("token");
			Element attribute1 = token.addAttribute("id", "123");
			Element attribute2 = token.addAttribute("name", api);
			//在token下创建节点  并给它们赋值
			Element time = token.addElement("time");
			time.setText(time_value);
			//在token下创建节点  并给它们赋值
			Element value = token.addElement("value");
			value.setText(token_value);
			//        创建一种输出格式    每个节点元素可自动换行
			OutputFormat outputFormat=OutputFormat.createPrettyPrint();
			outputFormat.setEncoding("UTF-8");
			//可达到同样的效果
//        OutputFormat outputFormat=new OutputFormat("\t",true,"UTF-8");//自动换行 指定字符集
//        outputFormat.setTrimText(true);
			XMLWriter xmlWriter=new XMLWriter(new FileWriter(new File(fileUrl)),outputFormat);//写入XML文件的位置 以及指定的格式
			xmlWriter.write(doc);//开始写入XML文件   写入Document对象
			xmlWriter.close();
			System.out.println("写入成功！");
		}catch (Exception e){
			e.printStackTrace();
		}

	}

	/**
	 * 遍历元素
	 * @param node 元素
	 * @param json 将元素遍历完成之后放的JSON对象
	 */
	@SuppressWarnings("unchecked")
	public static JSONObject iterateNodes(Element node,JSONObject json){
		//获取当前元素的名称
		String nodeName = node.getName();
		//判断已遍历的JSON中是否已经有了该元素的名称
		if(json.containsKey(nodeName)){
			//该元素在同级下有多个
			Object Object = json.get(nodeName);
			JSONArray array = null;
			if(Object instanceof JSONArray){
				array = (JSONArray) Object;
			}else {
				array = new JSONArray();
				array.add(Object);
			}
			//获取该元素下所有子元素
			List<Element> listElement = node.elements();
			if(listElement.isEmpty()){
				//该元素无子元素，获取元素的值
				String nodeValue = node.getTextTrim();
				array.add(nodeValue);
				json.put(nodeName, array);
				return json;
			}
			//有子元素
			JSONObject newJson = new JSONObject();
			//遍历所有子元素
			for(Element e:listElement){
				//递归
				iterateNodes(e,newJson);
			}
			array.add(newJson);
			json.put(nodeName, array);
			return json;
		}
		//该元素同级下第一次遍历
		//获取该元素下所有子元素
		List<Element> listElement = node.elements();
		if(listElement.isEmpty()){
			//该元素无子元素，获取元素的值
			String nodeValue = node.getTextTrim();
			json.put(nodeName, nodeValue);
			return json;
		}
		//有子节点，新建一个JSONObject来存储该节点下子节点的值
		JSONObject object = new JSONObject();
		//遍历所有一级子节点
		for(Element e:listElement){
			//递归
			iterateNodes(e,object);
		}
		json.put(nodeName, object);
		return json;
	}

}
