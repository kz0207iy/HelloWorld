 class LoopProblem {
    public static void main(String[] args) {
        printAll();
        System.out.println(addAll());
        multiOfNum(5);
    }
    public static void printAll(){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for(int i = 0; i < arr.length; i++){
            System.out.println("I am " + arr[i]);
        }
    }
    public static int addAll(){
        int totalSum = 0;
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }

    public static void multiOfNum(int n ){
        int a =n;

        for (int i = 1; i <= 10; i++){
            System.out.println(a + " * " + i + " = " + (a * i));

        }

    }

}

class loopPractice{

}