package org.ankang.tianmao.controller.user;

import javax.annotation.Resource;

import org.ankang.tianmao.dao.UserInfoMapperDao;
import org.ankang.tianmao.entity.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserInfoUpdateController {
	@Resource
	private UserInfoMapperDao dao;
	public void setDao(UserInfoMapperDao dao) {
		this.dao = dao;
	}
	@RequestMapping("/toUpdate")
	public String toUpdate(@RequestParam(value="user_id",required=false) Integer id,Model model){
		//����user_id��ѯ���ö���
		UserInfo user = dao.findByUserId(id);
		model.addAttribute("user", user);//����ģ���У�����ҳ�����key
		return "user/user_modi";
	}
	@RequestMapping("/updateUser")
	public String updateUserInfo(UserInfo user){
		//��ȡ���¼�¼
		dao.updateUserInfo(user);
		return "redirect:/user/user_list.from";
		
	}
	

}
