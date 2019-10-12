package com.sharma.utils;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EncryptFile {

    public static void encrypt(String filePathName, String privateKey) {

        if (filePathName == null || filePathName.isEmpty()) {
            System.out.println("File Path Name can not be null or empty.");
            return;
        }

        if (privateKey == null || privateKey.isEmpty()) {
            System.out.println("Private key can not be null.");
            return;
        }

        //Read the file and convert into byte
        byte[] fileContent = new byte[filePathName.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(filePathName);
            int nextChar = fileInputStream.read();

            while (nextChar != -1) {
                System.out.print((char)nextChar);
                nextChar = fileInputStream.read();
            }

            fileInputStream.read(fileContent);
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(fileContent.toString());
        System.out.println(fileContent.length);

        try {
            byte[] key = privateKey.getBytes("utf-8");
            System.out.println("Key length in bytes == " + key.length);
            byte[] newKey = new byte[16];
            for(int i = 0; i < 16; i++) {
                newKey[i] = key[i];
            }
            System.out.println("New-Key length in bytes == " + newKey.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(newKey, "AES");
            byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            IvParameterSpec ivspec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivspec);
            byte[] cipherText = cipher.doFinal(fileContent);
            System.out.println("cipherText length == " + cipherText.length);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(filePathName);
                fileOutputStream.write(fileContent);
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
    }

    public static void decrypt(String filePathName, String privateKey) {

        if (filePathName == null || filePathName.isEmpty()) {
            System.out.println("File Path Name can not be null or empty.");
            return;
        }

        if (privateKey == null || privateKey.isEmpty()) {
            System.out.println("Private key can not be null.");
            return;
        }

        //Read the file and convert into byte
        byte[] fileContent = new byte[filePathName.length()];

        try {
            FileInputStream fileInputStream = new FileInputStream(filePathName);
            int nextChar = fileInputStream.read();

            while (nextChar != -1) {
                System.out.print((char)nextChar);
                nextChar = fileInputStream.read();
            }

            fileInputStream.read(fileContent);
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(fileContent.toString());
        System.out.println(fileContent.length);

        try {

            byte[] key = privateKey.getBytes("utf-8");
            System.out.println("Key length in bytes == " + key.length);
            byte[] newKey = new byte[16];
            for(int i = 0; i < 16; i++) {
                newKey[i] = key[i];
            }
            System.out.println("New-Key length in bytes == " + newKey.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(newKey, "AES");
            byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            IvParameterSpec ivspec = new IvParameterSpec(iv);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivspec);
            byte[] cipherText = cipher.doFinal(fileContent);

            try {
                FileOutputStream fileOutputStream = new FileOutputStream(filePathName);
                fileOutputStream.write(cipherText);
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String filePath = args[0];
        String privateKey = args[1];

        EncryptFile.encrypt(filePath, privateKey);
        EncryptFile.decrypt(filePath, privateKey);

    }

    public static byte[] computeHash(String x)
            throws Exception
    {
        java.security.MessageDigest d =null;
        d = java.security.MessageDigest.getInstance("SHA-1");
        d.reset();
        d.update(x.getBytes());
        return  d.digest();
    }

    public static String byteArrayToHexString(byte[] b){
        StringBuffer sb = new StringBuffer(b.length * 2);
        for (int i = 0; i < b.length; i++){
            int v = b[i] & 0xff;
            if (v < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(v));
        }
        return sb.toString().toUpperCase();
    }
}
