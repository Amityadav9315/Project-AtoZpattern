
import java.util.*;
public class AtoZpattern {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online


        // a
        public  static void A(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if(i==1||i==4||j==1||j==7){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        // b
        public  static void B(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if((i==1||i==4||i==7)&&j==7){
                        System.out.print(" ");
                    }
                    else if(i==1||i==4||i==7||j==1||j==7){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //c
        public  static void C(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if((i==1||i==7)&&j==1){
                        System.out.print(" ");
                    }
                    else if(i==1||i==7||j==1||(i==2||i==6)&&j==7){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //d
        public  static void D(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if((i==1||i==7)&&j==7){
                        System.out.print(" ");
                    }
                    else if(i==1||i==7||j==1||j==7){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //e
        public  static void E(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if(i==4&&j>5){
                        System.out.print(" ");
                    }
                    else if(i==1||i==7||i==4||j==1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //f
        public  static void F(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if(i==4&&j>5){
                        System.out.print(" ");
                    }
                    else if(i==1||i==4||j==1||i==2&&j==7){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //g
        public  static void G(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if((i==1||i==7)&&(j==1||j==7)||j==7&&(i==3||i==4)){
                        System.out.print(" ");
                    }
                    else if(i==1||i==7||j==1||j==7||i==5&&j>2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //h
        public  static void H(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){

                    if(i==4||j==1||j==7){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //i
        public  static void I(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if(i==1||i==7||j==4){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //j
        public  static void J(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if(i==7&&j==1){
                        System.out.print(" ");
                    }
                    else if(i==1||j==4||i==7&&j<4||j==1&&i>4){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //k
        public  static void K(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=5; j++){

                    if(j==1||i==4&&j==2||j==5&&(i==1||i==7)||j==4&&(i==2||i==6)||j==3&&(i==3||i==5)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //l
        public  static void L(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if(i==7||j==1||j==7&&i==6){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //m
        public  static void M(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){

                    if(j==1||j==7||i==4&&j==4||i==2&&(j==2||j==6)||i==3&&(j==3||j==5)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
        }

        //n
        public  static void N(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){

                    if(j==1||j==7||i==2&&j==2||i==3&&j==3||i==4&&j==4||i==5&&j==5||i==6&&j==6){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //o
        public  static void O(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if((j==1||j==7)&&(i==1||i==7)){
                        System.out.print(" ");
                    }
                    else if(i==1||i==7||j==1||j==7){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //p
        public  static void P(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if(j==7&&i>4||(i==1||i==4)&&j==7){
                        System.out.print(" ");
                    }
                    else if(i==1||i==4||j==1||j==7){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //q
        public  static void Q(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if((i==1||i==7)&&(j==1||j==7)){
                        System.out.print(" ");
                    }
                    else if(i==1||i==7||j==1||j==7||i==6&&j==6||i==5&&j==5){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //r
        public  static void R(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if((i==1||i==4)&&j==7||i==1&&j==1){
                        System.out.print(" ");
                    }
                    else if(i==1||i==4||j==1||i==7&&j==7||i==6&&j==6||i==5&&j==5||j==7&&i<4){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //s
        public  static void S(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if((j==1||j==7)&&(i==1||i==7)||j==7&&i<4||j==1&&i>4){
                        System.out.print(" ");
                    }
                    else if(i==1||i==4||i==7||j==1||j==7||i==1&&j==6){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //t
        public  static void T(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if(i==1||j==4){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //u
        public  static void U(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if(i==7&&(j==1||j==7)){
                        System.out.print(" ");
                    }
                    else if(i==7||j==1||j==7){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //v
        public  static void V(){
            for(int i=1; i<=5; i++){
                for(int j=1; j<=9; j++){
                    if(i==5&&j==5||i==1&&(j==1||j==9)||i==2&&(j==2||j==8)||i==3&&(j==3||j==7)||i==4&&(j==4||j==6)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //w
        public  static void W(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if(i==2&&j==2||i==3&&j==3){
                        System.out.print(" ");
                    }
                    else if(j==1||j==7||i==j||i==6&&j==2||i==5&&j==3) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //x
        public  static void X(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    //if(i==2&&j==2||i==3&&j==3){
                    //System.out.print(" ");
                    //}
                    if(i==j||i+j==8) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //y
        public  static void Y(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if(i==5&&j==5||i==6&&j==6||i==7&&j==7){
                        System.out.print(" ");
                    }
                    else if(i==j||j+i==8){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        //z
        public  static void Z(){
            for(int i=1; i<=7; i++){
                for(int j=1; j<=7; j++){
                    if(i==1||i==7||i+j==8) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the letter you want to print");
            String str=sc.nextLine();
            switch(str){
                case"A":
                    A();
                    break;
                case"B":
                    B();
                    break;
                case"C":
                    C();
                    break;
                case"D":
                    D();
                    break;
                case"E":
                    E();
                    break;
                case"F":
                    F();
                    break;
                case"G":
                    G();
                    break;
                case"H":
                    H();
                    break;
                case"I":
                    I();
                    break;
                case"J":
                    J();
                    break;
                case"K":
                    K();
                    break;
                case"L":
                    L();
                    break;
                case"M":
                    M();
                    break;
                case"N":
                    N();
                    break;
                case"O":
                    O();
                    break;
                case"P":
                    P();
                    break;
                case"Q":
                    Q();
                    break;
                case"R":
                    R();
                    break;
                case"S":
                    S();
                    break;
                case"T":
                    T();
                    break;
                case"U":
                    U();
                    break;
                case"V":
                    V();
                    break;
                case"W":
                    W();
                    break;
                case"X":
                    X();
                    break;
                case"Y":
                    Y();
                    break;
                case"Z":
                    Z();
                    break;
                default:
                    System.out.println("invalid credentals");
                    }
            }
    }



