public class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    Fighter first = null;
    Fighter second = null;
    if(fighter1.name == firstAttacker){
      first = new Fighter(fighter1.name, fighter1.health, fighter1.damagePerAttack);
      second = new Fighter(fighter2.name, fighter2.health, fighter2.damagePerAttack);
    } else {
      first = new Fighter(fighter2.name, fighter2.health, fighter2.damagePerAttack);
      second = new Fighter(fighter1.name, fighter1.health, fighter1.damagePerAttack);
    }
    
    while(first.health > 0 && second.health > 0){
      second.health -= first.damagePerAttack;
      if(second.health <= 0){
          return first.name;
      }      
      first.health -= second.damagePerAttack;
      if(first.health <= 0){
          return second.name;
      }
    }
    // fix this shiz
    return null;
  }
}