import java.util.ArrayList;
import java.util.HashMap;

/**
 * Reference class to hold the terms and their TFIDF values.
 * @author james setola, logan cooper, gilbert carrasco
 * contribution: 33.33% each
 * @version 2017-05-01
 * all getter/setter methods have O(1)
 */
public class Reference {
	private String term;
	private double TF;
	private double IDF;
	private double TFIDF;
	
	/**
	 * constructor for the Reference class
	 * @param term
	 * @param TF
	 * @param IDF 
	 * @param TFIDF 
	 */
	public Reference(String term, double TF, double IDF, double TFIDF) {
		this.term=term;
		this.TF=TF;
		this.IDF=IDF;
		this.TFIDF=TFIDF;
		
	}
	/**
	 * @return boolean
	 * this method will return a boolean determining if the reference should be put into the BST
	 */
	public boolean isAbove() {
		return this.TFIDF >= ArticleStructure.threshold;
	}	
	
	/**
	 * setter for the term
	 * @param term
	 */
	public void setTerm(String term)
	{
		this.term = term;
	}
	
	/**
	 * getter for the term
	 * @return term
	 */
	public String getTerm()
	{
		return this.term;
	}
	/**
	 * setter for the TF
	 * @param TF
	 */
	public void setTF(double TF)
	{
		this.TF = TF;
	}
	/**
	 * getter for the TF
	 * @return TF
	 */
	public double getTF()
	{
		return this.TF;
	}
	/**
	 * setter for the IDF
	 * @param IDF
	 */
	public void setIDF(double IDF)
	{
		this.IDF = IDF;
	}
	/**
	 * getter for the IDF
	 * @return IDF
	 */
	public double getIDF()
	{
		return this.IDF;
	}
	/**
	 * setter for the TFIDF
	 * @param TFIDF
	 */
	public void setTFIDF(double TFIDF)
	{
		this.TFIDF = TFIDF;
	}
	/**
	 * getter for the TFIDF
	 * @return TFIDF
	 */
	public double getTFIDF()
	{
		return this.TFIDF;
	}
}
