package bookmanagementsystem;

import bookmanagementsystem.exception.*;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Stock {
    BookItem[] allBook = new BookItem[6];

    public BookItem[] getAllBook() {
        return allBook;
    }

    public Stock() {
        //创建图书实例
        BookItem b1 = new BookItem(new FictionBook("吞噬星空", "张三", 100, 1103, "青年"), true);
        BookItem b2 = new BookItem(new FictionBook("完美世界", "李四", 110, 2001, "青年"), true);
        BookItem b3 = new BookItem(new FictionBook("妖神记", "王五", 40, 2003, "中年"), true);
        BookItem b4 = new BookItem(new NonFictionBook("十万个为什么", "jack", 200, 1105, "幼儿"), true);
        BookItem b5 = new BookItem(new NonFictionBook("时间简史", "霍金", 300, 1111, "中年"), true);
        BookItem b6 = new BookItem(new NonFictionBook("红楼梦", "lucy", 500, 102, "老年"), true);
        allBook[0] = b1;
        allBook[1] = b2;
        allBook[2] = b3;
        allBook[3] = b4;
        allBook[4] = b5;
        allBook[5] = b6;
        //对书籍进行排序
        Arrays.sort(allBook);
    }

    public void setAllBook(BookItem[] allBook) {
        this.allBook = allBook;
    }

    public Stock(BookItem[] allBook) {
        this.allBook = allBook;
    }

    //显示书籍信息
    public void display() {
        for (int i = 0; i < allBook.length; i++) {
            if (allBook[i] == null) {
                try {
                    throw new NullPointerException();
                } catch (NullPointerException e) {
                    //什么也不做
                }
            } else {
                System.out.println(allBook[i].getBook());
            }
        }
    }


    //查找书籍
    public void find() throws NotFindBookException, IllegalISBNException {
        System.out.print("请输入您要查找的书籍编号:");
        java.util.Scanner s = new java.util.Scanner(System.in);
        int ISBN = -1;
        try {
            ISBN = s.nextInt();
        } catch (InputMismatchException e) {
            s.next(); // 清除输入缓冲区中的非法输入
        }
        //先检查用户输入图书编号是否合法
        if (ISBN <= 0) {
            throw new IllegalISBNException();
        }
        //线性查找
        int index = -1;
        for (int i = 0; i < allBook.length; i++) {
            if (allBook[i] == null) {
                try {
                    throw new NullPointerException();
                } catch (NullPointerException e) {
                    //什么也不做
                }
            } else if (allBook[i].getBook().getISBN() == ISBN) {
                index = i;
            }
        }
        if (index >= 0) {
            if (allBook[index].condition) {
                System.out.println("该书已找到,目前可借阅");
            } else {
                System.out.println("该书已找到,已被他人借阅");
            }
        } else {
            throw new NotFindBookException();
        }
    }

    //添加书籍
    public void addBook() throws IllegalISBNException, BookTypeInputException, BookPrinceInputException, BookLevelInputException, BookTopicInputException {
        System.out.print("请输入您要增添的书籍的对应编号:");
        java.util.Scanner s = new java.util.Scanner(System.in);
        int ISBN = -1;
        try {
            ISBN = s.nextInt();
        } catch (InputMismatchException e) {
            s.next(); // 清除输入缓冲区中的非法输入
        }
        //对用户输入的数字进行判断
        if (ISBN <= 0) {
            throw new IllegalISBNException();
        }
        System.out.print("请输入您要增添的书籍的对应名字:");
        String name = s.next();
        System.out.print("请输入您要增添的书籍的对应作者:");
        String bookAuthor = s.next();
        System.out.print("请输入您要增添的书籍的对应价格:");
        int bookPrince = -1;
        try {
            bookPrince = s.nextInt();
        } catch (InputMismatchException e) {
            s.next(); // 清除输入缓冲区中的非法输入
        }
        //对用户输入的数字进行判断
        if (bookPrince <= 0) {
            throw new BookPrinceInputException();
        }
        System.out.print("请输入您要增添的书籍的对应类型(请从'小说'或'非小说'这两个类型中选择一个):");
        String type = s.next();
        if(!(type.equals("小说") || type.equals("非小说"))){
            throw new BookTypeInputException();
        }
        for (int i = 0; i < allBook.length; i++) {
            if (allBook[i] == null) {
                //根据书类型创建不同的书籍对象
                if (type.equals("小说")) {
                    System.out.print("请输入书籍受众年龄段(幼儿,少年,青年,中年,老年):");
                    String level = s.next();
                    if(!(level.equals("幼儿") || level.equals("少年") || level.equals("青年") || level.equals("中年") || level.equals("老年"))){
                     throw new BookLevelInputException();
                    }
                    allBook[i] = new BookItem();
                    allBook[i].setBook(new FictionBook(name, bookAuthor, bookPrince, ISBN, level));
                    allBook[i].condition = true;
                    System.out.println("添加书籍成功!");
                    return;
                } else if (type.equals("非小说")) {
                    System.out.print("请输入书籍主题(科学,历史,军事,体育):");
                    String topic = s.next();
                    if(!(topic.equals("科学") || topic.equals("历史") || topic.equals("军事") || topic.equals("体育"))){
                        throw new BookTopicInputException();
                    }
                    allBook[i] = new BookItem();
                    allBook[i].setBook(new FictionBook(name, bookAuthor, bookPrince, ISBN, topic));
                    allBook[i].condition = true;
                    System.out.println("添加书籍成功!");
                    return;
                }
            } else if (allBook[i].getBook().getISBN() == ISBN) {
                System.out.println("书库中已有该书籍,添加失败!");
                return;
            }
        }
        //执行到这说明书库满了,需要扩容
        if (type.equals("小说")) {
            System.out.print("请输入书籍受众年龄段(幼儿,少年,青年,中年,老年):");
            String level = s.next();
            if(!(level.equals("幼儿") || level.equals("少年") || level.equals("青年") || level.equals("中年") || level.equals("老年"))){
                throw new BookLevelInputException();
            }
            BookItem[] newAllBook = new BookItem[allBook.length * 2];
            System.arraycopy(allBook, 0, newAllBook, 0, allBook.length);
            allBook = newAllBook;
            allBook[allBook.length / 2] = new BookItem();
            allBook[allBook.length / 2].setBook(new FictionBook(name, bookAuthor, bookPrince, ISBN, level));
            allBook[allBook.length / 2].condition = true;
            System.out.println("添加书籍成功!");
        } else if (type.equals("非小说")) {
            System.out.print("请输入书籍主题(科学,历史,军事,体育):");
            String topic = s.next();
            if(!(topic.equals("科学") || topic.equals("历史") || topic.equals("军事") || topic.equals("体育"))){
                throw new BookTopicInputException();
            }
            BookItem[] newAllBook = new BookItem[allBook.length * 2];
            System.arraycopy(allBook, 0, newAllBook, 0, allBook.length);
            allBook = newAllBook;
            allBook[allBook.length / 2] = new BookItem();
            allBook[allBook.length / 2].setBook(new NonFictionBook(name, bookAuthor, bookPrince, ISBN, topic));
            allBook[allBook.length / 2].condition = true;
            System.out.println("添加书籍成功!");
        }
    }

    //删除书籍
    public void deleteBook() throws NotFindBookException, IllegalISBNException {
        System.out.print("请输入您要删除的书籍的对应编号:");
        java.util.Scanner s = new java.util.Scanner(System.in);
        int ISBN = -1;
        try {
            ISBN = s.nextInt();
        } catch (InputMismatchException e) {
            s.next(); // 清除输入缓冲区中的非法输入
        }
        //对用户输入的数字进行判断
        if (ISBN <= 0) {
            throw new IllegalISBNException();
        }
        for (int i = 0; i < allBook.length; i++) {
            if (allBook[i] == null) {
                try {
                    throw new NullPointerException();
                } catch (NullPointerException e) {
                    //什么也不做
                }
            } else if (allBook[i].getBook().getISBN() == ISBN) {
                allBook[i] = null;
                System.out.println("删除书籍成功!");
                return;
            }
        }
        //走到这说明未找到文件
        throw new NotFindBookException();
    }
}
