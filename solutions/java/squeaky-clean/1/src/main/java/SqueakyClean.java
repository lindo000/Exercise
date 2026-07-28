class SqueakyClean {
   // public String clean="";
    
    static String clean(String identifier) {
        String identifier1 =identifier;      
      

      if(identifier1.contains(" ")){
        identifier1 = SqueakyClean.underscore(identifier);}
        
    
      if(identifier1.contains("-")){
        identifier1 = SqueakyClean.kebab2camel(identifier1);}
        
    identifier1 = identifier1.replaceAll("[<>!¡.,#$§&=+]", "");
          if(identifier1.contains("7")||identifier1.contains("0")||identifier1.contains("1")||identifier1.contains("3")||identifier1.contains("4")){
      identifier1= SqueakyClean.num2let(identifier1);}
     
        
        return identifier1;
    }
    
    public static String num2let(String identifier){
        if(identifier.contains("4")){identifier= identifier.replaceAll("4", "a");}
        if(identifier.contains("3")){identifier=identifier.replaceAll("3", "e");}
        if(identifier.contains("0")){identifier=identifier.replaceAll("0", "o");}
        if(identifier.contains("1")){identifier=identifier.replaceAll("1", "l");}
        if(identifier.contains("7")){identifier=identifier.replaceAll("7", "t");}
        return identifier;
    }
    
    public static String underscore( String identifier){
         String clean= identifier.replaceAll(" ", "_");
        return clean;
    }


    public static String kebab2camel(String identifier){
    String regex = "-";
    String[] id = identifier.split(regex);
     id[1] = Character.toUpperCase(id[1].charAt(0)) + id[1].substring(1);
        String text = String.join("", id);
        return text;
    }
    
}
