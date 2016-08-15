package org.ankang.tianmao.entity;

import java.io.Serializable;
import java.sql.Date;

//�����˻���
public class OrderInfo implements Serializable{
	private Integer order_id;//�������˻�������Ϣ��id
	private String order_type;//��������
	private String order_status;//����״̬
	private Integer product_id;//��Ʒid
	private Integer product_account;//��Ʒ����
	private Double pay_money;//�ܶ�
	private Integer customer_id;//�ͻ�id
	private Date start_date;//��ʼ����
	private Date deadline;//Ҫ���������
	private String return_reason;//�˻�ԭ��
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	
	public String getOrder_type() {
		return order_type;
	}
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public Integer getProduct_account() {
		return product_account;
	}
	public void setProduct_account(Integer product_account) {
		this.product_account = product_account;
	}
	public Double getPay_money() {
		return pay_money;
	}
	public void setPay_money(Double pay_money) {
		this.pay_money = pay_money;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public String getReturn_reason() {
		return return_reason;
	}
	public void setReturn_reason(String return_reason) {
		this.return_reason = return_reason;
	}
	

}
