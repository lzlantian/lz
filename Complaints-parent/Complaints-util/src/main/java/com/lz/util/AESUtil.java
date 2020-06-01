package com.lz.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class AESUtil
{

    
    private final static String encoding      = "UTF-8";
    private final static String AES  = "AES";
    private final static String KEY  = "xxxxsfddsfdsfsdfds";
     
    /**
    * AES����
    * **/
    public static String encryptAES(String content) {
        byte[] encryptResult = encrypt(content);
        String encryptResultStr = parseByte2HexStr(encryptResult);
        // BASE64λ����
        encryptResultStr = ebotongEncrypto(encryptResultStr);
        return encryptResultStr;
    }
     
    /**
    * AES����
    * @param encryptResultStr
    * @return String
    * **/
    public static String decryptAES(String encryptResultStr) {
         
        // BASE64λ����
        String decrpt = ebotongDecrypto(encryptResultStr);
        byte[] decryptFrom = parseHexStr2Byte(decrpt);
        byte[] decryptResult = decrypt(decryptFrom);
        return new String(decryptResult);
    }
     
      
    /**
    * �����ַ���
    * */
    public static String ebotongEncrypto(String str) {
     
        BASE64Encoder base64encoder = new BASE64Encoder();
        String result = str;
        if (str != null && str.length() > 0) {
            try {
         
                byte[] encodeByte = str.getBytes(encoding);    
                result = base64encoder.encode(encodeByte);
            }catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
     
        //base64���ܳ���һ�����Ȼ��Զ����� ��Ҫȥ�����з�
       // return result;
        return result.replaceAll("\r\n", "").replaceAll("\r", "").replaceAll("\n", "");
    }
     
    /**
    * �����ַ���
    * */
    public static String ebotongDecrypto(String str) {
         
        BASE64Decoder base64decoder = new BASE64Decoder();
        try {
            byte[] encodeByte = base64decoder.decodeBuffer(str);
            return new String(encodeByte);
        } catch (IOException e) {
            e.printStackTrace();
            return str;
        }
    }
     
      
      
    /**
    * ����
    *
    * @param content ��Ҫ���ܵ�����
    * @param password  ��������
    * @return
    */
    public static byte[] encrypt(String content) {
         
        try {
            KeyGenerator kgen = KeyGenerator.getInstance(AES);
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(KEY.getBytes());
            kgen.init(128, secureRandom);
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, AES);
            Cipher cipher = Cipher.getInstance(AES);// ����������
            byte[] byteContent = content.getBytes();
            cipher.init(Cipher.ENCRYPT_MODE, key);// ��ʼ��
            byte[] result = cipher.doFinal(byteContent);
            return result; // ����
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }
     
      
      
    /**����
    * @param content  ����������
    * @param password ������Կ
    * @return
    */
    public static byte[] decrypt(byte[] content) {
     
        try {
                KeyGenerator kgen = KeyGenerator.getInstance(AES);
                //kgen.init(128, new SecureRandom(AESUtilsPassWordKey.PASSWORD_KEY.getBytes()));
                SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
                secureRandom.setSeed(KEY.getBytes());
                kgen.init(128, secureRandom);
                SecretKey secretKey = kgen.generateKey();
                byte[] enCodeFormat = secretKey.getEncoded();
                SecretKeySpec key = new SecretKeySpec(enCodeFormat, AES);
                Cipher cipher = Cipher.getInstance(AES);// ����������
                cipher.init(Cipher.DECRYPT_MODE, key);// ��ʼ��
                byte[] result = cipher.doFinal(content);
                return result; // ����
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (NoSuchPaddingException e) {
                e.printStackTrace();
            } catch (InvalidKeyException e) {
                e.printStackTrace();
            } catch (IllegalBlockSizeException e) {
                e.printStackTrace();
            } catch (BadPaddingException e) {
                e.printStackTrace();
        }
        return null;
    }
    
    
    /**��16����ת��Ϊ������ ����
    * @param hexStr
    * @return
    */
    public static byte[] parseHexStr2Byte(String hexStr) {
     
        if (hexStr.length() < 1)
            return null;   
        byte[] result = new byte[hexStr.length()/2];
        for (int i = 0;i< hexStr.length()/2; i++) {
            int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);
            int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }
     
    /**
    * ��������ת����16���� ����
    * @param buf
    * @return
    */
    public static String parseByte2HexStr(byte buf[]) {
         
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }
     
    public static void main(String[] args) {
     
        String content = "���Ĳ���N0QxNjk1MDlDRTg5QkIxMzg1QTA3ODhFREE3ODgxNEQ=N0QxNjk1MDlDRTg5QkIxMzg1QTA3ODhFREE3ODgxNEQ=N0QxNjk1MDlDRTg5QkIxMzg1QTA3ODhFREE3ODgxNEQ=N0QxNjk1MDlDRTg5QkIxMzg1QTA3ODhFREE3ODgxNEQ=N0QxNjk1MDlDRTg5QkIxMzg1QTA3ODhFREE3ODgxNEQ=";
        String encryptResultStr = encryptAES(content);
        System.out.println("����ǰ: "+content);
        System.out.println("���ܺ�: "+encryptResultStr);
        System.out.println("���ܺ�: "+decryptAES(encryptResultStr));
    }

}
