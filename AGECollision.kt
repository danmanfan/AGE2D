/**
Daniel Flynn
Autumn 2025
*/

import kotlin.collections.ArrayDeque

class AGECollision() {

  // The queue of collidable Actors
  var colQueue : ArrayDeque<Actor>()

  // Number of frames to pass before collision of points
  var countDown : Int = 0

  // While countDown is below this number, check for collision of objects
  var checkCountDown : Int = -1

  fun checkCollision() {
    if(!colQueue.isEmpty()) {
      // 
    }

  }

}
