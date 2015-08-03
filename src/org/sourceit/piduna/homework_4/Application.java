package org.sourceit.piduna.homework_4;

import java.util.Scanner;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size of Stack ");
        int n = scan.nextInt();
        StackImpl stack = new StackImpl(n);

        char achar;
        do{
            System.out.println("\nStack settings:");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. check empty");
            System.out.println("4. check full");
            System.out.println("5. check size");
            System.out.println("6. clear stack");
            System.out.println("7. exit");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Push");
                    try
                    {
                        stack.push( scan.next() );
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 2 :
                    try
                    {
                        System.out.println("Popped = " + stack.pop());
                    }
                    catch (Exception e)
                    {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 3 :
                    System.out.println("Empty is = " + stack.isEmpty());
                    break;
                case 4 :
                    System.out.println("Full is = " + stack.isFull());
                    break;
                case 5 :
                    System.out.println("Size = " + stack.getSize());
                    break;
                case 6 :
                    System.out.printf("Clear ... ");
                    stack.clear();
                    break;
                case 7 :
                    System.out.printf("Exit\n");
                    System.exit(0);;
                default :
                    System.out.println("Wrong enter\n ");
                    break;
            }

            stack.print();
            System.out.println("\nDo you want to continue (Type y or any button) \n");
            achar = scan.next().charAt(0);

        } while (achar == 'Y'|| achar == 'y');
    }
}
