/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author alextsai
 */
public class Glaceon {

    public void draw(Graphics graphics) {
        graphics.drawRect(x, y, width, height);
        graphics.setColor(Color.cyan);
        graphics.fillOval(x + (width * 1 / 3), y + (height * 1 / 4), width - (width * 2 / 3), height - (height * 3 / 4));
        graphics.setColor(Color.blue);
        graphics.fillOval(x + (width * 1 / 3), y + (height * 1 / 4), width - (width * 2 / 3), height - (height * 7 / 8));

        graphics.setColor(Color.cyan);
        int[] xS = new int[4];
        xS[0] = x + (width / 20);
        xS[1] = x + (width / 10);
        xS[3] = x + (width / 3);
        xS[2] = x + (width / 3);

        int[] yS = new int[4];
        yS[0] = y;
        yS[1] = y + (height * 25 / 100);
        yS[3] = y + (height * 18 / 100);
        yS[2] = y + (height * 35 / 100);

        graphics.fillPolygon(xS, yS, 4);

        int[] aS = new int[4];
        aS[0] = x + (width * 19 / 20);
        aS[1] = x + (width * 9 / 10);
        aS[2] = x + (width * 2 / 3);
        aS[3] = x + (width * 2 / 3);

        int[] zS = new int[4];
        zS[0] = y;
        zS[1] = y + (height * 25 / 100);
        zS[2] = y + (height * 35 / 100);
        zS[3] = y + (height * 18 / 100);
        graphics.fillPolygon(aS, zS, 4);
        
        
        
        graphics.setColor(Color.blue);
        
        int[] pS = new int[4];
        pS[0] = x + (width * 50 / 100);
        pS[1] = x + (width * 45 / 100);
        pS[2] = x + (width * 50 / 100);
        pS[3] = x + (width * 55 / 100);

        int[] oS = new int[4];
        oS[0] = y + (height * 24 / 100);
        oS[1] = y + (height * 32 / 100);
        oS[2] = y + (height * 38 / 100);
        oS[3] = y + (height * 32 / 100);
        graphics.fillPolygon(pS, oS, 4);
        
        
        graphics.setColor(Color.cyan);
        int[] uS = new int[4];
        uS[0] = x + (width * 50 / 100);
        uS[1] = x + (width * 45 / 100);
        uS[2] = x + (width * 50 / 100);
        uS[3] = x + (width * 55 / 100);

        int[] nS = new int[4];
        nS[0] = y + (height * 24 / 100);
        nS[1] = y + (height * 31 / 100);
        nS[2] = y + (height * 38 / 100);
        nS[3] = y + (height * 31 / 100);
        graphics.drawPolygon(uS, nS, 4);
        
        
        
        

    }

    public Glaceon(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    private int x;
    private int y;
    private int height;
    private int width;

}
