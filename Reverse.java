/*A) Write a  program to accept a string from user and reverse it using Static implementation of
Stack.*/
package day4assignment;

public class Reverse 
	{

		 private  int MaxSize, tos;

		    private char stack[];



		    public void create_Stack(int size) {

		        tos = -1;//init tos

		        stack = new char[size];//create stack

		        MaxSize = size;//init MaxSize

		    }



		    void push(char e) {

		        tos++;

		        stack[tos] = e;

		        System.out.println("Element " + e + " Pushed:");

		    }



		    boolean is_Full() {

		        if (tos == MaxSize - 1)

		            return true;

		        else

		            return false;

		    }



		    char pop() {

		        char temp = stack[tos];

		        tos--;

		        return (temp);



		        //return(stack[tos--]);

		    }



		    boolean is_Empty() {

		        if (tos == -1)

		            return true;

		        else

		            return false;

		    }



		    char peek() {

		        return (stack[tos]);

		    }



		    void print_Stack() {//lifo print

		        System.out.println("Stack has");

		        for (int i = tos; i >= 0; i--) {

		            System.out.println(stack[i]);

		        }



		    

		}



}
