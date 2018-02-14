/**
 * 
 */
package com.smartschool.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * 
 * @author Anand_Rathod
 *
 */
 
public class PasswordUtility {
	private static final String MD5 = "MD5";
	private static final String SUN = "SUN";
	private static final String SHA1PRNG = "SHA1PRNG";

	public static String getSecurePassword(String passwordToHash, String salt)
    {
        String generatedPassword = null;
        String algorithm = MD5;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance(algorithm);
            //Add password bytes to digest
            md.update(salt.getBytes());
            //Get the hash's bytes 
            byte[] bytes = md.digest(passwordToHash.getBytes());
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        } 
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("No Such Algorithm exists while retrieving Secure Password using MessageDigest algorithm: "+algorithm);
        }
        return generatedPassword;
    }
     
    //Add salt
    public static String getSalt()
    {
    	String saltInString = null;
    	String algorithm = SHA1PRNG;
    	String provider = SUN;
    	try {
    		// Create a secure random number generator using the SHA1PRNG algorithm and SUN provider
            SecureRandom sr = SecureRandom.getInstance(algorithm, provider);
            // Get 16 random bytes
            byte[] salt = new byte[16];
            //Get a random salt
            sr.nextBytes(salt);
            saltInString = salt.toString();
    	} catch(NoSuchAlgorithmException ex) {
    		throw new RuntimeException("No Such Algorithm exists while retrieving the salt value using secure random algorithm: " + algorithm);
    	} catch (NoSuchProviderException ex) {
    		throw new RuntimeException("No Such Provider exists while retrieving the Salt value using secure random provider: " + provider);
		}
    	return saltInString;
    }
    
    private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final int RANDOM_STRING_LENGTH = 8;
     
    public static String generateRandomString(){
         
        StringBuffer randStr = new StringBuffer();
        for(int i=0; i<RANDOM_STRING_LENGTH; i++){
            int number = getRandomNumber();
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }
    
    private static int getRandomNumber() {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }
    
    /*public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException{
    	String password = "password";
    	String salt = getSalt();
    	System.out.println(getSecurePassword(password, salt));
    	System.out.println(salt);
    }*/
    
  /*  public static void main( String args[]){
		StringBuffer randStr = new StringBuffer();
        for(int i=0; i<8; i++){
            int number = getRandomNumber();
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
        
	    System.out.println(randStr.toString());
	}*/
}
