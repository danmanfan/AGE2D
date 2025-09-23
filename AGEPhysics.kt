/**
Daniel Flynn
Autumn 2025
*/

import kotlin.math.*

class AGEPhysics() {


  fun quadratic_t(a : Float, b : Float, c : Float) {
    var x = b.pow(2) - (4*a*c)
    var t = 0
    if(x < 0){
      return -1
    } 
    t = (-b + sqrt(x)) / (2*a)
    return t

  }

  fun solveForT(acc : Float, veloc : Float, posF : Float, posI : Float) {
    var a = acc / 2
    var b = veloc
    var c = posI - posF
    var t = quadratic_t(a,b,c)
    return t
    

  }


}
