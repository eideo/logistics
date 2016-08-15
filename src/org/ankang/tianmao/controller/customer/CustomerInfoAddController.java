package org.ankang.tianmao.controller.customer;

import javax.annotation.Resource;

import org.ankang.tianmao.dao.CustomerInfoMapperDao;
import org.ankang.tianmao.entity.CustomerInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerInfoAddController {
	@Resource
	private CustomerInfoMapperDao dao;
	public void setDao(CustomerInfoMapperDao dao) {
		this.dao = dao;
	}

	//��Ӧ/customer/toAdd.from����
	@RequestMapping("/toAdd")
	public String toAdd(){
		return "customer/customer_add";//����customer/customer_add.jsp
	}
	//��Ӧ/customer/add.from,���������װ��CustomerInfo�����룬jsp����name����Ҫ��CustomerInfo����һ��
	@RequestMapping("/addCustomer")
	public String addCustomer(CustomerInfo customer){
		dao.saveCustomer(customer);
		return "redirect:/customer/customer_list.from";
		
	}

}
