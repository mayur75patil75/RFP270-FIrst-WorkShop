package com.bl.reviewsession;

import java.util.HashSet;
import java.util.Set;

public class distinctelement {



        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {4, 5, 6, 7, 8};



            Set<Integer> distinctElements = new HashSet<>();

            for (int i = 0; i < arr1.length; i++) {
                distinctElements.add(arr1[i]);
            }

            for (int i = 0; i < arr2.length; i++) {
                distinctElements.add(arr2[i]);
            }

            System.out.print("Distinct elements in both arrays are: ");

            for (int element : distinctElements) {
                System.out.print(element + " ");
            }
        }
    }


