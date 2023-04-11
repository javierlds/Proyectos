
import random

def evaluaNumero(jugador1, jugador2):
    puntosJug1 = 0
    puntosJug2 = 0
    vida = 0
    numeroAleatorio = random.randint(1,5)
    print("el numero aleatorio es: " + str(numeroAleatorio))

    for i in range(1,2):
        if i==1:           
            print("Empieza " + jugador1)
            puntosJug1,vida= juego(1,jugador1)
        elif i==2:
            print("Continua " + jugador2)
            puntosJug2,vida= juego(2,jugador2)
    #if vida <=0:
     #   return "Perdiste vuelve a intentarlo."

def juego(valor):
    vida = 3
    puntos = 0
    while vida >=1:
        numeroUsuario = int(input("Ingrese numero a buscar:"))
        if numeroUsuario != numeroAleatorio:
            vida -= 1
        elif numeroUsuario == numeroAleatorio:
            puntos +=1
    return puntos,vida


if __name__ == "__main__":
    jugador1 = input("ingrese su nombre:")
    jugador2 = input("ingrese su nombre:")

    print(evaluaNumero(jugador1, jugador2))

