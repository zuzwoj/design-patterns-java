package Interfaces;

public interface Room {
    int getAnimalsCount();
    int getNumber();
    void setNumber(int number);
    Primary.Employee getResponsibleEmployee();
    void setResponsibleEmployee(Primary.Employee employee);
}