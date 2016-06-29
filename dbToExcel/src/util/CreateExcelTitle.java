package util;

import java.util.ArrayList;
import java.util.List;

public class CreateExcelTitle {
	public static List<String> createExcelTitle(){
		List<String> list = new ArrayList<String>();
		String membernoTitle,customer_nameTitle,WXResultTitle,Shop_4STitle,getCardTimeTitle,dataRecordTime,buickResultTitle,buickSerialNumberTitle,WXSerialNumberTitle,cancelTimeTitle,cardType,resource,getCardSerialNumberTitle,customerNumber,cardId,getCustomerIdTitle,WXRealResult,phoneNumber,getCardParam;
		membernoTitle = "短信兑换码";
		customer_nameTitle = "券号Code";
		WXResultTitle = "微信结果";
		Shop_4STitle = "4S店";
		getCardTimeTitle = "领取时间";
		dataRecordTime = "数据记录时间";
		buickResultTitle = "buick结果";
		buickSerialNumberTitle = "buick流水号";
		WXSerialNumberTitle = "微信流水号";
		cancelTimeTitle = "核销时间";
		cardType = "卡券类型";
		resource = "来源";
		getCardSerialNumberTitle = "领取流水号";
		customerNumber = "商户编码";
		cardId = "卡ID";
		getCustomerIdTitle = "领取者的ID";
		WXRealResult = "微信真实结果";
		phoneNumber = "手机";
		getCardParam = "领取参数";
		list.add(membernoTitle);
		list.add(customer_nameTitle);
		list.add(WXResultTitle);
		list.add(Shop_4STitle);
		list.add(getCardTimeTitle);
		list.add(dataRecordTime);
		list.add(buickResultTitle);
		list.add(buickSerialNumberTitle);
		list.add(WXSerialNumberTitle);
		list.add(cancelTimeTitle);
		list.add(cardType);
		list.add(resource);
		list.add(getCardSerialNumberTitle);
		list.add(customerNumber);
		list.add(cardId);
		list.add(getCustomerIdTitle);
		list.add(WXRealResult);
		list.add(phoneNumber);
		list.add(getCardParam);
		return list;
	}
}
