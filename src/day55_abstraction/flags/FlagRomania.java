package day55_abstraction.flags;

import java.awt.*;

public class FlagRomania {
    public static void main(String[] args) {
        Grid grid = new Grid();
        grid.setColor(0,0, Color.RED);

        Grid grid1 = new Grid();
        for(int row=0;row<grid1.getHt();row++){
            for(int col=0;col<grid1.getWd();col++){
                if(col<grid1.getWd()/3 ){
                    grid1.setColor(row, col, Color.RED);
                }else if(col<grid1.getWd()/3*2){
                    grid1.setColor(row, col, Color.YELLOW);
                }else{
                    grid1.setColor(row, col, Color.BLUE);
                }

            }

        }
    }
}
