package com.linklate.subject.infra.basic.utils;

import com.alibaba.druid.filter.config.ConfigTools;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public class DruidEncryptUtil {

    private static String publicKey;

    private static String privateKey;

    static {
        try {
            String[] keyPair = ConfigTools.genKeyPair(512);
            privateKey = keyPair[0];
            System.out.println("privateKey: " + privateKey);
            publicKey = keyPair[1];
            System.out.println("publicKey: " + publicKey);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
    }

    public static String encrypt(String plainText) throws Exception {
        String encrypt = ConfigTools.encrypt(privateKey, plainText);
        System.out.println("encrypt: " + encrypt);
        return encrypt;
    }

    public static String decrypt(String plainText) throws Exception {
        String decrypt = ConfigTools.decrypt(publicKey, plainText);
        System.out.println("decrypt: " + decrypt);
        return decrypt;
    }

    public static void main(String[] args) throws Exception {
        String encrypt = encrypt("hlk932596");
        System.out.println("encrypt: " + encrypt);
    }

    /**
     * privateKey: MIIBVQIBADANBgkqhkiG9w0BAQEFAASCAT8wggE7AgEAAkEAteJ2HL5gyZKtXQMsJiaIJmJa6RxUyXbIw0Jcrg937c1iad2ilCres4oh0owuDuXWmnjTzAZmQ/Uz82lNDxE9VQIDAQABAkAY2C46Duc5oYd8xQoqy+idFaJFZVFPk6Ioyc/PFt3S5ZdXd/9fIYqzxJa51gYbeP4urf9g6frjmMFBSs+a10EBAiEA/5wEhp+rKo1eALCXBGaxGQteLMEl/9r7AgyYbaVUnikCIQC2KZsk5vmWtsdllOVg+ly6mCK3FoFZcGw3GtxJLK+zTQIhAO2PJhGsYZt5qW0Askov2tZI32y+0j85WOHtrNjyuHMJAiBU3ht23Nlpeyx4yh73yIzNLjX2QNjwl20DW1NIEDanfQIhANJBKN0cFrkIH00nN0zCLSEkh81YkB4IrBMEyDkYczS2
     * publicKey: MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBALXidhy+YMmSrV0DLCYmiCZiWukcVMl2yMNCXK4Pd+3NYmndopQq3rOKIdKMLg7l1pp408wGZkP1M/NpTQ8RPVUCAwEAAQ==
     * encrypt: TAM+6P1Wm/I5OnAfOpqaGCOlGTDSSIjjD8VhE05yrejkp+QJYJaQeNchdRiKTwjMmjSuH1JKqFjOS3oUQJol6A==
     * encrypt: TAM+6P1Wm/I5OnAfOpqaGCOlGTDSSIjjD8VhE05yrejkp+QJYJaQeNchdRiKTwjMmjSuH1JKqFjOS3oUQJol6A==
     */
}
