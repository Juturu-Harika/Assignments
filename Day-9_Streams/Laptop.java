package Assignments.StreamsEx;

import java.util.Date;

public class Laptop {
    public String model;
    public String processor;
    public int ram;
    int graphics;
    int hardDisk;
    Date manuDate;

    public Laptop(String model,String processor, int ram, int graphics, int hardDisk, Date manuDate) {
        this.model=model;
        this.processor=processor;
        this.ram=ram;
        this.graphics=graphics;
        this.hardDisk=hardDisk;
        this.manuDate=manuDate;
    }
}

