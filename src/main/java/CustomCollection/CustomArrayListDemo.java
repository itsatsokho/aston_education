package CustomCollection;


import java.util.ArrayList;

public class CustomArrayListDemo {
    public static void main(String[] args) {

        //demo add elements in CustomArrayList
        System.out.println("---Output CustomArrayList---");
        CustomArrayList<String> str = new CustomArrayList<>(5);
        str.add("Maxim3");
        str.add("Maxim7");
        str.add("Maxim2");
        str.add("Maxim9");
        str.add("Maxim4");
        str.add(12,"Maxim5");
        System.out.println(str);

        //demo remove one element from CustomArrayList
        System.out.println("---Output CustomArrayList after remove one element---");
        str.remove(3);
        System.out.println(str);

        //demo initialize empty CustomArrayList
        System.out.println("---Output empty CustomArrayList---");
        CustomArrayList<Integer> i = new CustomArrayList<>();
        System.out.println(i);

        System.out.println("---Output ArrayList---");
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(2);
        integers.add(4);
        integers.add(3);
        integers.add(6);
        integers.add(1);
        integers.add(7);
        System.out.println(integers);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Maxim3");
        strings.add("Maxim7");
        strings.add("Maxim2");
        strings.add("Maxim9");
        strings.add("Maxim4");
        System.out.println(strings);

        //demo initialize CustomArrayList from Collection
        System.out.println("---Output CustomArrayList initialized from ArrayList---");
        CustomArrayList<Integer> customIntegers = new CustomArrayList<>(integers);
        System.out.println(customIntegers);

        //bubblesort
        System.out.println("---BubbleSort---");
        CustomArrayList.bubbleCollectionSort(integers);
        System.out.println(integers);
        CustomArrayList.bubbleCollectionSort(strings);
        System.out.println(strings);
        CustomArrayList.bubbleCustomCollectionSort(customIntegers);
        System.out.println(customIntegers);
        CustomArrayList.bubbleCustomCollectionSort(str);
        System.out.println(str);


        //demo getting element from CustomArrayList
        System.out.println("---Output elements CustomArrayList---");
        System.out.println(str.get(1));
        System.out.println(str.get(2));
        System.out.println(str.get(3));
        System.out.println(str.get(4));


    }
}
