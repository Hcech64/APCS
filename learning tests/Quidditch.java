public class Quidditch {
 
    public static void main(String args[]) {
     
    QuidditchPlayer[] allPlayers = new QuidditchPlayer[28];
    String[] teams = {"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"};
    String[] positions = {"Chaser", "Chaser", "Chaser", "Beater", "Beater", "Keeper", "Seeker"};
     
    /* 
    allPlayers[0] = new QuidditchPlayer(teams[0], positions[0]);
    allPlayers[1] = new QuidditchPlayer(teams[0], positions[1]);
    allPlayers[2] = new QuidditchPlayer(teams[0], positions[2]);
    //
    //
    allPlayers[27] = new QuidditchPlayer(teams[3], positions[6]);

*/

    int player = 0;


    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 7; j++){
            allPlayers[player] = new QuidditchPlayer(teams[i], positions[j]);
            player++;
        }
    }


    for (int x =0; x < 28; x++) {
        System.out.println("Player " + x + " is " + allPlayers[x]);
    }
    
     
    /* Replace the code in lines 10 - 15 with a nested for loop that sets all the players */
     
    }
}
