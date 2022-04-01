package IntArrayList;

public class Test {
    public static void main(String[] args) {
        //IntList myList2 = new IntLinkedList();
        IntList myList = new IntArrayList();

        for (int i = 1; i <= 20; i++) {
            myList.add(i);
        }


        System.out.println(myList.toString());

        myList.add(20,21);
        System.out.println(myList.toString());

        System.out.println("element 15: "+myList.get(15));

        System.out.println("is empty: "+myList.isEmpty());

        myList.remove(12);
        System.out.println(myList.toString());

        myList.removeByValue(21);
        System.out.println(myList.toString());

        System.out.println("size: "+myList.size());

        myList.subList(1,6);


//
//        myList.set(18,77);
//        System.out.println(myList.toString());
////
//        System.out.println( myList.get(19));
//        System.out.println(myList.toString());
////
////
////
//        myList.clear();
//        System.out.println(myList.toString());
//
//






    }
}
