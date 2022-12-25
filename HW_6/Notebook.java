package HW_6;

public class Notebook {
    private String name;
    private Integer ram;
    private Integer hardDisk;
    private String operatingSystem;
    private String colour;

    public Notebook(String name, Integer ram, Integer hardDisk, String operatingSystem, String colour) {
        this.name = name;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }


    public Integer getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(Integer hardDisk) {
        this.hardDisk = hardDisk;
    }


    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return "[name=" + name + ", ram=" + ram + ", hardDisk=" + hardDisk + ", operatingSystem="
                + operatingSystem + ", colour=" + colour + "]";
    }

}
