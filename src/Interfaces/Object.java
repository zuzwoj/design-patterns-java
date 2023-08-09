package Interfaces;

public interface Object {
    String getName();
    String Print();
    boolean meetsCondition(String condition);
    String[] getFields();
    void setProperty(String key, String value);
}