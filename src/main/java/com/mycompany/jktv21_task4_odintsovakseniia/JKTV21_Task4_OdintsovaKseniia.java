/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jktv21_task4_odintsovakseniia;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class JKTV21_Task4_OdintsovaKseniia {

    public static void main(String[] args) {
       
          Random random = new Random();
        System.out.println("--- Одномерный массив ---");
        int n =100;
        int [] nums = new int[10];
        for(int i = 0;i<nums.length;i++) {
            nums[i] = random.nextInt(100);
       
        }
        //Arrays.sort(nums);
        int sum = 0;
        int min = 100;
        int max = 0;
        for(int i = 0;i<nums.length;i++) {
            System.out.printf("%2d,",nums[i]);
            sum += nums[i];
            if(min > nums[i])min = nums[i];
            if(max < nums[i])max = nums[i];
            new Random().ints(10).average();
        }
       
        System.out.println();
        System.out.println("sum = "+sum);
        System.out.println("sum min = "+min);
        System.out.println("sum max = "+max);
        
        
    }
}
