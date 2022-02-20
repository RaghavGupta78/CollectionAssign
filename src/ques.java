class SpecialStack{

    public int[] specialStk = new int[5];
    public int top=-1;
    int minEl;

    public Boolean isEmpty(){
        if(top<0){

            System.out.println("STACK IS EMPTY ADD SOME ELEMENTS");
            return true;
        }
        else {
            return false;
        }

    }
    public Boolean isFull(){
        if(top>=4){

            System.out.println("STACK IS FULL POP SOME ELEMENTS");
            return true;
        }
        else {
            return false;
        }

    }

    public void push(int num){
        if(isEmpty()==true){
            minEl = num;
            System.out.println("ELEMENT ADDED IS "+num);
            top++;
            specialStk[top]=num;
        }
        else if(isFull()==false && isEmpty()==false){
            if (num < minEl)
            {

                top++;
                specialStk[top]=num;
                //specialStk[top]= 2*num-minEl;
                System.out.println("ELEMENT ADDED IS " + num);
                minEl = num;
            }
            else{

                top++;
                specialStk[top] = num;
                System.out.println("ELEMENT ADDED IS " + num);
            }
        }

    }
    public void pop(){
        if(isEmpty()==false){
            if (top < minEl)
            {
                System.out.println("ELEMENT REMOVED IS "+minEl);
                minEl = 2*minEl - top;
            }
            else {
                System.out.println();
                System.out.println("ELEMENT REMOVED IS " + specialStk[top]);
                top--;
            }
        }


    }

    public int getMin(){
        return minEl;
    }

    public void printStack(){

        System.out.println("THE CURRENT STACK IS");
        for(int i=0;i<=top;i++){
            System.out.println(specialStk[i]);
        }
    }
}
public class ques {
    public static void main(String[] args) {
        SpecialStack s = new SpecialStack();
        int currMin;
        System.out.println("SIZE OF THE SPECIAL STACK IS 5");
        s.push(5);
        s.push(3);
        s.push(8);
        System.out.println();
        currMin= s.getMin();
        System.out.println("CURRENT MINIMUM IS "+currMin);
        System.out.println();
        s.push(2);
        s.push(9);
        s.push(11);
        System.out.println();
        currMin= s.getMin();
        System.out.println("CURRENT MINIMUM IS "+currMin);
        System.out.println();
        s.printStack();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();

    }
}
