public class LogLevels {
    private static String error = "[ERROR]";
    private static String warning = "[WARNING]";
    private static String info = "[INFO]";
    public static String message(String logLine) {
        int index = logLine.indexOf("]") + 3;
        return logLine.substring(index).trim();
    }

    public static String logLevel(String logLine) {
        if (logLine.contains(error)) return "error";
        if (logLine.contains(warning)) return "warning";
        if (logLine.contains(info)) return "info";
        return "";
    }

    public static String reformat(String logLine) {
        String message = LogLevels.message(logLine);
        if (logLine.contains(error)) return message +" (error)";
        if (logLine.contains(warning)) return message +" (warning)";
        if (logLine.contains(info)) return message +" (info)";
        return message;
    }
}
