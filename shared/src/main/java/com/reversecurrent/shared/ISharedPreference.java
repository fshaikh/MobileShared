package com.reversecurrent.shared;

/**
 * Created by fshaikh on 28/02/2015.
 */
public interface ISharedPreference {
    public String GetStringValue(String key,String defaultValue);
    public Boolean GetBooleanValue(String key,Boolean defaultValue);
    public int GetIntegerValue(String key,int defaultValue);

    public Boolean SetStringValue(String key,String value);
    public Boolean SetBooleanValue(String key,Boolean value);
    public Boolean SetIntegerValue(String key,int value);

    public Boolean RemoveKey(String key);

    public void Save();
}
