package org.ankang.tianmao.entity;

public class Page {
	//��ʾ�ڼ�ҳ����,Ĭ�ϵ�һҳ
	private Integer page=1;
	//һҳ��ʾ����,Ĭ��5��
	private Integer pageSize = 3;
	//���ҳ��
	private Integer totalPage=1;
	
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	//����page��pageSize����begin���
	public Integer getBegin(){
		return (page-1)*pageSize;
	}
	//����page��pageSize����end������
	public Integer getEnd(){
		return page*pageSize+1;
	}
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
