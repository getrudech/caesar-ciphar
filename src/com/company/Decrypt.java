package com.company;

public class Decrypt
{
    private int decryption_key;
    private String decrypt_this, decrypted_data;

    public Decrypt()
    {
        decrypt_this= "";
        decryption_key= 0;
        decrypted_data= "";
    }

    public int getDecryption_key()
    {
        return decryption_key;
    }

    public void setDecryption_key(int decryption_key)
    {
        this.decryption_key= decryption_key;
    }

    public String getDecrypt_this()
    {
        return decrypt_this;
    }

    public void setDecrypt_this(String decrypt_this)
    {
        this.decrypt_this= decrypt_this;
    }

    public String decrypt_data()
    {
        for(int c = 0; c < decrypt_this.length(); ++c)
        {
            if(decrypt_this.charAt(c) != ' ')
            {
                char character= decrypt_this.charAt(c);
                int character_value= character - decryption_key;

                if(character >= 'A' && character <= 'Z' && character_value < 65)
                {
                    character_value = 90 - (64 - character_value);
                }
                else if(character >= 'a' && character <= 'z' && character_value < 97)
                {
                    character_value = 122 - (96 - character_value);
                }
                decrypted_data += (char)character_value;
            }
            else decrypted_data += ' ';
        }
        return decrypted_data;
    }
}
