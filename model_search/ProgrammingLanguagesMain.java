package model_search;
/**
	 * Write a description of class ProgrammingLanguages here.
	 
	 * @author (your name)
	 * @version (a version number or a date)
	 */
import java.util.*;
public class ProgrammingLanguagesMain 
{
        
    public  String printPython() {
    	 return new Python().toString(); 	         
    }
    
    public  String printRuby() {
   	 	return new Ruby().toString(); 	         
    }
    
    public  String printJava() {
   	 	return new Java().toString(); 	         
    }
            
    public static String main(String input) {
        
    	String Answer="", CSharp="", Java="", Python="", Ruby="", Swift="";
    	
    	if (new CSharp().toString().indexOf(input) > 0)
            CSharp ="CSharp";
    	if (new Java().toString().indexOf(input) > 0)
            Java="Java";
    	if (new Python().toString().indexOf(input) > 0)
            Python ="Python";
    	if (new Ruby().toString().indexOf(input) > 0)
            Ruby ="Ruby";
    	if (new Swift().toString().indexOf(input) > 0)
            Swift ="Swift";
    	
        Answer = CSharp + Java + Python + Ruby + Swift;
        
        if (Answer.length() > 0)
        	return Answer;
        
        return "not found";
    }
}


