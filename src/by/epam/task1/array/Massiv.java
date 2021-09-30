package by.epam.task1.array;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Massiv {
    static Logger logger = LogManager.getLogger();

    private double arr[];

    public Massiv(double arr[]) {
        this.arr = arr;

    }

    public double[] getArr() {
        return arr;
    }

    public void setArr(double[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Massiv massiv = (Massiv) o;
        return Arrays.equals(arr, massiv.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }
}

