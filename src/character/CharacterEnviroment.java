/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class CharacterEnviroment extends Environment {


//    private  Umbreon dmBig;
    private  Glaceon dmSmall;

    public CharacterEnviroment() {
        dmSmall = new Glaceon(400, 150, 400, 250);
//        dmBig = new (300, 500, 400, 250);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {

        if (dmSmall != null) {
            dmSmall.draw(graphics);
        }
//        if (dmBig != null) {
//            dmBig.draw(graphics);
        }

    }


