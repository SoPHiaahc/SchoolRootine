import java.util.ArrayList;
import java.util.List;

/**
 * Created by bony on 2017/9/4.
 */
public class Test {

    public static void main(String[] args){
        List<Vertex> vertexs = new ArrayList<Vertex>();
        //学校重要标志
        //1~6：大门，真理钟，图书馆，新体育馆，东门，至诚
        Vertex STUDM = new Vertex("大门");//原点
        Vertex ZLZ = new Vertex("真理钟");
        Vertex TSG = new Vertex("图书馆",0);
        Vertex XTYG = new Vertex("新体育馆");
        Vertex DM = new Vertex("东门");
        Vertex ZC = new Vertex("至诚");
        //7-12: E座，校训碑，4饭，G座宿舍，期末篮球馆，DG教学楼
        Vertex EZ = new Vertex("E座");
        Vertex XXB = new Vertex("校训碑");
        Vertex _4F = new Vertex("4饭");
        Vertex GZ = new Vertex("G座宿舍");
        Vertex QMLQG = new Vertex("气膜篮球馆");
        Vertex DG = new Vertex("DG教学楼");
        //13-18： 风洞实验室，科报厅，广东以色列大楼，大礼堂，新行政楼，金三角
        Vertex FDSYS = new Vertex("风洞实验室");
        Vertex KBT = new Vertex("科报厅");
        Vertex GYL = new Vertex("广东以色列大楼");
        Vertex DLT = new Vertex("大礼堂");
        Vertex XXZL = new Vertex("新行政楼");
        Vertex JSJ = new Vertex("金三角");
        //19-24: 23饭，ABCD宿舍楼，EF宿舍楼，水库，ACC，新医学院
        Vertex _23F = new Vertex("223饭");
        Vertex ABCD = new Vertex("ABCD宿舍");
        Vertex EF = new Vertex("EF宿舍");
        Vertex SK = new Vertex("水库");
        Vertex ACC = new Vertex("ACC");
        Vertex XYXY = new Vertex("新医学院");
        //25-30：弘毅，网络中心，汕大附小，知行思源，妇女中心，教师公寓
        Vertex HY = new Vertex("弘毅书院");
        Vertex WLZX = new Vertex("网络中心");
        Vertex SDFX = new Vertex("汕大附小");
        Vertex ZXSY = new Vertex("知行思源");
        Vertex FNZX = new Vertex("妇女中心");
        Vertex JSGY = new Vertex("教师公寓");
        //31-34： 789，艺教中心，校医院，操场
        Vertex _789 = new Vertex("789");
        Vertex YJZX = new Vertex("艺教中心");
        Vertex XYY = new Vertex("校医院");
        Vertex CC = new Vertex("操场");


        vertexs.add(STUDM);
        vertexs.add(ZLZ);
        vertexs.add(TSG);
        vertexs.add(XTYG);
        vertexs.add(DM);
        vertexs.add(ZC);
        vertexs.add(EZ);
        vertexs.add(XXB);
        vertexs.add(_4F);
        vertexs.add(GZ);
        vertexs.add(QMLQG);
        vertexs.add(DG);
        vertexs.add(FDSYS);
        vertexs.add(KBT);
        vertexs.add(GYL);
        vertexs.add(DLT);
        vertexs.add(XXZL);
        vertexs.add(JSJ);
        vertexs.add(_23F);
        vertexs.add(ABCD);
        vertexs.add(EF);
        vertexs.add(SK);
        vertexs.add(ACC);
        vertexs.add(XYXY);
        vertexs.add(HY);
        vertexs.add(WLZX);
        vertexs.add(SDFX);
        vertexs.add(ZXSY);
        vertexs.add(FNZX);
        vertexs.add(JSGY);
        vertexs.add(_789);
        vertexs.add(YJZX);
        vertexs.add(XYY);
        vertexs.add(CC);

        int[][] edges = {
                //1、学校大门
                {Integer.MAX_VALUE,213,Integer.MAX_VALUE,85,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //2、真理钟
                {213,Integer.MAX_VALUE,83,Integer.MAX_VALUE,81,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //3、图书馆
                {Integer.MAX_VALUE,83,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, 163,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,72,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //4、新体育馆
                {85,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,250,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //5、东门
                {Integer.MAX_VALUE,81,Integer.MAX_VALUE,250,Integer.MAX_VALUE,80,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //6、至诚
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,80,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,30,255,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //7、E座
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, 128,164,Integer.MAX_VALUE,Integer.MAX_VALUE,72,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //8、校训碑
                {Integer.MAX_VALUE,Integer.MAX_VALUE,163,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        128, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,202,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, 72,111,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //9、4饭
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,30,
                        164, Integer.MAX_VALUE,Integer.MAX_VALUE,94,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //10、G座宿舍楼
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,255,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,94,Integer.MAX_VALUE,130,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //11、气膜篮球馆
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,130,Integer.MAX_VALUE,50,
                        42,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //12、DG教学楼
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        72, 202,Integer.MAX_VALUE,Integer.MAX_VALUE,50,Integer.MAX_VALUE,
                        60,Integer.MAX_VALUE,30,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //13、风洞实验室
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,42,60,
                        Integer.MAX_VALUE,725, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},

                //14、科报厅
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        725,Integer.MAX_VALUE,500,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        85,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},

                //15、广东以色列理工楼
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,72,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,30,
                        Integer.MAX_VALUE,500, Integer.MAX_VALUE,85,134,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},

                //16、大礼堂
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,111,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, 85,Integer.MAX_VALUE,Integer.MAX_VALUE,549,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,111,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},

                //17、新行政楼
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, 134,Integer.MAX_VALUE,Integer.MAX_VALUE,128,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},

                //18、金三角
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,549,128,Integer.MAX_VALUE,
                        72,94,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,60},
                //19、23饭
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,85, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,72,
                        Integer.MAX_VALUE,66,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //20、ABCD
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,94,
                        66,Integer.MAX_VALUE,85,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //21、EF
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,85,Integer.MAX_VALUE,571,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},

                //22、水库
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,571,Integer.MAX_VALUE,83,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //23、ACC
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,83,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //24、新医学院
                {Integer.MAX_VALUE,Integer.MAX_VALUE,72,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        102,242, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //25、弘毅书院
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,170,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,102,
                        Integer.MAX_VALUE,106, Integer.MAX_VALUE,Integer.MAX_VALUE,105,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //26、网络中心
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,242,
                        106,Integer.MAX_VALUE, 32,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //27、汕大附小
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,32,Integer.MAX_VALUE,410,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //28、知行弘毅
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,410,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //29、妇女中心
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,111,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        105,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,277,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //30、教师公寓
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,277,Integer.MAX_VALUE,
                        119,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //31、789
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,119,
                        Integer.MAX_VALUE,70,35,85},
                //32、艺教中心
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        70,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //33、校医院
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        35,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},
                //34、操场
                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,60,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,
                        85,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE},

        };
        Graph graph = new Graph(vertexs, edges);
        graph.printGraph();
        graph.search();
        System.out.println("节点 "+ ZLZ.getName()+" 距离初始节点 "+TSG.getName()+" 的最小距离为："+ZLZ.getPath());
        System.out.println("节点 "+ DM.getName()+" 距离初始节点 "+TSG.getName()+" 的最小距离为："+DM.getPath());
        System.out.println("节点 "+ TSG.getName()+" 距离初始节点 "+TSG.getName()+" 的最小距离为："+TSG.getPath());
        System.out.println("节点 "+ XXB.getName()+" 距离初始节点 "+TSG.getName()+" 的最小距离为："+XXB.getPath());
        System.out.println("节点 "+ XYXY.getName()+" 距离初始节点 "+TSG.getName()+" 的最小距离为："+XYXY.getPath());

        /*System.out.println("节点"+c.getName()+"距离初始节点a的最小距离为："+c.getPath());
        System.out.println("节点"+d.getName()+"距离初始节点a的最小距离为："+d.getPath());
        System.out.println("节点"+e.getName()+"距离初始节点a的最小距离为："+e.getPath());
        System.out.println("节点"+f.getName()+"距离初始节点a的最小距离为："+f.getPath());
*/
    }
}
