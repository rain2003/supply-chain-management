package project;

import project.bean.Buyer;
import project.bean.Application;
import project.bean.Seller;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Buyer obj1 = new Buyer();
//        Main o = new Main();
//        Seller sell = new Seller();
//        combinerating c = new combinerating();
//
//        //making objects of inventory class
//        Application I = new Application();
//        Application I2 = new Application();
//
//        I.P_id=121;
//        I2.P_id=122;
//        I.P_name="Shoes";
//        I2.P_name="Watch";
//        I.P_Price="$50";
//        I2.P_Price="$80";
//        I.P_quantity=4;
//        I2.P_quantity=5;
//
//
//        //
//
//        System.out.println("Supply management system");
//        int i;
//        int u;
//        int chosen_pid;
//        int chosen_quan;
//        System.out.println("Enter your choice (1,2,3)");
//        i = sc.nextInt();
//        if(i==1){
//            System.out.println("welcome to Buyer Section");
//            System.out.println("Please enter details");
//            obj1.name = sc.nextLine();
//            obj1.phoneNo = sc.nextLine();
////            obj1.address = sc.nextLine();
//            obj1.age = sc.nextInt();
//            obj1.gender = sc.nextLine();
//            System.out.println("Welcome "+obj1.name);
//            System.out.println("Please Select the task : ");
//            System.out.println("1 -> View Inventory");
//            System.out.println("2 -> Buy Products" );
//                u = sc.nextInt();
//                //
//                if(u==1){
//                    System.out.println("Products list as follows : ");
//                    System.out.println("Pid      Name      Price       Quantity");
//                    System.out.println(I.P_id+"       "+I.P_name+"       "+I.P_Price+"        "+I.P_quantity);
//                    System.out.println(I2.P_id+"       "+I2.P_name+"       "+I2.P_Price+"        "+I2.P_quantity);
//
//                }
//                if(u==2){
//                    System.out.println("Available Products : ");
//                    System.out.println("Pid        Name        Price      Quantity");
//                    System.out.println(I.P_id+"       "+I.P_name+"       "+I.P_Price+"        "+I.P_quantity);
//                    System.out.println(I2.P_id+"       "+I2.P_name+"       "+I2.P_Price+"        "+I2.P_quantity);
//                    System.out.println("Enter chossen pid : ");
//                    chosen_pid = sc.nextInt();
//
//                        if (chosen_pid == 121) {
//                            System.out.println("Choosen Id : " + I.P_id);
//                            System.out.println("Enter Quantity : ");
//
//                            chosen_quan = sc.nextInt();
//
//
//
//                            I.P_quantity = I.P_quantity - chosen_quan;
//                            System.out.println("Succesfully buyed ! ");
//                            System.out.println("Updated Available Items : ");
//                            System.out.println("Pid      Name      Price       Quantity");
//                            System.out.println(I.P_id + "       " + I.P_name + "       " + I.P_Price + "        " + I.P_quantity);
//                            System.out.println(I2.P_id + "       " + I2.P_name + "       " + I2.P_Price + "        " + I2.P_quantity);
//                            System.out.println("Please give feedback ");
//                            c.Rating();
//                            c.review();
//
//
//                        }
//
//
//                    if(chosen_pid==122){
//                        System.out.println("Choosen Id : "+I2.P_id);
//                        System.out.println("Enter Quantity : ");
//                        chosen_quan=sc.nextInt();
//                        I2.P_quantity=I2.P_quantity-chosen_quan;
//                        System.out.println("Succesfully buyed ! ");
//                        System.out.println("Updated Available Items : ");
//                        System.out.println("Pid      Name      Price       Quantity");
//                        System.out.println(I.P_id+"       "+I.P_name+"       "+I.P_Price+"        "+I.P_quantity);
//                        System.out.println(I2.P_id+"       "+I2.P_name+"       "+I2.P_Price+"        "+I2.P_quantity);
//                        System.out.println("Please give feedback ");
//                        c.Rating();
//                        c.review();
//
//                    }
//                }
//                //
//
//
//        }
//        if(i==2){
//            System.out.println("welcome to Seller Section");
//            System.out.println("Please enter details");
//            obj1.name = sc.nextLine();
//            obj1.phoneNo = sc.nextLine();
////            obj1.address = sc.nextLine();
//            obj1.age = sc.nextInt();
//            obj1.gender = sc.nextLine();
//            System.out.println("Welcome "+obj1.name);
//            System.out.println("Please Select the task : ");
//            System.out.println("1 -> View Inventory");
//            System.out.println("2 -> Add product" );
//            u = sc.nextInt();
//            if(u==1){
//                System.out.println("Products list as follows : ");
//                System.out.println("Pid      Name      Price       Quantity");
//                System.out.println(I.P_id+"       "+I.P_name+"       "+I.P_Price+"        "+I.P_quantity);
//                System.out.println(I2.P_id+"       "+I2.P_name+"       "+I2.P_Price+"        "+I2.P_quantity);
//                System.out.println(sell.arr[1]+"       "+sell.arr[2]+"        "+sell.arr[3]+"         "+sell.arr[4]);
//
//            }
//            if(u==2){
//                System.out.println("Products list as follows : ");
//                System.out.println("Pid      Name      Price       Quantity");
//                System.out.println(I.P_id+"       "+I.P_name+"       "+I.P_Price+"        "+I.P_quantity);
//                System.out.println(I2.P_id+"       "+I2.P_name+"       "+I2.P_Price+"        "+I2.P_quantity);
//                System.out.println("Add product details");
//
//                sell.arr[80]= sc.nextLine();
//                System.out.println("enter p_id");
//                sell.arr[1]=sc.nextLine();
//                System.out.println("enter name");
//                sell.arr[2]=sc.nextLine();
//                System.out.println("enter price");
//                sell.arr[3]=sc.nextLine();
//                System.out.println("enter quantity");
//                sell.arr[4]=sc.nextLine();
//                System.out.println("product Added");
//                System.out.println("Pid      Name      Price       Quantity");
//                System.out.println(sell.arr[1]+"       "+sell.arr[2]+"        "+sell.arr[3]+"         "+sell.arr[4]);
//
//                System.out.println("Updated Available items :");
//                System.out.println("Pid      Name      Price       Quantity");
//                System.out.println(I.P_id+"       "+I.P_name+"       "+I.P_Price+"        "+I.P_quantity);
//                System.out.println(I2.P_id+"       "+I2.P_name+"       "+I2.P_Price+"        "+I2.P_quantity);
//                System.out.println(sell.arr[1]+"       "+sell.arr[2]+"        "+sell.arr[3]+"         "+sell.arr[4]);
//
//            }
//        }

    }


}
