package com.neuedu.test;

/**
 * Created by 86188 on 2020/2/11.
 */
public class MyBook {
    private String name;
    private Double price;
    private String press;
    private String anthor;
    private String bookISBN;

    public MyBook(String name, Double price, String press, String anthor, String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.anthor = anthor;
        this.bookISBN = bookISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAnthor() {
        return anthor;
    }

    public void setAnthor(String anthor) {
        this.anthor = anthor;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    @Override
    public String toString() {
        return "MyBook{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", anthor='" + anthor + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                '}';
    }
}
