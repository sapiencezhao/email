package com.lyq.Bean1;

import java.io.Serializable;
/**
 * �ʼ�����JavaBean
 * @author sapiencezhao
 */
public class Email implements Serializable {
	//  serialVersionUID ֵ
	private static final long serialVersionUID = 1L;
	// Email��ַ
	private String mailAdd;
	// �Ƿ���һ����׼��Email��ַ
	private boolean email;
	/**
	 * Ĭ���޲εĹ��췽��
	 */
	public Email() {
	}
	/**
	 * ���췽��
	 * @param mailAdd Email��ַ
	 */
	public Email(String mailAdd) {
		this.mailAdd = mailAdd;
	}
	/**
	 * �Ƿ���һ����׼��Email��ַ
	 * @return ����ֵ
	 */
	public boolean isEmail() {
		// ������ʽ�����������ʽ
		String regex = "\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"; 
		// matches()�������ж��ַ����Ƿ���������ʽƥ��
		if (mailAdd.matches(regex)) { 
			// eamilΪ��
			email = true;
		}
		// ����email
		return email;
	}
	public String getMailAdd() {
		return mailAdd;
	}
	public void setMailAdd(String mailAdd) {
		this.mailAdd = mailAdd;
	}
}
