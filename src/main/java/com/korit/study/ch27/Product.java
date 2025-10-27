package com.korit.study.ch27;

public class Product {
    private String name;
    private Integer price;
    private String size;

    public Product() {}

    public Product(String name, Integer price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

    public static productBuilder builder() {
        return new productBuilder();
    }

    public static class productBuilder {
        private String name;
        private Integer price;
        private String size;

        public productBuilder name(String name) {
            this.name = name;
            return this;
        }

        public productBuilder price(Integer price) {
            this.price = price;
            return this;
        }

        public productBuilder size(String size) {
            this.size = size;
            return this;
        }

        public Product build() {
            return new Product(name, price, size);
        }
    }


}
