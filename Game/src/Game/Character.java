/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;

/**
 *
 * @author bhargav
 */
public class Character {
    private int type;
    private boolean gucci;
    private String form;
    
    public Character(int t, boolean isGucci){
        type = t;
        gucci = isGucci;
        if (t == 0){
            form = "average";
        }
        if (t == 1){
            form = "nerd";
        }
        if (t == 2){
            form = "hero";
        }
        if (t == 3){
            form = "villain";
        }
        if (t == 4){
            form = "wizard";
        }
        if (t == 5){
            form = "conman";
        }
        if (t == 6){
            form = "other";
        }
    }
    
}
