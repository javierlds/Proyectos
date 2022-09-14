# Objetivo: Adivinar el numero que arroja el sistema entre el rango 1 a 10.
#           si se adivina el numero, el programa mostrara un mensaje y acumulara 10 puntos
#           si falla el adivinar, el programa indicara que el numero es mayor o menor de acuerdo al numero aleatorio dando una pista, hasta encontrar el numero,
#           si falla en los 3 intentos no acumula puntos y continua el jugador 2 y asi sucesivamente hasta que gane el jugador con 30 puntos.
#           gana el jugador que llegue a 30 puntos.
##
import random

def adivinaNumero():
    jug1 = input("Ingresa nombre primer jugador: ")
    jug2 = input("Ingresa nombre segundo jugador: ")
    
    puntaje = 0
    puntaje2 = 0
    while puntaje != 30 or puntaje2 !=30:  
      for i in range(2): # ciclo por numero de jugadores
        print("CICLO: " + str(i))
        if i == 0: # juega jugador 1
          print("  Juega " + jug1)
          puntaje += controlJuego(i, jug1)
        if i== 1: # juega jugador 2
          print("  Juega " + jug2)
          puntaje2 += controlJuego(i, jug2)

      if puntaje == 30:
        print("Ganaste " + jugador)
        break
      elif puntaje2 == 30:
        print("Ganaste " + jugador)
        break
      else:
        print("sigue intentando !!")
        
        
        
def controlJuego(idJugador, jugador):
    valor = random.randint(1,10)
    puntajejg = 0
    for x in range(3): # ciclo de oportunidades por jugador
      print("SUBCICLO " +  str(x))
      valJug = int(input("cual numero es? "))
      if valJug == valor:
        puntajejg += 10
        print("Adivinaste!!!")
        break
      elif valJug < valor:
        print("  Estas cerca pero el numero a adivinar es menor, sigue intentando ....")
      else:
        print("  Estas cerca pero el numero a adivinar es mayor, sigue intentando ....")

    return puntajejg


if __name__ == '__main__':
   adivinaNumero()
    

    
