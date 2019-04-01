package luckyStudy;

/**
 * Created by zhangwei on 2019/4/1
 **/

public class Book {
    /**
     * 类和对象的关系以及调用
     * */
    private String bookName;
    private String kind;
    private double price;
    private String bookNumber;

    //无参构造
//    public Book(){}
    //有参构造
    public Book(String bookName,String kind,double price,String bookNumber){
        this.bookName = bookName;
        this.kind = kind;
        this.price = price;
        this.bookNumber = bookNumber;
    }

    //Get/Set
    public String getBookName(){
        return bookName;
    }
    public void setBookName(){
        this.bookName = bookName;
    }

    @Override
    public String toString(){
        return ("书名：" + bookName + "，书的种类：" + kind + "，单价" + price + "，书籍编号：" + bookNumber);
    }
}
