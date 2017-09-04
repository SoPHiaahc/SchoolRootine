import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by bony on 2017/9/4.
 */
public class Graph {

    //顶点
    private List<Vertex> vertexs;

    //边
    private int[][] edges;

    //没有访问的顶点
    private Queue<Vertex> unVisted;

    public Graph(List<Vertex> vertexs, int[][] edges){
        this.vertexs= vertexs;
        this.edges= edges;
        initUnVisited();
    }

    //搜索各顶点最短路径
    public void search(){
        while (!unVisted.isEmpty()){
            Vertex vertex = unVisted.element();
            //顶点已经计算出最短路径，则设置为“已访问”
            vertex.setMarked(true);
            //获取所有 未访问 的邻居
            List<Vertex> neighbors= getNeighbors(vertex);
            //更新邻居的最短路径
            updatesDistance(vertex, neighbors);
            pop();
        }
        System.out.println("search over");
    }

    //更新所有邻居的最短路径
    private void updatesDistance(Vertex vertex, List<Vertex> neighbors){
        for (Vertex neighbor : neighbors){
            updateDistance(vertex , neighbor);
        }
    }

    //更新邻居的最短路径
    private  void updateDistance(Vertex vertex, Vertex neighbor){
        int distance = getDistance(vertex, neighbor)+ vertex.getPath();
        if(distance < neighbor.getPath()){
            neighbor.setPath(distance);
        }
    }

    //初始化未访问顶点集合
    private void initUnVisited(){
        unVisted = new PriorityQueue<Vertex>();
        for(Vertex v: vertexs){
            unVisted.add(v);
        }
    }

    //从未访问顶点集合中删除已找到最短路径的结点
    private void pop(){
        unVisted.poll();
    }

    private int getDistance(Vertex source, Vertex destination){
        int sourceIndex= vertexs.indexOf(source);
        int destIndex = vertexs.indexOf(destination);
        return  edges[sourceIndex][destIndex];
    }

    //根据顶点位置获取顶点
    private Vertex getVertex(int index){
        return vertexs.get(index);
    }


    //获取顶点所有（未访问）的邻居
    private List<Vertex> getNeighbors(Vertex v){
        List<Vertex> neighbors = new ArrayList<Vertex>();
        int position = vertexs.indexOf(v);
        Vertex neighbor = null;
        int distance;
        for(int i = 0; i<vertexs.size();i++){
            if(i == position){
                //顶点本身，跳过
                continue;
            }
            //到所有顶点的距离
            distance = edges[position][i];
            if (distance< Integer.MAX_VALUE){
                //是领居（有路径可达）
                neighbor = getVertex(i);
                if (!neighbor.isMarked()){
                    //如果邻居没有访问过，则加入list;
                    neighbors.add(neighbor);
                }
            }

        }
        return neighbors;
    }

    //打印图
    public void printGraph(){
        int verNums = vertexs.size();
        for(int row = 0; row< verNums; row++){
            for(int col = 0; col< verNums; col++){
                if(Integer.MAX_VALUE == edges[row][col]){
                    System.out.print("X");
                    System.out.print(" ");
                    continue;
                }
                System.out.print(edges[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
