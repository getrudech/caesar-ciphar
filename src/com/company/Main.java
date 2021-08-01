package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
            throws IllegalKey, IllegalCharacter
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Content: ");
        String content = input.nextLine();
        for(char ch : content.toCharArray())
        {
            if(!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z') && ch != ' ')
                throw new IllegalCharacter(ch);
        }

        System.out.print("Enter Key: ");
        int key = input.nextInt();
        if(!(key >= 1 && key <= 25))
            throw new IllegalKey(key);

        System.out.println();

        Encrypt encrypt = new Encrypt();
        encrypt.setEncryption_key(key);
        encrypt.setEncrypt_this(content);
        System.out.println("Original Content: " + encrypt.getEncrypt_this());
        System.out.println("Encrypted Content: " +encrypt.encrypt_data());

        Decrypt decrypt = new Decrypt();
        decrypt.setDecryption_key(encrypt.getEncryption_key());
        decrypt.setDecrypt_this(encrypt.getEncrypted_data());
        System.out.println("Decrypted Content: " +decrypt.decrypt_data());
    }
}
