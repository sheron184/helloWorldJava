public class Stack{
	public void getBack(int max,int[] nums,int top){ 
		Drive drive = new Drive();
		drive.getCmd(max,nums,top);//this will return to the Drive class's getCmd method and waiting for the command
	}
	public void push(int val,int max,int[] nums,int top){ //push value
		if(top<max-1){
			top=top+1;
			nums[top]=val;
			System.out.println(">"+val+" is inserted!");
		}else{
			System.out.println(">Stack Overflow!");
		}		
		getBack(max,nums,top);//going back to wait for a command from user 
	}
	public void print(int[] nums,int max,int top){ //printing the array
		if(top>-1){
			System.out.print(">");
			for(int i=0;i<nums.length;i++){
				if(nums[i]!=0){
					System.out.print(nums[i]+" ");
				}
			}
			System.out.print("\n");
		}else{
			System.out.println(">Stack is empty!");
		}		
		getBack(max,nums,top);//going back to wait for a command from user
	}
	public void pop(int max,int[] nums,int top){ //pop-delete last entered value
		if(top>-1){ //check is the stack empty
			nums[top]=0;
			top = top-1;
		}else{
			System.out.println(">Stack is empty!");
		}
		getBack(max,nums,top);//going back to wait for a command from user
	}
	public void peek(int[] nums,int max,int top){
		if(top>-1){
			System.out.println(">Peek value = "+nums[top]);
		}else{
			System.out.println(">Stack is empty!");
		}
		getBack(max,nums,top);//going back to wait for a command from user
	}
}
//-----SJTECH-----//