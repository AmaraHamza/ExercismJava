public class LogLevels {
    
    public static String message(String logLine) {
        int index = logLine.indexOf("]") + 3;
        return logLine.substring(index).trim();
    }

    public static String logLevel(String logLine) {
        if (logLine.contains("[ERROR]")) return "error";
        if (logLine.contains("[WARNING]")) return "warning";
        if (logLine.contains("[INFO]")) return "info";
        return "";
    }

    public static String reformat(String logLine) {
        String message = LogLevels.message(logLine);
        if (logLine.contains("[ERROR]")) return message +" (error)";
        if (logLine.contains("[WARNING]")) return message +" (warning)";
        if (logLine.contains("[INFO]")) return message +" (info)";
        return message;
    }
}
