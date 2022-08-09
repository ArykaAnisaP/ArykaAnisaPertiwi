import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.*;
/**
 * Write a description of class lebahsuka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lebahsuka extends Actor
{
    private final String catchs = "mysql-connector-java-5.1.23-bin.jar";
    private String dBase = "jdbc:mysql://localhost/";
    private String username;
    private String password;
    private Connection con;
    private Statement stmt;
    private String dBaseH = "lebahsuka";
    private String usernameH = "root";
    private String passwordH = "";
    public void act()
    {
        
        if (Greenfoot.isKeyDown("d")){
            setLocation(getX()+1,getY());
        }
        if (Greenfoot.isKeyDown("a")){
            setLocation(getX()-1,getY());
        }
        if (Greenfoot.isKeyDown("w")){
            setLocation(getX(),getY()+1);
        }
        if (Greenfoot.isKeyDown("s")){
            setLocation(getX(),getY()-1);
        }
        
    }
}
