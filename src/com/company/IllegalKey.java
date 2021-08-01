package com.company;

public class IllegalKey extends Exception
{
    int illegal_key;
    public IllegalKey(int illegal_key)
    {
        this.illegal_key= illegal_key;
    }

    public String toString()
    {
        return
                "Warning: Illegal key (" +illegal_key +")!!!"
                        +"\nConsinder key from range (1 - 25)";
    }
}
