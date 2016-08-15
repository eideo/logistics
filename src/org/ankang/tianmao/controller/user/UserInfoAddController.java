package org.ankang.tianmao.controller.user;

import javax.annotation.Resource;

import org.ankang.tianmao.dao.UserInfoMapperDao;
import org.ankang.tianmao.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserInfoAddController {
	@Resource
	private UserInfoMapperDao dao;
	public void setDao(UserInfoMapperDao dao) {
		this.dao = dao;
	}

	//��Ӧ/user/toAdd.from����
	@RequestMapping("/toAdd")
	public String toAdd(){
		return "user/user_add";//����user/user_add.jsp
	}
	//��Ӧ/user/add.from,���������װ��UserInfo�����룬jsp����name����Ҫ��UserInfo����һ��
	@RequestMapping("/addUser")
	public String addUser(UserInfo user){
		dao.saveUser(user);
		return "redirect:/user/user_list.from";
		
	}

}
