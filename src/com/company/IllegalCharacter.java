package com.company;

public class IllegalCharacter extends Exception
{
    private char illegal_character;

    public IllegalCharacter(char illegal_character)
    {
        this.illegal_character= illegal_character;
    }

    public String toString()
    {
        return
                "Warning: Use of illegal character (" +illegal_character +")!!!"
                        +"\nConsider letters from range (A-Z) or (a-z) or both";
    }
}
