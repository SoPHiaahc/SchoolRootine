import java.util.ArrayList;
import java.util.List;

/**
 * Created by bony on 2017/9/4.
 */
public class Test {

    public static void main(String[] args){
        List<Vertex> vertexs = new ArrayList<Vertex>();
        Vertex a = new Vertex("A",0);
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        vertexs.add(a);
        vertexs.add(b);
        vertexs.add(c);
        vertexs.add(d);
        vertexs.add(e);
        vertexs.add(f);
        int[][] edges = {
                {Integer.MAX_VALUE,6,3,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {6,Integer.MAX_VALUE,2,5,Integer.MAX_VALUE,Integer.MAX_VALUE},
                {3,2,Integer.MAX_VALUE,3,4,Integer.MAX_VALUE},
                {Integer.MAX_VALUE,5,3,Integer.MAX_VALUE,5,3},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,4,5,Integer.MAX_VALUE,5},
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,3,5,Integer.MAX_VALUE}

        };

        Graph graph = new Graph(vertexs, edges);
        graph.printGraph();
        graph.search();
        System.out.println("节点"+b.getName()+"距离初始节点a的最小距离为："+b.getPath());
        System.out.println("节点"+c.getName()+"距离初始节点a的最小距离为："+c.getPath());
        System.out.println("节点"+d.getName()+"距离初始节点a的最小距离为："+d.getPath());
        System.out.println("节点"+e.getName()+"距离初始节点a的最小距离为："+e.getPath());
        System.out.println("节点"+f.getName()+"距离初始节点a的最小距离为："+f.getPath());

    }
}
