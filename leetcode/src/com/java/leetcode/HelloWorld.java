package com.java.leetcode;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int number =7;int limit=25;
        // 1234321234321234
        //34
        printPattern(number,limit);
        getLastTwoNumbers(number,limit);
    }
    static void getLastTwoNumbers(int friends,int time){
        int period = 2*(friends-1);
        int passer=1;
        int reciever =2;
        int modulo = time%period;
        if(modulo == 0){
            passer=2;
            reciever=1;
        }else if(modulo<friends){
           passer = modulo;
           reciever=passer+1;
        }
        else if(modulo==friends){
            passer=modulo;
            reciever=passer-1;
        }else {
            int diff = modulo -friends;
            passer = friends-diff;
            reciever=passer -1;
        }
        
        System.out.println("Passer: "+ passer + " Receiver: "+ reciever);
    }
    static void printPattern(int num,int limit){
        int reverse = 0;
        int[] pattern = new int[limit+2];
              int value=1;
              pattern[0]=0;
        for(int i=1;i<=limit+1;i++){
            pattern[i]=value;
            System.out.print(pattern[i]+ " ");
            if(value==num){
                value=num-1;
            }else if(value==1){
                value++;
            } else if(pattern[i-1]<pattern[i]){
                value++;
            }else {
                value --;
            }
           
           
        }
    }
}