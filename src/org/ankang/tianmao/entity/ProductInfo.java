package org.ankang.tianmao.entity;

import java.io.Serializable;
//��Ʒ��Ϣ
public class ProductInfo implements Serializable {

	private Integer product_id;//��Ʒid
	private String  product_name;
	private String unit;//������λ
	private Double price;//��Ʒ����
	private Double cost;//��Ʒ�ɱ���
	private String provider;//����
	private String can_return;//�ɷ��˻�
	private String can_change;//�ɷ񻻻�
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getCan_return() {
		return can_return;
	}
	public void setCan_return(String can_return) {
		this.can_return = can_return;
	}
	public String getCan_change() {
		return can_change;
	}
	public void setCan_change(String can_change) {
		this.can_change = can_change;
	}
	
}
