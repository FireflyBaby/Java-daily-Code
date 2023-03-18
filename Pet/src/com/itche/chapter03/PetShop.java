package com.itche.chapter03;

public class PetShop {//宠物商店
    private ILink<IPet>allPets=new LinkImpl<IPet>();//保存多个宠物信息
    public void add(IPet pet){//追加宠物，宠物上架
        this.allPets.add(pet);//集合中保存对象

    }
    public void delete(IPet pet){
        this.allPets.remove(pet);
    }
    public ILink<IPet> search(String keyword){
        ILink<IPet>searchResult=new LinkImpl<IPet>();//保存查询结果
        Object result[]=this.allPets.toArray();//获取全部数据源
        if (result!=null){
            for (Object obj:result){
                IPet pet=(IPet)obj;
                if (pet.getName().contains(keyword)||pet.getColor().contains(keyword)){
                    searchResult.add(pet);//保存查询结果
                }
            }
        }
        return searchResult;
    }
}
