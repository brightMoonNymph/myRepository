package entity;

import java.sql.Timestamp;

public class Tcustomer {
	//此属性为t_sub_userinfo表字段，与t_customer表通过外键SUB_ACCOUNT_ID关联
	private String staff_name;
	private int SEED;
	private String SUB_ACCOUNT_ID;
	private String CUSTOMER_NAME;
	private String CUSTOMER_ALIAS;
	private String customer_no;
	private String member_no;
	private String member_name;
	private String member_password;
	private int PARENT_CUSTOMER_SEED;
	private String PARENT_CUSTOMER_NAME;
	private String invoice_address;
	private int CUSTOMER_TYPE;
	//别克结果	1:00000操作成功;2:00001操作失败;3:00002卡号已核销;4:00003卡号不存在;5:00007鉴权失败;
	//6:99998请求超时;7:99999其他错误;定义成string型。
	private String INDUSTRY_KIND;
	private int CREDIT_LEVEL;
	private int STAFF_SCOPE;
	private int HOT_KIND;
	private int RELATION_LEVEL;
	private int VALUE_EVALUATE;
	private int CUSTOMER_SOURCE;
	private int KIND;
	//微信结果	1:00000操作成功;2:00001参数不全;3:00002鉴权失败;4:00003卡券已领;5:00004业务错误;6:00005无效卡券;
	//7:99998内部错误;8:99999其他错误，因此此处要定义成string型，依据数据库字段来设值
	private String CUSTOMER_PHASE;
	private int COUNTRY;
	private String PROVINCE;
	private String CITY;
	private String ADDRESS;
	private String ZIPCODE;
	private String COMM_PHONE;
	private String COMM_FAX;
	private String COMM_EMAIL;
	private String WEBURL;
	private String REMARK;
	private String REVENUE_INFO;
	private String FILES;
	private String DELETE_FLAG;
	private String UPDATE_MAN;
	private Timestamp CREATE_DATE;
	private Timestamp UPDATE_DATE;
	private int GENDER;
	private String MOBILE_PHONE;
	private String QQ;
	private String MSN;
	private String SKYPE;
	private String BLOG;
	private String HOME_PHONE;
	private String HOME_ADDRESS;
	private String COMPANY;
	private String DEPARTMENT;
	private String POSITION;
	private String PRESIDE_WORK;
	private Timestamp BIRTHDAY;
	private String C_BANK_NAME;
	private String C_BANK_ACCOUNT;
	private String C_TAX_ACCOUNT;
	private String CONTACT_NAME;
	private String CONTACT_PHONE;
	private String SHARE_SEEDS;
	private String CUSTOMER_LEVEL;
	private String invoice_name;
	//卡卷类型
	private String EXTEND1;
	private String EXTEND2;
	private String EXTEND3;
	private String EXTEND4;
	private String EXTEND5;
	private String EXTEND6;
	private String EXTEND7;
	private String EXTEND8;
	private String EXTEND9;
	private String EXTEND10;
	private String EXTEND11;
	private String EXTEND12;
	private String EXTEND13;
	private String EXTEND14;
	private String EXTEND15;
	private String EXTEND16;
	private String EXTEND17;
	private String EXTEND18;
	private String EXTEND19;
	private String EXTEND20;
	private String EXTEND21;
	private String EXTEND22;
	private String EXTEND23;
	private String EXTEND24;
	private String EXTEND25;
	private int EXTEND26;
	private int EXTEND27;
	private int EXTEND28;
	private int EXTEND29;
	private int EXTEND30;
	private int EXTEND31;
	private int EXTEND32;
	private int EXTEND33;
	private int EXTEND34;
	private int EXTEND35;
	//表中是近似数值型，float
	private int EXTEND36;
	private int EXTEND37;
	private int EXTEND38;
	private int EXTEND39;
	private int EXTEND40;
	private int EXTEND41;
	private int EXTEND42;
	private int EXTEND43;
	private int EXTEND44;
	private int EXTEND45;
	private Timestamp EXTEND46;
	private Timestamp EXTEND47;
	private Timestamp EXTEND48;
	private Timestamp EXTEND49;
	private Timestamp EXTEND50;
	private int contact_SEED;
	private Timestamp customer_follow_link_date;
	private Timestamp customer_follow_next_date;
	private String customer_follow_follow_result;
	private int customer_follow_num;
	private String create_man;
	private int IS_SHARED;
	private int expiration_days;
	private Timestamp lastest_sign_order_date;
	private String FILES1;
	private String FILES2;
	private String FILES3;
	private String FILES4;
	private String FILES5;
	private int customer_kind;
	private Timestamp OWN_DATE;
	private int customer_state;
	private int ACTIVITY_SEED;
	private String ACTIVITY_SUBJECT;
	private int CALL_PROCESS_STATE;
	private int CALL_REFUSE_TIMES;
	private Timestamp CALL_LINK_DATE;
	private String CALL_FOLLOW_RESULT;
	private int CALL_RESULT;
	private int DEPT_ID;
	//近似数值型，float
	private int CREDIT_AMOUNT;
	private int Balance;
	private int INTEGRAL;
	private int IS_MEMBER;
	private int original_source;
	private int channel_customer_seed;
	private String channel_customer_name;
	private Timestamp lock_time;
	private int introduce_customer_seed;
	private String introduce_customer_name;
	private Timestamp require_date;
	private String name_abbreviation;
	private int CUSTOMER_INTEGRAL;
	private int pay_method;
	private int transaction_kind;
	private int audit_status;
	private Timestamp BIRTHDAY_LUNAR;
	private String latest_review;
	private int ALERT_BALANCE;
	private Timestamp ALERT_BALANCE_DATE;
	private String EXTEND51;
	private String EXTEND52;
	private String EXTEND53;
	private String EXTEND54;
	private String EXTEND55;
	private String EXTEND56;
	private String EXTEND57;
	private String EXTEND58;
	private String EXTEND59;
	private String EXTEND60;
	private String EXTEND61;
	private String EXTEND62;
	private String EXTEND63;
	private String EXTEND64;
	private String EXTEND65;
	private String EXTEND66;
	private String EXTEND67;
	private String EXTEND68;
	private String EXTEND69;
	private String EXTEND70;
	private String EXTEND71;
	private String EXTEND72;
	private String EXTEND73;
	private String EXTEND74;
	private String EXTEND75;
	private String EXTEND76;
	private String EXTEND77;
	private String EXTEND78;
	private String EXTEND79;
	private String EXTEND80;
	private String LONGTITUDE; 
	private String LATITUDE;
	private String allocate_man;
	private int branch_id;
	private int public_type;
	private int audit_flag;
	private Timestamp audit_date;
	private int FEE_TYPE;
	private Timestamp DEAD_LINE;
	private int MAX_VOLUME;
	private int USED_VOLUME;
	private int ALERT_VOLUME;
	private Timestamp ALERT_VOLUME_DATE;
	private Timestamp service_end_date;
	private int update_flag;
	private int MARKET_SEGMENT_SEED;
	private String MARKET_SEGMENT_name;
	private String mobile_phone2;
	private int attention_status;
	private Timestamp REVISIT_DATE;
	private String RECEIVABLE_DEADLINE;
	private String SETTLE_DATE;
	private Timestamp CONVERT_DATE;
	private String third_system_no;
	private int third_system_seed;
	private Timestamp latest_sale_chance_date;
	private Timestamp latest_contract_date;
	private Timestamp latest_history_quoted_price_date;
	private Timestamp latest_out_storage_date;
	private Timestamp latest_pay_fact_date;
	private int shop_seed;
	private String shop_name;
	private int PAYMENT_KIND;
	private int pk_seed;
	private String pk_name;
	private Timestamp Recovery_date;
	private String logo;
	private String picture;
	private String ic_no;
	private String bank_branch;
	private String bank_user_name;
	private int ID_TYPE;
	private String revoke_remark;
	private String ASSIST_MAN;
	private int follow_cycle;
	private int follow_overdue_times;
	private Timestamp follow_overdue_date;
	private int expiration_mode;
	public int getSEED() {
		return SEED;
	}
	public void setSEED(int sEED) {
		SEED = sEED;
	}
	public String getSUB_ACCOUNT_ID() {
		return SUB_ACCOUNT_ID;
	}
	public void setSUB_ACCOUNT_ID(String sUB_ACCOUNT_ID) {
		SUB_ACCOUNT_ID = sUB_ACCOUNT_ID;
	}
	public String getCUSTOMER_NAME() {
		return CUSTOMER_NAME;
	}
	public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
		CUSTOMER_NAME = cUSTOMER_NAME;
	}
	public String getCUSTOMER_ALIAS() {
		return CUSTOMER_ALIAS;
	}
	public void setCUSTOMER_ALIAS(String cUSTOMER_ALIAS) {
		CUSTOMER_ALIAS = cUSTOMER_ALIAS;
	}
	public String getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(String customer_no) {
		this.customer_no = customer_no;
	}
	public String getMember_no() {
		return member_no;
	}
	public void setMember_no(String member_no) {
		this.member_no = member_no;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_password() {
		return member_password;
	}
	public void setMember_password(String member_password) {
		this.member_password = member_password;
	}
	public int getPARENT_CUSTOMER_SEED() {
		return PARENT_CUSTOMER_SEED;
	}
	public void setPARENT_CUSTOMER_SEED(int pARENT_CUSTOMER_SEED) {
		PARENT_CUSTOMER_SEED = pARENT_CUSTOMER_SEED;
	}
	public String getPARENT_CUSTOMER_NAME() {
		return PARENT_CUSTOMER_NAME;
	}
	public void setPARENT_CUSTOMER_NAME(String pARENT_CUSTOMER_NAME) {
		PARENT_CUSTOMER_NAME = pARENT_CUSTOMER_NAME;
	}
	public String getInvoice_address() {
		return invoice_address;
	}
	public void setInvoice_address(String invoice_address) {
		this.invoice_address = invoice_address;
	}
	public int getCUSTOMER_TYPE() {
		return CUSTOMER_TYPE;
	}
	public void setCUSTOMER_TYPE(int cUSTOMER_TYPE) {
		CUSTOMER_TYPE = cUSTOMER_TYPE;
	}
	public String getINDUSTRY_KIND() {
		return INDUSTRY_KIND;
	}
	public void setINDUSTRY_KIND(String iNDUSTRY_KIND) {
		INDUSTRY_KIND = iNDUSTRY_KIND;
	}
	public int getCREDIT_LEVEL() {
		return CREDIT_LEVEL;
	}
	public void setCREDIT_LEVEL(int cREDIT_LEVEL) {
		CREDIT_LEVEL = cREDIT_LEVEL;
	}
	public int getSTAFF_SCOPE() {
		return STAFF_SCOPE;
	}
	public void setSTAFF_SCOPE(int sTAFF_SCOPE) {
		STAFF_SCOPE = sTAFF_SCOPE;
	}
	public int getHOT_KIND() {
		return HOT_KIND;
	}
	public void setHOT_KIND(int hOT_KIND) {
		HOT_KIND = hOT_KIND;
	}
	public int getRELATION_LEVEL() {
		return RELATION_LEVEL;
	}
	public void setRELATION_LEVEL(int rELATION_LEVEL) {
		RELATION_LEVEL = rELATION_LEVEL;
	}
	public int getVALUE_EVALUATE() {
		return VALUE_EVALUATE;
	}
	public void setVALUE_EVALUATE(int vALUE_EVALUATE) {
		VALUE_EVALUATE = vALUE_EVALUATE;
	}
	public int getCUSTOMER_SOURCE() {
		return CUSTOMER_SOURCE;
	}
	public void setCUSTOMER_SOURCE(int cUSTOMER_SOURCE) {
		CUSTOMER_SOURCE = cUSTOMER_SOURCE;
	}
	public int getKIND() {
		return KIND;
	}
	public void setKIND(int kIND) {
		KIND = kIND;
	}
	public String getCUSTOMER_PHASE() {
		return CUSTOMER_PHASE;
	}
	public void setCUSTOMER_PHASE(String cUSTOMER_PHASE) {
		CUSTOMER_PHASE = cUSTOMER_PHASE;
	}
	public int getCOUNTRY() {
		return COUNTRY;
	}
	public void setCOUNTRY(int cOUNTRY) {
		COUNTRY = cOUNTRY;
	}
	public String getPROVINCE() {
		return PROVINCE;
	}
	public void setPROVINCE(String pROVINCE) {
		PROVINCE = pROVINCE;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String cITY) {
		CITY = cITY;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getZIPCODE() {
		return ZIPCODE;
	}
	public void setZIPCODE(String zIPCODE) {
		ZIPCODE = zIPCODE;
	}
	public String getCOMM_PHONE() {
		return COMM_PHONE;
	}
	public void setCOMM_PHONE(String cOMM_PHONE) {
		COMM_PHONE = cOMM_PHONE;
	}
	public String getCOMM_FAX() {
		return COMM_FAX;
	}
	public void setCOMM_FAX(String cOMM_FAX) {
		COMM_FAX = cOMM_FAX;
	}
	public String getCOMM_EMAIL() {
		return COMM_EMAIL;
	}
	public void setCOMM_EMAIL(String cOMM_EMAIL) {
		COMM_EMAIL = cOMM_EMAIL;
	}
	public String getWEBURL() {
		return WEBURL;
	}
	public void setWEBURL(String wEBURL) {
		WEBURL = wEBURL;
	}
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	public String getREVENUE_INFO() {
		return REVENUE_INFO;
	}
	public void setREVENUE_INFO(String rEVENUE_INFO) {
		REVENUE_INFO = rEVENUE_INFO;
	}
	public String getFILES() {
		return FILES;
	}
	public void setFILES(String fILES) {
		FILES = fILES;
	}
	public String getDELETE_FLAG() {
		return DELETE_FLAG;
	}
	public void setDELETE_FLAG(String dELETE_FLAG) {
		DELETE_FLAG = dELETE_FLAG;
	}
	public String getUPDATE_MAN() {
		return UPDATE_MAN;
	}
	public void setUPDATE_MAN(String uPDATE_MAN) {
		UPDATE_MAN = uPDATE_MAN;
	}
	public Timestamp getCREATE_DATE() {
		return CREATE_DATE;
	}
	public void setCREATE_DATE(Timestamp cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}
	public Timestamp getUPDATE_DATE() {
		return UPDATE_DATE;
	}
	public void setUPDATE_DATE(Timestamp uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
	}
	public int getGENDER() {
		return GENDER;
	}
	public void setGENDER(int gENDER) {
		GENDER = gENDER;
	}
	public String getMOBILE_PHONE() {
		return MOBILE_PHONE;
	}
	public void setMOBILE_PHONE(String mOBILE_PHONE) {
		MOBILE_PHONE = mOBILE_PHONE;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	public String getMSN() {
		return MSN;
	}
	public void setMSN(String mSN) {
		MSN = mSN;
	}
	public String getSKYPE() {
		return SKYPE;
	}
	public void setSKYPE(String sKYPE) {
		SKYPE = sKYPE;
	}
	public String getBLOG() {
		return BLOG;
	}
	public void setBLOG(String bLOG) {
		BLOG = bLOG;
	}
	public String getHOME_PHONE() {
		return HOME_PHONE;
	}
	public void setHOME_PHONE(String hOME_PHONE) {
		HOME_PHONE = hOME_PHONE;
	}
	public String getHOME_ADDRESS() {
		return HOME_ADDRESS;
	}
	public void setHOME_ADDRESS(String hOME_ADDRESS) {
		HOME_ADDRESS = hOME_ADDRESS;
	}
	public String getCOMPANY() {
		return COMPANY;
	}
	public void setCOMPANY(String cOMPANY) {
		COMPANY = cOMPANY;
	}
	public String getDEPARTMENT() {
		return DEPARTMENT;
	}
	public void setDEPARTMENT(String dEPARTMENT) {
		DEPARTMENT = dEPARTMENT;
	}
	public String getPOSITION() {
		return POSITION;
	}
	public void setPOSITION(String pOSITION) {
		POSITION = pOSITION;
	}
	public String getPRESIDE_WORK() {
		return PRESIDE_WORK;
	}
	public void setPRESIDE_WORK(String pRESIDE_WORK) {
		PRESIDE_WORK = pRESIDE_WORK;
	}
	public Timestamp getBIRTHDAY() {
		return BIRTHDAY;
	}
	public void setBIRTHDAY(Timestamp bIRTHDAY) {
		BIRTHDAY = bIRTHDAY;
	}
	public String getC_BANK_NAME() {
		return C_BANK_NAME;
	}
	public void setC_BANK_NAME(String c_BANK_NAME) {
		C_BANK_NAME = c_BANK_NAME;
	}
	public String getC_BANK_ACCOUNT() {
		return C_BANK_ACCOUNT;
	}
	public void setC_BANK_ACCOUNT(String c_BANK_ACCOUNT) {
		C_BANK_ACCOUNT = c_BANK_ACCOUNT;
	}
	public String getC_TAX_ACCOUNT() {
		return C_TAX_ACCOUNT;
	}
	public void setC_TAX_ACCOUNT(String c_TAX_ACCOUNT) {
		C_TAX_ACCOUNT = c_TAX_ACCOUNT;
	}
	public String getCONTACT_NAME() {
		return CONTACT_NAME;
	}
	public void setCONTACT_NAME(String cONTACT_NAME) {
		CONTACT_NAME = cONTACT_NAME;
	}
	public String getCONTACT_PHONE() {
		return CONTACT_PHONE;
	}
	public void setCONTACT_PHONE(String cONTACT_PHONE) {
		CONTACT_PHONE = cONTACT_PHONE;
	}
	public String getSHARE_SEEDS() {
		return SHARE_SEEDS;
	}
	public void setSHARE_SEEDS(String sHARE_SEEDS) {
		SHARE_SEEDS = sHARE_SEEDS;
	}
	public String getCUSTOMER_LEVEL() {
		return CUSTOMER_LEVEL;
	}
	public void setCUSTOMER_LEVEL(String cUSTOMER_LEVEL) {
		CUSTOMER_LEVEL = cUSTOMER_LEVEL;
	}
	public String getInvoice_name() {
		return invoice_name;
	}
	public void setInvoice_name(String invoice_name) {
		this.invoice_name = invoice_name;
	}
	public String getEXTEND1() {
		return EXTEND1;
	}
	public void setEXTEND1(String eXTEND1) {
		EXTEND1 = eXTEND1;
	}
	public String getEXTEND2() {
		return EXTEND2;
	}
	public void setEXTEND2(String eXTEND2) {
		EXTEND2 = eXTEND2;
	}
	public String getEXTEND3() {
		return EXTEND3;
	}
	public void setEXTEND3(String eXTEND3) {
		EXTEND3 = eXTEND3;
	}
	public String getEXTEND4() {
		return EXTEND4;
	}
	public void setEXTEND4(String eXTEND4) {
		EXTEND4 = eXTEND4;
	}
	public String getEXTEND5() {
		return EXTEND5;
	}
	public void setEXTEND5(String eXTEND5) {
		EXTEND5 = eXTEND5;
	}
	public String getEXTEND6() {
		return EXTEND6;
	}
	public void setEXTEND6(String eXTEND6) {
		EXTEND6 = eXTEND6;
	}
	public String getEXTEND7() {
		return EXTEND7;
	}
	public void setEXTEND7(String eXTEND7) {
		EXTEND7 = eXTEND7;
	}
	public String getEXTEND8() {
		return EXTEND8;
	}
	public void setEXTEND8(String eXTEND8) {
		EXTEND8 = eXTEND8;
	}
	public String getEXTEND9() {
		return EXTEND9;
	}
	public void setEXTEND9(String eXTEND9) {
		EXTEND9 = eXTEND9;
	}
	public String getEXTEND10() {
		return EXTEND10;
	}
	public void setEXTEND10(String eXTEND10) {
		EXTEND10 = eXTEND10;
	}
	public String getEXTEND11() {
		return EXTEND11;
	}
	public void setEXTEND11(String eXTEND11) {
		EXTEND11 = eXTEND11;
	}
	public String getEXTEND12() {
		return EXTEND12;
	}
	public void setEXTEND12(String eXTEND12) {
		EXTEND12 = eXTEND12;
	}
	public String getEXTEND13() {
		return EXTEND13;
	}
	public void setEXTEND13(String eXTEND13) {
		EXTEND13 = eXTEND13;
	}
	public String getEXTEND14() {
		return EXTEND14;
	}
	public void setEXTEND14(String eXTEND14) {
		EXTEND14 = eXTEND14;
	}
	public String getEXTEND15() {
		return EXTEND15;
	}
	public void setEXTEND15(String eXTEND15) {
		EXTEND15 = eXTEND15;
	}
	public String getEXTEND16() {
		return EXTEND16;
	}
	public void setEXTEND16(String eXTEND16) {
		EXTEND16 = eXTEND16;
	}
	public String getEXTEND17() {
		return EXTEND17;
	}
	public void setEXTEND17(String eXTEND17) {
		EXTEND17 = eXTEND17;
	}
	public String getEXTEND18() {
		return EXTEND18;
	}
	public void setEXTEND18(String eXTEND18) {
		EXTEND18 = eXTEND18;
	}
	public String getEXTEND19() {
		return EXTEND19;
	}
	public void setEXTEND19(String eXTEND19) {
		EXTEND19 = eXTEND19;
	}
	public String getEXTEND20() {
		return EXTEND20;
	}
	public void setEXTEND20(String eXTEND20) {
		EXTEND20 = eXTEND20;
	}
	public String getEXTEND21() {
		return EXTEND21;
	}
	public void setEXTEND21(String eXTEND21) {
		EXTEND21 = eXTEND21;
	}
	public String getEXTEND22() {
		return EXTEND22;
	}
	public void setEXTEND22(String eXTEND22) {
		EXTEND22 = eXTEND22;
	}
	public String getEXTEND23() {
		return EXTEND23;
	}
	public void setEXTEND23(String eXTEND23) {
		EXTEND23 = eXTEND23;
	}
	public String getEXTEND24() {
		return EXTEND24;
	}
	public void setEXTEND24(String eXTEND24) {
		EXTEND24 = eXTEND24;
	}
	public String getEXTEND25() {
		return EXTEND25;
	}
	public void setEXTEND25(String eXTEND25) {
		EXTEND25 = eXTEND25;
	}
	public int getEXTEND26() {
		return EXTEND26;
	}
	public void setEXTEND26(int eXTEND26) {
		EXTEND26 = eXTEND26;
	}
	public int getEXTEND27() {
		return EXTEND27;
	}
	public void setEXTEND27(int eXTEND27) {
		EXTEND27 = eXTEND27;
	}
	public int getEXTEND28() {
		return EXTEND28;
	}
	public void setEXTEND28(int eXTEND28) {
		EXTEND28 = eXTEND28;
	}
	public int getEXTEND29() {
		return EXTEND29;
	}
	public void setEXTEND29(int eXTEND29) {
		EXTEND29 = eXTEND29;
	}
	public int getEXTEND30() {
		return EXTEND30;
	}
	public void setEXTEND30(int eXTEND30) {
		EXTEND30 = eXTEND30;
	}
	public int getEXTEND31() {
		return EXTEND31;
	}
	public void setEXTEND31(int eXTEND31) {
		EXTEND31 = eXTEND31;
	}
	public int getEXTEND32() {
		return EXTEND32;
	}
	public void setEXTEND32(int eXTEND32) {
		EXTEND32 = eXTEND32;
	}
	public int getEXTEND33() {
		return EXTEND33;
	}
	public void setEXTEND33(int eXTEND33) {
		EXTEND33 = eXTEND33;
	}
	public int getEXTEND34() {
		return EXTEND34;
	}
	public void setEXTEND34(int eXTEND34) {
		EXTEND34 = eXTEND34;
	}
	public int getEXTEND35() {
		return EXTEND35;
	}
	public void setEXTEND35(int eXTEND35) {
		EXTEND35 = eXTEND35;
	}
	public int getEXTEND36() {
		return EXTEND36;
	}
	public void setEXTEND36(int eXTEND36) {
		EXTEND36 = eXTEND36;
	}
	public int getEXTEND37() {
		return EXTEND37;
	}
	public void setEXTEND37(int eXTEND37) {
		EXTEND37 = eXTEND37;
	}
	public int getEXTEND38() {
		return EXTEND38;
	}
	public void setEXTEND38(int eXTEND38) {
		EXTEND38 = eXTEND38;
	}
	public int getEXTEND39() {
		return EXTEND39;
	}
	public void setEXTEND39(int eXTEND39) {
		EXTEND39 = eXTEND39;
	}
	public int getEXTEND40() {
		return EXTEND40;
	}
	public void setEXTEND40(int eXTEND40) {
		EXTEND40 = eXTEND40;
	}
	public int getEXTEND41() {
		return EXTEND41;
	}
	public void setEXTEND41(int eXTEND41) {
		EXTEND41 = eXTEND41;
	}
	public int getEXTEND42() {
		return EXTEND42;
	}
	public void setEXTEND42(int eXTEND42) {
		EXTEND42 = eXTEND42;
	}
	public int getEXTEND43() {
		return EXTEND43;
	}
	public void setEXTEND43(int eXTEND43) {
		EXTEND43 = eXTEND43;
	}
	public int getEXTEND44() {
		return EXTEND44;
	}
	public void setEXTEND44(int eXTEND44) {
		EXTEND44 = eXTEND44;
	}
	public int getEXTEND45() {
		return EXTEND45;
	}
	public void setEXTEND45(int eXTEND45) {
		EXTEND45 = eXTEND45;
	}
	public Timestamp getEXTEND46() {
		return EXTEND46;
	}
	public void setEXTEND46(Timestamp eXTEND46) {
		EXTEND46 = eXTEND46;
	}
	public Timestamp getEXTEND47() {
		return EXTEND47;
	}
	public void setEXTEND47(Timestamp eXTEND47) {
		EXTEND47 = eXTEND47;
	}
	public Timestamp getEXTEND48() {
		return EXTEND48;
	}
	public void setEXTEND48(Timestamp eXTEND48) {
		EXTEND48 = eXTEND48;
	}
	public Timestamp getEXTEND49() {
		return EXTEND49;
	}
	public void setEXTEND49(Timestamp eXTEND49) {
		EXTEND49 = eXTEND49;
	}
	public Timestamp getEXTEND50() {
		return EXTEND50;
	}
	public void setEXTEND50(Timestamp eXTEND50) {
		EXTEND50 = eXTEND50;
	}
	public int getContact_SEED() {
		return contact_SEED;
	}
	public void setContact_SEED(int contact_SEED) {
		this.contact_SEED = contact_SEED;
	}
	public Timestamp getCustomer_follow_link_date() {
		return customer_follow_link_date;
	}
	public void setCustomer_follow_link_date(Timestamp customer_follow_link_date) {
		this.customer_follow_link_date = customer_follow_link_date;
	}
	public Timestamp getCustomer_follow_next_date() {
		return customer_follow_next_date;
	}
	public void setCustomer_follow_next_date(Timestamp customer_follow_next_date) {
		this.customer_follow_next_date = customer_follow_next_date;
	}
	public String getCustomer_follow_follow_result() {
		return customer_follow_follow_result;
	}
	public void setCustomer_follow_follow_result(String customer_follow_follow_result) {
		this.customer_follow_follow_result = customer_follow_follow_result;
	}
	public int getCustomer_follow_num() {
		return customer_follow_num;
	}
	public void setCustomer_follow_num(int customer_follow_num) {
		this.customer_follow_num = customer_follow_num;
	}
	public String getCreate_man() {
		return create_man;
	}
	public void setCreate_man(String create_man) {
		this.create_man = create_man;
	}
	public int getIS_SHARED() {
		return IS_SHARED;
	}
	public void setIS_SHARED(int iS_SHARED) {
		IS_SHARED = iS_SHARED;
	}
	public int getExpiration_days() {
		return expiration_days;
	}
	public void setExpiration_days(int expiration_days) {
		this.expiration_days = expiration_days;
	}
	public Timestamp getLastest_sign_order_date() {
		return lastest_sign_order_date;
	}
	public void setLastest_sign_order_date(Timestamp lastest_sign_order_date) {
		this.lastest_sign_order_date = lastest_sign_order_date;
	}
	public String getFILES1() {
		return FILES1;
	}
	public void setFILES1(String fILES1) {
		FILES1 = fILES1;
	}
	public String getFILES2() {
		return FILES2;
	}
	public void setFILES2(String fILES2) {
		FILES2 = fILES2;
	}
	public String getFILES3() {
		return FILES3;
	}
	public void setFILES3(String fILES3) {
		FILES3 = fILES3;
	}
	public String getFILES4() {
		return FILES4;
	}
	public void setFILES4(String fILES4) {
		FILES4 = fILES4;
	}
	public String getFILES5() {
		return FILES5;
	}
	public void setFILES5(String fILES5) {
		FILES5 = fILES5;
	}
	public int getCustomer_kind() {
		return customer_kind;
	}
	public void setCustomer_kind(int customer_kind) {
		this.customer_kind = customer_kind;
	}
	public Timestamp getOWN_DATE() {
		return OWN_DATE;
	}
	public void setOWN_DATE(Timestamp oWN_DATE) {
		OWN_DATE = oWN_DATE;
	}
	public int getCustomer_state() {
		return customer_state;
	}
	public void setCustomer_state(int customer_state) {
		this.customer_state = customer_state;
	}
	public int getACTIVITY_SEED() {
		return ACTIVITY_SEED;
	}
	public void setACTIVITY_SEED(int aCTIVITY_SEED) {
		ACTIVITY_SEED = aCTIVITY_SEED;
	}
	public String getACTIVITY_SUBJECT() {
		return ACTIVITY_SUBJECT;
	}
	public void setACTIVITY_SUBJECT(String aCTIVITY_SUBJECT) {
		ACTIVITY_SUBJECT = aCTIVITY_SUBJECT;
	}
	public int getCALL_PROCESS_STATE() {
		return CALL_PROCESS_STATE;
	}
	public void setCALL_PROCESS_STATE(int cALL_PROCESS_STATE) {
		CALL_PROCESS_STATE = cALL_PROCESS_STATE;
	}
	public int getCALL_REFUSE_TIMES() {
		return CALL_REFUSE_TIMES;
	}
	public void setCALL_REFUSE_TIMES(int cALL_REFUSE_TIMES) {
		CALL_REFUSE_TIMES = cALL_REFUSE_TIMES;
	}
	public Timestamp getCALL_LINK_DATE() {
		return CALL_LINK_DATE;
	}
	public void setCALL_LINK_DATE(Timestamp cALL_LINK_DATE) {
		CALL_LINK_DATE = cALL_LINK_DATE;
	}
	public String getCALL_FOLLOW_RESULT() {
		return CALL_FOLLOW_RESULT;
	}
	public void setCALL_FOLLOW_RESULT(String cALL_FOLLOW_RESULT) {
		CALL_FOLLOW_RESULT = cALL_FOLLOW_RESULT;
	}
	public int getCALL_RESULT() {
		return CALL_RESULT;
	}
	public void setCALL_RESULT(int cALL_RESULT) {
		CALL_RESULT = cALL_RESULT;
	}
	public int getDEPT_ID() {
		return DEPT_ID;
	}
	public void setDEPT_ID(int dEPT_ID) {
		DEPT_ID = dEPT_ID;
	}
	public int getCREDIT_AMOUNT() {
		return CREDIT_AMOUNT;
	}
	public void setCREDIT_AMOUNT(int cREDIT_AMOUNT) {
		CREDIT_AMOUNT = cREDIT_AMOUNT;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public int getINTEGRAL() {
		return INTEGRAL;
	}
	public void setINTEGRAL(int iNTEGRAL) {
		INTEGRAL = iNTEGRAL;
	}
	public int getIS_MEMBER() {
		return IS_MEMBER;
	}
	public void setIS_MEMBER(int iS_MEMBER) {
		IS_MEMBER = iS_MEMBER;
	}
	public int getOriginal_source() {
		return original_source;
	}
	public void setOriginal_source(int original_source) {
		this.original_source = original_source;
	}
	public int getChannel_customer_seed() {
		return channel_customer_seed;
	}
	public void setChannel_customer_seed(int channel_customer_seed) {
		this.channel_customer_seed = channel_customer_seed;
	}
	public String getChannel_customer_name() {
		return channel_customer_name;
	}
	public void setChannel_customer_name(String channel_customer_name) {
		this.channel_customer_name = channel_customer_name;
	}
	public Timestamp getLock_time() {
		return lock_time;
	}
	public void setLock_time(Timestamp lock_time) {
		this.lock_time = lock_time;
	}
	public int getIntroduce_customer_seed() {
		return introduce_customer_seed;
	}
	public void setIntroduce_customer_seed(int introduce_customer_seed) {
		this.introduce_customer_seed = introduce_customer_seed;
	}
	public String getIntroduce_customer_name() {
		return introduce_customer_name;
	}
	public void setIntroduce_customer_name(String introduce_customer_name) {
		this.introduce_customer_name = introduce_customer_name;
	}
	public Timestamp getRequire_date() {
		return require_date;
	}
	public void setRequire_date(Timestamp require_date) {
		this.require_date = require_date;
	}
	public String getName_abbreviation() {
		return name_abbreviation;
	}
	public void setName_abbreviation(String name_abbreviation) {
		this.name_abbreviation = name_abbreviation;
	}
	public int getCUSTOMER_INTEGRAL() {
		return CUSTOMER_INTEGRAL;
	}
	public void setCUSTOMER_INTEGRAL(int cUSTOMER_INTEGRAL) {
		CUSTOMER_INTEGRAL = cUSTOMER_INTEGRAL;
	}
	public int getPay_method() {
		return pay_method;
	}
	public void setPay_method(int pay_method) {
		this.pay_method = pay_method;
	}
	public int getTransaction_kind() {
		return transaction_kind;
	}
	public void setTransaction_kind(int transaction_kind) {
		this.transaction_kind = transaction_kind;
	}
	public int getAudit_status() {
		return audit_status;
	}
	public void setAudit_status(int audit_status) {
		this.audit_status = audit_status;
	}
	public Timestamp getBIRTHDAY_LUNAR() {
		return BIRTHDAY_LUNAR;
	}
	public void setBIRTHDAY_LUNAR(Timestamp bIRTHDAY_LUNAR) {
		BIRTHDAY_LUNAR = bIRTHDAY_LUNAR;
	}
	public String getLatest_review() {
		return latest_review;
	}
	public void setLatest_review(String latest_review) {
		this.latest_review = latest_review;
	}
	public int getALERT_BALANCE() {
		return ALERT_BALANCE;
	}
	public void setALERT_BALANCE(int aLERT_BALANCE) {
		ALERT_BALANCE = aLERT_BALANCE;
	}
	public Timestamp getALERT_BALANCE_DATE() {
		return ALERT_BALANCE_DATE;
	}
	public void setALERT_BALANCE_DATE(Timestamp aLERT_BALANCE_DATE) {
		ALERT_BALANCE_DATE = aLERT_BALANCE_DATE;
	}
	public String getEXTEND51() {
		return EXTEND51;
	}
	public void setEXTEND51(String eXTEND51) {
		EXTEND51 = eXTEND51;
	}
	public String getEXTEND52() {
		return EXTEND52;
	}
	public void setEXTEND52(String eXTEND52) {
		EXTEND52 = eXTEND52;
	}
	public String getEXTEND53() {
		return EXTEND53;
	}
	public void setEXTEND53(String eXTEND53) {
		EXTEND53 = eXTEND53;
	}
	public String getEXTEND54() {
		return EXTEND54;
	}
	public void setEXTEND54(String eXTEND54) {
		EXTEND54 = eXTEND54;
	}
	public String getEXTEND55() {
		return EXTEND55;
	}
	public void setEXTEND55(String eXTEND55) {
		EXTEND55 = eXTEND55;
	}
	public String getEXTEND56() {
		return EXTEND56;
	}
	public void setEXTEND56(String eXTEND56) {
		EXTEND56 = eXTEND56;
	}
	public String getEXTEND57() {
		return EXTEND57;
	}
	public void setEXTEND57(String eXTEND57) {
		EXTEND57 = eXTEND57;
	}
	public String getEXTEND58() {
		return EXTEND58;
	}
	public void setEXTEND58(String eXTEND58) {
		EXTEND58 = eXTEND58;
	}
	public String getEXTEND59() {
		return EXTEND59;
	}
	public void setEXTEND59(String eXTEND59) {
		EXTEND59 = eXTEND59;
	}
	public String getEXTEND60() {
		return EXTEND60;
	}
	public void setEXTEND60(String eXTEND60) {
		EXTEND60 = eXTEND60;
	}
	public String getEXTEND61() {
		return EXTEND61;
	}
	public void setEXTEND61(String eXTEND61) {
		EXTEND61 = eXTEND61;
	}
	public String getEXTEND62() {
		return EXTEND62;
	}
	public void setEXTEND62(String eXTEND62) {
		EXTEND62 = eXTEND62;
	}
	public String getEXTEND63() {
		return EXTEND63;
	}
	public void setEXTEND63(String eXTEND63) {
		EXTEND63 = eXTEND63;
	}
	public String getEXTEND64() {
		return EXTEND64;
	}
	public void setEXTEND64(String eXTEND64) {
		EXTEND64 = eXTEND64;
	}
	public String getEXTEND65() {
		return EXTEND65;
	}
	public void setEXTEND65(String eXTEND65) {
		EXTEND65 = eXTEND65;
	}
	public String getEXTEND66() {
		return EXTEND66;
	}
	public void setEXTEND66(String eXTEND66) {
		EXTEND66 = eXTEND66;
	}
	public String getEXTEND67() {
		return EXTEND67;
	}
	public void setEXTEND67(String eXTEND67) {
		EXTEND67 = eXTEND67;
	}
	public String getEXTEND68() {
		return EXTEND68;
	}
	public void setEXTEND68(String eXTEND68) {
		EXTEND68 = eXTEND68;
	}
	public String getEXTEND69() {
		return EXTEND69;
	}
	public void setEXTEND69(String eXTEND69) {
		EXTEND69 = eXTEND69;
	}
	public String getEXTEND70() {
		return EXTEND70;
	}
	public void setEXTEND70(String eXTEND70) {
		EXTEND70 = eXTEND70;
	}
	public String getEXTEND71() {
		return EXTEND71;
	}
	public void setEXTEND71(String eXTEND71) {
		EXTEND71 = eXTEND71;
	}
	public String getEXTEND72() {
		return EXTEND72;
	}
	public void setEXTEND72(String eXTEND72) {
		EXTEND72 = eXTEND72;
	}
	public String getEXTEND73() {
		return EXTEND73;
	}
	public void setEXTEND73(String eXTEND73) {
		EXTEND73 = eXTEND73;
	}
	public String getEXTEND74() {
		return EXTEND74;
	}
	public void setEXTEND74(String eXTEND74) {
		EXTEND74 = eXTEND74;
	}
	public String getEXTEND75() {
		return EXTEND75;
	}
	public void setEXTEND75(String eXTEND75) {
		EXTEND75 = eXTEND75;
	}
	public String getEXTEND76() {
		return EXTEND76;
	}
	public void setEXTEND76(String eXTEND76) {
		EXTEND76 = eXTEND76;
	}
	public String getEXTEND77() {
		return EXTEND77;
	}
	public void setEXTEND77(String eXTEND77) {
		EXTEND77 = eXTEND77;
	}
	public String getEXTEND78() {
		return EXTEND78;
	}
	public void setEXTEND78(String eXTEND78) {
		EXTEND78 = eXTEND78;
	}
	public String getEXTEND79() {
		return EXTEND79;
	}
	public void setEXTEND79(String eXTEND79) {
		EXTEND79 = eXTEND79;
	}
	public String getEXTEND80() {
		return EXTEND80;
	}
	public void setEXTEND80(String eXTEND80) {
		EXTEND80 = eXTEND80;
	}
	public String getLONGTITUDE() {
		return LONGTITUDE;
	}
	public void setLONGTITUDE(String lONGTITUDE) {
		LONGTITUDE = lONGTITUDE;
	}
	public String getLATITUDE() {
		return LATITUDE;
	}
	public void setLATITUDE(String lATITUDE) {
		LATITUDE = lATITUDE;
	}
	public String getAllocate_man() {
		return allocate_man;
	}
	public void setAllocate_man(String allocate_man) {
		this.allocate_man = allocate_man;
	}
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public int getPublic_type() {
		return public_type;
	}
	public void setPublic_type(int public_type) {
		this.public_type = public_type;
	}
	public int getAudit_flag() {
		return audit_flag;
	}
	public void setAudit_flag(int audit_flag) {
		this.audit_flag = audit_flag;
	}
	public Timestamp getAudit_date() {
		return audit_date;
	}
	public void setAudit_date(Timestamp audit_date) {
		this.audit_date = audit_date;
	}
	public int getFEE_TYPE() {
		return FEE_TYPE;
	}
	public void setFEE_TYPE(int fEE_TYPE) {
		FEE_TYPE = fEE_TYPE;
	}
	public Timestamp getDEAD_LINE() {
		return DEAD_LINE;
	}
	public void setDEAD_LINE(Timestamp dEAD_LINE) {
		DEAD_LINE = dEAD_LINE;
	}
	public int getMAX_VOLUME() {
		return MAX_VOLUME;
	}
	public void setMAX_VOLUME(int mAX_VOLUME) {
		MAX_VOLUME = mAX_VOLUME;
	}
	public int getUSED_VOLUME() {
		return USED_VOLUME;
	}
	public void setUSED_VOLUME(int uSED_VOLUME) {
		USED_VOLUME = uSED_VOLUME;
	}
	public int getALERT_VOLUME() {
		return ALERT_VOLUME;
	}
	public void setALERT_VOLUME(int aLERT_VOLUME) {
		ALERT_VOLUME = aLERT_VOLUME;
	}
	public Timestamp getALERT_VOLUME_DATE() {
		return ALERT_VOLUME_DATE;
	}
	public void setALERT_VOLUME_DATE(Timestamp aLERT_VOLUME_DATE) {
		ALERT_VOLUME_DATE = aLERT_VOLUME_DATE;
	}
	public Timestamp getService_end_date() {
		return service_end_date;
	}
	public void setService_end_date(Timestamp service_end_date) {
		this.service_end_date = service_end_date;
	}
	public int getUpdate_flag() {
		return update_flag;
	}
	public void setUpdate_flag(int update_flag) {
		this.update_flag = update_flag;
	}
	public int getMARKET_SEGMENT_SEED() {
		return MARKET_SEGMENT_SEED;
	}
	public void setMARKET_SEGMENT_SEED(int mARKET_SEGMENT_SEED) {
		MARKET_SEGMENT_SEED = mARKET_SEGMENT_SEED;
	}
	public String getMARKET_SEGMENT_name() {
		return MARKET_SEGMENT_name;
	}
	public void setMARKET_SEGMENT_name(String mARKET_SEGMENT_name) {
		MARKET_SEGMENT_name = mARKET_SEGMENT_name;
	}
	public String getMobile_phone2() {
		return mobile_phone2;
	}
	public void setMobile_phone2(String mobile_phone2) {
		this.mobile_phone2 = mobile_phone2;
	}
	public int getAttention_status() {
		return attention_status;
	}
	public void setAttention_status(int attention_status) {
		this.attention_status = attention_status;
	}
	public Timestamp getREVISIT_DATE() {
		return REVISIT_DATE;
	}
	public void setREVISIT_DATE(Timestamp rEVISIT_DATE) {
		REVISIT_DATE = rEVISIT_DATE;
	}
	public String getRECEIVABLE_DEADLINE() {
		return RECEIVABLE_DEADLINE;
	}
	public void setRECEIVABLE_DEADLINE(String rECEIVABLE_DEADLINE) {
		RECEIVABLE_DEADLINE = rECEIVABLE_DEADLINE;
	}
	public String getSETTLE_DATE() {
		return SETTLE_DATE;
	}
	public void setSETTLE_DATE(String sETTLE_DATE) {
		SETTLE_DATE = sETTLE_DATE;
	}
	public Timestamp getCONVERT_DATE() {
		return CONVERT_DATE;
	}
	public void setCONVERT_DATE(Timestamp cONVERT_DATE) {
		CONVERT_DATE = cONVERT_DATE;
	}
	public String getThird_system_no() {
		return third_system_no;
	}
	public void setThird_system_no(String third_system_no) {
		this.third_system_no = third_system_no;
	}
	public int getThird_system_seed() {
		return third_system_seed;
	}
	public void setThird_system_seed(int third_system_seed) {
		this.third_system_seed = third_system_seed;
	}
	public Timestamp getLatest_sale_chance_date() {
		return latest_sale_chance_date;
	}
	public void setLatest_sale_chance_date(Timestamp latest_sale_chance_date) {
		this.latest_sale_chance_date = latest_sale_chance_date;
	}
	public Timestamp getLatest_contract_date() {
		return latest_contract_date;
	}
	public void setLatest_contract_date(Timestamp latest_contract_date) {
		this.latest_contract_date = latest_contract_date;
	}
	public Timestamp getLatest_history_quoted_price_date() {
		return latest_history_quoted_price_date;
	}
	public void setLatest_history_quoted_price_date(Timestamp latest_history_quoted_price_date) {
		this.latest_history_quoted_price_date = latest_history_quoted_price_date;
	}
	public Timestamp getLatest_out_storage_date() {
		return latest_out_storage_date;
	}
	public void setLatest_out_storage_date(Timestamp latest_out_storage_date) {
		this.latest_out_storage_date = latest_out_storage_date;
	}
	public Timestamp getLatest_pay_fact_date() {
		return latest_pay_fact_date;
	}
	public void setLatest_pay_fact_date(Timestamp latest_pay_fact_date) {
		this.latest_pay_fact_date = latest_pay_fact_date;
	}
	public int getShop_seed() {
		return shop_seed;
	}
	public void setShop_seed(int shop_seed) {
		this.shop_seed = shop_seed;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public int getPAYMENT_KIND() {
		return PAYMENT_KIND;
	}
	public void setPAYMENT_KIND(int pAYMENT_KIND) {
		PAYMENT_KIND = pAYMENT_KIND;
	}
	public int getPk_seed() {
		return pk_seed;
	}
	public void setPk_seed(int pk_seed) {
		this.pk_seed = pk_seed;
	}
	public String getPk_name() {
		return pk_name;
	}
	public void setPk_name(String pk_name) {
		this.pk_name = pk_name;
	}
	public Timestamp getRecovery_date() {
		return Recovery_date;
	}
	public void setRecovery_date(Timestamp recovery_date) {
		Recovery_date = recovery_date;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getIc_no() {
		return ic_no;
	}
	public void setIc_no(String ic_no) {
		this.ic_no = ic_no;
	}
	public String getBank_branch() {
		return bank_branch;
	}
	public void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}
	public String getBank_user_name() {
		return bank_user_name;
	}
	public void setBank_user_name(String bank_user_name) {
		this.bank_user_name = bank_user_name;
	}
	public int getID_TYPE() {
		return ID_TYPE;
	}
	public void setID_TYPE(int iD_TYPE) {
		ID_TYPE = iD_TYPE;
	}
	public String getRevoke_remark() {
		return revoke_remark;
	}
	public void setRevoke_remark(String revoke_remark) {
		this.revoke_remark = revoke_remark;
	}
	public String getASSIST_MAN() {
		return ASSIST_MAN;
	}
	public void setASSIST_MAN(String aSSIST_MAN) {
		ASSIST_MAN = aSSIST_MAN;
	}
	public int getFollow_cycle() {
		return follow_cycle;
	}
	public void setFollow_cycle(int follow_cycle) {
		this.follow_cycle = follow_cycle;
	}
	public int getFollow_overdue_times() {
		return follow_overdue_times;
	}
	public void setFollow_overdue_times(int follow_overdue_times) {
		this.follow_overdue_times = follow_overdue_times;
	}
	public Timestamp getFollow_overdue_date() {
		return follow_overdue_date;
	}
	public void setFollow_overdue_date(Timestamp follow_overdue_date) {
		this.follow_overdue_date = follow_overdue_date;
	}
	public int getExpiration_mode() {
		return expiration_mode;
	}
	public void setExpiration_mode(int expiration_mode) {
		this.expiration_mode = expiration_mode;
	}
	
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	@Override
	public String toString() {
		return "Tcustomer [SEED=" + SEED + ", SUB_ACCOUNT_ID=" + SUB_ACCOUNT_ID + ", CUSTOMER_NAME=" + CUSTOMER_NAME
				+ ", CUSTOMER_ALIAS=" + CUSTOMER_ALIAS + ", customer_no=" + customer_no + ", member_no=" + member_no
				+ ", member_name=" + member_name + ", member_password=" + member_password + ", PARENT_CUSTOMER_SEED="
				+ PARENT_CUSTOMER_SEED + ", PARENT_CUSTOMER_NAME=" + PARENT_CUSTOMER_NAME + ", invoice_address="
				+ invoice_address + ", CUSTOMER_TYPE=" + CUSTOMER_TYPE + ", INDUSTRY_KIND=" + INDUSTRY_KIND
				+ ", CREDIT_LEVEL=" + CREDIT_LEVEL + ", STAFF_SCOPE=" + STAFF_SCOPE + ", HOT_KIND=" + HOT_KIND
				+ ", RELATION_LEVEL=" + RELATION_LEVEL + ", VALUE_EVALUATE=" + VALUE_EVALUATE + ", CUSTOMER_SOURCE="
				+ CUSTOMER_SOURCE + ", KIND=" + KIND + ", CUSTOMER_PHASE=" + CUSTOMER_PHASE + ", COUNTRY=" + COUNTRY
				+ ", PROVINCE=" + PROVINCE + ", CITY=" + CITY + ", ADDRESS=" + ADDRESS + ", ZIPCODE=" + ZIPCODE
				+ ", COMM_PHONE=" + COMM_PHONE + ", COMM_FAX=" + COMM_FAX + ", COMM_EMAIL=" + COMM_EMAIL + ", WEBURL="
				+ WEBURL + ", REMARK=" + REMARK + ", REVENUE_INFO=" + REVENUE_INFO + ", FILES=" + FILES
				+ ", DELETE_FLAG=" + DELETE_FLAG + ", UPDATE_MAN=" + UPDATE_MAN + ", CREATE_DATE=" + CREATE_DATE
				+ ", UPDATE_DATE=" + UPDATE_DATE + ", GENDER=" + GENDER + ", MOBILE_PHONE=" + MOBILE_PHONE + ", QQ="
				+ QQ + ", MSN=" + MSN + ", SKYPE=" + SKYPE + ", BLOG=" + BLOG + ", HOME_PHONE=" + HOME_PHONE
				+ ", HOME_ADDRESS=" + HOME_ADDRESS + ", COMPANY=" + COMPANY + ", DEPARTMENT=" + DEPARTMENT
				+ ", POSITION=" + POSITION + ", PRESIDE_WORK=" + PRESIDE_WORK + ", BIRTHDAY=" + BIRTHDAY
				+ ", C_BANK_NAME=" + C_BANK_NAME + ", C_BANK_ACCOUNT=" + C_BANK_ACCOUNT + ", C_TAX_ACCOUNT="
				+ C_TAX_ACCOUNT + ", CONTACT_NAME=" + CONTACT_NAME + ", CONTACT_PHONE=" + CONTACT_PHONE
				+ ", SHARE_SEEDS=" + SHARE_SEEDS + ", CUSTOMER_LEVEL=" + CUSTOMER_LEVEL + ", invoice_name="
				+ invoice_name + ", EXTEND1=" + EXTEND1 + ", EXTEND2=" + EXTEND2 + ", EXTEND3=" + EXTEND3 + ", EXTEND4="
				+ EXTEND4 + ", EXTEND5=" + EXTEND5 + ", EXTEND6=" + EXTEND6 + ", EXTEND7=" + EXTEND7 + ", EXTEND8="
				+ EXTEND8 + ", EXTEND9=" + EXTEND9 + ", EXTEND10=" + EXTEND10 + ", EXTEND11=" + EXTEND11 + ", EXTEND12="
				+ EXTEND12 + ", EXTEND13=" + EXTEND13 + ", EXTEND14=" + EXTEND14 + ", EXTEND15=" + EXTEND15
				+ ", EXTEND16=" + EXTEND16 + ", EXTEND17=" + EXTEND17 + ", EXTEND18=" + EXTEND18 + ", EXTEND19="
				+ EXTEND19 + ", EXTEND20=" + EXTEND20 + ", EXTEND21=" + EXTEND21 + ", EXTEND22=" + EXTEND22
				+ ", EXTEND23=" + EXTEND23 + ", EXTEND24=" + EXTEND24 + ", EXTEND25=" + EXTEND25 + ", EXTEND26="
				+ EXTEND26 + ", EXTEND27=" + EXTEND27 + ", EXTEND28=" + EXTEND28 + ", EXTEND29=" + EXTEND29
				+ ", EXTEND30=" + EXTEND30 + ", EXTEND31=" + EXTEND31 + ", EXTEND32=" + EXTEND32 + ", EXTEND33="
				+ EXTEND33 + ", EXTEND34=" + EXTEND34 + ", EXTEND35=" + EXTEND35 + ", EXTEND36=" + EXTEND36
				+ ", EXTEND37=" + EXTEND37 + ", EXTEND38=" + EXTEND38 + ", EXTEND39=" + EXTEND39 + ", EXTEND40="
				+ EXTEND40 + ", EXTEND41=" + EXTEND41 + ", EXTEND42=" + EXTEND42 + ", EXTEND43=" + EXTEND43
				+ ", EXTEND44=" + EXTEND44 + ", EXTEND45=" + EXTEND45 + ", EXTEND46=" + EXTEND46 + ", EXTEND47="
				+ EXTEND47 + ", EXTEND48=" + EXTEND48 + ", EXTEND49=" + EXTEND49 + ", EXTEND50=" + EXTEND50
				+ ", contact_SEED=" + contact_SEED + ", customer_follow_link_date=" + customer_follow_link_date
				+ ", customer_follow_next_date=" + customer_follow_next_date + ", customer_follow_follow_result="
				+ customer_follow_follow_result + ", customer_follow_num=" + customer_follow_num + ", create_man="
				+ create_man + ", IS_SHARED=" + IS_SHARED + ", expiration_days=" + expiration_days
				+ ", lastest_sign_order_date=" + lastest_sign_order_date + ", FILES1=" + FILES1 + ", FILES2=" + FILES2
				+ ", FILES3=" + FILES3 + ", FILES4=" + FILES4 + ", FILES5=" + FILES5 + ", customer_kind="
				+ customer_kind + ", OWN_DATE=" + OWN_DATE + ", customer_state=" + customer_state + ", ACTIVITY_SEED="
				+ ACTIVITY_SEED + ", ACTIVITY_SUBJECT=" + ACTIVITY_SUBJECT + ", CALL_PROCESS_STATE="
				+ CALL_PROCESS_STATE + ", CALL_REFUSE_TIMES=" + CALL_REFUSE_TIMES + ", CALL_LINK_DATE=" + CALL_LINK_DATE
				+ ", CALL_FOLLOW_RESULT=" + CALL_FOLLOW_RESULT + ", CALL_RESULT=" + CALL_RESULT + ", DEPT_ID=" + DEPT_ID
				+ ", CREDIT_AMOUNT=" + CREDIT_AMOUNT + ", Balance=" + Balance + ", INTEGRAL=" + INTEGRAL
				+ ", IS_MEMBER=" + IS_MEMBER + ", original_source=" + original_source + ", channel_customer_seed="
				+ channel_customer_seed + ", channel_customer_name=" + channel_customer_name + ", lock_time="
				+ lock_time + ", introduce_customer_seed=" + introduce_customer_seed + ", introduce_customer_name="
				+ introduce_customer_name + ", require_date=" + require_date + ", name_abbreviation="
				+ name_abbreviation + ", CUSTOMER_INTEGRAL=" + CUSTOMER_INTEGRAL + ", pay_method=" + pay_method
				+ ", transaction_kind=" + transaction_kind + ", audit_status=" + audit_status + ", BIRTHDAY_LUNAR="
				+ BIRTHDAY_LUNAR + ", latest_review=" + latest_review + ", ALERT_BALANCE=" + ALERT_BALANCE
				+ ", ALERT_BALANCE_DATE=" + ALERT_BALANCE_DATE + ", EXTEND51=" + EXTEND51 + ", EXTEND52=" + EXTEND52
				+ ", EXTEND53=" + EXTEND53 + ", EXTEND54=" + EXTEND54 + ", EXTEND55=" + EXTEND55 + ", EXTEND56="
				+ EXTEND56 + ", EXTEND57=" + EXTEND57 + ", EXTEND58=" + EXTEND58 + ", EXTEND59=" + EXTEND59
				+ ", EXTEND60=" + EXTEND60 + ", EXTEND61=" + EXTEND61 + ", EXTEND62=" + EXTEND62 + ", EXTEND63="
				+ EXTEND63 + ", EXTEND64=" + EXTEND64 + ", EXTEND65=" + EXTEND65 + ", EXTEND66=" + EXTEND66
				+ ", EXTEND67=" + EXTEND67 + ", EXTEND68=" + EXTEND68 + ", EXTEND69=" + EXTEND69 + ", EXTEND70="
				+ EXTEND70 + ", EXTEND71=" + EXTEND71 + ", EXTEND72=" + EXTEND72 + ", EXTEND73=" + EXTEND73
				+ ", EXTEND74=" + EXTEND74 + ", EXTEND75=" + EXTEND75 + ", EXTEND76=" + EXTEND76 + ", EXTEND77="
				+ EXTEND77 + ", EXTEND78=" + EXTEND78 + ", EXTEND79=" + EXTEND79 + ", EXTEND80=" + EXTEND80
				+ ", LONGTITUDE=" + LONGTITUDE + ", LATITUDE=" + LATITUDE + ", allocate_man=" + allocate_man
				+ ", branch_id=" + branch_id + ", public_type=" + public_type + ", audit_flag=" + audit_flag
				+ ", audit_date=" + audit_date + ", FEE_TYPE=" + FEE_TYPE + ", DEAD_LINE=" + DEAD_LINE + ", MAX_VOLUME="
				+ MAX_VOLUME + ", USED_VOLUME=" + USED_VOLUME + ", ALERT_VOLUME=" + ALERT_VOLUME
				+ ", ALERT_VOLUME_DATE=" + ALERT_VOLUME_DATE + ", service_end_date=" + service_end_date
				+ ", update_flag=" + update_flag + ", MARKET_SEGMENT_SEED=" + MARKET_SEGMENT_SEED
				+ ", MARKET_SEGMENT_name=" + MARKET_SEGMENT_name + ", mobile_phone2=" + mobile_phone2
				+ ", attention_status=" + attention_status + ", REVISIT_DATE=" + REVISIT_DATE + ", RECEIVABLE_DEADLINE="
				+ RECEIVABLE_DEADLINE + ", SETTLE_DATE=" + SETTLE_DATE + ", CONVERT_DATE=" + CONVERT_DATE
				+ ", third_system_no=" + third_system_no + ", third_system_seed=" + third_system_seed
				+ ", latest_sale_chance_date=" + latest_sale_chance_date + ", latest_contract_date="
				+ latest_contract_date + ", latest_history_quoted_price_date=" + latest_history_quoted_price_date
				+ ", latest_out_storage_date=" + latest_out_storage_date + ", latest_pay_fact_date="
				+ latest_pay_fact_date + ", shop_seed=" + shop_seed + ", shop_name=" + shop_name + ", PAYMENT_KIND="
				+ PAYMENT_KIND + ", pk_seed=" + pk_seed + ", pk_name=" + pk_name + ", Recovery_date=" + Recovery_date
				+ ", logo=" + logo + ", picture=" + picture + ", ic_no=" + ic_no + ", bank_branch=" + bank_branch
				+ ", bank_user_name=" + bank_user_name + ", ID_TYPE=" + ID_TYPE + ", revoke_remark=" + revoke_remark
				+ ", ASSIST_MAN=" + ASSIST_MAN + ", follow_cycle=" + follow_cycle + ", follow_overdue_times="
				+ follow_overdue_times + ", follow_overdue_date=" + follow_overdue_date + ", expiration_mode="
				+ expiration_mode + "]";
	}
	
}
