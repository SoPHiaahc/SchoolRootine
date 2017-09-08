package Astar;

import java.util.Objects;

/**
 * Created by bony on 2017/9/7.
 */
public class Coord {
    public int x;
    public int y;

    public Coord(int x,int y){
        this.x = x;
        this.y = y;
    }

    //比较坐标
    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;
        if(obj instanceof Coord){
            Coord c= (Coord) obj;
            return x ==c.x&& y==c.y;
        }
        return false;
    }
}

