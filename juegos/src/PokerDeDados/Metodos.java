/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PokerDeDados;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
/**
 *
 * @author ines
 */
public class Metodos {

  
    static void iniciarPantalla(Pantalla pantalla, JLabel bkgrnd, JLabel r1, JLabel r2, JLabel r3, JLabel r4, JLabel r5) {

        pantalla.setVisible(true);
        bkgrnd.setVisible(true);
        r1.setVisible(false);
        r2.setVisible(false);
        r3.setVisible(false);
        r4.setVisible(false);
        r5.setVisible(false);
    }


    static void setToFalse(JLabel k, JLabel q, JLabel j, JLabel t, JLabel a, JLabel n) {
        k.setVisible(false);
        q.setVisible(false);
        j.setVisible(false);
        n.setVisible(false);
        t.setVisible(false);
        a.setVisible(false);
    }

    static void rollDice(JLabel k, JLabel q, JLabel j, JLabel n, JLabel t, JLabel a) {

        new Thread() {
            @Override
            public void run() {
                try {
                    int veces = 8;

                    for (int i = 0; i <= veces; i++) {

                        int random = (int) (Math.random() * 6) + 1;

                        switch (random) {
                            case 1:
                                k.setVisible(true);
                                break;
                            case 2:
                                q.setVisible(true);
                                break;
                            case 3:
                                j.setVisible(true);
                                break;
                            case 4:
                                t.setVisible(true);
                                break;
                            case 5:
                                n.setVisible(true);
                                break;
                            case 6:
                                a.setVisible(true);
                                break;
                        }

                        Thread.sleep(300);
                        if (i == veces) {

                        } else {
                            setToFalse(k, q, j, t, a, n);
                        }
                    }
                } catch (InterruptedException e) {
                }
            }
        }.start();

    }
    
    
    static void playMusic(String musicfile) {

        try {
            File musicPath = new File(musicfile);

            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            } else {
                System.out.println("cannot find audio file");
            }

        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
        }
    }
}
