/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trailofspace;


import byui.cit260.curiousWorkmanship.model.Player;
import byui.cit260.curiousWorkmanship.model.ship;
import byui.cit260.curiousWorkmanship.model.characters;
import byui.cit260.curiousWorkmanship.model.spaceCaves;
import byui.cit260.curiousWorkmanship.model.map;
import byui.cit260.curiousWorkmanship.model.game;
import byui.cit260.curiousWorkmanship.model.armor;
import byui.cit260.curiousWorkmanship.model.ancientAlienBattle;
import byui.cit260.curiousWorkmanship.model.weapon;
import byui.cit260.curiousWorkmanship.model.location;
import byui.cit260.curiousWorkmanship.model.inventory;
import byui.cit260.curiousWorkmanship.model.battle;
import citbyui.cit260.TrailofSpace.view.startProgramView;
import citbyui.cit260.curiousworkmanship.control.Game;


/**
 *
 * @author Travis
 * 
 * private double armor;
    private double upgradeArmor;
 */
public class TrailofSpace {

    /**
     * @param args
     */
    
    public static void main(String[] args) {
            // create StartProgramView and start the program
            startProgramView startProgramView = new startProgramView();
            startProgramView.startProgram();

    }

    public class CuriousWorkmanship implements Serializable{

        public static void setPlayer(Player player) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        public CuriousWorkmanship(){
       
        private static Game currentGame = null;
        private static Player player = null;

    }
    
        public static Game getCurrentGame() {
            return currentGame;
        }

        public static void setCurrentGame(Game currentGame) {
            CuriousWorkmanship.currentGame = currentGame;
        }

        public static Player getPlayer() {
            return player;
        }

        public static void setPlayer(Player player) {
            CuriousWorkmanship.player = player;
        }
    }
    
        
    
    
}
