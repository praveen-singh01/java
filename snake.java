
package com.praveen;

import javax.swing.*;

    public class snake extends JFrame{

        snake(){
            super("Snake Game");
            add(new board());
            pack();

            setLocationRelativeTo(null);
//        setTitle("Snake Game");
            setResizable(false);

        }

        public static void main(String[] args){
            new snake().setVisible(true);
        }
    }


