
package datecal;
import java.io.*;
import java.util.*;
public class Datecal {
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
    System.out.println("enter the date:  ");
    int date=in.nextInt();
    int year=date%10000;
    int mon=date/10000;
    int month=mon%100;
    int day=mon/100;
    int leapyear=year%4;
   
             int yearcode=0;
             if(year >=1600 && year<=1699)
                 yearcode=6;
             else if(year >=1700 && year<=1799)
              yearcode=4;
             else if(year >=1800 && year<=1899)
              yearcode=2;
             else if(year >=1900 && year<=1999)
              yearcode=0;
             else 
              yearcode=6;
           int last2yearvalue=year%100;
           int yearby4=last2yearvalue/4;
          
            int  totalvalue=0;
           int tt=0;
           
                   if(month==1 && day>=1 && day<=31){
                     System.out.println("valid date");
                     tt=((totalvalue=day+0+last2yearvalue+yearby4+yearcode)%7)+1;
                     
                   }
                   else if(month==2 && leapyear==0 && day>=1 && day<=29)
                   {
                    System.out.println("valid date");
                       tt=((totalvalue=day+3+last2yearvalue+yearby4+yearcode)%7)+1;
                   
                   }
                   else if(month==2 && leapyear!=0 && day>=1 &&day<=28){
                     System.out.println("valid date");
                   tt=((totalvalue=day+3+last2yearvalue+yearby4+yearcode)%7)+1;
                   }
                   
                  
                  else if(month==3 && day>=1 && day<=31){
                   System.out.println("valid date");
                   tt=((totalvalue=day+3+last2yearvalue+yearby4+yearcode)%7)+1;
                   }
                   
                  else if(month==4 && day>=1 &&  day<=30){
                   System.out.println("valid date");
                   tt=((totalvalue=day+6+last2yearvalue+yearby4+yearcode)%7)+1;
                   }
                   
                  else if(month==5 && day>=1 && day<=31){
                   System.out.println("valid date");
                   
                   tt=((totalvalue=day+1+last2yearvalue+yearby4+yearcode)%7)+1;
                   }
                  
                  else if(month==6 && day>=1 && day<=30){
                   System.out.println("valid date");
                   tt=((totalvalue=day+4+last2yearvalue+yearby4+yearcode)%7)+1;
               }
                  
                   else if(month==7 && day>=1 &&  day<=31){
                   System.out.println("valid date");
                   tt=((totalvalue=day+6+last2yearvalue+yearby4+yearcode)%7)+1;
                }
                   
                  else if(month==8 && day>=1 && day<=31){
                   System.out.println("valid date");
                   tt=((totalvalue=day+2+last2yearvalue+yearby4+yearcode)%7)+1;
                  }
                   
                  else if(month==9 && day>=1 && day<=30){
                   System.out.println("valid date");
                   tt=((totalvalue=day+5+last2yearvalue+yearby4+yearcode)%7)+1;
                  }
                   
                  else if(month==10 && day>=1 && day<=31){
                   System.out.println("valid date");
                   tt=((totalvalue=day+0+last2yearvalue+yearby4+yearcode)%7)+1;
                   }
                   
                  else if(month==11 && day>=1 && day<=30){
                   System.out.println("valid date");
                   tt=((totalvalue=day+3+last2yearvalue+yearby4+yearcode)%7)+1;
                  
                  }
                   
                  else if(month==12 && day>=1 && day<=31){
                   System.out.println("valid date");
                   tt=((totalvalue=day+5+last2yearvalue+yearby4+yearcode)%7)+1;
                  }
                   else
                      System.out.println("invalid date");
                   
                   
                   if(tt==1)
                       System.out.println("sunday");
                   else if(tt==2)
                       System.out.println("monday");
                   else if(tt==3)
                       System.out.println("tuesday");
                   else if(tt==4)
                       System.out.println("wednesday");
                   else if(tt==5)
                       System.out.println("thursday");
                   else if(tt==6)
                       System.out.println("friday");
                   else if(tt==7)
                       System.out.println("saturday");
                   else
                       System.out.println("");
     }
    }

