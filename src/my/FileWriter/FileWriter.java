/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.FileWriter;

import my.Question.Question;
import java.io.*;
import java.awt.Desktop; 
import java.util.List;
import my.FilesUtil.FilesUtil;
/**
 *
 * @author Amr
 *
 * */

public class FileWriter{
static int questionCount   = 0;
int qnumber = 0;


final static String END_QUESTION_TOKEN ="~";
public String d = "|";

public String getNextQuestionAnswer(Question Qstn){
 qnumber = tildacounter("Saved Questions") + 1;
 return Integer.toString(qnumber) + ". " + Qstn.questionname + d + Qstn.questiontext + d + Qstn.answer + d + Qstn.units +  END_QUESTION_TOKEN + "\n\r"  ;//add the \n for new line
}

public void addQuestion(Question Qstn, String name) throws IOException {



     
      File file = new File(name) ;
     try  {
            boolean exists = file.exists();
            boolean successfullyMadeFile = file.createNewFile();
               
            }
     catch (IOException ioe) {; }

    String fileDataStr = FilesUtil.readTextFile(name);

   fileDataStr += getNextQuestionAnswer(Qstn) + "\n"; 
	
	FilesUtil.writeToTextFile(name, fileDataStr);
        

    try{
        Desktop.getDesktop().open( file );
        }  catch (IOException ioe) {  ; }
    
    FilesUtil.readTextFileByLines(name);

  
  
  }

public int tildacounter(String name)
{
    int counter = 0;
    File file = new File(name) ;
     try  {
            boolean exists = file.exists();
            boolean successfullyMadeFile = file.createNewFile();
               
            }
     catch (IOException ioe) {; }
     
     String fileDataStr = "";
    try
    {fileDataStr = FilesUtil.readTextFile(name);
    }
    catch (IOException ioe) {; }
    
    for(int i = 0; i < fileDataStr.length(); i ++)
        if(fileDataStr.charAt(i) == '~')
            counter++;
    return counter;
}

public String[] namebringer(String name)
{
    int counter = tildacounter(name);
    
    boolean b = true;
    String[] names = new String[counter];
    File file = new File(name) ;
     try  {
            boolean exists = file.exists();
            boolean successfullyMadeFile = file.createNewFile();
               
            }
     catch (IOException ioe) {; }
     
     String fileDataStr = "";
    try
    {fileDataStr = FilesUtil.readTextFile(name);
    }
    catch (IOException ioe) {; }
    int linestart = startfinder(fileDataStr, 0);
    
    outer: for(int i = 0; i < counter; i ++)
    {
        b = true;
        for(int x = linestart; x < fileDataStr.length(); x ++)
        {
            if(b && fileDataStr.charAt(x) == '|')
            {
                names[i] = fileDataStr.substring(linestart, x);
                b = false;
            }
            if(b == false && fileDataStr.charAt(x) == '~')
            {
                linestart = startfinder(fileDataStr, x);
                continue outer;
            }
        }
    }
    return names;
}

public String[] namegetter(String name)
{
    int counter = tildacounter(name);
    
    String[] names = new String[counter];
    File file = new File(name) ;
     try  {
            boolean exists = file.exists();
            boolean successfullyMadeFile = file.createNewFile();
               
            }
     catch (IOException ioe) {; }
     
     String fileDataStr = "";
    try
    {fileDataStr = FilesUtil.readTextFile(name);
    }
    catch (IOException ioe) {; }
    int linestart = 0;
    int index = 0;
        for(int x = 0; x < fileDataStr.length(); x ++)
        {
            if(fileDataStr.charAt(x) == '~')
            {
                names[index] = fileDataStr.substring(linestart, x);
                linestart = x + 1;
                index ++;
            }
        }
    return names;
}

public String textgetter(int location, String name)
{
    int counter = 0;
    int linestart = 0;
    String text = "";
    File file = new File(name) ;
     try  {
            boolean exists = file.exists();
            boolean successfullyMadeFile = file.createNewFile();
            }
     catch (IOException ioe) {; }
     
     String fileDataStr = "";
    try
    {fileDataStr = FilesUtil.readTextFile(name);
    }
    catch (IOException ioe) {; }
    
    for(int i = 0; i < fileDataStr.length(); i ++)
    {
        if(counter == location)
        {
            linestart = i;
            break;
        }
        if(fileDataStr.charAt(i) == '~')
            counter ++;
    }
    
    boolean a = true;
    for(int i = linestart; i < fileDataStr.length(); i ++)
    {
        if(a && fileDataStr.charAt(i) == '|')
        {
            linestart = i + 1;
            a = false;
            continue;
        }
        if(a == false && fileDataStr.charAt(i) == '|')
        {
            text =fileDataStr.substring(linestart, i);
            break;
        }
    }
    return text;
}

public void delete(int location, String name)
{
    File file = new File(name);
    if(tildacounter(name) <= 1)
    {
        try  {
            boolean delete = file.delete();
            boolean successfullyMadeFile = file.createNewFile();
            }
        catch (IOException ioe) {; }
        return;
    }

    
    String fileDataStr = "";
    try
    {
        fileDataStr = FilesUtil.readTextFile(name);
    }
    catch (IOException ioe) {; }
    boolean a = true;
    int startindex = 0;
    int endindex = fileDataStr.length();
    for(int i = 0; i < fileDataStr.length() && a; i ++)
    {
        if(fileDataStr.substring(i, i + 3).equals(Integer.toString(location) + ". "))
        {
            startindex = i;
            a = false;
        }
    }
    a = true;
    boolean b = false;
    for(int i = startindex; i < fileDataStr.length() && a; i ++)
    {
        if(!b && fileDataStr.charAt(i) == '~')
        b = true;
        if(b && isnumber(fileDataStr.charAt(i)))
        {
            endindex = i;
            a = false;
        }
    }
    String temp = "";
    if(startindex <=10)
    temp = fileDataStr.substring(endindex, fileDataStr.length()-2);
    else if(endindex == fileDataStr.length())
    temp = fileDataStr.substring(0,startindex-2);
    else
    temp = fileDataStr.substring(0,startindex-2) + fileDataStr.substring(endindex, fileDataStr.length()-2);
    System.out.println(temp);
    int counter = 1;
    a = true;
    for(int i = 0; i < temp.length(); i ++)
    {
        if(a && isnumber(temp.charAt(i)))
        {
            a = false;
            temp = numberchanger(i, counter, temp);
            counter ++;
        }
        if(!a && temp.charAt(i) == '~')
            a = true;
    }
    try  {
            boolean delete = file.delete();
            boolean successfullyMadeFile = file.createNewFile();
            }
    catch (IOException ioe) {; }
    try{FilesUtil.writeToTextFile(name, temp);}
    catch (IOException ioe) {; }
}

public boolean isnumber(Character x)
{
    String checker = "1234567890";
    for(int i = 0; i < checker.length(); i ++)
        if(checker.charAt(i) == x)
            return true;
    return false;
}

public String numberchanger(int x, int y, String str)
{
    String temp = str.substring(0,x) + Integer.toString(y) + str.substring(x+1);
    return temp;
}

// Stats

public String stats = "Q:0T:0K:0F:0M:0E:0C:0G:0KT:0FT:0MT:0ET:0CT:0GT:0";
public void getstats()
{
        try{stats = FilesUtil.readTextFile("stats");}
        catch(IOException ioe){;}
}

public void tally(String a)
{
    getstats();
    int x = 0;
    for(int i = 0; i < stats.length() && x == 0; i ++)
    if(a.equals(stats.substring(i, i + a.length())))
    x = i+1+a.length();
    int temp = Character.getNumericValue(stats.charAt(x));
    temp ++;
    stats = stats.substring(0,x) + Integer.toString(temp) + stats.substring(x+1);
    try{FilesUtil.writeToTextFile("stats", stats);}
    catch(IOException ioe){;}
}

public String MV()
{
    getstats();
    int k = Character.getNumericValue(stats.charAt(8)) + Character.getNumericValue(stats.charAt(27));
    int f = Character.getNumericValue(stats.charAt(11)) + Character.getNumericValue(stats.charAt(31));
    int m = Character.getNumericValue(stats.charAt(14)) + Character.getNumericValue(stats.charAt(35));
    int e = Character.getNumericValue(stats.charAt(17)) + Character.getNumericValue(stats.charAt(39));
    int c = Character.getNumericValue(stats.charAt(20)) + Character.getNumericValue(stats.charAt(43));
    int g = Character.getNumericValue(stats.charAt(23)) + Character.getNumericValue(stats.charAt(47));
    int largest = 0;
    if(k > largest)
    largest = k;
    if(f > largest)
    largest = f;
    if(m > largest)
    largest = m;
    if(e > largest)
    largest = e;
    if(c > largest)
    largest = c;
    if(g > largest)
    largest = g;
    if(largest == 0)
    return "D.N.E.";
    boolean a = true;
    boolean b = true;
    String output = "";
    if(k == largest)
    {
        b = false;
        output = "Kinematics";
    }
    if(f == largest)
    {
        if(b == false)
        a = false;
        b = false;
        output = "Forces";
    }
    if(m == largest && a)
    {
        if(b == false)
        a = false;
        b = false;
        output = "Momentum";
    }
    if(e == largest && a)
    {
        if(b == false)
        a = false;
        b = false;
        output = "Energy";
    }
    if(c == largest && a)
    {
        if(b == false)
        a = false;
        b = false;
        output = "Circular Motion";
    }
    if(g == largest && a)
    {
        if(b == false)
        a = false;
        b = false;
        output = "Gravity";
    }
    if(a != true)
    return "Tie";
    return output;
}

public void clearstats()
{
    stats = "Q:0T:0K:0F:0M:0E:0C:0G:0KT:0FT:0MT:0ET:0CT:0GT:0";
    try{FilesUtil.writeToTextFile("stats", stats);}
    catch(IOException ioe){;}
}

public int startfinder(String str, int x)
{
    for(int i = x; i < str.length(); i ++)
    {
        if(Character.getNumericValue(str.charAt(i)) != -1)
            return i;
    }
    return 0;
}

public void typedelete(int x, String name)
{
    File file = new File(name);
    if(tildacounter(name) <= 1)
    {
        try  {
            boolean delete = file.delete();
            boolean successfullyMadeFile = file.createNewFile();
            }
        catch (IOException ioe) {; }
        return;
    }

    
    String fileDataStr = "";
    try
    {
        fileDataStr = FilesUtil.readTextFile(name);
    }
    catch (IOException ioe) {; }
    int startindex = 0;
    int endindex = fileDataStr.length();
    int count = 0;
    boolean a = true;
    outer: for(int i = 0; i < fileDataStr.length() && a; i ++)
        {
            if(count != x && fileDataStr.charAt(i) == '~')
            {
                startindex = i;
                count ++;
                i++;
            }
            if(count == x && fileDataStr.charAt(i) == '~')
            {
                endindex = i;
                a = false;
            }
        }
    
    String temp = "";
    if(startindex <=3)
    temp = fileDataStr.substring(endindex, fileDataStr.length());
    else if(endindex == fileDataStr.length())
    temp = fileDataStr.substring(0,startindex+1);
    else
    temp = fileDataStr.substring(0,startindex) + fileDataStr.substring(endindex, fileDataStr.length());

    try  {
            boolean delete = file.delete();
            boolean successfullyMadeFile = file.createNewFile();
            }
    catch (IOException ioe) {; }
    try{FilesUtil.writeToTextFile(name, temp);}
    catch (IOException ioe) {; }
}

public String countQuiz()
{
    int count = 1;
    boolean a = true;
    while(a)
    {
        File file = new File("Quiz" + Integer.toString(count));
        if(file.exists())
        {
            count ++;
        }
        else
        {
            a = false;
        }
    }
    return Integer.toString(count);
}

public String[] testbringer()
{
    int counter = 0;
    int count = 1;
    boolean a = true;
    while(a)
    {
        File file = new File("Quiz" + Integer.toString(count));
        if(file.exists())
        {
            count ++;
            counter ++;
        }
        else
        a = false;
    }
    String[] names = new String[counter];
    for(int i = 1; i <= counter; i ++)
    names[i] = "Quiz" + Integer.toString(i);
    return names;
}
}