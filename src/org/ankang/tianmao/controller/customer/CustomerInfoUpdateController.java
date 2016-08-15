package org.ankang.tianmao.controller.customer;

import javax.annotation.Resource;

import org.ankang.tianmao.dao.CustomerInfoMapperDao;
import org.ankang.tianmao.entity.CustomerInfo;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customer")
public class CustomerInfoUpdateController{
	@Resource
	private CustomerInfoMapperDao dao;
	public void setDao(CustomerInfoMapperDao dao) {
		this.dao = dao;
	}
	@RequestMapping("/toUpdate")
	public String toUpdate(@RequestParam(value="customer_id",required=false) Integer id,Model model){
		//����customer_id��ѯ���ö���
		
		CustomerInfo customer = dao.findByCustomerId(id);
		model.addAttribute("customer", customer);//����ģ���У�����ҳ�����key
		return "customer/customer_modi";
	}
	@RequestMapping("/updateCustomer")
	public String updateCustomerInfo(CustomerInfo customer){
		//��ȡ���¼�¼
		dao.updateCustomerInfo(customer);
		return "redirect:/customer/customer_list.from";
		
	}

}
