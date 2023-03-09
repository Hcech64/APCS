public class WordSearchReader {
    public static void main(String[] args) {
        //init random search
    
        String[][] Search = WordSearch.WordSearchGen();

        //print
        for(int l = 0 ; l < 10; l++){
            for(int b = 0; b < 10; b++ ){
                System.out.print(Search[l][b] + "  ");
            }
            System.out.println(Search[l][0]);
        }

        String word1 = "FLUBBER";
        String word2 = "POOPIES";

        String Flubberfinder = "";
        String Poopiesfinder = "";

        for(int y = 0; y < 10; y++){
            for(int x = 0; x < 10; x++){
               Flubberfinder += Search[y][x];
            }
            if(Flubberfinder.contains(word1)){
                System.out.println("\'Flubber\' is at y = "+ (10 -y) + " and x = " + (1+Flubberfinder.indexOf(word1)));
            }
            Flubberfinder = "";
            
        }

        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
               Poopiesfinder += Search[y][x];
            }
            if(Poopiesfinder.contains(word2)){
                System.out.println("\'Poopies\' is at y = "+ (10 - Poopiesfinder.indexOf(word2)) + " and x = " + (x + 1));
            }
            Poopiesfinder = "";
            
        }


    }
}
