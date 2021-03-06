/**
 * This code has been taken and modified from:
 * https://github.com/rayzhangcl/ESDemo
 * 
 * @author Chenlei Zhang - Original Owner
 * @author Minhal Syed -Minor Editor
 */

package cs.ualberta.ca.beargitandroid.ES;

public class ElasticSearchResponse<T> {
	String _index;
	String _type;
	String _id;
	int _version;
	boolean exists;
	T _source;
	double max_score;

	public T getSource() {
		return _source;
	}

	public boolean getExtists() {
		return this.exists;
	}

}
