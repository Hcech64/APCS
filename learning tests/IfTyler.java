public class IfTyler {
    public static void main(String[] args) {
        
    }
private String Name;
private String Sexy;
private String string = "";

public IfTyler(String name, String sexy){
    Name = name;
    Sexy = sexy;
}

public String toString(){
    if(Name.equalsIgnoreCase("tyler") && (Sexy.equalsIgnoreCase("Yes"))){
        return "heyyy bebe. Ur a sexy " + Name;
    }

    else if(Name.equalsIgnoreCase("tyler") && (!Sexy.equalsIgnoreCase("Yes"))){
        return "False all tylers are sexy";
    }

    if(!Name.equalsIgnoreCase("tyler") && (Sexy.equalsIgnoreCase("Yes"))){
        return "damn boi i seeee youuuu!";
    }

    if(!Name.equalsIgnoreCase("tyler") && (!Sexy.equalsIgnoreCase("Yes"))){
        return "thats a big oof " + Name;
    }
    return string;
    
}

}

