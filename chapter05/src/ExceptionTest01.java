public class ExceptionTest01 {
    public static void main(String[] args) {
        /*
            异常的发生需要经历两个阶段
            1.创建异常对象
            2.让异常发生(手动抛出异常)
         */
        //执行第一步
        NullPointerException e = new NullPointerException();
        //执行第二步
        throw e;

    }
}
