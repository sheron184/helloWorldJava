import java.util.Scanner;
public class Drive{
	public static void getCmd(int max,int [] nums,int top){
		Scanner myObj = new Scanner(System.in);  //getting the new command
		System.out.print(">");
		String cmd = myObj.nextLine(); 
    	Stack stack = new Stack();//creating a new object from stack class for access the methods
    	switch(cmd){ //checking what is the command
    		case "push":
	    		Scanner pushVal = new Scanner(System.in); //getting the value for insert
	    		System.out.print(">Enter value:");
	    		int pushV = pushVal.nextInt();
	    		stack.push(pushV,max,nums,top); //calling the push method in stack class
	    		break;
	    	case "pop":
	    		stack.pop(max,nums,top); //pop method
	    		break;
	    	case "print":
	    		stack.print(nums,max,top); //print method
	    		break;
	    	case "peek":
	    		stack.peek(nums,max,top); //peek method
	    		break;
	    	case "exit": //exit here
	    		break;
	    	default:
	    		System.out.println("Invalid command");
    	}
	}
	public static boolean exit(){
		return true; //this will kill the process
	}
	public static void main(String[] args){
		//printing the commands
		System.out.println("#commands# \n~push(add new value)\n~pop(delete last inserted value) \n~print(print stack) \n~peek(returns top value) \n~exit(end the process)");
		System.out.println("");
		int max = 5; //length of the array
		int nums[] = new int[max];
		int top=-1;
		getCmd(max,nums,top); //calling the method to get the command   
	}	
}	

//-----SJTECH-----//
