/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.Question;

/**
 *
 * @author Amr
 */
public class Question {
    public String questiontext;
    public double answer;
    public String units;
    public String questionname;
    public String keyword1;
    public String keyword2;
    public String keyword3;
    public String keyword4;
    public Question(String qname, String qtext, double ans, String un){
        answer = ans;
        questiontext = qtext;
        units = un;
        questionname = qname;
    }
    
    public Question(String qname, String qtext, double ans, String un, String kw1)
    {
        answer = ans;
        questiontext = qtext;
        units = un;
        questionname = qname;
        keyword1 = kw1;
    }
    
    public Question(String qname, String qtext, double ans, String un, String kw1, String kw2)
    {
        answer = ans;
        questiontext = qtext;
        units = un;
        questionname = qname;
        keyword1 = kw1;
        keyword2 = kw2;
    }
    
    public Question(String qname, String qtext, double ans, String un, String kw1, String kw2, String kw3)
    {
        answer = ans;
        questiontext = qtext;
        units = un;
        questionname = qname;
        keyword1 = kw1;
        keyword2 = kw2;
        keyword3 = kw3;
    }
    
    public Question(String qname, String qtext, double ans, String un, String kw1, String kw2, String kw3, String kw4)
    {
        answer = ans;
        questiontext = qtext;
        units = un;
        questionname = qname;
        keyword1 = kw1;
        keyword2 = kw2;
        keyword3 = kw3;
        keyword4 = kw4;
    }
}