package Presentation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("------------------------SHOP MENU------------------------");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.println("---------------------------------------------------------");
            System.out.println("Please enter your choice : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":{
                    break;
                }
                case "2":{
                    break;
                }
                case "3":{
                    break;
                }
                default:{
                    break;
                }
            }
        }while(true);
    }
}
