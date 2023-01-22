package ENCRIPTACION;

import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class EncriptadorAES256 {
    //private static final long serialVersionUID = 5486865543976730876L;
    private static final String key = "$F&2xXJt1wT7jBB2663orbv3448l%Nd2";
    private static final String salt = "Bs5PPkDOtHxYDuEI1N7woU2*3FOS@6gV";
    
    private SecretKey secretKeyTemp;
    
    public EncriptadorAES256() {
        SecretKeyFactory secretKeyFactory;
        KeySpec keySpec;
        try {
            secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
            keySpec = new PBEKeySpec(key.toCharArray(), salt.getBytes(), 65536, 256);
            secretKeyTemp = secretKeyFactory.generateSecret(keySpec);
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
    public String getAESEncrypt(String data) { 
        byte[] iv = new byte[16];
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            SecretKeySpec secretKey = new SecretKeySpec(secretKeyTemp.getEncoded(), "AES"); 
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);
            return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes("UTF-8"))); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    return null;
    }
    public String getAESDecrypt(String data) {
        byte[] iv = new byte[16];
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            SecretKeySpec secretKey = new SecretKeySpec(secretKeyTemp.getEncoded(),"AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(data)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args) {
        try {
            String dato="rogerto";
            EncriptadorAES256 encriptador=new EncriptadorAES256();
            String encriptado = encriptador.getAESEncrypt(dato);
            String desencriptado = encriptador.getAESDecrypt("XY0MNTo2NKS2022k4zmNXA==");
            System.out.println("Cadena Origina: " + dato);
            System.out.println("encriptado: "+encriptado);
            System.out.println("desencriptado: "+ desencriptado);
        } catch (Exception e) {
            
        }
    }
}
