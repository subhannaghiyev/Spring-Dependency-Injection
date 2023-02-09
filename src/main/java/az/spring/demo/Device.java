package az.spring.demo;

public class Device {
    public String name;
    public String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
