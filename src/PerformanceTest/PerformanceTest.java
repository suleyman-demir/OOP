package PerformanceTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PerformanceTest {
    public static void main(String[] args) {
        List <Integer> liste=new ArrayList();
        for (int i = 0; i < 10000000; i++) {
            liste.add(i);
        }
        long baslangicZamani = System.currentTimeMillis();
        boolean containsList = liste.contains(10000000);
        long bitisZamani = System.currentTimeMillis();
        System.out.println("List arama süresi: " + (bitisZamani - baslangicZamani) + " ms");

        Map<Integer,Integer> newMap=new HashMap();
        for (int i = 0; i < 10000000; i++) {
            newMap.put(i,i);
        }
        long baslangicZamani2 = System.currentTimeMillis();
        boolean containsList2 = newMap.containsKey(10000000);
        long bitisZamani2 = System.currentTimeMillis();
        System.out.println("List arama süresi: " + (bitisZamani2 - baslangicZamani2) + " ms");
    }
}
