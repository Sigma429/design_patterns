import java.util.*;
import java.util.stream.Collectors;

/**
 * ClassName:Test
 * Package:PACKAGE_NAME
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/18 - 19:18
 * @Version:v1.0
 */
public class Test {
    @org.junit.Test
    public void test() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("grape");
        list.add("grape");
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }

    @org.junit.Test
    public void test1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 35);
        map.put("Bob", 40);
        map.put("Alice", 30);
        map.put("Tom", 45);
        map.put("Jerry", 50);
        List nameByAge = getNameByAge(map);
        System.out.println(nameByAge.get(2));
        System.out.println(nameByAge.get(3));
        System.out.println(nameByAge.get(4));
    }

    public List getNameByAge(Map<String, Integer> map) {
        return map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
    }

    @org.junit.Test
    public void test3() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("grape");
        list.add("grape");
        Map<String, Integer> map = new HashMap<>();
        int apple = getNumberByStr(list, "apple");
        int banana = getNumberByStr(list, "banana");
        int orange = getNumberByStr(list, "orange");
        int grape = getNumberByStr(list, "grape");
        map.put("apple", apple);
        map.put("banana", banana);
        map.put("orange", orange);
        map.put("grape", grape);
        System.out.println(map);
    }

    public int getNumberByStr(List<String> list, String target) {
        int count = 0;
        for (String str : list) {
            if (str.equals(target)) {
                count++;
            }
        }
        return count;
    }

    @org.junit.Test
    public void test4() {
        List<String> list = new ArrayList<String>();
        list.add("123");
        list.add("abc");
        list.add("456");
        list.add("def");
        list.add("789");
        list.add("ghi");
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        for (String str : list) {
            if (getStrOrNumber(str)) {
                list1.add(str);
            } else {
                list2.add(str);
            }
        }
        System.out.println(list1);
        System.out.println(list2);

    }

    public boolean getStrOrNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                return true;
            } else if (Character.isDigit(c)) {
                return false;
            }
        }
        return false;
    }

    @org.junit.Test
    public void test5() {
        Map<String, List<Integer>> map = new HashMap<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(85);
        list1.add(90);
        list1.add(95);
        map.put("John", list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(85);
        list2.add(90);
        list2.add(95);
        map.put("John", list2);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(85);
        list3.add(90);
        list3.add(95);
        map.put("John", list3);
    }

    @org.junit.Test
    public void test6() {
        List<String> list = new ArrayList<>();
        list.add("John Doe,john@doe.com");
        list.add("Bob Smith,bob@smith.com");
        list.add("Alice Johnson,alice@johnson.com");
        Map<String, String> map = new HashMap<>();
        for (String s : list) {
            String[] split = s.split(",");
            map.put(split[1], split[0]);
        }
        System.out.println(map);
    }

    @org.junit.Test
    public void test7() {
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        int k = 2;
        MinHeap heap = new MinHeap(k);
        for (int i = 0; i < k; i++) {
            heap.offer(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > heap.peek()) {
                heap.replace(nums[i]);
            }
        }
        System.out.println(heap.peek());
    }
}

class MinHeap {
    int[] array;
    int size;

    public MinHeap(int capacity) {
        array = new int[capacity];
    }

    public void heapify() {
        for (int i = (size >> 1) - 1; i >= 0; i--) {
            down(i);
        }
    }

    public int poll() {
        swap(0, size - 1);
        size--;
        down(0);
        return array[size];
    }

    public int poll(int index) {
        swap(index, size - 1);
        size--;
        down(index);
        return array[size];
    }

    public int peek() {
        return array[0];
    }

    public boolean offer(int offered) {
        if (size == array.length) {
            return false;
        }
        up(offered);
        size++;
        return true;
    }

    public void replace(int replaced) {
        array[0] = replaced;
        down(0);
    }

    private void up(int offered) {
        int child = size;
        while (child > 0) {
            int parent = (child - 1) >> 1;
            if (offered < array[parent]) {
                array[child] = array[parent];
            } else {
                break;
            }
            child = parent;
        }
        array[child] = offered;
    }

    private void down(int parent) {
        int left = (parent << 1) + 1;
        int right = left + 1;
        int min = parent;
        if (left < size && array[left] < array[min]) {
            min = left;
        }
        if (right < size && array[right] < array[min]) {
            min = right;
        }
        if (min != parent) {
            swap(min, parent);
            down(min);
        }
    }

    // 交换两个索引处的元素
    private void swap(int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

}
