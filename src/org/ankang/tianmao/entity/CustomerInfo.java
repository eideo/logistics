package org.ankang.tianmao.entity;
//ʵ�ָýӿ�--���л���������д���ļ�
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class CustomerInfo implements Serializable {
	private Integer customer_id;//�ͻ���Ϣ��id
	private String  customer_name;//�ͻ�����
	private String identity_no;//���֤����
	private String job_add;//������λ
	private String tel;//��������
	private String cellphone;//�ƶ��绰
	private String adds;//��ϵ��ַ
	private Integer post;//�ʱ�
	private String mail;//��������
	//������ѯ����orderInfo
	private List<OrderInfo> orderInfos;
	

	public List<OrderInfo> getOrderInfos() {
		return orderInfos;
	}
	public void setOrderInfos(List<OrderInfo> orderInfos) {
		this.orderInfos = orderInfos;
	}
	
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getIdentity_no() {
		return identity_no;
	}
	public void setIdentity_no(String identity_no) {
		this.identity_no = identity_no;
	}
	public String getJob_add() {
		return job_add;
	}
	public void setJob_add(String job_add) {
		this.job_add = job_add;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getAdds() {
		return adds;
	}
	public void setAdds(String adds) {
		this.adds = adds;
	}
	public Integer getPost() {
		return post;
	}
	public void setPost(Integer post) {
		this.post = post;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	

}
