package org.cloud.store;

import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;


/**
 * 
 * @author Mangesh
 *
 */
public class GettersandSetters {
	
	public static SecretKey secretKey=null;

	public static SecretKey secretKey() throws NoSuchAlgorithmException{
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(128);
		secretKey = keyGenerator.generateKey();
		return secretKey;
	}
	
	
	public static SecretKey getSecretkey() throws NoSuchAlgorithmException {
		return secretKey();
	}
}
