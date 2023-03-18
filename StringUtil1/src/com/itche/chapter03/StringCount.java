package com.itche.chapter03;

public class StringCount  extends StringUtil{
    private int nConut;
    private int oCount;

    public StringCount(String content) {
        super(content);
        this.countChar();
    }
    public void countChar(){
        char data[]=super.getContent().toCharArray();
        for (int i=0;i<data.length;i++){
            if(data[i]=='n'||data[i]=='N'){
                this.nConut++;
            }
            if(data[i]=='o'||data[i]=='O'){
                this.oCount++;
            }
        }
    }

    public int getnConut() {
        return this.nConut;
    }

    public int getoCount() {
        return this.oCount;
    }
    public String getInfo(){
        return "字母n的个数"+this.nConut+"、字母o的个数"+this.oCount;

    }
}
