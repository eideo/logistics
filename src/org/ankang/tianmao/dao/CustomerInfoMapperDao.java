package org.ankang.tianmao.dao;

import java.util.List;

import org.ankang.tianmao.entity.CustomerInfo;
import org.ankang.tianmao.entity.Page;
import org.ankang.tianmao.util.MyBatisDao;

//xml�ļ��еķ�����Ȼ����Controller�е��ø÷���
@MyBatisDao
public interface CustomerInfoMapperDao {
	public List<CustomerInfo> findAll();
	public void deleteCustomer(int id);
	public void saveCustomer(CustomerInfo customer);
	public CustomerInfo findByCustomerName(String customer_name);
	public CustomerInfo findByCustomerId(int id);
	public List<CustomerInfo> findByCuId(int id);//����cuid��ѯ�ͻ��Ķ�����Ϣ
	public void updateCustomerInfo(CustomerInfo customer);
	//��ҳ����
	public  List<CustomerInfo> findPage(Page page);
	public int findRows();

}
