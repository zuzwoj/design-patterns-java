package Root.Interfaces;

public interface Object {
    String ObjectName();
    String Print();
    boolean meetsCondition(String condition);
    String[] getFields();
    void setProperty(String key, String value);
}