package com.co.jscoder.projects;

import java.util.Arrays;
import java.util.logging.Logger;

public class LinealSearch {
    static final Logger LOG = Logger.getLogger("paquete.NombreClase");
    public static void main(String[] args) {
        int[] array = { 10, 15, 20, 40, 50, 100, 120, 200, 400, 500, 600, 800, 2222 };
        int result = Arrays.binarySearch(array, 400);
       LOG.info("result = " + result + " bytes  " + result + " bytes " + result + " bytes " + result + " bytes");

    }
}
