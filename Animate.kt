/**
Daniel Flynn
Autumn 2025
*/

class Animate : Actor() {

  /**
  *  The maximum health cap for an animate object to achieve
  *
  */
  open var MAX_HEALTH_CAP : Int = 999
    get() = field
    set(value) {
      
    }

  /**
  * The current maximum health that an animate object has. Cannot exceed MAX_HEALTH_CAP.
  *
  */
  open var maxHealth : Int = 10
    get() = field
    set(value) {
      if(value <= MAX_HEALTH_CAP) {
        field f = value
      }
    }

  /**
  * The current health that an animate object has. Cannot exceed maxHealth
  *
  */
  open var health : Int = 10
    get() = field
    set(value) {
      if(value <= maxHealth) {
        field = value
      } else if (value <= 0) {
        health = 0
      }
    }
  

  

}


