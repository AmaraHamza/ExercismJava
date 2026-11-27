public class LogLine {
    String logLevel;
    String logLine;
    public LogLine(String logLine) {
        this.logLine = logLine;
        logLevel = logLine.substring(1,4);
    }

    public LogLevel getLogLevel() {
        switch(logLevel) {
            case "TRC" : return LogLevel.TRACE;
            case "DBG" : return LogLevel.DEBUG;
            case "INF" : return LogLevel.INFO;
            case "WRN" : return LogLevel.WARNING;
            case "ERR" : return LogLevel.ERROR;
            case "FTL" : return LogLevel.FATAL;
            default : return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        LogLevel ll = getLogLevel();
        int num = 
            ll.getNumberOfLog();
        return num+logLine.substring(5).replaceFirst(" ","");
    }
}
