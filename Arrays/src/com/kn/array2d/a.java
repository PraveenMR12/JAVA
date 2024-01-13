package com.kn.array2d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class a{
    public static void main(String [] args)
    
    {
//        int a =102525;
//        int b=121145145;
//        double c = b/a;
//        int e=a/b;
//        System.out.println(c);
//        System.out.println(e);
//        System.out.println();
//        char d = 'c';
//        System.out.println((int)d);
//        List<Integer> ge = new ArrayList<Integer>();
//        
//        int x =6;
//        float y =11.1f;
//        System.out.println(x+y);
////        System.out.println("Hello"");
        
        
        
                int av[] = new int[20];
                for (int i = 0; i <= 16; ++i) {
                    av[i] = i / 3;
                    av[i]++;
                    System.out.print(av[i] + " ");
                    i++;
                }
          
                String d1=new  String("d");
                String d2=new  String("D");
                System.out.println(d1=d2);
                System.out.println("hi");
        
                LinkedList<Integer> ll = new LinkedList<Integer>();
                for (int i = 0; i < ll.size(); i++) {
					System.out.println(ll.get(i));
				}
                
//                Integer arr[] = {};
                List<Integer> l = Arrays.asList(1,15,3,10,27);
                int sum = l.stream().filter(i-> i%3==0).mapToInt(Integer::intValue).sum();
                System.out.println(sum);
         
        
    }
}
