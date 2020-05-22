//-------------------------------------------------------------------------
/**
 * An implementation of the Levenshtein distance algorithm.
 *
 * @author Logan Cooper
 * @version March 4, 2017
 */
public class Levenshtein {
	// ~ Fields ..........................................................
	public String s1;
	public String s2;

	/**
	 * @param s1
	 *     the first string
	 * @param s2
	 *     the secpnd string
	 */
	// ~ Constructors ....................................................
	public Levenshtein(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	// ~ Methods .........................................................

	/**
	 * @return Levenshtein Distance
	 */
	public int distance()
	{
		return distance(0, 0, s1.length(), s2.length());
	}
	private int distance(int pos1, int pos2, int sub1, int sub2)
	{
		if (s1.length()==0 && s2.length()>0) 
			return sub2;
		else if (s2.length()==0 && s1.length()>0)
			return sub1;
		else if (s1.length()==0 && s2.length()==0)
			return 0;
		else if (s1.substring(pos1, sub1-1).length()==0 && s2.substring(pos2, sub2-1).length()>0) 
			return sub2;
		else if (s2.substring(pos2, sub2-1).length()==0 && s1.substring(pos2, sub2-1).length()>0)
			return sub1;
		else if (s1.substring(pos1, sub1-1).length()==0 && s2.substring(pos2, sub2-1).length()==0)
			return 0;
		else{
		int deletion = distance(pos1, pos2+1, sub1, sub2) + 1;
	    int insertion = distance(pos1+1, pos2, sub1, sub2) + 1;
	    int sameChar = distance(pos1+1, pos2+1, sub1, sub2);
	    if (s1.substring(pos1, 1).equals(s2.substring(pos2, 1)))
	    {
	    	sameChar++;
	    }
	    return Math.min(deletion, Math.min(insertion, sameChar));
		}
	}
}
