package com.ydprojects.utils;
/**
 * 
 * @author Yasiru Dahanayake
 * 
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class MessageEncryption
{

	private static String key = "Bar12345Bar12345";
	private static Cipher cipher;
	private static Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
	private static final Logger LOG = LoggerFactory.getLogger(MessageEncryption.class);

	/*
	 * Encrypts a given string using AES encryption
	 */
	public static String encrypt(String text)
	{
		String encryptedString = null;

		try
		{
			cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, aesKey);
			byte[] encrypted = cipher.doFinal(text.getBytes());
			Base64.Encoder encoder = Base64.getEncoder();

			encryptedString = encoder.encodeToString(encrypted);
		} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException
				| BadPaddingException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encryptedString;

	}

	/*
	 * De-crypts  a given string using AES
	 */
	public static String decrypt(String encryptedString)
	{
		String decrypted = null;
		try
		{
			cipher = Cipher.getInstance("AES");
			Base64.Decoder decoder = Base64.getMimeDecoder();
			cipher.init(Cipher.DECRYPT_MODE, aesKey);
			if (encryptedString == null){
				LOG.trace("no String present");
			}else {
				decrypted = new String(cipher.doFinal(decoder.decode(encryptedString)), "UTF-8");
			}
			
		} catch (NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException
				| InvalidKeyException | UnsupportedEncodingException | NullPointerException e)
		{
			e.printStackTrace();
		}

		return decrypted;
	}

	public static void main(String[] args)
	{
		System.out.println(decrypt("lBJ7ApPnWFJevkNNEzjUM34p7mZXpCiirK7cYndSsBE="));
	
	
		
	}
}
