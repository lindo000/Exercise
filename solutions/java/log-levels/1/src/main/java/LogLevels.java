public class LogLevels {
    
    public static String message(String logLine) {
        String mes= logLine;
     //position of :
        int position= mes.indexOf(" ");
         mes = mes.substring(position, mes.length());
        mes= mes.trim();
        return mes;
    }

    public static String logLevel(String logLine) {
       String mes= logLine;
        int position= mes.indexOf("]");
        mes = mes.substring(0, position);
        mes = mes.substring(1, mes.length());
        mes= mes.trim().toLowerCase();
        return mes;
    }

    public static String reformat(String logLine) {
        String message = new LogLevels().message(logLine);
        String logLevel = new LogLevels().logLevel(logLine);
        
        String Message= (message + " ("+logLevel+ ")");
     return Message;
    }


}