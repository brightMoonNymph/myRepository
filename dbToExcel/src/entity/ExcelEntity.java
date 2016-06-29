package entity;

public class ExcelEntity {
	private String customer_name;
	private String mobile_phone;
	private String EXTEND5;
	private String extend1;
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	public String getEXTEND5() {
		return EXTEND5;
	}
	public void setEXTEND5(String eXTEND5) {
		EXTEND5 = eXTEND5;
	}
	public String getExtend1() {
		return extend1;
	}
	public void setExtend1(String extend1) {
		this.extend1 = extend1;
	}
	@Override
	public String toString() {
		return "ExcelEntity [customer_name=" + customer_name + ", mobile_phone=" + mobile_phone + ", EXTEND5=" + EXTEND5
				+ ", extend1=" + extend1 + "]";
	}
	
	
}
