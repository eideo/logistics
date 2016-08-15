package org.ankang.tianmao.controller.login;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ankang.tianmao.dao.UserInfoMapperDao;
import org.ankang.tianmao.entity.UserInfo;

@Controller
@RequestMapping("/login")
public class CheckLoginController {
	@Resource
	private UserInfoMapperDao dao;
	public void setDao(UserInfoMapperDao dao) {
		this.dao = dao;
	}
	@RequestMapping("/login")
	public String login(
		UserInfo user,Model model,
		HttpSession session){
		//�����֤��
		String scode = (String) 
			session.getAttribute("scode");
		System.out.println("�û�����:"+user.getCode());
		System.out.println("Session:"+scode);
		//�����ִ�Сд
		if(!user.getCode().toUpperCase().equals(scode.toUpperCase())){
			//��֤�����
			model.addAttribute("code_error", "��֤�����");
			return "login";
		}
		//����˺ź�����
		UserInfo info = 
			dao.findByUsernameAndPwd(user);
		if(info != null){//�м�¼ֱ�������ݿ��в�ѯ
			session.setAttribute(
				"user", info.getUser_name());
			return "index";//����index.jsp
		}else{//�޼�¼,����
			model.addAttribute(
				"error", "�û��������벻��ȷ");
			return "login";//����login.jsp
		}
	}
}


