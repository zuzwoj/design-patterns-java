package Root.Interfaces;

public interface Room {
    int getAnimalsCount();
    int getNumber();
    void setNumber(int number);
    Root.Primary.Employee getResponsibleEmployee();
    void setResponsibleEmployee(Root.Primary.Employee employee);
}