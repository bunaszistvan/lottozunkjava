package lottozunk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class Lottozunk {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set s=new HashSet();
        while(s.size()<5){
            int random=(int) ((Math.random()*90)+1);
            s.add(random);
        }
        
    //  System.out.println(s);
        Set szamok=new HashSet();
        System.out.println("Kérlek írj be 5 számot 1-90 között: ");
        int szam=0;
        while(szamok.size()<5){
            szam=sc.nextInt();
            if(szam>0 && szam<=90){
                szamok.add(szam);
            }
            else{
                System.out.println("1-90 közötti számot adj meg!");
            }
        }
        int talalat=0;
        Iterator i = s.iterator();
        while(i.hasNext()){
            Iterator i2 = szamok.iterator();
            int a = (int)i.next();
            while(i2.hasNext()){
                  int b= (int) i2.next();
                      if(a==b){
                           talalat++;
                      }
            } 
        }
        List<Integer> sortedList = new ArrayList<>(s);
        Collections.sort(sortedList);
        List<Integer> sortedList2 = new ArrayList<>(szamok);
        Collections.sort(sortedList2);
        if(talalat!=0){
            System.out.println("A sorsolt számok: "+sortedList);
            System.out.println("A te számaid: "+sortedList2);
            System.out.println("Gartulálok " +talalat+"db találatod van!");
        }
        else{
            System.out.println("A sorsolt számok: "+sortedList);
            System.out.println("A te számaid: "+sortedList2);
            System.out.println("Sajnos nem nyertél!");
        }
    }
    
}
    
    

