package Astar;

/**
 * Created by bony on 2017/9/7.
 */
public class Node implements Comparable<Node> {
    public Coord coord;//坐标
    public Node parent; //父结点
    public int G; //起点到当前格子的步数
    public int H; //起点到当前的估值

    public Node(int x,int y){
        this.coord = new Coord(x,y);
    }

    public  Node(Coord coord, Node parent, int g, int h){
        this.coord = coord;
        this.parent = parent;
        G = g;
        H = h;
    }

    @Override
    public int compareTo(Node o){
        if(o == null) return  -1;
        if(G+ H> o.G+o.H)
            return 1;
        else if(G+H< o.G+o.H)
            return -1;
        return 0;
    }
}
