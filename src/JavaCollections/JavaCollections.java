package JavaCollections;

import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 1. add(E e)
        list.add("A");

        // 2. add(int index, E element)
        list.add(1, "B");

        // 3. addAll(Collection<? extends E> c)
        List<String> anotherList = new ArrayList<>();
        anotherList.add("C");
        anotherList.add("D");
        list.addAll(anotherList);

        // 4. addAll(int index, Collection<? extends E> c)
        anotherList.clear();
        anotherList.add("E");
        anotherList.add("F");
        list.addAll(2, anotherList);

        // 5. clear()
        list.clear();
        list.add("A");
        list.add("B");
        list.add("C");

        // 6. contains(Object o)
        boolean containsA = list.contains("A");

        // 7. containsAll(Collection<?> c)
        anotherList.clear();
        anotherList.add("A");
        anotherList.add("B");
        boolean containsAll = list.containsAll(anotherList);

        // 8. equals(Object o)
        anotherList.clear();
        anotherList.addAll(list);
        boolean isEqual = list.equals(anotherList);

        // 9. get(int index)
        String elementAt1 = list.get(1);

        // 10. hashCode()
        int hashCode = list.hashCode();

        // 11. indexOf(Object o)
        int indexOfA = list.indexOf("A");

        // 12. isEmpty()
        boolean isEmpty = list.isEmpty();

        // 13. iterator()
        Iterator<String> iterator = list.iterator();

        // 14. lastIndexOf(Object o)
        list.add("A");
        int lastIndexOfA = list.lastIndexOf("A");

        // 15. listIterator()
        ListIterator<String> listIterator = list.listIterator();

        // 16. listIterator(int index)
        ListIterator<String> listIteratorFromIndex1 = list.listIterator(1);

        // 17. remove(int index)
        String removedElement = list.remove(1);

        // 18. remove(Object o)
        boolean isRemoved = list.remove("A");

        // 19. removeAll(Collection<?> c)
        anotherList.clear();
        anotherList.add("A");
        anotherList.add("B");
        boolean isRemovedAll = list.removeAll(anotherList);

        // 20. replaceAll(UnaryOperator<E> operator)
        list.replaceAll(s -> s.toLowerCase());

        // 21. retainAll(Collection<?> c)
        anotherList.clear();
        anotherList.add("c");
        boolean isRetainedAll = list.retainAll(anotherList);

        // 22. set(int index, E element)
        list.set(0, "X");

        // 23. size()
        int size = list.size();

        // 24. sort(Comparator<? super E> c)
        list.sort(Comparator.naturalOrder());

        // 25. spliterator()
        Spliterator<String> spliterator = list.spliterator();

        // 26. subList(int fromIndex, int toIndex)
        List<String> subList = list.subList(0, 1);

        // 27. toArray()
        Object[] array = list.toArray();

        // 28. toArray(T[] a)
        String[] stringArray = list.toArray(new String[0]);

        // Print the list to see the result
        System.out.println(list);
    }
}

