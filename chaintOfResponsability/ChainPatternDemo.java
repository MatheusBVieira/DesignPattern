package designPatterns.chaintOfResponsability;


public class ChainPatternDemo  {
	
	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLoger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLoger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLoger = new ConsoleLogger(AbstractLogger.INFO);
		
		
		errorLoger.setNextLogger(fileLoger);
		fileLoger.setNextLogger(consoleLoger);
		
		return errorLoger;
	}
	public static void main(String[] args) {
		AbstractLogger logerChain = getChainOfLoggers();
		
		
		logerChain.logMessage(AbstractLogger.INFO, "This is a information" );
		logerChain.logMessage(AbstractLogger.DEBUG, "This is an DEBUG level information" );
		logerChain.logMessage(AbstractLogger.ERROR, "This is an ERROR information" );
		
	
	}
	
}
