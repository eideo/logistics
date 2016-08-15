package org.ankang.tianmao.controller.customer;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.ankang.tianmao.dao.CustomerInfoMapperDao;
import org.ankang.tianmao.entity.CustomerInfo;

@Controller
@RequestMapping("/customer")
public class CheckCustomerInfoNameController {
	@Resource
	private CustomerInfoMapperDao dao;
	
	@RequestMapping("/checkCustomer_name")
	@ResponseBody
	public boolean check(
		@RequestParam(value="customer_name",required=false) 
		String customer_name){
		System.out.println(customer_name);
		CustomerInfo customer = dao.findByCustomerName(customer_name);
		if(customer == null){
			return true;//û��¼�����ͻ����ƿ���
		}else{
			return false;//�м�¼�����ͻ����Ʋ�����
		}
	}
}