package designPatterns.chaintOfResponsability;

public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	protected int level;
	
	protected AbstractLogger nextLoger;
	
	public void setNextLogger(AbstractLogger nextLoger) {
		this.nextLoger = nextLoger;
	}
	
	public void logMessage(int level, String message) {
		if(this.level <= level) {
			write(message);
		}
		
		if(nextLoger != null) {
			nextLoger.logMessage(level, message);
		}
		
		
	}

	abstract protected void write(String message);
}
