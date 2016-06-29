package test;

import java.util.Date;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class SendMailTest {
	public static void main(String[] args) throws Exception {
		// 发送文本邮件 
        sendTextEmail(); 
	}
	
	 // 邮件发送协议 
    private final static String PROTOCOL = "smtp";
 // SMTP邮件服务器 
    private final static String HOST = "smtp.qq.com";
 // SMTP邮件服务器默认端口 （qq邮箱端口465或587）
    private final static String PORT = "587";
    // 是否要求身份认证 
    private final static String IS_AUTH = "true";
 // 是否启用调试模式（启用调试模式可打印客户端与服务器交互过程时一问一答的响应消息） 
    private final static String IS_ENABLED_DEBUG_MOD = "true";
    //自己发给自己(间接实现向邮箱发送文件)
 // 发件人 
    private static String from = "1398365890@qq.com"; 
    // 收件人 
    private static String to = "2372960094@qq.com";
    // 初始化连接邮件服务器的会话信息 
    private static Properties props = null; 
    static { 
        props = new Properties(); 
        props.setProperty("mail.transport.protocol", PROTOCOL); 
        props.setProperty("mail.smtp.host", HOST); 
        props.setProperty("mail.smtp.port", PORT); 
        props.setProperty("mail.smtp.auth", IS_AUTH); 
        props.setProperty("mail.debug",IS_ENABLED_DEBUG_MOD); 
    } 
    /**
     * 发送简单的文本邮件
     */
    public static void sendTextEmail() throws Exception { 
        // 创建Session实例对象 
        Session session = Session.getDefaultInstance(props); 
         
        // 创建MimeMessage实例对象 
        MimeMessage message = new MimeMessage(session); 
        // 设置发件人 
        message.setFrom(new InternetAddress(from)); 
        // 设置邮件主题 
        message.setSubject("使用javamail发送简单文本邮件"); 
        // 设置收件人 
        message.setRecipient(RecipientType.TO, new InternetAddress(to)); 
        // 设置发送时间 
        message.setSentDate(new Date()); 
        // 设置纯文本内容为邮件正文 
        message.setText("使用POP3协议发送文本邮件测试!!!"); 
        // 保存并生成最终的邮件内容 
        message.saveChanges(); 
         
        // 获得Transport实例对象 
        Transport transport = session.getTransport(); 
        // 打开连接 
        transport.connect("1398365890", "wwnywcpzlgsgjcgb"); 
        // 将message对象传递给transport对象，将邮件发送出去 
        transport.sendMessage(message, message.getAllRecipients()); 
        // 关闭连接 
        transport.close(); 
    } 
}
