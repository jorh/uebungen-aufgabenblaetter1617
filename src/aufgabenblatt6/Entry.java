package aufgabenblatt6;


public class Entry implements Comparable<Entry> {
	String word;
	long count = 1;
	
	public Entry (String word){
		this.word = word;
	}
	
	public void counter (){
		count++;
	}
	public String getWort(){
		return word;
	}
	
	public long getCount(){
		return count;
	}
	
	@Override
	public int compareTo(Entry et) {
		if(this.getCount()<et.getCount()){
			return 1;
		} else if (this.getCount() == et.getCount()){
			return 0;
		} else {
			return -1;
		}

	}
	
	@Override
	public String toString(){
		return this.getWort()+": "+this.getCount();
	}
}
