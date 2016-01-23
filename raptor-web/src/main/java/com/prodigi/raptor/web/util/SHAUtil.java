package com.prodigi.raptor.web.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHAUtil {

	public static void main(String[] args) throws NoSuchAlgorithmException{
		System.out.println(sha2("admin"));
	}
	
	static String sha2(String s) throws NoSuchAlgorithmException {
		MessageDigest mDigest = MessageDigest.getInstance("SHA-256");
		byte[] result = mDigest.digest(s.getBytes());
		StringBuffer sb = new StringBuffer();
		for(int i=0; i < result.length; i++){
			sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}
}
