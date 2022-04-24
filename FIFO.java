/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifo;

import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class FIFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        CircleStaticFIFO line = new CircleStaticFIFO(10);
        
        int op, num, i, num02;
        do{
            System.out.println("Enter you option: \n"
                    + "1 - Insert a number in the line; \n"
                    + "2 - Remove a number in the line; \n"
                    + "3 - See the head of line; \n"
                    + "4 - See all numbers of line \n"
                    + "5 - Exit. \n");
            op = in.nextInt();
            
            switch(op)  {
                case 1:
                    System.out.println("How many numbers do you wish to insert?");
                    num = in.nextInt();
                    for(i = 0; i < num; i++)    {
                        System.out.print("Input the " + (i + 1) + " number: ");
                        num02 = in.nextInt();
                        num02 = num02 - 1;
                        line.insert(num02);
                    }
                    break;
                case 2:
                    System.out.println("How many numbers do you wish to remove?");
                    num = in.nextInt();
                    for(i = 0; i < num; i++)    {
                        line.remove(); 
                    }
                    break;
                case 3:
                    line.nextElement();
                    break;
                case 4:
                    line.seeArray();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(op >= 1 && op <= 5);
    }
    
}
