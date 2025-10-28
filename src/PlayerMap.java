import java.util.Scanner;

public class PlayerMap {

    private class Map{
        private int rows;
        private int cols;
        private char[][] grid;

        Map(int rows, int cols){
            this.rows = rows;
            this.cols = cols;
            this.grid = new char[rows][cols];

        }
    }
    public int GetRows(int rows){
        return rows;
    }
    public int GetCols(Map map){
        return map.cols;
    }

    public int SetRows(int rows){

        return rows = GetRows(rows);
    }


    private void createmap(){

    }


}

//test