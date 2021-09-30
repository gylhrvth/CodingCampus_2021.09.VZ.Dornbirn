package Lena;

public class Stack {

    public static void main(String[] args) {

        Stack stack1 = new Stack(5);


        stack1.push(5);
        stack1.push(4);
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);



        System.out.println();

        PermutationCheck(stack1);

    }

    int size;
    int [] stack;

    public Stack(int size) {
        this.size = size;
        this.stack = new int[this.size];

    }


    public boolean isEmpty() {
        boolean isEmpty =true;
        for (int i =0; i<this.stack.length;i++){
            if(this.stack[i]!=0){
               return isEmpty=false;
            }
        }
        return isEmpty;
    }

    public void push(int item) {
        for (int i = 0; i<this.stack.length; i++){
            if(this.stack[i]==0){
                this.stack[i]=item;
                break;
            }
        }
    }

    public int pop() {
        int item=0;
        for (int i =this.stack.length-1; i>=0;i--){
            if(this.stack[i]!=0){
                item= this.stack[i];
                this.stack[i]=0;
                break;
            }
        }
        return item;
    }

    public int top() {
        int item=0;
        for (int i =0; i<this.stack.length;i++){
            if(this.stack[i]!=0){
                item= this.stack[i];
                break;
            }
        }
        return item;
    }


    public static void PermutationCheck(Stack order){
        Stack gleis2 = new Stack(5);
        Stack helpSteck = new Stack(5);
        int cache;

        for(int count=0;count<10; count++) {

            if (count == 0 || count == 2 || count == 3 || count == 5 || count == 6) {
                cache=order.pop();
                helpSteck.push(cache);
            }else {
                cache=helpSteck.pop();
                gleis2.push(cache);
            }
        }
        while (!gleis2.isEmpty()){
            System.out.println(gleis2.pop());
        }

    }


}
