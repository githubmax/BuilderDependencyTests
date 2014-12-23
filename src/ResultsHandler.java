import java.util.Arrays;

/**
 * Created by Illya on 22.12.2014.
 */
public class ResultsHandler {
    ArrayUtils utils;

    ResultsHandler(ArrayUtils utils) {
        this.utils = utils;
    }


    public void innerJoin(Person[] firstPerson, Person[] secondPerson) {
        Person[] innerResult = utils.innerJoin(firstPerson, secondPerson);
        Arrays.sort(innerResult, new SortedPerson());
        System.out.println("Inner join results: \n" + Arrays.toString(innerResult) + "\n");
    }

    public void outerJoin(Person[] firstPerson, Person[] secondPerson) {
        Person[] outerResult = utils.outerJoin(firstPerson, secondPerson);
        Arrays.sort(outerResult, new SortedPerson());
        System.out.println("Outer join results: \n" + Arrays.toString(outerResult) + "\n");
    }

    public void merge(Person[] firstPerson, Person[] secondPerson) {
        Person[] mergeResult = utils.merge(firstPerson, secondPerson);
        Arrays.sort(mergeResult, new SortedPerson());
        System.out.println("Merge results: \n" + Arrays.toString(mergeResult) + "\n");
    }


    public void innerJoin(int[] first, int[] second) {
        int[] innerResult = utils.innerJoin(first, second);
        Arrays.sort(innerResult);
        System.out.println("Inner join results: \n" + Arrays.toString(innerResult) + "\n");
    }

    public void outerJoin(int[] first, int[] second) {
        int[] outerResult = utils.outerJoin(first, second);
        Arrays.sort(outerResult);
        System.out.println("Outer join results: \n" + Arrays.toString(outerResult) + "\n");
    }

    public void merge(int[] first, int[] second) {
        int[] mergeResult = utils.merge(first, second);
        Arrays.sort(mergeResult);
        System.out.println("Merge results: \n" + Arrays.toString(mergeResult) + "\n");
    }


}
