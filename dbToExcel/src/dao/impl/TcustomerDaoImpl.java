package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.TcustomerDao;
import entity.ExcelEntity;
import entity.Tcustomer;
import util.DBUtil;
import util.GetCustomerDataList;

public class TcustomerDaoImpl implements TcustomerDao{
	PreparedStatement ps = null;
	Connection conn = null;
	ResultSet rs = null;
	@Override
	public List<Tcustomer> getAllOfTcustomer() {
		// TODO Auto-generated method stub
		String sql = "select * from t_customer where extend1='试驾卡券' or extend1='购车卡券'";
		List<Tcustomer> tCustomerList = new ArrayList<Tcustomer>();
		try {
			conn = DBUtil.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				Tcustomer customer = new Tcustomer();
				customer.setSEED(rs.getInt("SEED"));
				customer.setStaff_name(rs.getString("staff_name"));
				customer.setSUB_ACCOUNT_ID(rs.getString("SUB_ACCOUNT_ID"));
//				customer.setCUSTOMER_NAME(rs.getString("CUSTOMER_NAME"));
				customer.setCUSTOMER_ALIAS(rs.getString("CUSTOMER_ALIAS"));
				customer.setCustomer_no(rs.getString("Customer_no"));
				customer.setMember_no(rs.getString("Member_no"));
//				customer.setMember_name(rs.getString("Member_name"));
//				customer.setMember_password(rs.getString("Member_password"));
//				customer.setPARENT_CUSTOMER_SEED(Integer.parseInt(rs.getString("PARENT_CUSTOMER_SEED")));
				customer.setPARENT_CUSTOMER_NAME(rs.getString("PARENT_CUSTOMER_NAME"));
//				customer.setInvoice_address(rs.getString("Invoice_address"));
//				customer.setCUSTOMER_TYPE(rs.getInt("CUSTOMER_TYPE"));
//				//别克结果	1:00000操作成功;2:00001操作失败;3:00002卡号已核销;4:00003卡号不存在;5:00007鉴权失败;
//				//6:99998请求超时;7:99999其他错误;
				int temp2 = rs.getInt("INDUSTRY_KIND");
				switch(temp2){
					case 1 : customer.setINDUSTRY_KIND("00000操作成功");break;
					case 2 : customer.setINDUSTRY_KIND("00001操作失败");break;
					case 3 : customer.setINDUSTRY_KIND("00002卡号已核销");break;
					case 4 : customer.setINDUSTRY_KIND("00003卡号不存在");break;
					case 5 : customer.setINDUSTRY_KIND("00007鉴权失败");break;
					case 6 : customer.setINDUSTRY_KIND("99998请求超时");break;
					case 7 : customer.setINDUSTRY_KIND("99999其他错误");break;
				}
////				customer.setINDUSTRY_KIND(rs.getInt("INDUSTRY_KIND"));
//				customer.setCREDIT_LEVEL(rs.getInt("CREDIT_LEVEL"));
//				customer.setACTIVITY_SEED(rs.getInt("ACTIVITY_SEED"));
//				customer.setACTIVITY_SUBJECT(rs.getString("ACTIVITY_SUBJECT"));
//				
//				customer.setADDRESS(rs.getString("ADDRESS"));
//				customer.setALERT_BALANCE(rs.getInt("ALERT_BALANCE"));
//				customer.setALERT_BALANCE_DATE(rs.getTimestamp("ALERT_BALANCE_DATE"));
//				customer.setALERT_VOLUME(rs.getInt("ALERT_VOLUME"));
//				customer.setALERT_VOLUME_DATE(rs.getTimestamp("ALERT_VOLUME_DATE"));
//				customer.setAttention_status(rs.getInt("attention_status"));
//				customer.setAudit_date(rs.getTimestamp("audit_date"));
//				customer.setAudit_flag(rs.getInt("audit_flag"));
//				customer.setAudit_status(rs.getInt("audit_status"));
//				customer.setBalance(rs.getInt("Balance"));
//				customer.setBank_branch(rs.getString("bank_branch"));
//				customer.setBank_user_name(rs.getString("bank_user_name"));
//				
//				customer.setBIRTHDAY(rs.getTimestamp("BIRTHDAY"));
//				customer.setBIRTHDAY_LUNAR(rs.getTimestamp("BIRTHDAY_LUNAR"));
//				customer.setBLOG(rs.getString("BLOG"));
//				customer.setBranch_id(rs.getInt("branch_id"));
//				customer.setC_BANK_ACCOUNT(rs.getString("C_BANK_ACCOUNT"));
//				customer.setC_BANK_NAME(rs.getString("C_BANK_NAME"));
//				customer.setC_TAX_ACCOUNT(rs.getString("C_TAX_ACCOUNT"));
//				customer.setCALL_LINK_DATE(rs.getTimestamp("CALL_LINK_DATE"));
//				customer.setCALL_LINK_DATE(rs.getTimestamp("CALL_LINK_DATE"));
//				customer.setCALL_FOLLOW_RESULT(rs.getString("CALL_FOLLOW_RESULT"));
//				
//				customer.setCALL_PROCESS_STATE(rs.getInt("CALL_PROCESS_STATE"));
//				customer.setCALL_REFUSE_TIMES(rs.getInt("CALL_REFUSE_TIMES"));
//				customer.setCALL_RESULT(rs.getInt("CALL_RESULT"));
//				customer.setChannel_customer_name(rs.getString("channel_customer_name"));
//				customer.setCITY(rs.getString("CITY"));
//				customer.setCOMM_EMAIL(rs.getString("COMM_EMAIL"));
//				customer.setCOMM_FAX(rs.getString("COMM_FAX"));
//				customer.setCOMM_PHONE(rs.getString("COMM_PHONE"));
//				customer.setCOMPANY(rs.getString("COMPANY"));
//				customer.setCONTACT_NAME(rs.getString("CONTACT_NAME"));
//				customer.setCONTACT_PHONE(rs.getString("CONTACT_PHONE"));
//				customer.setContact_SEED(rs.getInt("contact_SEED"));
//				customer.setCONVERT_DATE(rs.getTimestamp("CONVERT_DATE"));
//				customer.setThird_system_no(rs.getString("third_system_no"));
//				customer.setThird_system_seed(rs.getInt("third_system_seed"));
//					
//				customer.setCOUNTRY(rs.getInt("COUNTRY"));
				customer.setCREATE_DATE(rs.getTimestamp("CREATE_DATE"));
//				customer.setCreate_man(rs.getString("create_man"));
//				customer.setCREDIT_AMOUNT(rs.getInt("CREDIT_AMOUNT"));
//				customer.setCustomer_follow_follow_result(rs.getString("customer_follow_follow_result"));
				customer.setCustomer_follow_link_date(rs.getTimestamp("customer_follow_link_date"));
//				customer.setCustomer_follow_next_date(rs.getTimestamp("customer_follow_next_date"));;
//				customer.setCustomer_follow_num(rs.getInt("customer_follow_num"));
//				customer.setCUSTOMER_INTEGRAL(rs.getInt("CUSTOMER_INTEGRAL"));
//				customer.setCUSTOMER_LEVEL(rs.getString("CUSTOMER_LEVEL"));
//				//微信结果	1:00000操作成功;2:00001参数不全;3:00002鉴权失败;4:00003卡券已领;5:00004业务错误;
//				//6:00005无效卡券;7:99998内部错误;8:99999其他错误
				int temp = rs.getInt("CUSTOMER_PHASE");
				if(temp == 1){
					customer.setCUSTOMER_PHASE("00000操作成功");
				}else if(temp == 2){
					customer.setCUSTOMER_PHASE("00001参数不全");
				}else if(temp == 3){
					customer.setCUSTOMER_PHASE("00002鉴权失败");
				}else if(temp == 3){
					customer.setCUSTOMER_PHASE("00000操作成功");
				}else if(temp == 4){
					customer.setCUSTOMER_PHASE("00003卡券已领");
				}else if(temp == 5){
					customer.setCUSTOMER_PHASE("00004业务错误");
				}else if(temp == 6){
					customer.setCUSTOMER_PHASE("00005无效卡券");
				}else if(temp == 7){
					customer.setCUSTOMER_PHASE("99998内部错误");
				}else if(temp == 8){
					customer.setCUSTOMER_PHASE("99999其他错误");
				}
//				customer.setCUSTOMER_SOURCE(rs.getInt("CUSTOMER_SOURCE"));
//				customer.setCustomer_state(rs.getInt("customer_state"));
//				customer.setDEAD_LINE(rs.getTimestamp("DEAD_LINE"));
//				customer.setDELETE_FLAG(rs.getString("DELETE_FLAG"));
//				customer.setDEPARTMENT(rs.getString("DEPARTMENT"));
//				customer.setDEPT_ID(rs.getInt("DEPT_ID"));
//				customer.setExpiration_days(rs.getInt("expiration_days"));
//				customer.setExpiration_mode(rs.getInt("Expiration_mode"));
				customer.setEXTEND1(rs.getString("EXTEND1"));
				customer.setEXTEND2(rs.getString("EXTEND2"));
				customer.setEXTEND3(rs.getString("EXTEND3"));
				customer.setEXTEND4(rs.getString("EXTEND4"));
				customer.setEXTEND5(rs.getString("EXTEND5"));
				customer.setEXTEND6(rs.getString("EXTEND6"));
//				customer.setEXTEND7(rs.getString("EXTEND7"));
				customer.setEXTEND8(rs.getString("EXTEND8"));
//				customer.setEXTEND9(rs.getString("EXTEND9"));
//				customer.setEXTEND10(rs.getString("EXTEND10"));
//				customer.setEXTEND11(rs.getString("EXTEND11"));
//				customer.setEXTEND12(rs.getString("EXTEND12"));
//				customer.setEXTEND13(rs.getString("EXTEND13"));
//				customer.setEXTEND14(rs.getString("EXTEND14"));
//				customer.setEXTEND15(rs.getString("EXTEND15"));
//				customer.setEXTEND16(rs.getString("EXTEND16"));
//				customer.setEXTEND17(rs.getString("EXTEND17"));
//				customer.setEXTEND18(rs.getString("EXTEND18"));
//				customer.setEXTEND19(rs.getString("EXTEND19"));
//				customer.setEXTEND20(rs.getString("EXTEND20"));
//				customer.setEXTEND21(rs.getString("EXTEND21"));
//				customer.setEXTEND22(rs.getString("EXTEND22"));
//				customer.setEXTEND23(rs.getString("EXTEND23"));
//				customer.setEXTEND24(rs.getString("EXTEND24"));
//				customer.setEXTEND25(rs.getString("EXTEND25"));
//				customer.setEXTEND26(rs.getInt("EXTEND26"));
//				customer.setEXTEND27(rs.getInt("EXTEND27"));
//				customer.setEXTEND28(rs.getInt("EXTEND28"));
//				customer.setEXTEND29(rs.getInt("EXTEND29"));
//				customer.setEXTEND30(rs.getInt("EXTEND30"));
//				customer.setEXTEND31(rs.getInt("EXTEND31"));
//				customer.setEXTEND32(rs.getInt("EXTEND32"));
//				customer.setEXTEND33(rs.getInt("EXTEND33"));
//				customer.setEXTEND34(rs.getInt("EXTEND34"));
//				customer.setEXTEND35(rs.getInt("EXTEND35"));
//				customer.setEXTEND36(rs.getInt("EXTEND36"));
//				customer.setEXTEND37(rs.getInt("EXTEND37"));
//				customer.setEXTEND38(rs.getInt("EXTEND38"));
//				customer.setEXTEND39(rs.getInt("EXTEND39"));
//				customer.setEXTEND40(rs.getInt("EXTEND40"));
//				customer.setEXTEND41(rs.getInt("EXTEND41"));
//				customer.setEXTEND42(rs.getInt("EXTEND42"));
//				customer.setEXTEND43(rs.getInt("EXTEND43"));
//				customer.setEXTEND44(rs.getInt("EXTEND44"));
//				customer.setEXTEND45(rs.getInt("EXTEND45"));
//				customer.setEXTEND40(rs.getInt("EXTEND46"));
//				customer.setEXTEND41(rs.getInt("EXTEND41"));
//				customer.setEXTEND42(rs.getInt("EXTEND42"));
//				customer.setEXTEND43(rs.getInt("EXTEND43"));
//				customer.setEXTEND44(rs.getInt("EXTEND44"));
//				customer.setEXTEND45(rs.getInt("EXTEND45"));
//				customer.setEXTEND46(rs.getTimestamp("EXTEND46"));
//				customer.setEXTEND47(rs.getTimestamp("EXTEND47"));
//				customer.setEXTEND48(rs.getTimestamp("EXTEND48"));
//				customer.setEXTEND49(rs.getTimestamp("EXTEND49"));
//				customer.setEXTEND50(rs.getTimestamp("EXTEND50"));
//				customer.setEXTEND51(rs.getString("EXTEND51"));
//				customer.setEXTEND52(rs.getString("EXTEND52"));
//				customer.setEXTEND53(rs.getString("EXTEND53"));
//				customer.setEXTEND54(rs.getString("EXTEND54"));
//				customer.setEXTEND55(rs.getString("EXTEND55"));
//				customer.setEXTEND56(rs.getString("EXTEND56"));
//				customer.setEXTEND57(rs.getString("EXTEND57"));
//				customer.setEXTEND58(rs.getString("EXTEND58"));
//				customer.setEXTEND59(rs.getString("EXTEND59"));
//				customer.setEXTEND60(rs.getString("EXTEND60"));
//				customer.setEXTEND61(rs.getString("EXTEND61"));
//				customer.setEXTEND62(rs.getString("EXTEND62"));
//				customer.setEXTEND63(rs.getString("EXTEND63"));
//				customer.setEXTEND64(rs.getString("EXTEND64"));
//				customer.setEXTEND65(rs.getString("EXTEND65"));
//				customer.setEXTEND66(rs.getString("EXTEND66"));
//				customer.setEXTEND67(rs.getString("EXTEND67"));
//				customer.setEXTEND68(rs.getString("EXTEND68"));
//				customer.setEXTEND69(rs.getString("EXTEND69"));
//				customer.setEXTEND70(rs.getString("EXTEND70"));
//				customer.setEXTEND71(rs.getString("EXTEND71"));
//				customer.setEXTEND72(rs.getString("EXTEND72"));
//				customer.setEXTEND73(rs.getString("EXTEND73"));
//				customer.setEXTEND74(rs.getString("EXTEND74"));
//				customer.setEXTEND75(rs.getString("EXTEND75"));
//				customer.setEXTEND76(rs.getString("EXTEND76"));
//				customer.setEXTEND77(rs.getString("EXTEND77"));
//				customer.setEXTEND78(rs.getString("EXTEND78"));
//				customer.setEXTEND79(rs.getString("EXTEND79"));
//				customer.setEXTEND80(rs.getString("EXTEND80"));
//				customer.setLONGTITUDE(rs.getString("LONGTITUDE"));
//				customer.setLATITUDE(rs.getString("LATITUDE"));
//				customer.setAllocate_man(rs.getString("allocate_man"));
//				
//				customer.setFEE_TYPE(rs.getInt("FEE_TYPE"));
//				customer.setFILES(rs.getString("FILES"));
//				customer.setFILES1(rs.getString("FILES1"));
//				customer.setFILES2(rs.getString("FILES2"));
//				customer.setFILES3(rs.getString("FILES3"));
//				customer.setFILES4(rs.getString("FILES4"));
//				customer.setFILES5(rs.getString("FILES5"));
//				customer.setCustomer_kind(rs.getInt("customer_kind"));
//				customer.setFollow_cycle(rs.getInt("follow_cycle"));
//				customer.setFollow_overdue_date(rs.getTimestamp("follow_overdue_date"));
//				customer.setFollow_overdue_times(rs.getInt("follow_overdue_times"));
//				customer.setGENDER(rs.getInt("GENDER"));
//				customer.setHOME_ADDRESS(rs.getString("HOME_ADDRESS"));
//				customer.setHOME_PHONE(rs.getString("HOME_PHONE"));
//				customer.setHOT_KIND(rs.getInt("HOT_KIND"));
//				customer.setIc_no(rs.getString("ic_no"));
//				customer.setID_TYPE(rs.getInt("ID_TYPE"));
//				customer.setRevoke_remark(rs.getString("revoke_remark"));
//				customer.setASSIST_MAN(rs.getString("ASSIST_MAN"));
//				
//				customer.setINTEGRAL(rs.getInt("INTEGRAL"));
//				customer.setIntroduce_customer_name(rs.getString("introduce_customer_name"));
//				customer.setIntroduce_customer_seed(rs.getInt("introduce_customer_seed"));
//				customer.setInvoice_name(rs.getString("Invoice_name"));
//				customer.setIS_MEMBER(rs.getInt("IS_MEMBER"));
//				customer.setIS_SHARED(rs.getInt("IS_SHARED"));
//				customer.setKIND(rs.getInt("KIND"));
//				customer.setLastest_sign_order_date(rs.getTimestamp("lastest_sign_order_date"));
//				customer.setLatest_contract_date(rs.getTimestamp("latest_contract_date"));
//				customer.setLatest_history_quoted_price_date(rs.getTimestamp("latest_history_quoted_price_date"));
//				customer.setLatest_out_storage_date(rs.getTimestamp("latest_out_storage_date"));
//				customer.setLatest_pay_fact_date(rs.getTimestamp("latest_pay_fact_date"));
//				customer.setLatest_review(rs.getString("latest_review"));
//				customer.setLatest_sale_chance_date(rs.getTimestamp("latest_sale_chance_date"));
//				customer.setLock_time(rs.getTimestamp("lock_time"));
//				customer.setLogo(rs.getString("logo"));
//				customer.setPicture(rs.getString("picture"));
//				
//				customer.setMARKET_SEGMENT_name(rs.getString("MARKET_SEGMENT_name"));
//				customer.setMARKET_SEGMENT_SEED(rs.getInt("MARKET_SEGMENT_SEED"));
//				customer.setMAX_VOLUME(rs.getInt("MAX_VOLUME"));
				customer.setMOBILE_PHONE(rs.getString("MOBILE_PHONE"));
//				customer.setMobile_phone2(rs.getString("mobile_phone2"));
//				customer.setMSN(rs.getString("MSN"));
//				customer.setName_abbreviation(rs.getString("name_abbreviation"));
//				customer.setOriginal_source(rs.getInt("original_source"));
//				customer.setChannel_customer_seed(rs.getInt("channel_customer_seed"));
//				
//				customer.setOWN_DATE(rs.getTimestamp("OWN_DATE"));
//				customer.setPay_method(rs.getInt("pay_method"));
//				customer.setPAYMENT_KIND(rs.getInt("PAYMENT_KIND"));
//				customer.setPk_name(rs.getString("pk_name"));
//				customer.setPk_seed(rs.getInt("pk_seed"));
//				customer.setPOSITION(rs.getString("POSITION"));
//				customer.setPRESIDE_WORK(rs.getString("PRESIDE_WORK"));
//				customer.setPROVINCE(rs.getString("PROVINCE"));
//				customer.setPublic_type(rs.getInt("public_type"));
//				customer.setQQ(rs.getString("QQ"));
//				customer.setRecovery_date(rs.getTimestamp("Recovery_date"));
//				customer.setRELATION_LEVEL(rs.getInt("RELATION_LEVEL"));
//				customer.setREMARK(rs.getString("REMARK"));
//				customer.setRequire_date(rs.getTimestamp("require_date"));
//				customer.setREVENUE_INFO(rs.getString("REVENUE_INFO"));
//				customer.setREVISIT_DATE(rs.getTimestamp("REVISIT_DATE"));
//				customer.setRECEIVABLE_DEADLINE(rs.getString("RECEIVABLE_DEADLINE"));
//				customer.setSETTLE_DATE(rs.getString("SETTLE_DATE"));
//				
//				customer.setSEED(Integer.parseInt(rs.getString("SEED")));
//				customer.setService_end_date(rs.getTimestamp("service_end_date"));
//				customer.setSHARE_SEEDS(rs.getString("SHARE_SEEDS"));
//				customer.setShop_seed(rs.getInt("shop_seed"));
//				customer.setShop_name(rs.getString("shop_name"));
//				
//				customer.setSKYPE(rs.getString("SKYPE"));
//				customer.setSTAFF_SCOPE(rs.getInt("STAFF_SCOPE"));
//				customer.setTransaction_kind(rs.getInt("transaction_kind"));
				customer.setUPDATE_DATE(rs.getTimestamp("UPDATE_DATE"));
//				customer.setUpdate_flag(rs.getInt("update_flag"));
//				customer.setUPDATE_MAN(rs.getString("UPDATE_MAN"));
//				customer.setUSED_VOLUME(rs.getInt("USED_VOLUME"));
//				customer.setVALUE_EVALUATE(rs.getInt("VALUE_EVALUATE"));
//				customer.setWEBURL(rs.getString("WEBURL"));
//				customer.setZIPCODE(rs.getString("ZIPCODE"));
				tCustomerList.add(customer);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeResource(conn, rs, ps);
		}
		return tCustomerList;
	}
	@Override
	public int countDBSubItems() {
		// TODO Auto-generated method stub
		int sub = 0;
		String sql = "select count(1) subItems from t_customer where extend1='试驾卡券' or extend1='购车卡券'";
		PreparedStatement psmt = null;
		ResultSet rs = null;
		conn = DBUtil.getConnection();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()){
				sub = rs.getInt("subItems");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.closeResource(conn, rs, psmt);
		}
		return sub;
	}
	@Override
	public List<Tcustomer> getDividePageData(String sql) {
		// TODO Auto-generated method stub
		List<Tcustomer> list = new ArrayList<Tcustomer>();
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			psmt = conn.prepareCall(sql);
			rs = psmt.executeQuery();
			list = GetCustomerDataList.getDataList(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.closeResource(conn, rs, psmt);
		}
		return list;
	}
	@Override
	public void excelToDB(ExcelEntity entity){
		// TODO Auto-generated method stub
		String sql = "insert into T_CUSTOMER(customer_name,mobile_phone,EXTEND5,extend1) values (?,?,'pAOwnv24a4aXsKT-_QaEIrJojzPI','测试1')";
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, entity.getCustomer_name());
			psmt.setString(2, entity.getMobile_phone());
			if(psmt.execute()){
				System.out.println("succed..");
			}else{
				System.out.println("failed..");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
}
