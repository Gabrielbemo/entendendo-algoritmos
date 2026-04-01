package HackerRank.Java.JavaMethodOverriding;

import java.util.*;
class Sports{

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class Solution {
    static void main(String[] args) {
        Sports sports = new Sports();
        Soccer soccer = new Soccer();

        sports.getNumberOfTeamMembers();
        soccer.getNumberOfTeamMembers();
    }
}
