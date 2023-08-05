package lambda.src.main.java.org.example.sorting;


public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting arraySorting = new ArraySorting();
        QuickSorting quickSorting = new QuickSorting();
        BubbleSorting bubbleSorting = new BubbleSorting();
//        arraySorting.sort(quickSorting);
//        arraySorting.sort(bubbleSorting);

        //lambda example******************************

//        Sorting noLambda = new QuickSorting();
//        noLambda.sort();

        Sorting quickSorting1 = () -> System.out.println("Quick Sorting");
        arraySorting.sort(quickSorting1);

        Sorting bubbleSorting1 = () -> System.out.println("Bubble Sorting");
        arraySorting.sort(bubbleSorting1);


    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}
