package com.dawjung.richface.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	public static String getInstance(String password) {
		String msgDigest = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] byteOfPassword = md.digest(password.getBytes("UTF-8"));
			msgDigest = new BigInteger(1, byteOfPassword).toString(16);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msgDigest;
	}

	public static void main(String[] args) throws NoSuchAlgorithmException {
		System.out.println(MD5.getInstance("a"));
	}

}
