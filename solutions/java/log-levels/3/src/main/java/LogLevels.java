public class LogLevels {

    public static String message(String logLine) {
        int index = logLine.indexOf(':') + 1;
        return logLine.substring(index).trim();
    }

    public static String logLevel(String logLine) {
        int index1 = logLine.indexOf('[');
        int index2 = logLine.indexOf(']');
        return logLine.substring(index1+1,index2).toLowerCase();
    }

    public static String reformat(String logLine) {
        return LogLevels.message(logLine)+" ("+LogLevels.logLevel(logLine)+")";
    }
}
