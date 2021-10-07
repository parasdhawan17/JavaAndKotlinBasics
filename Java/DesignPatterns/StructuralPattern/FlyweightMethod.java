package Java.DesignPatterns.StructuralPattern;


import java.util.ArrayList;
import java.util.List;

class TreeType{
    String name,color, texture;

    TreeType(String name, String color, String texture){
        this.color = color;
        this.texture = texture;
        this.name = name;
    }
    public void draw(int x, int y){

    }
}

class TreeTypeFactory{
    List<TreeType> treeTypeList = new ArrayList<>();
    public TreeType getTreeType(String name, String color, String texture){
        for(TreeType treeType  : treeTypeList){
            if(treeType.name.equals(name)  && treeType.color.equals(color)  && treeType.texture.equals(texture)){
                return treeType;
            }
        }
        TreeType treeType = new TreeType(name, color, texture);
        return treeType;
    }
}

class Tree{
    int x,y;
    TreeType treeType;
    Tree(int x, int y , TreeType treeType){
        this.treeType = treeType;
        this.x = x;
        this.y = y;
    }
    public void draw(){
        treeType.draw(x,y);
    }
}

class Forrest{
    private List<Tree> trees = new ArrayList<>();
    public void plantTree(int x, int y,String name,String color,String texture){
        TreeTypeFactory treeTypeFactory = new TreeTypeFactory();
        TreeType treeType = treeTypeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x,y,treeType);
    }
    public void draw(){
        for(Tree tree : trees){
            tree.draw();
        }
    }
}

public class FlyweightMethod {
    public static void main(String[] args){
        Forrest forrest = new Forrest();
        forrest.plantTree(10,20,"Grut","Red","Plain");
        forrest.plantTree(10,30,"Grut","Red","Plain");
        forrest.draw();
    }
}
