/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package every;

import javax.swing.JOptionPane;

/**
 *
 * @author Dad
 */
public class guesser {
    
    public int answer = 0;
    
    public team favored;
    public team underdog;
    public int spread;
    public int home;
    public team reference;
    
    public int score1;
    public int score2;
    
    public double fpoints;
    public double upoints;
    
    public double favt;
    public double undt;
    

    public guesser(team favored, team underdog, int spread, int home, team reference) {
        this.favored = favored;
        this.underdog = underdog;
        this.spread = spread;
        this.home = home;
        this.reference = reference;
        
        
        
        pointstest();
        adiftest();
        adifspreadtest();
        recordtest();
        
        
    }
    
    public void pointstest()
    {
        
        fpoints = 0;
        upoints = 0;
        
//        fpoints += favored.apointsfor() + underdog.apointsagainst() + reference.apointsagainst() + reference.apointsfor();
//        upoints += underdog.apointsfor() + favored.apointsagainst() + reference.apointsagainst() + reference.apointsfor();
        
        fpoints += favored.apointsfor() + underdog.apointsagainst();
        upoints += underdog.apointsfor() + favored.apointsagainst();
        
        fpoints *= 3;
        upoints *= 3;
        
        
//        if ( home == 2 ) {
//            fpoints += favored.ahomepointsfor() + underdog.ahomepointsagainst() + reference.ahomepointsfor();
//            upoints += underdog.aawaypointsfor() + favored.aawaypointsagainst() + reference.aawaypointsfor();
//        } else {
//            fpoints += favored.aawaypointsfor() + underdog.aawaypointsagainst() + reference.aawaypointsfor();
//            upoints += underdog.ahomepointsfor() + favored.ahomepointsagainst() + reference.ahomepointsfor();
//        }
        
        if ( home == 1 ) {
            fpoints += favored.ahomepointsfor() + underdog.aawaypointsagainst();
            upoints += underdog.aawaypointsfor() + favored.ahomepointsagainst();
        } else {
            fpoints += favored.aawaypointsfor() + underdog.ahomepointsagainst();
            upoints += underdog.ahomepointsfor() + favored.aawaypointsagainst();
        }
        
        
        fpoints /= 8;
        upoints /= 8;
        
        
        
        
        int temp = ( int ) ( fpoints - spread );
        
        int dif = ( int ) ( temp - upoints );
        
        int temp2 = 10 + dif;
        
        if ( temp2 > 20 ) {
            temp2 = 20;
        }
        if ( temp2 < 0 ) {
            temp2 = 0;
        }
        
        answer += temp2;
        
        score1 = ( int ) fpoints;
        score2 = ( int ) upoints;
        
        
//        JOptionPane.showMessageDialog(null, "" + dif);
        
    }
    
    
    public void adiftest()
    {
        int temp = ( int ) ( ( favored.adifference() - underdog.adifference() ) / 2 );
        
        temp += 10;
        
        if ( temp > 20 ) {
            temp = 20;
        }
        if ( temp < 0 ) {
            temp = 0;
        }
        
        answer += temp;
    }


    public void adifspreadtest()
    {
        int temp = ( int ) ( ( favored.getAvedifspread() - underdog.getAvedifspread() ) * 2 );
        
        int temp2 = 10 + temp;
        
        if ( temp2 > 20 ) {
            temp2 = 20;
        }
        if ( temp2 < 0 ) {
            temp2 = 0;
        }
        
        answer += temp2;
    }


    public void recordtest()
    {
        
        
        favt = favored.getWins() + underdog.getLosses() + favored.getFavwins() + underdog.getUnderlosses();
        undt = underdog.getWins() + favored.getLosses() + underdog.getUnderwins() + favored.getFavlosses();
        
        
        favt *= 2;
        undt *= 2;
        
        if ( home == 1 ) {
            favt += favored.getHomewins() + underdog.getAwaylosses();
            undt += underdog.getAwaywins() + favored.getHomelosses();
        } else {
            undt += underdog.getHomewins() + favored.getAwaylosses();
            favt += favored.getAwaywins() + underdog.getHomelosses();
        }
        
        double temp = ( favt / undt ) * 10;
        
        if ( temp > 20 ) {
            temp = 20;
        }
        if ( temp < 0 ) {
            temp = 0;
        }
        
        answer += ( int ) temp;
    }

}
