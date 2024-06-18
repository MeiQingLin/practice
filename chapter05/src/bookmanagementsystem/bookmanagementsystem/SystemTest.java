package bookmanagementsystem;

import bookmanagementsystem.exception.*;

import java.util.InputMismatchException;

public class SystemTest {
    public static void main(String[] args) {

        //创建书库
        Stock stock = new Stock();
        java.util.Scanner s = new java.util.Scanner(System.in);
        if (args.length == 0) {
            System.out.println("-----进入系统失败,要进入本系统,请按以下指令输入命令行参数!");
            System.out.println("-----进入管理员模式,请输入:用户名 密码 权限码");
            System.out.println("-----进入普通用户模式,请输入:用户名 密码");
            System.out.println("-----进入游客模式,请输入:用户名");
            System.exit(0);
        }
        //这里随便限制以下命令行参数,并没有对用户名,密码,权限码的具体值进行过多要求
        if (args.length == 1) {
            System.out.println("欢迎游客'" + args[0] + "'进入图书管理系统,您可以查找图书!");
            System.out.println("您可以通过输入数字选择相对应的功能!");
            System.out.println("1.查找书籍");
            System.out.println("0.退出系统");
            while (true) {
                System.out.print("请输入编号:");
                int i = -1;
                try {
                    i = s.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("您输入的数字非法,请重新输入!");
                    s.next(); // 清除输入缓冲区中的非法输入
                }
                switch (i) {
                    case 1 -> {
                        stock.display();
                        try {
                            stock.find();
                        } catch (NotFindBookException e) {
                            System.out.println("该书未找到!");
                        } catch (IllegalISBNException e) {
                            System.out.println("您输入的图书编号不合法!");
                        }
                    }
                    case 0 -> System.exit(0);
                }
            }
        } else if (args.length == 2) {
            System.out.println("欢迎用户'" + args[0] + "'进入图书管理系统,您可以查找,借阅,归还书籍!");
            System.out.println("您可以通过输入数字选择相对应的功能!");
            System.out.println("1.查找书籍");
            System.out.println("2.借阅书籍");
            System.out.println("3.归还书籍");
            System.out.println("0.退出系统");
            while (true) {
                System.out.print("请输入编号:");
                int i = -1;
                try {
                    i = s.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("您输入的数字非法,请重新输入!");
                    s.next(); // 清除输入缓冲区中的非法输入
                }
                switch (i) {
                    case 1 -> {
                        stock.display();
                        try {
                            stock.find();
                        } catch (NotFindBookException e) {
                            System.out.println("该书未找到!");
                        } catch (IllegalISBNException e) {
                            System.out.println("您输入的图书编号不合法!");
                        }
                    }
                    case 2 -> {
                        stock.display();
                        System.out.print("请输入您要借阅的书籍编号:");
                        int ISBN = -1;
                        int index = -1;
                        try {
                            ISBN = s.nextInt();
                        } catch (InputMismatchException e) {
                            //为了让下面的"未找到该书"不再执行
                            index = -2;
                            s.next(); // 清除输入缓冲区中的非法输入
                        }
                        //对用户输入的数字进行判断
                        if (ISBN <= 0) {
                            try {
                                throw new IllegalISBNException();
                            } catch (IllegalISBNException e) {
                                //为了让下面的"未找到该书"不再执行
                                index = -3;
                                System.out.println("您输入的书籍编号不合法!");
                            }
                        }
                        //在书库中查找该编号,返回对应下标
                        //线性查找

                        for (int j = 0; j < stock.allBook.length; j++) {
                            if (stock.allBook[j] == null) {
                                try {
                                    throw new NullPointerException();
                                } catch (NullPointerException e) {
                                    //什么也不做
                                }
                            } else if (stock.allBook[j].getBook().getISBN() == ISBN) {
                                index = j;
                            }
                        }
                        if (index == -1) {
                            try {
                                throw new NotFindBookException();
                            } catch (NotFindBookException e) {
                                System.out.println("未找到该书!");
                            }
                        }
                        if (index >= 0) {
                            if (stock.allBook[index].isCondition()) {
                                stock.allBook[index].borrowBook();
                            } else {
                                System.out.println("该书已被借阅!");
                            }
                        }
                    }
                    case 3 -> {
                        System.out.print("请输入您要归还的书籍编号:");
                        int ISBN = -1;
                        int index = -1;
                        try {
                            ISBN = s.nextInt();
                        } catch (InputMismatchException e) {
                            //为了让下面的"未找到该书"不再执行
                            index = -2;
                            s.next(); // 清除输入缓冲区中的非法输入
                        }
                        //对用户输入的数字进行判断
                        if (ISBN <= 0) {
                            try {
                                throw new IllegalISBNException();
                            } catch (IllegalISBNException e) {
                                //为了让下面的"未找到该书"不再执行
                                index = -3;
                                System.out.println("您输入的书籍编号不合法!");
                            }
                        }
                        //在书库中查找该编号,返回对应下标
                        //线性查找
                        for (int j = 0; j < stock.allBook.length; j++) {
                            if (stock.allBook[j] == null) {
                                try {
                                    throw new NullPointerException();
                                } catch (NullPointerException e) {
                                    //什么也不做
                                }

                            } else if (stock.allBook[j].getBook().getISBN() == ISBN) {
                                index = j;
                            }
                        }
                        if (index == -1) {
                            try {
                                throw new NotFindBookException();
                            } catch (NotFindBookException e) {
                                System.out.println("未找到该书!");
                            }
                        }
                        if (index >= 0) {
                            if (!stock.allBook[index].isCondition()) {
                                stock.allBook[index].returnBook();
                            } else {
                                System.out.println("该书已经归还!");
                            }
                        }
                    }
                    case 0 -> System.exit(0);
                }
            }
        } else if (args.length == 3) {
            System.out.println("欢迎管理员'" + args[0] + "'进入图书管理系统,您可以查找,借阅,归还,对图书进行增添,删除!");
            System.out.println("您可以通过输入数字选择相对应的功能!");
            System.out.println("1.查找书籍");
            System.out.println("2.借阅书籍");
            System.out.println("3.归还书籍");
            System.out.println("4.增添书籍");
            System.out.println("5.删除书籍");
            System.out.println("0.退出系统");
            while (true) {
                System.out.print("请选择功能:");
                int i = -1;
                try {
                    i = s.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("您输入的数字非法,请重新输入!");
                    s.next(); // 清除输入缓冲区中的非法输入
                }
                switch (i) {
                    case 1 -> {
                        stock.display();
                        try {
                            stock.find();
                        } catch (NotFindBookException e) {
                            System.out.println("该书未找到!");
                        } catch (IllegalISBNException e) {
                            System.out.println("您输入的图书编号不合法!");
                        }
                    }
                    case 2 -> {
                        stock.display();
                        System.out.print("请输入您要借阅的书籍编号:");
                        int ISBN = -1;
                        int index = -1;
                        try {
                            ISBN = s.nextInt();
                        } catch (InputMismatchException e) {
                            //为了让下面的"未找到该书"不再执行
                            index = -2;
                            s.next(); // 清除输入缓冲区中的非法输入
                        }
                        //对用户输入的数字进行判断
                        if (ISBN <= 0) {
                            try {
                                throw new IllegalISBNException();
                            } catch (IllegalISBNException e) {
                                //为了让下面的"未找到该书"不再执行
                                index = -3;
                                System.out.println("您输入的书籍编号不合法!");
                            }
                        }
                        //在书库中查找该编号,返回对应下标
                        //线性查找

                        for (int j = 0; j < stock.allBook.length; j++) {
                            if (stock.allBook[j] == null) {
                                try {
                                    throw new NullPointerException();
                                } catch (NullPointerException e) {
                                    //什么也不做
                                }
                            } else if (stock.allBook[j].getBook().getISBN() == ISBN) {
                                index = j;
                            }
                        }
                        if (index == -1) {
                            try {
                                throw new NotFindBookException();
                            } catch (NotFindBookException e) {
                                System.out.println("未找到该书!");
                            }
                        }
                        if (index >= 0) {
                            if (stock.allBook[index].isCondition()) {
                                stock.allBook[index].borrowBook();
                            } else {
                                System.out.println("图书借阅失败,该书在您借阅之前已被借阅!");
                            }
                        }
                    }
                    case 3 -> {
                        System.out.print("请输入您要归还的书籍编号:");
                        int ISBN = -1;
                        int index = -1;
                        try {
                            ISBN = s.nextInt();
                        } catch (InputMismatchException e) {
                            //为了让下面的"未找到该书"不再执行
                            index = -2;
                            s.next(); // 清除输入缓冲区中的非法输入
                        }
                        //对用户输入的数字进行判断
                        if (ISBN <= 0) {
                            try {
                                throw new IllegalISBNException();
                            } catch (IllegalISBNException e) {
                                //为了让下面的"未找到该书"不再执行
                                index = -3;
                                System.out.println("您输入的书籍编号不合法!");
                            }
                        }
                        //在书库中查找该编号,返回对应下标
                        //线性查找
                        for (int j = 0; j < stock.allBook.length; j++) {
                            if (stock.allBook[j] == null) {
                                try {
                                    throw new NullPointerException();
                                } catch (NullPointerException e) {
                                    //什么也不做
                                }

                            } else if (stock.allBook[j].getBook().getISBN() == ISBN) {
                                index = j;
                            }
                        }
                        if (index == -1) {
                            try {
                                throw new NotFindBookException();
                            } catch (NotFindBookException e) {
                                System.out.println("未找到该书!");
                            }
                        }
                        if (index >= 0) {
                            if (!stock.allBook[index].isCondition()) {
                                stock.allBook[index].returnBook();
                            } else {
                                System.out.println("图书归还失败,该书在您归还之前已经归还!");
                            }
                        }
                    }
                    case 4 -> {
                        try {
                            stock.addBook();
                        } catch (IllegalISBNException e) {
                            System.out.println("您输入的书籍编号不合法!");
                        } catch (BookTypeInputException e) {
                            System.out.println("您输入的书籍类型不合法!");
                        } catch (BookPrinceInputException e) {
                            System.out.println("您输入的书籍价格不合法!");
                        } catch (BookLevelInputException e) {
                            System.out.println("您输入的书籍受众人群不合法!");
                        } catch (BookTopicInputException e) {
                            System.out.println("您输入的书籍主题不合法!");
                        }
                    }
                    case 5 -> {
                        stock.display();
                        try {
                            stock.deleteBook();
                        } catch (NotFindBookException e) {
                            System.out.println("未找到该书籍!");
                        } catch (IllegalISBNException e) {
                            System.out.println("您输入的书籍编号不合法!");
                        }
                    }
                    case 0 -> System.exit(0);
                }
            }
        }
    }
}
