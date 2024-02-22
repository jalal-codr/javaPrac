import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        System.out.println(sumFib(10));
//        System.out.println("Enter your name: ");
//        String name =input.next() ;
//        System.out.println("Enter your age: ");
//        int age = input.nextInt();
//        Person Jalal = new Person(name, age);
//        System.out.println(Jalal.getName()+" is "+Jalal.getAge()+" years old");
//
//        Person[] arr = new Person[1] ;
//        arr[0] = Jalal;
//        System.out.println(arr[0].getName());
//        int [] g = {1,2,3,4,5};
//        int [] k = reverseArr(g);
//        System.out.println(Arrays.toString(k));
//        Node head = new Node(5);
//        Node node1 = new Node(4);
//        Node node2 = new Node(3);
//        Node tail = new Node(2);
////
//        head.next = node1;
//        node1.next = node2;
//        node2.next = tail;


//
//        System.out.println(countNodes(head));
//        System.out.println(fact(3));
//
        Node head = new Node(0);
        Node left = new Node(1);
        Node right = new Node(2);
        Node leftLeft = new Node(3);
        Node leftRight = new Node(4);
        Node rightLeft = new Node(5);
        Node rightRight = new Node(6);
//
//
        head.left=left;
        head.right=right;
        head.left.left=leftLeft;
        head.left.right =leftRight;
        head.right.right=rightRight;
        head.right.left=rightLeft;


//        int sum = sumTree(head);
//        System.out.println(sum);

//
//        System.out.println(sumNode(head));
//        int num =  2345;
//        String numString = Integer.toString(num);
//        int [] arri  = new int[numString.length() - 1];
//
//        for (int i =0; i< numString.length() -1; i++){
//            arri[i]  = numString.charAt(i);
//        }
//        System.out.println(Arrays.toString(arri));

//
        int  []newArr  = new int [] {7,0,5,2,6};
        int []newSortArr = bubleSort(newArr);
        System.out.println(Arrays.toString(newSortArr));
//
//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        for(int i =0; i<newArr.length;i++){
//            hashMap.put(newArr[i],i);
//        }
//        System.out.println(hashMap.get(5));

        String name = "Ala";
        System.out.println(isPald(name));




    }
    public static   int[] reverseArr (int[]arr){
        int length = arr.length - 1;
       int [] newArr = new int[length];

       int i = length;
       int j = 0;
       while ( i>0){
           while (j<length){
               newArr[j] = arr[i];
               j++;
               i--;
           }
       }


       return (newArr);
    }
//    public static   int countNodes(Node head){
//        int count = 0;
//        Node current = head;
//        if(head!=null){
//            count +=1;
//            while (current.next != null){
//                count += 1;
//                current  = current.next;
//            }
//        }
//        return count;
//
//
//    }

    static int fact (int n){
        if (n>1) {
            return (n*fact(n-1));
        }
        else {
            return (1);
        }
    }
    static int fib(int n){
        if(n>3){
            return (fib(n-1)+fib(n-2));
        }
        else {
            return (1);
        }
    }
    static int sumFib(int n){
        if(n>3){
            return (fib(n-1)+fib(n-2));
        }else{
            return (1);
        }
    }
//    static int sumNode(Node head){
//        if(head==null){
//            return (0);
//        }
//        else {
//            return (head.data+sumNode(head.right)+sumNode(head.left));
//        }
//    }

//    static  int partition (int []arr,int l,int r){
//        int pivot = arr[r];
//
//
//    }

    static int []  sort(int []arr, int l, int r){
        if(l>=r){
            return arr;
        }
        else {
            return arr;
        }

    }

//    public int sumNodes(Node head){
//        if(head==null){
//            return (0);
//        }else {
//            return (head.data+sumNode(head)+sumNode(head.next));
//        }
//    }
//    public int returnNodes(Node head) {
//        if (head.data > 3) {
//            return (0);
//        } else {
//            return (head.data + returnNodes(head.left) + returnNodes(head.right));
//        }
//    }
//
//    static int sumTree(Node head){
//        if(head==null){
//            return 0;
//        }
//        else {
//            return ((head.data)+sumTree(head.left)+sumTree(head.right));
//        }
//    }

//    static int countNodes (Node head){
//        int count = 0;
//        Node current = head;
//        if(head!=null){
//            count++;
//            while (current.next!=null){
//                count++;
//                current=current.next;
//            }
//        }
//        return count;
//    }


    static int sumNode (Node head){
        if(head==null){
            return (0);
        }else {
            return (head.data + sumNode(head.next));
        }
    }
    static int sumTree (Node head){
       if(head==null){
           return 0;
       }else {
           return (head.data + sumTree(head.left) + sumTree(head.right));
       }
    }
    static int[] bubleSort (int [] arr){
       int n = arr.length-1;
       for(int i=0;i<n;i++){
           boolean swap = false;
           for(int j=0;j<n;j++){
               if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;

               }
           }
           if(!swap){
               return arr;
           }

       }
        return arr;
    }

    static boolean isPald (String word){
     String txt = word.toLowerCase();
     char [] wordArr = txt.toCharArray();
     int left = 0;
     int right = wordArr.length-1;
     while (right>left){
         if(wordArr[left]!=wordArr[right]){
             return (false);
         }
         else {
             left++;
             right--;
         }
     }
     return true;

    }


}