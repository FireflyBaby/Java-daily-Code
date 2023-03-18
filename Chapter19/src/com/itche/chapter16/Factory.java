package com.itche.chapter16;

public class Factory {
    private Factory(){}
    public static IVoteService getInstance(){
        return new VoteServiceImpl();
    }
}
