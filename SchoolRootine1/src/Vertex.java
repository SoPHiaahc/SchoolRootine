/**
 * Created by bony on 2017/9/4.
 */
public class Vertex implements Comparable<Vertex> {
    //节点名称（A B C D...）
    private String name;

    //最短路径长度
    private int path;

    //节点是否已经出列
    private boolean isMarked;

    public Vertex(String name){
        this.name = name;
        this.path = Integer.MAX_VALUE;//初始设置为无穷大
        this.setMarked(false);
    }

    public Vertex(String name,int path){
        this.name= name;
        this.path= path;
        this.setMarked(false);
    }

    public boolean isMarked(){
        return this.isMarked;
    }

    public void setMarked(boolean flag){
        this.isMarked = flag;
    }

    public void setPath(int path){
        this.path= path;
    }

    public int getPath(){
        return path;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Vertex o){
        return o.path> path?-1:1;
    }

}
