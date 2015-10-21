/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import java.io.Serializable;

/**
 *
 * @author Dad
 */
public class league implements Serializable {
    
public team Ari;
public team Atl;
public team Bal;
public team Buf;
public team Car;
public team Chi;
public team Cin;
public team Cle;
public team Dal;
public team Den;
public team Det;
public team GB;
public team Hou;
public team Ind;
public team Jac;
public team KC;
public team Mia;
public team Min;
public team NE;
public team NO;
public team NYG;
public team NYJ;
public team Oak;
public team Phi;
public team Pit;
public team SD;
public team Sea;
public team Sf;
public team StL;
public team TB;
public team Ten;
public team Was;
public team ref;


    public league()
    {
        
        Ari = new team("Ari", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Atl = new team("Atl", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Bal = new team("Bal", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Buf = new team("Buf", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Car = new team("Car", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Chi = new team("Chi", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Cin = new team("Cin", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Cle = new team("Cle", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Dal = new team("Dal", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Den = new team("Den", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Det = new team("Det", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        GB = new team("GB", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Hou = new team("Hou", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Ind = new team("Ind", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Jac = new team("Jac", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        KC = new team("KC", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Mia = new team("Mia", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Min = new team("Min", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        NE = new team("NE", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        NO = new team("NO", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        NYG = new team("NYG", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        NYJ = new team("NYJ", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Oak = new team("Oak", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Phi = new team("Phi", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Pit = new team("Pit", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        SD = new team("SD", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Sea = new team("Sea", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Sf = new team("Sf", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        StL = new team("StL", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        TB = new team("TB", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Ten = new team("Ten", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        Was = new team("Was", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        ref = new team("ref", 0, 0, 0, 0, 0, 0, 0, 0, 0 ,0 );
        
        
        
        
        
        
    }
    
    public void addgame( Object winner, Object losser, int hometeam, int favored, String score1, String score2, String spread ) {
        
        team win = stringtoteam( winner );
        team lose = stringtoteam( losser );
        
        win.setWins(win.getWins() + 1);
        lose.setLosses(lose.getLosses() + 1);
        
        ref.setWins(ref.getWins() + 1);
        ref.setLosses(ref.getLosses() + 1);
        
        
        int scorea = Integer.parseInt(score1);
        int scoreb = Integer.parseInt(score2);
        
        int winpoints;
        int losepoints;
        
        double spreada = Double.parseDouble(spread);
        
        winpoints = scorea;
        losepoints = scoreb;
        
//        if ( scorea > scoreb ) {
//            winpoints = scorea;
//            losepoints = scoreb;
//        } else {
//            winpoints = scoreb;
//            losepoints = scorea;
//        }
//        
        win.setPointsfor(win.getPointsfor() + winpoints);
        win.setPointsagainst(win.getPointsagainst() + losepoints);
        
        lose.setPointsfor(lose.getPointsfor() + losepoints);
        lose.setPointsagainst(lose.getPointsagainst() + winpoints);
        
        ref.setPointsfor(ref.getPointsfor() + winpoints);
        ref.setPointsagainst(ref.getPointsagainst() + losepoints);
        
        ref.setPointsfor(ref.getPointsfor() + losepoints);
        ref.setPointsagainst(ref.getPointsagainst() + winpoints);
        
        if ( hometeam == 1 ) {
            win.setHomewins(win.getHomewins() + 1);
            lose.setAwaylosses(lose.getAwaylosses() + 1);
            
            win.setHomepointsfor(win.getHomepointsfor() + winpoints);
            win.setHomepointsagainst(win.getHomepointsagainst() + losepoints);
        
            lose.setAwaypointsfor(lose.getAwaypointsfor() + losepoints);
            lose.setAwaypointsagainst(lose.getAwaypointsagainst() + winpoints);
            
            
            
            ref.setHomewins(ref.getHomewins() + 1);
            ref.setAwaylosses(ref.getAwaylosses() + 1);
            
            ref.setHomepointsfor(ref.getHomepointsfor() + winpoints);
            ref.setHomepointsagainst(ref.getHomepointsagainst() + losepoints);
        
            ref.setAwaypointsfor(ref.getAwaypointsfor() + losepoints);
            ref.setAwaypointsagainst(ref.getAwaypointsagainst() + winpoints);
            
            
        }
        else {
            win.setAwaywins(win.getAwaywins() + 1);
            lose.setHomelosses(lose.getHomelosses() + 1);
            
            win.setAwaypointsfor(win.getAwaypointsfor() + winpoints);
            win.setAwaypointsagainst(win.getAwaypointsagainst() + losepoints);
        
            lose.setHomepointsfor(lose.getHomepointsfor() + losepoints);
            lose.setHomepointsagainst(lose.getHomepointsagainst() + winpoints);
            
            ref.setAwaywins(ref.getAwaywins() + 1);
            ref.setHomelosses(ref.getHomelosses() + 1);
            
            ref.setAwaypointsfor(ref.getAwaypointsfor() + winpoints);
            ref.setAwaypointsagainst(ref.getAwaypointsagainst() + losepoints);
        
            ref.setHomepointsfor(ref.getHomepointsfor() + losepoints);
            ref.setHomepointsagainst(ref.getHomepointsagainst() + winpoints);
        }
        
        if ( favored == 1 ) {
            win.setFavwins(win.getFavwins() + 1);
            lose.setUnderlosses(lose.getUnderlosses() + 1);
            
            win.setSpreadtotal(win.getSpreadtotal() + ( int )spreada);
            lose.setSpreadtotal(lose.getSpreadtotal() - ( int )spreada);
            
            win.addAvedifspread( ( int )spreada, scorea - scoreb );
            lose.addAvedifspread( -1 * ( int )spreada, scoreb - scorea );
            
            ref.setFavwins(ref.getFavwins() + 1);
            ref.setUnderlosses(ref.getUnderlosses() + 1);
            
            ref.setSpreadtotal(ref.getSpreadtotal() + ( int )spreada);
            ref.setSpreadtotal(ref.getSpreadtotal() - ( int )spreada);
            
            ref.addAvedifspread( ( int )spreada, scorea - scoreb );
            ref.addAvedifspread( -1 * ( int )spreada, scoreb - scorea );
        } 
        else {
            win.setUnderwins(win.getUnderwins() + 1);
            lose.setFavlosses(lose.getFavlosses() + 1);
            
            win.setSpreadtotal(win.getSpreadtotal() - ( int )spreada);
            lose.setSpreadtotal(lose.getSpreadtotal() + ( int )spreada);
            
            win.addAvedifspread( -1 * ( int )spreada, scorea - scoreb );
            lose.addAvedifspread( ( int )spreada, scoreb - scorea );
            
            ref.setUnderwins(ref.getUnderwins() + 1);
            ref.setFavlosses(ref.getFavlosses() + 1);
            
            ref.setSpreadtotal(ref.getSpreadtotal() - ( int )spreada);
            ref.setSpreadtotal(ref.getSpreadtotal() + ( int )spreada);
            
            ref.addAvedifspread( -1 * ( int )spreada, scorea - scoreb );
            ref.addAvedifspread( ( int )spreada, scoreb - scorea );
        }
        
    }
    
    
    
    public int getstat( Object teamname, Object stat ) {
        
        if ( stat.equals("Wins") ) {
            return stringtoteam( teamname ).getWins();
        }
        if ( stat.equals("Losses") ) {
            return stringtoteam( teamname ).getLosses();
        }
        if ( stat.equals("Home Wins") ) {
            return stringtoteam( teamname ).getHomewins();
        }
        if ( stat.equals("Home Losses") ) {
            return stringtoteam( teamname ).getHomelosses();
        }
        if ( stat.equals("Away Wins") ) {
            return stringtoteam( teamname ).getAwaywins();
        }
        if ( stat.equals("Away Losses") ) {
            return stringtoteam( teamname ).getAwaylosses();
        }
        if ( stat.equals("Favored Wins") ) {
            return stringtoteam( teamname ).getFavwins();
        }
        if ( stat.equals("Favored Losses") ) {
            return stringtoteam( teamname ).getFavlosses();
        }
        if ( stat.equals("Underdog Wins") ) {
            return stringtoteam( teamname ).getUnderwins();
        }
        if ( stat.equals("Underdog Losses") ) {
            return stringtoteam( teamname ).getUnderlosses();
        }
        
        return 0;
    }
    
    public String getstatstring( Object teamname, Object stat ) {
        
        if ( stat.equals("Wins") ) {
            return "" + stringtoteam( teamname ).getWins();
        }
        if ( stat.equals("Losses") ) {
            return "" + stringtoteam( teamname ).getLosses();
        }
        if ( stat.equals("Home Wins") ) {
            return "" + stringtoteam( teamname ).getHomewins();
        }
        if ( stat.equals("Home Losses") ) {
            return "" + stringtoteam( teamname ).getHomelosses();
        }
        if ( stat.equals("Away Wins") ) {
            return "" + stringtoteam( teamname ).getAwaywins();
        }
        if ( stat.equals("Away Losses") ) {
            return "" + stringtoteam( teamname ).getAwaylosses();
        }
        if ( stat.equals("Favored Wins") ) {
            return "" + stringtoteam( teamname ).getFavwins();
        }
        if ( stat.equals("Favored Losses") ) {
            return "" + stringtoteam( teamname ).getFavlosses();
        }
        if ( stat.equals("Underdog Wins") ) {
            return "" + stringtoteam( teamname ).getUnderwins();
        }
        if ( stat.equals("Underdog Losses") ) {
            return "" + stringtoteam( teamname ).getUnderlosses();
        }
        
        return "";
    }
    
    public void upstat( Object teamname, Object stat ) {
        
        if ( stat.equals("Wins") ) {
            stringtoteam( teamname ).setWins(stringtoteam( teamname ).getWins() + 1);
        }
        if ( stat.equals("Losses") ) {
            stringtoteam( teamname ).setLosses(stringtoteam( teamname ).getLosses() + 1);
        }
        if ( stat.equals("Home Wins") ) {
            stringtoteam( teamname ).setHomewins(stringtoteam( teamname ).getHomewins() + 1);
        }
        if ( stat.equals("Home Losses") ) {
            stringtoteam( teamname ).setHomelosses(stringtoteam( teamname ).getHomelosses() + 1);
        }
        if ( stat.equals("Away Wins") ) {
            stringtoteam( teamname ).setAwaywins(stringtoteam( teamname ).getAwaywins() + 1);
        }
        if ( stat.equals("Away Losses") ) {
            stringtoteam( teamname ).setAwaylosses(stringtoteam( teamname ).getAwaylosses() + 1);
        }
        if ( stat.equals("Favored Wins") ) {
            stringtoteam( teamname ).setFavwins(stringtoteam( teamname ).getFavwins() + 1);
        }
        if ( stat.equals("Favored Losses") ) {
            stringtoteam( teamname ).setFavlosses(stringtoteam( teamname ).getFavlosses() + 1);
        }
        if ( stat.equals("Underdog Wins") ) {
            stringtoteam( teamname ).setUnderwins(stringtoteam( teamname ).getUnderwins() + 1);
        }
        if ( stat.equals("Underdog Losses") ) {
            stringtoteam( teamname ).setUnderlosses(stringtoteam( teamname ).getUnderlosses() + 1);
        }
        
    }
    
    public void downstat( Object teamname, Object stat ) {
        
        if ( stat.equals("Wins") ) {
            stringtoteam( teamname ).setWins(stringtoteam( teamname ).getWins() - 1);
        }
        if ( stat.equals("Losses") ) {
            stringtoteam( teamname ).setLosses(stringtoteam( teamname ).getLosses() - 1);
        }
        if ( stat.equals("Home Wins") ) {
            stringtoteam( teamname ).setHomewins(stringtoteam( teamname ).getHomewins() - 1);
        }
        if ( stat.equals("Home Losses") ) {
            stringtoteam( teamname ).setHomelosses(stringtoteam( teamname ).getHomelosses() - 1);
        }
        if ( stat.equals("Away Wins") ) {
            stringtoteam( teamname ).setAwaywins(stringtoteam( teamname ).getAwaywins() - 1);
        }
        if ( stat.equals("Away Losses") ) {
            stringtoteam( teamname ).setAwaylosses(stringtoteam( teamname ).getAwaylosses() - 1);
        }
        if ( stat.equals("Favored Wins") ) {
            stringtoteam( teamname ).setFavwins(stringtoteam( teamname ).getFavwins() - 1);
        }
        if ( stat.equals("Favored Losses") ) {
            stringtoteam( teamname ).setFavlosses(stringtoteam( teamname ).getFavlosses() - 1);
        }
        if ( stat.equals("Underdog Wins") ) {
            stringtoteam( teamname ).setUnderwins(stringtoteam( teamname ).getUnderwins() - 1);
        }
        if ( stat.equals("Underdog Losses") ) {
            stringtoteam( teamname ).setUnderlosses(stringtoteam( teamname ).getUnderlosses() - 1);
        }
        
    }
    
    public team stringtoteam( Object name ) {
        
        if ( Ari.getName().equals(name) ) {
            return Ari;
        }
        if ( Atl.getName().equals(name) ) {
            return Atl;
        }
        if ( Bal.getName().equals(name) ) {
            return Bal;
        }
        if ( Buf.getName().equals(name) ) {
            return Buf;
        }
        if ( Car.getName().equals(name) ) {
            return Car;
        }
        if ( Chi.getName().equals(name) ) {
            return Chi;
        }
        if ( Cin.getName().equals(name) ) {
            return Cin;
        }
        if ( Cle.getName().equals(name) ) {
            return Cle;
        }
        if ( Dal.getName().equals(name) ) {
            return Dal;
        }
        if ( Den.getName().equals(name) ) {
            return Den;
        }
        if ( Det.getName().equals(name) ) {
            return Det;
        }
        if ( GB.getName().equals(name) ) {
            return GB;
        }
        if ( Hou.getName().equals(name) ) {
            return Hou;
        }
        if ( Ind.getName().equals(name) ) {
            return Ind;
        }
        if ( Jac.getName().equals(name) ) {
            return Jac;
        }
        if ( KC.getName().equals(name) ) {
            return KC;
        }
        if ( Mia.getName().equals(name) ) {
            return Mia;
        }
        if ( Min.getName().equals(name) ) {
            return Min;
        }
        if ( NE.getName().equals(name) ) {
            return NE;
        }
        if ( NO.getName().equals(name) ) {
            return NO;
        }
        if ( NYG.getName().equals(name) ) {
            return NYG;
        }
        if ( NYJ.getName().equals(name) ) {
            return NYJ;
        }
        if ( Oak.getName().equals(name) ) {
            return Oak;
        }
        if ( Phi.getName().equals(name) ) {
            return Phi;
        }
        if ( Pit.getName().equals(name) ) {
            return Pit;
        }
        if ( SD.getName().equals(name) ) {
            return SD;
        }
        if ( Sea.getName().equals(name) ) {
            return Sea;
        }
        if ( Sf.getName().equals(name) ) {
            return Sf;
        }
        if ( StL.getName().equals(name) ) {
            return StL;
        }
        if ( TB.getName().equals(name) ) {
            return TB;
        }
        if ( Ten.getName().equals(name) ) {
            return Ten;
        }
        if ( Was.getName().equals(name) ) {
            return Was;
        }
        if ( ref.getName().equals(name) ) {
            return ref;
        }
        
        
        
        
        
        return null;
    }
    
}
