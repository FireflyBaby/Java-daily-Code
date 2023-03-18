package com.itche.chapter03;

public  enum  Color {
    RED("红色"){
        @Override
        public String getMessage() {
            return this.toString();
        }
    },GREEN("绿色"){
        @Override
        public String getMessage() {
            return this.toString();
        }
    },BLUE("蓝色"){
        @Override
        public String getMessage() {
            return this.toString();
        }
    };
    private String title;
    private Color(String title){
        this.title=title;
    }

    public abstract String getMessage();

    @Override
    public String toString() {
        return "Color{" +
                "title='" + this.title + '\'' +
                '}';
    }
}
