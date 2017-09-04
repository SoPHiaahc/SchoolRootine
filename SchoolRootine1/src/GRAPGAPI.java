/**
 * Created by bony on 2017/9/4.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 * 图的常用算法实现（邻接矩阵表示）
 * @author XiaoYe
 *
 */
public class GRAPGAPI  {
    public class Vertex implements Comparable<Vertex>{

        /**
         * 节点名称(A,B,C,D)
         */
        private String name;

        /**
         * 最短路径长度
         */
        private int minPath;

        /**
         * 最小生成树中节点链接的另一个节点的ID,两个节点之间保存着最小生成树中的边
         */
        private int anotherIDinminEdge;


        /**
         * 节点是否已经出列(是否已经处理完毕)最短路径用到
         */
        private boolean isMarked;

        public Vertex(String name){
            this.name = name;
            this.minPath = Integer.MAX_VALUE; //初始设置最短路径长度为无穷大
            this.anotherIDinminEdge=-1;
            this.setMarked(false);
        }
        public Vertex(String name, int path){
            this.name = name;
            this.minPath = path;
            this.setMarked(false);
        }
        public int getAnotherIDinminEdge() {
            return anotherIDinminEdge;
        }
        public void setAnotherIDinminEdge(int anotherIDinminEdge) {
            this.anotherIDinminEdge = anotherIDinminEdge;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getPath() {
            return minPath;
        }

        public void setPath(int path) {
            this.minPath = path;
        }

        boolean isMarked(){
            return this.isMarked;

        }

        void setMarked(boolean flag){
            this.isMarked=flag;
        }

        @Override
        public int compareTo(Vertex o) {
            return o.minPath > minPath?-1:1;
        }
    }


    public class Graph {

        /**
         * 顶点
         */
        private List<Vertex> vertexs;

        /**
         * 边
         */
        private int[][] edges;

        /**
         * 拓扑序列
         */
        private List<Vertex> topVertexs;

        /**
         * 没有访问的顶点,用于求最短路径
         */
        private Queue<Vertex> unVisited;
        /**
         * 最小生成树保存在二维数组中
         */
        private int[][] minTree;


        /**
         * 初始化
         * @param vertexs
         * @param edges
         */
        public Graph(List<Vertex> vertexs, int[][] edges) {
            this.vertexs = vertexs;
            this.topVertexs=new ArrayList<GRAPGAPI.Vertex>();
            this.edges = edges;
            this.minTree=new int[this.vertexs.size()][this.vertexs.size()];
            initUnVisited();
        }

        /**
         * 深度优先搜索
         * @param
         */
        public void  DFS(String vertexName){
            int id=getIdOfVertexName(vertexName);
            if(id==-1)return;
            vertexs.get(id).setMarked(true);
            System.out.println("遍历到"+vertexs.get(id).getName());
            List<Vertex> neighbors = getNeighbors(vertexs.get(id));
            for(int i=0;i<neighbors.size();i++){
                if(!neighbors.get(i).isMarked()){
                    DFS(neighbors.get(i).getName());
                }
            }
        }
        /**
         * 广度优先搜索
         * @param
         */
        public void BFS(String vertexName){
            int startID=getIdOfVertexName(vertexName);
            if(startID==-1) return;
            List<Vertex> q=new ArrayList<Vertex>();
            q.add(vertexs.get(startID));
            vertexs.get(startID).setMarked(true);
            while(!q.isEmpty()){
                Vertex curVertex=q.get(0);
                q.remove(0);
                System.out.println("遍历到"+curVertex.getName());
                List<Vertex> neighbors = getNeighbors(curVertex);
                for(int i=0;i<neighbors.size();i++){
                    if(!neighbors.get(i).isMarked()){
                        neighbors.get(i).setMarked(true);
                        q.add(neighbors.get(i));
                    }
                }

            }

        }

        /**
         * 获取最小生成树
         * @return
         */
        public int[][] getMinTree(){
            initMinTree();//初始化最小生成树
            while(!allVisited()){
                Vertex vertex = vertexs.get(getNotMarkedMinVertex());//设置处理节点
                System.out.println("处理：节点"+vertex.getName());
                //顶点已经计算出最短路径，设置为"已访问"
                vertex.setMarked(true);
                //获取所有"未访问"的邻居
                List<Vertex> neighbors = getNeighbors(vertex);
                System.out.println("邻居个数为："+neighbors.size());
                //更新最小生成树
                updateMinEdge(vertex, neighbors);
            }
            System.out.println("search over");
            setMinTree();

            return minTree;
        }
        /**
         * 设置最小生成树矩阵对称
         */
        public void setMinTree(){
            for(int i=0;i<vertexs.size();i++){
                if(vertexs.get(i).getAnotherIDinminEdge()!=-1){
                    minTree[getIdOfVertexName(vertexs.get(i).getName())][vertexs.get(i).getAnotherIDinminEdge()]=
                            edges[getIdOfVertexName(vertexs.get(i).getName())][vertexs.get(i).getAnotherIDinminEdge()];
                    minTree[vertexs.get(i).getAnotherIDinminEdge()][getIdOfVertexName(vertexs.get(i).getName())]=
                            edges[vertexs.get(i).getAnotherIDinminEdge()][getIdOfVertexName(vertexs.get(i).getName())];
                }
            }
        }
        /**
         * 初始化最小生成树,将所有节点设置值最大
         */
        public void initMinTree(){
            for(int i=0;i<this.vertexs.size();i++){
                for(int j=0;j<this.vertexs.size();j++){
                    this.minTree[i][j]=Integer.MAX_VALUE;
                }

            }
        }
        /**
         * 更新最小生成树
         * @param vertex
         * @param neighbors
         */
        public void  updateMinEdge(Vertex vertex, List<Vertex> neighbors){
            //参数检测
            if(!isInGraph(vertex)){
                System.out.println("当前节点不在图中");
                return ;
            }

            for(Vertex neighbor: neighbors){
                int distance = edges[getIdOfVertexName(neighbor.getName())][getIdOfVertexName(vertex.getName())];
                if(neighbor.getAnotherIDinminEdge()==-1){
                    neighbor.setAnotherIDinminEdge(getIdOfVertexName(vertex.getName()));
                    System.out.println(neighbor.getName()+"setEdge To"+vertex.getName()+edges[neighbor.getAnotherIDinminEdge()][getIdOfVertexName(neighbor.getName())]);
                }
                else if(distance <  edges[getIdOfVertexName(neighbor.getName())][neighbor.getAnotherIDinminEdge()]){
                    neighbor.setAnotherIDinminEdge(getIdOfVertexName(vertex.getName()));
                    System.out.println(neighbor.getName()+"setEdge To"+vertex.getName()+edges[neighbor.getAnotherIDinminEdge()][getIdOfVertexName(neighbor.getName())]);
                }
            }
        }

        /**
         * 拓扑排序
         */
        public void topSort(){
            int[][] tmpEdges=edges;
            int IDofNullPreVertex=getNullPreVertexID(tmpEdges);//获得当前图中无前驱的节点
            while(IDofNullPreVertex!=-1){
                vertexs.get(IDofNullPreVertex).setMarked(true);
                topVertexs.add(vertexs.get(IDofNullPreVertex));//拓扑序列增加
                //边销毁
                for(int j=0;j<this.vertexs.size();j++){
                    if(tmpEdges[IDofNullPreVertex][j]!=Integer.MAX_VALUE){
                        tmpEdges[IDofNullPreVertex][j]=Integer.MAX_VALUE;
                    }
                }
                IDofNullPreVertex=getNullPreVertexID(tmpEdges);
            }

        }

        /**
         * 获取当前图中无前驱的节点
         * @param tmpEdges
         * @return
         */
        public int getNullPreVertexID(int[][] tmpEdges){
            int resultId=-1;
            for(int j=0;j< this.vertexs.size();j++){
                boolean flag=false;
                for(int i=0;i< this.vertexs.size();i++){
                    if(tmpEdges[i][j]!=Integer.MAX_VALUE){
                        flag=true;
                    }
                }
                if(!flag&&!vertexs.get(j).isMarked()){
                    resultId=j;
                    break;
                }
            }
            return resultId;
        }


        /**
         * 搜索各顶点最短路径
         */
        public void search(){
            while(!unVisited.isEmpty()){
                Vertex vertex = unVisited.element();
                //顶点已经计算出最短路径，设置为"已访问"
                vertex.setMarked(true);
                //获取所有"未访问"的邻居
                List<Vertex> neighbors = getNeighbors(vertex);
                //更新邻居的最短路径
                updatesDistance(vertex, neighbors);
                pop();
            }
            System.out.println("search over");
        }

        /**
         * 更新所有邻居的最短路径
         */
        private void updatesDistance(Vertex vertex, List<Vertex> neighbors){
            //参数检测
            if(!isInGraph(vertex)){
                System.out.println("当前节点不在图中");
                return ;
            }
            for(Vertex neighbor: neighbors){
                updateDistance(vertex, neighbor);
            }
        }

        /**
         * 更新邻居的最短路径
         */
        private void updateDistance(Vertex vertex, Vertex neighbor){
            //参数检测
            if(!isInGraph(vertex)||!isInGraph(neighbor)){
                System.out.println("当前节点不在图中");
                return ;
            }
            int distance = getDistance(vertex, neighbor) + vertex.getPath();
            if(distance < neighbor.getPath()){
                neighbor.setPath(distance);
            }
        }

        /**
         * 初始化未访问顶点集合
         */
        private void initUnVisited() {
            unVisited = new PriorityQueue<Vertex>();
            for (Vertex v : vertexs) {
                unVisited.add(v);
            }
        }

        /**
         * 从未访问顶点集合中删除已找到最短路径的节点
         */
        private void pop() {
            unVisited.poll();
        }

        /**
         * 获取顶点到目标顶点的距离
         */
        private int getDistance(Vertex source, Vertex destination) {
            //参数检测
            if(!isInGraph(source)||!isInGraph(destination)){
                System.out.println("当前节点不在图中");
                return -1;
            }



            int sourceIndex = vertexs.indexOf(source);
            int destIndex = vertexs.indexOf(destination);
            return edges[sourceIndex][destIndex];
        }

        /**
         * 获取顶点所有(未访问的)邻居
         */
        public List<Vertex> getNeighbors(Vertex v) {
            //参数检测
            if(!isInGraph(v)){
                System.out.println("当前节点不在图中");
                return null;
            }
            List<Vertex> neighbors = new ArrayList<Vertex>();
            int position = vertexs.indexOf(v);
            Vertex neighbor = null;
            int distance;
            for (int i = 0; i < vertexs.size(); i++) {
                if (i == position) {
                    //顶点本身，跳过
                    continue;
                }
                distance = edges[position][i];    //到所有顶点的距离
                if (distance < Integer.MAX_VALUE) {
                    //是邻居(有路径可达)
                    neighbor = getVertex(i);
                    if (!neighbor.isMarked()) {
                        //如果邻居没有访问过，则加入list;
                        neighbors.add(neighbor);
                    }
                }
            }
            return neighbors;
        }

        /**
         * 根据顶点位置获取顶点
         */
        private Vertex getVertex(int index) {
            if(index<0||index>vertexs.size()+1){
                System.out.println("获取ID为"+index+"的顶点失败");
                return null;
            }
            return vertexs.get(index);
        }

        /**
         * 打印图
         */
        public void printGraph() {
            int verNums = vertexs.size();
            for (int row = 0; row < verNums; row++) {
                for (int col = 0; col < verNums; col++) {
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
        /**
         * 判断是否全部访问到
         * @return
         */
        public boolean allVisited(){
            boolean flag=true;
            for(int i=0;i<vertexs.size();i++){
                if(!vertexs.get(i).isMarked())
                    flag=false;
            }
            return flag;
        }

        /**
         * 打印拓扑序列
         */
        public void printTopSort(){
            for(int i=0;i<this.topVertexs.size();i++){
                System.out.print(this.topVertexs.get(i).getName()+" ");
            }
            System.out.println();
        }

        public int getIdOfVertexName(String name){
            int id=-1;
            for(int i=0;i<vertexs.size();i++){
                if(vertexs.get(i).getName().equals(name))
                    id=i;
            }
            return id;
        }
        /**
         * 获取到连接着未访问过的节点的最小边，返回链接节点的ID
         * @return
         */
        public int getNotMarkedMinVertex(){
            int min=10000;
            int id=0;
            for(int i=0;i<vertexs.size();i++){
                if(!vertexs.get(i).isMarked()&&vertexs.get(i).getAnotherIDinminEdge()!=-1){
                    if(min>edges[getIdOfVertexName(vertexs.get(i).getName())][vertexs.get(i).getAnotherIDinminEdge()]){
                        min=edges[getIdOfVertexName(vertexs.get(i).getName())][vertexs.get(i).getAnotherIDinminEdge()];
                        id=i;

                    }
                }
            }
            return id;
        }

        /**
         * 清除图中的标记信息
         */
        public void clearGraph(){
            for(Vertex vertex:vertexs){
                vertex.setMarked(false);
                vertex.setAnotherIDinminEdge(-1);
            }

        }

        private boolean isInGraph(Vertex v){
            for(Vertex vertex:vertexs){
                if(vertex.getName().equals(v.getName()))
                    return true;
            }
            return false;
        }


    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GRAPGAPI main=new GRAPGAPI();

        //初始化图
        List<Vertex> vertexs = new ArrayList<Vertex>();
        Vertex a = main.new Vertex("A",0);//0到第一个节点的最短路径设置为0
        Vertex b = main.new Vertex("B");
        Vertex c = main.new Vertex("C");
        Vertex d = main.new Vertex("D");
        Vertex e = main.new Vertex("E");
        Vertex f = main.new Vertex("F");
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
        Graph graph = main.new Graph(vertexs, edges);

        //遍历
        System.out.println("------------------------------------");
        System.out.println("当前图状态：");
        graph.printGraph();
        System.out.println("------------------------------------");
        System.out.println("深度优先遍历：");
        System.out.println("开始节点：E");
        graph.DFS("E");
        graph.clearGraph();
        System.out.println("------------------------------------");
        System.out.println("广度优先遍历：");
        System.out.println("开始节点：E");
        graph.BFS("E");
        graph.clearGraph();

        //最小生成树
        System.out.println("------------------------------------");
        System.out.println("最小生成树：");
        int[][] minTree=graph.getMinTree();
        for(int i=0;i<vertexs.size();i++){
            for(int j=0;j<vertexs.size();j++){
                if(minTree[i][j]==Integer.MAX_VALUE)
                    minTree[i][j]=0;
                System.out.print(minTree[i][j]+" ");
            }
            System.out.println();
        }
        graph.clearGraph();

        //拓扑序列
//          System.out.println("------------------------------------");
//          System.out.println("拓扑排序(Ps：针对于有向图，需要修改图的链接结构！！！)");
//          System.out.println(graph.getNullPreVertexID()+"###");
//          graph.topSort();
//          graph.printTopSort();
//          graph.clearGraph();

        //最短路径
        System.out.println("------------------------------------");
        System.out.println("最短路径");
        graph.search();
        System.out.println("节点"+f.getName()+"距离初始节点的最小距离为："+f.getPath());


    }

}