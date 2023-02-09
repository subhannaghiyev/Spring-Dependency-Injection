package az.spring.demo;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
public class Employee {
    public String name;
    public String surname;
    public int age;
    public double salary;


    public List<Device> devices;

    public Map<String, Device> devicesMap;


    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public void setDevicesMap(Map<String, Device> devicesMap) {
        this.devicesMap = devicesMap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", devices=" + devices +
                ", devicesMap=" + devicesMap +
                '}';
    }
}