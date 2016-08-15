package org.ankang.tianmao.dao;

import java.util.List;

import org.ankang.tianmao.entity.Page;
import org.ankang.tianmao.entity.UserInfo;
import org.ankang.tianmao.util.MyBatisDao;

@MyBatisDao
public interface UserInfoMapperDao {
	public UserInfo findByUsernameAndPwd(UserInfo user);//���û����û�����Ӧ�ķ���
	public List<UserInfo> findAll();//���������û�
	public void deleteUser(int id);//ɾ���û�
	public void saveUser(UserInfo user);//�½��û��������û�
	public UserInfo findByUserName(String user_name);//�����û���
	public UserInfo findByUserId(Integer id);//�����û�id
	public void updateUserInfo(UserInfo user);//�����û���Ϣ
	//��ҳ����
	public  List<UserInfo> findPage(Page page);//��ҳ����
	public int findRows();
 
}
