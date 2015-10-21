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
public class team implements Serializable {
    
    private String name;
    
    private int wins;
    private int losses;
    
    private int homewins;
    private int homelosses;
    
    private int awaywins;
    private int awaylosses;
    
    private int favwins;
    private int favlosses;
    
    private int underwins;
    private int underlosses;
    
    private int pointsfor = 0;
    private int pointsagainst = 0;
    
    private int homepointsfor = 0;
    private int homepointsagainst = 0;
    
    private int awaypointsfor = 0;
    private int awaypointsagainst = 0;
    
    private int spreadtotal = 0;
    private double avedifspread = 0;
    

    public team(String name, int wins, int losses, int homewins, int homelosses, int awaywins, int awaylosses, int favwins, int favlosses, int underwins, int underlosses) {
        this.name = name;
        this.wins = wins;
        this.losses = losses;
        this.homewins = homewins;
        this.homelosses = homelosses;
        this.awaywins = awaywins;
        this.awaylosses = awaylosses;
        this.favwins = favwins;
        this.favlosses = favlosses;
        this.underwins = underwins;
        this.underlosses = underlosses;
        
    }



    @Override
    public String toString() {
        return "name=" + name + ", wins=" + wins + ", losses=" + losses + ", homewins=" + homewins + ", homelosses=" + homelosses + ", awaywins=" + awaywins + ", awaylosses=" + awaylosses + ", favwins=" + favwins + ", favlosses=" + favlosses + ", underwins=" + underwins + ", underlosses=" + underlosses + ", pointsfor=" + apointsfor() + ", pointsagainst=" + apointsagainst() + ", homepointsfor=" + ahomepointsfor() + ", homepointsagainst=" + ahomepointsagainst() + ", awaypointsfor=" + aawaypointsfor() + ", awaypointsagainst=" + aawaypointsagainst() + ", Average difference=" + adifference() + ", Average Spread=" + aspread() + ", Average Difference from Spread=" + avedifspread;
    }

    public int getSpreadtotal() {
        return spreadtotal;
    }

    public void setSpreadtotal(int spreadtotal) {
        this.spreadtotal = spreadtotal;
    }

    public double getAvedifspread() {
        return avedifspread;
    }

    public void addAvedifspread( int spread, int dif ) {
        
        double gamesplayed = wins + losses;
        
        double temp = ( gamesplayed - 1 ) * this.avedifspread + dif - spread;
        
        this.avedifspread = temp / gamesplayed;
        
        
    }
    
    
    
    
    public double aspread()
    {
        double gamesplayed = wins + losses;
        
        return spreadtotal / gamesplayed;
        
        
    }
    
    public double apointsfor()
    {
        double gamesplayed = wins + losses;
        
        return pointsfor / gamesplayed;
        
        
    }
    
    public double apointsagainst()
    {
        double gamesplayed = wins + losses;
        
        return pointsagainst / gamesplayed;
        
        
    }
    
    public double ahomepointsfor()
    {
        double gamesplayed = homewins + homelosses;
        
        return homepointsfor / gamesplayed;
        
        
    }
    
    public double ahomepointsagainst()
    {
        double gamesplayed = homewins + homelosses;
        
        return homepointsagainst / gamesplayed;
        
        
    }
    
    public double aawaypointsfor()
    {
        double gamesplayed = awaywins + awaylosses;
        
        return awaypointsfor / gamesplayed;
        
        
    }
    
    public double aawaypointsagainst()
    {
        double gamesplayed = awaywins + awaylosses;
        
        return awaypointsagainst / gamesplayed;
        
        
    }
    
    public double adifference()
    {
        return apointsfor() - apointsagainst();
        
    }
    
    
    
    

    public int getAwaypointsagainst() {
        return awaypointsagainst;
    }

    public void setAwaypointsagainst(int awaypointsagainst) {
        this.awaypointsagainst = awaypointsagainst;
    }

    public int getAwaypointsfor() {
        return awaypointsfor;
    }

    public void setAwaypointsfor(int awaypointsfor) {
        this.awaypointsfor = awaypointsfor;
    }

    public int getHomepointsagainst() {
        return homepointsagainst;
    }

    public void setHomepointsagainst(int homepointsagainst) {
        this.homepointsagainst = homepointsagainst;
    }

    public int getHomepointsfor() {
        return homepointsfor;
    }

    public void setHomepointsfor(int homepointsfor) {
        this.homepointsfor = homepointsfor;
    }

    public int getPointsagainst() {
        return pointsagainst;
    }

    public void setPointsagainst(int pointsagainst) {
        this.pointsagainst = pointsagainst;
    }

    public int getPointsfor() {
        return pointsfor;
    }

    public void setPointsfor(int pointsfor) {
        this.pointsfor = pointsfor;
    }
    
    

    public int getAwaylosses() {
        return awaylosses;
    }

    public void setAwaylosses(int awaylosses) {
        this.awaylosses = awaylosses;
    }

    public int getAwaywins() {
        return awaywins;
    }

    public void setAwaywins(int awaywins) {
        this.awaywins = awaywins;
    }

    public int getFavlosses() {
        return favlosses;
    }

    public void setFavlosses(int favlosses) {
        this.favlosses = favlosses;
    }

    public int getFavwins() {
        return favwins;
    }

    public void setFavwins(int favwins) {
        this.favwins = favwins;
    }

    public int getHomelosses() {
        return homelosses;
    }

    public void setHomelosses(int homelosses) {
        this.homelosses = homelosses;
    }

    public int getHomewins() {
        return homewins;
    }

    public void setHomewins(int homewins) {
        this.homewins = homewins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnderlosses() {
        return underlosses;
    }

    public void setUnderlosses(int underlosses) {
        this.underlosses = underlosses;
    }

    public int getUnderwins() {
        return underwins;
    }

    public void setUnderwins(int underwins) {
        this.underwins = underwins;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    
    
}
