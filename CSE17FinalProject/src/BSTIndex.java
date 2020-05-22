import java.util.ArrayList;

/**
 * BSTIndex class to hold the term and an arraylist of Strings of documents that have the term in them.
 * @author james setola, logan cooper, gilbert carrasco
 * contribution: 33.33% each
 * @version 2017-05-01
 * all getter/setter methods have O(1)
 */
public class BSTIndex implements Comparable<BSTIndex>{
	private String term;
	private ArrayList<String> articles;
	
	/**
	 * constructor for the BSTIndex class
	 * @param term
	 */
	public BSTIndex(String term) {
		this.term = term;
		articles = new ArrayList<String>();
		//code to add articles to array list that contain the key term
	}
	
	/**
	 * getter for the term
	 * @return String
	 */
	public String getTerm()
	{
		return this.term;
	}
	
	/**
	 * setter for the term
	 * @param newTerm
	 */
	public void setTerm(String newTerm)
	{
		this.term=newTerm;
	}
	
	/**
	 * getter for the articles
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getArticles()
	{
		return this.articles;
	}
	
	/**
	 * setter for the articles
	 * @param newArticles
	 */
	public void setArticles(ArrayList<String> newArticles)
	{
		this.articles=newArticles;
	}
	
	/**
	 * method to compare two BSTIndex objects
	 * @return int
	 * O(1)
	 */
	public int compareTo(BSTIndex o) {
		return term.compareTo(o.getTerm());
	}
	
}
