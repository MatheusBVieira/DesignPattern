package designPattern.iterator;

public class NameRepository implements Container {
	public String names[] = {"Robert", "John", "Julie"};
	

	@Override
	public Iterator getIterator() {
		return new Iterator() {
			
			int index;
			
			@Override
			public boolean hasNext() {
				if(index < names.length) {
					return true;
				}
				return false;
			}
			
			@Override
			public Object next() {
				if(this.hasNext()) {
					return names[index++];
				}
				return null;
			}
		};
	}

}
