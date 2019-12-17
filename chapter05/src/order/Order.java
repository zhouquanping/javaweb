package order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private String id; // 订单编号
	private String ordername;//订单名称
	private String gongying;//供应商
	private String goodsid;//商品编号
	private String goodsname;//商品名称
	private int number;//采购数量
	private double price;//采购单价
	private double money; // 订单总价
	private String date;//应交日期
	private int paystate; // 订单状态

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public String getGongying() {
		return gongying;
	}
	public void setGongying(String gongying) {
		this.gongying = gongying;
	}

	public String getGoodsid() {
		return goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public void setNumber(int number)
	{
		this.number=number;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getPaystate() {
		return paystate;
	}

	public void setPaystate(int paystate) {
		this.paystate = paystate;
	}

	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	

}
