package com.zrt.base64;

import java.io.IOException;


import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64 {

	 public static void main(String[] args) {
	        String s = "MDEwMGR6MDIyMDE4MTAyMzE0Mzk0NTAwMDAy";
	        String s1="MDEwMGR6MDIyMDE4MTAyMzE0Mzk0NTAwMDAx";
	        String s2="MDEwMGR6MDIyMDE4MTAyMzE0Mzk0NTAwMDAz";
	        String s3="NjYwMTAwMDEwMjAwMDAwMDIxMTU=";
	        String jiema = decode(s);
	        String jiema1 = decode(s1);
	        String jiema2 = decode(s2);
	        String jiema3 = decode(s3);
	        System.out.println("���ܺ�" +jiema+"\t���ܺ�" +jiema1+"\t���ܺ�" +jiema2+"\t���ܺ�" +jiema3);
/*	        String bianma = encode(jiema);
	        System.out.println("ԭ�ַ���" + s+"\r"+"���ܺ�" + bianma);
*/
	        //92410621MA40LN9Q1G X3 ���؁�ɽ���´����Լ����¸�ʳ���� 66010001210000000057
	        //����ϼ   66010001020000000543 410621198904231109
	        //������  66010001020000000259 410621197407121051
	        String a="111111";//5bel5L2c6ZyA6KaB������Ҫ/
	        String a1="20190221";//110041MTEwMDQx  010000MDEwMDAw
	        String a2="0100dz022018101814282400002";
	        String a3="�����м���";//MzcwODg1MzgyMDE4MDkyOTE0NDMyODAwMDAy

	        String aa=encode(a);
	        String aa1=encode(a1);
	        String aa2=encode(a2);
	        String aa3=encode(a3);

	        System.out.println(aa+"\t"+aa1+"\t"+aa2+"\t"+aa3);

	    }


	public static String decode(String str) {
		String before =str;
		if (before != null && !"".equals(before)) {
			byte[] ret = null;
			try {
				ret = new BASE64Decoder().decodeBuffer(before);
				return new String(ret, "UTF-8");
			} catch (IOException e) {
				e.printStackTrace();
				return "";
			}
		}
		return "";
	}

	// BASE64���뺯��
	public static String encode(String str) {
		String before = str;
		if (before != null && !"".equals(before)) {
			try {
				return new BASE64Encoder().encode(before.trim().getBytes("UTF-8"));
			} catch (Exception e) {
				e.printStackTrace();
				return "";
			}
		}
		return "";
	}

}
