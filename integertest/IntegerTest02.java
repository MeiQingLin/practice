package integertest;

/**
 * 包装类的构造方法
 */
public class IntegerTest02 {
    public static void main(String[] args) {
        int value = 10;
        // 'Integer(int)' is deprecated since version 9 and marked for removal
        Integer i1 = new Integer(value);
        System.out.println(i1); // 10
        // 'Integer(java.lang.String)' is deprecated since version 9 and marked for removal
        Integer i2 = new Integer("100");
        System.out.println(i2); // 100

        // java.lang.NumberFormatException 数字格式异常
        //Integer i3 = new Integer("abc");
        //System.out.println(i3);

        Boolean b1 = new Boolean(true);
        System.out.println(b1); // true

        Boolean b2 = new Boolean(false);
        System.out.println(b2); // false

        /*
        public static boolean parseBoolean(String s) {
                return "true".equalsIgnoreCase(s);
            }
        */
        Boolean b3 = new Boolean("true");
        System.out.println(b3);

        Boolean b4 = new Boolean("TRue"); // 这样写可以(虽然没什么意义),底层会调用字符串的equalsIgnoreCase()方法,是字符串"true"就返回true,否则返回false
        System.out.println(b4); // true

        Boolean b5 = new Boolean("faLSe"); // 与上同理
        System.out.println(b5); // false


        Boolean b6 = new Boolean("tre"); // 与上同理
        System.out.println(b6); // false
    }
}
