package oop05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 测试Arrays工具类的方法
 */
public class ArrayTest01 {
    /**
     * Arrays工具类中的toString()方法
     * 将数组转换成字符串
     */
    @Test
    public void testToString(){
        //基本类型数组
        int[] num = {1,2,3,4,5,6};
        //这样相当于调用引用num的toString()方法,没有重写的话,相当于调用Object类中的toString()方法
        System.out.println(num.toString());

        System.out.println(Arrays.toString(num));

        //引用类型数组
        String[] names = {"张三","李四","王五"};
        //与上同理
        System.out.println(names);
        System.out.println(names.toString());
        //会调用数组里元素的toString()方法,元素是String类型,相当于调用String类里的toString()方法,而它的toString是写好了的
        System.out.println(Arrays.toString(names));

        Person person1 = new Person(18, "jack");
        Person person2 = new Person(20, "jay");
        Person[] persons = {person2, person1};
        //由源码可知,会调用数组里的元素的toString()方法,想要达到我们想要的效果,需要重写toString()方法
        System.out.println(Arrays.toString(persons));
    }

    /**
     * Array工具类中的deepToString()方法
     * 可以将二维数组转换成字符串
     */
    @Test
    public void testDeepToString(){
        //基本类型数组
        int[][] nums = {{1,2,3},{2,3,4},{3,4,5,6}};
        System.out.println(Arrays.deepToString(nums));

        //引用类型数组
        String[][] names = {{"chen", "wang", "li"}, {"jay", "jack", "lucy"}};
        System.out.println(Arrays   .deepToString(names));

        Person person1 = new Person(18, "jack");
        Person person2 = new Person(20, "jay");
        Person[] persons = {person2, person1};
        //由源码可知,底层最后会调用Person数组中的Person对象的toString()方法
        System.out.println(Arrays.deepToString(persons));
    }

    /**
     * Arrays工具类中的equals()方法
     * 判断两个数组是否相等
     */
    @Test
    public void testEquals(){
        //基本类型数组
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,2,3,4};
        //返回值boolean类型
        System.out.println(Arrays.equals(nums1, nums2));

        //引用类型数组
        String[] names1 = {"chen", "wang", "li"};
        String[] names2 = {"chen", "wang", "li"};
        System.out.println(Arrays.equals(names1, names2));

        //通过相同的数组下标一一进行比较,全部相等,返回true
        //这里比较的是数组里的引用,他们指向的对象是同一个
        //由源码可知默认调用Object类中的equals()方法
        Person person1 = new Person(18, "jack");
        Person person2 = new Person(20, "jay");
        Person person3 = new Person(18, "jack");
        Person person4 = new Person(20, "jay");
        Person[] persons1 = {person2, person1};
        Person[] persons2 = {person4, person3};
        System.out.println(Arrays.equals(persons1, persons2));
        //如果想要自己制定一个相等标准,需要在Person类中重写equals()方法
    }

    /**
     * Arrays工具类中的deepEquals()方法
     * 判断二维数组是否相等
     */
    @Test
    public void testDeepEquals(){
        //基本类型数组
        int[][] nums1 = {{1,2,3},{2,3,4},{3,4,5}};
        int[][] nums2 = {{1,2,3},{2,3,4},{3,4,5}};
        System.out.println(Arrays.deepEquals(nums1, nums2));

        //引用类型数组
        String[][] names1 = {{"chen", "wang", "li"}, {"jay", "jack", "lucy"}};
        String[][] names2 = {{"chen", "wang", "li"}, {"jay", "jack", "lucy"}};
        System.out.println(Arrays.deepEquals(names1, names2));
    }

    /**
     * Arrays工具类中的sort()方法
     * 基于快速排序算法,适合小型数据量排序
     */
    @Test
    public void testSort(){
        //基本类型数组
        int[] nums1 = {2,7,4,3,6,5,1};
        Arrays.sort(nums1);
        for(int num : nums1){
            System.out.print(num);
        }
        System.out.println();

        //引用类型数组
        //根据字典的顺序进行排序的
        String[] names = {"wang", "chen", "li"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        Person[] persons = {new Person(21, "B"), new Person(20, "A")};
        System.out.println(Arrays.toString(persons));

        //直接这样写是不可比较的,需要Person类实现comparable接口
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }

    /**
     * Arrays工具类中的binarySearch()方法
     * 二分法查找
     */
    @Test
    public void testBinarySearch(){
        int[] numbers = new int[]{1,2,3,4,5,6,7};
        //基本类型数组
        //返回值int类型,查找到返回该数下标,未查找到返回-1
        System.out.println(Arrays.binarySearch(numbers, 3));

        //引用类型数组
        String[] names = {"chen", "wang", "li"};
        System.out.println(Arrays.binarySearch(names, "wang"));

    }

    /**
     * Arrays工具类中的fill()方法
     * 填充数组
     */
    @Test
    public void testFill(){
        //基本类型数组
        int[] numbers = new int[5];
        //被填充数组为numbers,填充内容为9
        Arrays.fill(numbers, 9);
        System.out.println(Arrays.toString(numbers));

        //引用类型数组
        String[] names = new String[5];
        //被填充数组为names,填充内容为"jack"
        Arrays.fill(names, "jack");
        System.out.println(Arrays.toString(names));

        Person[] persons = new Person[5];
        Arrays.fill(persons, new Person());
        System.out.println(Arrays.toString(persons));

        //还可以选择填充位置
        int[] numbers1 = new int[5];
        //从下标2的位置 to 下标4的位置,但不包括下标4,填充数字为1
        Arrays.fill(numbers1, 2, 4, 1);
        System.out.println(Arrays.toString(numbers1));
    }

    /**
     * Arrays工具类中的copyOf()方法
     * 数组拷贝
     */
    @Test
    public void testCopyOf(){
        //基本类型数组
        int[] numbers = new int[]{1,2,3,4,5,6,7};
        //从numbers数组中拷贝,拷贝长度是numbers.length
        int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(copyNumbers));

        //引用类型数组
        String[] names = {"chen", "wang", "li"};
        //从copyNames数组中拷贝,拷贝长度是names.length
        String[] copyNames = Arrays.copyOf(names, names.length);
        System.out.println(Arrays.toString(copyNames));

        Person[] persons = new Person[]{new Person(21, "B"), new Person(20, "A")};
        //从persons数组中拷贝,拷贝长度是persons.length
        Person[] copyPersons = Arrays.copyOf(persons, persons.length);
        System.out.println(Arrays.toString(copyPersons));
    }

    /**
     * Arrays工具类中的copyOfRange()方法
     * 可选择数组拷贝的范围
     */
    @Test
    public void testCopyOfRange(){
        //基本类型数组
        int[] numbers = new int[]{1,2,3,4,5,6,7};
        //拷贝下标2到下标6的元素,但不包括下标6,拷贝到copyNumbers数组中
        int[] copyNumbers = Arrays.copyOfRange(numbers, 2, 6); // 3, 4, 5, 6
        System.out.println(Arrays.toString(copyNumbers));

        //引用类型数组
        String[] names = {"chen", "wang", "li", "jack", "lucy"};
        //拷贝下标1到下标4的元素,但不包括下标4,拷贝到copyNames数组中
        String[] copyNames = Arrays.copyOfRange(names, 1, 4); // wang, li, jack
        System.out.println(Arrays.toString(copyNames));

        Person[] persons = new Person[]{new Person(21, "B"), new Person(20, "A"), new Person(23, "C")};
        //拷贝下标0到下标2的元素,但不包括下标2,拷贝到copyPersons数组中
        Person[] copyPersons = Arrays.copyOfRange(persons, 0,2); // B--21, A--20
        System.out.println(Arrays.toString(copyPersons));
    }
}
