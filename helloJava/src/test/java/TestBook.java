import luckyStudy.Book;

/**
 * Created by zhangwei on 2019/4/1
 **/

public class TestBook {
    public static void main(String[] args){
        Book book = new Book("Java从入门到精通","IT",24,"A007");
        System.out.println(book.toString());
        System.out.println("书本名称：" + book.getBookName());
    }
}
